package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.BaseClass;
import pageObjects.ClientPage;
import pageObjects.SearchMasterPage;

import java.time.Duration;

public class SearchMasterCreationSteps extends BaseClass {

    static JavascriptExecutor js;
    int RandomNumber;


    @And("User Scrolls down and click on Search Master Link")
    public void userScrollsDownAndClickOnSearchMasterLink() {
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
        SearchMasterPg= new SearchMasterPage(driver);
        js=(JavascriptExecutor)driver;
        RandomNumber =  SearchMasterPg.generateRandomNumber();
        js.executeScript("arguments[0].scrollIntoView(true);",SearchMasterPg.searchMasterLink );
        wdwait.until(ExpectedConditions.invisibilityOf(SearchMasterPg.preload));
        SearchMasterPg.searchMasterLink.click();

    }

    @When("User clicks on Create Master Button")
    public void userClicksOnCreateMasterButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(SearchMasterPg.preload));
        wdwait.until(ExpectedConditions.elementToBeClickable(SearchMasterPg.createMasterButton));
        SearchMasterPg.createMasterButton.click();
    }

    @Then("User gets redirected to create Search Master form")
    public void userGetsRedirectedToCreateSearchMasterForm() {
        wdwait.until(ExpectedConditions.invisibilityOf(SearchMasterPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("searchmaster/new"));

    }

    @When("User enters FirstName {string} LastName {string}")
    public void userEntersFirstNameLastName(String firstName, String lastName) {
        String RandomFirstName = firstName+RandomNumber;
        String RandomLastName = lastName+RandomNumber;

        SearchMasterPg.firstName.sendKeys(RandomFirstName);
        SearchMasterPg.lastName.sendKeys(RandomLastName);

    }

    @And("User click on the Confirm button")
    public void userClickOnTheConfirmButton() {
        SearchMasterPg.confirmButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(SearchMasterPg.preload));

    }

    @Then("Search Master is created successfully")
    public void searchMasterIsCreatedSuccessfully() {
        wdwait.until(ExpectedConditions.invisibilityOf(SearchMasterPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("searchmaster/list"));

    }

    @And("Turn on the toggle for External SM")
    public void turnOnTheToggleForExternalSM() {
        SearchMasterPg.externalSearchMasterToggle.click();
    }

    @And("User enters internal search master email")
    public void userEntersInternalSearchMasterEmail() {
        String Email = "automationIntSearchMaster"+RandomNumber+"@mailinator.com";
        SearchMasterPg.email.sendKeys(Email);
        SearchMasterPg.confirmEmail.sendKeys(Email);


    }

    @And("User enters external search master email")
    public void userEntersExternalSearchMasterEmail() {
        String Email = "automationExtSearchMaster"+RandomNumber+"@mailinator.com";
        SearchMasterPg.email.sendKeys(Email);
        SearchMasterPg.confirmEmail.sendKeys(Email);


    }
}
