package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.AbstractPage;
import pageObjects.BaseClass;


import java.time.Duration;

public class AbstractorCreationSteps extends BaseClass {

    static JavascriptExecutor js;

    @Then("User Scrolls down and click on Abstractors Link")
    public void user_scrolls_down_and_click_on_abstractors_link() {
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
        AbstractPg= new AbstractPage(driver);
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", AbstractPg.abstractLink);
        wdwait.until(ExpectedConditions.invisibilityOf(AbstractPg.preload));
        AbstractPg.abstractLink.click();
    }
    @When("User clicks on Create Abstractor Button")
    public void user_clicks_on_create_abstractor_button() {
        wdwait.until(ExpectedConditions.invisibilityOf(AbstractPg.preload));
        wdwait.until(ExpectedConditions.elementToBeClickable(AbstractPg.createAbstractButton));
        AbstractPg.createAbstractButton.click();

    }
    @Then("User gets redirected to create Abstractors form")
    public void user_gets_redirected_to_create_abstractors_form() {
        wdwait.until(ExpectedConditions.invisibilityOf(AbstractPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("/abstractor/new"));

    }
    @When("User enters abstractor {string} and enter email and confirm email address")
    public void user_enters_abstractor_and_enter_email_and_confirm_email_address(String Name) {
        int RandomNumber = AbstractPg.generateRandomNumber();
        AbstractPg.abstractName.click();
        AbstractPg.abstractName.sendKeys(Name);
        AbstractPg.abstractEmail.click();
        AbstractPg.abstractEmail.sendKeys(Name+RandomNumber+"@mailinator.com");
        AbstractPg.abstractConfirmEmail.click();
        AbstractPg.abstractConfirmEmail.sendKeys(Name+RandomNumber+"@mailinator.com");


    }
    @When("User clicks on Confirm Button")
    public void user_clicks_on_confirm_button() {
        js.executeScript("window.scrollBy(0,1000)");
        AbstractPg.absConfirmButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(AbstractPg.preload));

    }
}
