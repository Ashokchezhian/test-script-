package SlackIntegration;

import com.google.cloud.storage.*;
import com.lowagie.text.DocumentException;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


import java.net.URL;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class Slack {
    public static void main(String[] args) throws IOException, DocumentException {
        Slack s1 = new Slack();
        s1.AuthenticateAppInGCP();
        String url = s1.uploadFolderToGCS();
//        s1.SendToSlack(url);

    }

    public void AuthenticateAppInGCP() {
        try {
            // Provide the path to the service account key JSON file
            String credentialsPath = "src/test/java/SlackIntegration/TitleDevBucket.json";

            // Load the service account credentials
            GoogleCredentials credentials = GoogleCredentials.fromStream(Files.newInputStream(Paths.get(credentialsPath)));

            // Create the storage service object using the loaded credentials
            Storage storage = StorageOptions.newBuilder().setCredentials(credentials).build().getService();

        } catch (IOException e) {
            // Handle exception
            e.printStackTrace();
        }
    }




    public String uploadFolderToGCS() throws IOException {

        String projectId = "titledev";
        String bucketName = "dev-pippin";
        String folderPath = "target/cucumber-report-html/cucumber-html-reports";
        String destinationFolderName = "QA";
        String subfolderPrefix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String subfolderName = destinationFolderName + "/" + subfolderPrefix + "/test_report";

        // Create a storage service object using the project ID
        Storage storage = StorageOptions.newBuilder()
                .setProjectId(projectId)
                .setCredentials(GoogleCredentials.getApplicationDefault())
                .build()
                .getService();

        Path folder = Paths.get(folderPath);
        AtomicReference<String> authenticated_Url = new AtomicReference<>(null);

        Files.walk(folder)
                .filter(Files::isRegularFile)
                .forEach(filePath -> {
                    try {
                        // Create a BlobId for each file in the folder
                        String relativePath = subfolderName + "\\" + folder.relativize(filePath).toString();
                        BlobId blobId = BlobId.of(bucketName, relativePath);

                        // Set content type based on file extension
                        String contentType;
                        String fileExtension = filePath.toString().substring(filePath.toString().lastIndexOf('.') + 1);
                        switch (fileExtension.toLowerCase()) {
                            case "html":
                                contentType = "text/html";
                                break;
                            case "css":
                                contentType = "text/css";
                                break;
                            case "js":
                                contentType = "application/javascript";
                                break;
                            case "png":
                                contentType = "image/png";
                                break;
                            case "woff2":
                                contentType = "font/woff2";
                                break;
                            case "woff":
                                contentType = "font/woff";
                                break;
                            case "ttf":
                                contentType = "font/ttf";
                                break;
                            case "svg":
                                contentType = "image/svg+xml";
                                break;
                            case "eot":
                                contentType = "application/vnd.ms-fontobject";
                                break;
                            case "otf":
                                contentType = "font/otf";
                                break;
                            default:
                                contentType = "application/octet-stream"; // Default content type
                                break;
                        }

                        // Upload the file to the bucket
                        Blob blob = storage.create(
                                BlobInfo.newBuilder(blobId)
                                        .setContentType(contentType)
                                        .build(),
                                Files.readAllBytes(filePath)
                        );

                        //System.out.println("File uploaded successfully: " + blob.getName());
                        if (blob.getName().contains("feature-overview")) {
                            long expirationTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(365);
                            URL signedUrl = storage.signUrl(blob, expirationTimeMillis, TimeUnit.MILLISECONDS);
                            authenticated_Url.set(signedUrl.toString());
                            System.out.println("Authenticated URL: " + signedUrl.toString());
                        }
                    } catch (IOException e) {
                        System.err.println("Error uploading file: " + filePath);
                        e.printStackTrace();
                    }
                });

        return authenticated_Url.get();
    }


    public void SendToSlack(String ReportUrl){
        String apiUrl = "https://hooks.slack.com/services/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";


        RestAssured.given()
                .contentType(ContentType.JSON)
                .body("{\"text\": \"" + ReportUrl + "\"}")
                .when()
                .post(apiUrl)
                .then()
                .statusCode(200);


    }


}