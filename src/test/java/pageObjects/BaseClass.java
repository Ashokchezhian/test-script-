package pageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Random;
//import pageObjects.QuotePage;

public class BaseClass {

    public static WebDriver driver;
    public static WebDriverWait wdwait;
    public LoginPage LoginPg;
    public HomePage HomePg;
    public OrderPage Orderpg;
    public QuotePage QuotePg;
    public CompanyPage CompanyPg;
    public ClientPage ClientPg;
    public  SearchMasterPage SearchMasterPg;
    public AdminPage AdminPg;
    public AbstractPage AbstractPg;
    public ClientLoginPage ClientLoginPg;
    public ClientSideQuotePage ClientSideQuotePg;
    public ClientOrderPage ClientOrderPg;
    public ClientPanelPage ClientPanelPg;
    public ReportPage ReportPg;



    public void takeScreenShot(WebDriver sdriver) {
        TakesScreenshot scrShot = ((TakesScreenshot)sdriver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(System.getProperty("user.dir")+"//Screenshots");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void waitForElement(WebElement element)
    {
        for(int i=0;i<10;i++)
        {
            wdwait.until(ExpectedConditions.visibilityOf(element));
            if(element.isDisplayed())
            {
                break;
            }
        }
    }
    public void waitForElementClickable(WebElement element)
    {
        for(int i=0;i<10;i++)
        {
            wdwait.until(ExpectedConditions.elementToBeClickable(element));
            if(element.isSelected())
            {
                break;
            }
        }
    }

    public int generateRandomNumber(){
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int randomInteger = rand.nextInt(1000);
        return randomInteger;
    }

}
