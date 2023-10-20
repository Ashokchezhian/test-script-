package testRunner;

import com.lowagie.text.DocumentException;
import io.restassured.response.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.xhtmlrenderer.layout.SharedContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileSystems;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//Features"}, //".//Features/Login.feature",".//Features/QuoteCreate.feature",".//Features/OrderCreation.feature"
		glue = "stepDefinitions",
		dryRun=false,
		monochrome=true, //removes unnecessary characters in console
		plugin={"pretty","html:target/cucumber-reports","json:target/cucumber.json"}

		)



public class TestRun {

}


