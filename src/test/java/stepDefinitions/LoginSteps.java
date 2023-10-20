package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.BaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginSteps extends BaseClass {
    WebDriver driver;
    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true); //Chrome Headless
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("disable-extensions"); // disabling extensions
        options.addArguments("disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("no-sandbox"); // Bypass OS security model
        options.addArguments("--window-size=1440,900");
        options.addArguments("--remote-allow-origins=*");
//        options.setBrowserVersion("114");


        driver= new ChromeDriver(options);


        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
        LoginPg= new LoginPage(driver);
        HomePg = new HomePage(driver);

    }


    @When("User Opens URL {string}")
    public void user_opens_url(String Url) {
        driver.get(Url);
    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String UserName, String Password) throws InterruptedException {
        LoginPg.setUserName(UserName);
        Thread.sleep(500);
        LoginPg.setPassword(Password);

    }
    @When("Click on Login")
    public void click_on_login() throws InterruptedException {
        LoginPg.clickLogin();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
    }
    @Then("Application Home page should be displayed")
    public void application_home_page_should_be_displayed() throws InterruptedException {
        if(driver.getPageSource().contains("Incorrect username or password."))
        {
            driver.close();
            Assert.fail();

        }
       else if(HomePg.lnkWelcomeMsg.isDisplayed())
        {
            wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
            System.out.println("Login successful");
        }
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

    }
    @When("User click on Log out link")
    public void user_click_on_log_out_link() {
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        HomePg.lnkWelcomeMsg.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        wdwait.until(ExpectedConditions.visibilityOf(LoginPg.welcomeHomeDropDown));
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        LoginPg.clickLogout();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
    }
    @Then("{string} Header should be displayed")
    public void header_should_be_displayed(String adminHeader) {
        if(driver.getPageSource().contains(adminHeader))
        {
            System.out.println("Logout successful");

        }
    }
    @Then("Close browser")
    public void close_browser() {
        driver.manage().deleteAllCookies();
        driver.quit();

    }

    @Then("print the Output")
    public void printTheOutput() {
        System.out.println("Test");
        Assert.assertTrue(true);
    }
}

