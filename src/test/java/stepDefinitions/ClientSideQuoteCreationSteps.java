package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.BaseClass;
import pageObjects.ClientSideQuotePage;

import java.time.Duration;


public class ClientSideQuoteCreationSteps extends BaseClass {
    static JavascriptExecutor js;


    @And("User clicks on request quote button")
    public void userClicksOnRequestQuoteButton() {
        ClientSideQuotePg = new ClientSideQuotePage(driver);
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
        js=(JavascriptExecutor)driver;

        wdwait.until(ExpectedConditions.invisibilityOf(ClientSideQuotePg.preload));
        ClientSideQuotePg.requestQuoteButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ClientSideQuotePg.preload));


    }

    @And("User selects the search Criteria as Full Address and enters the complete address of the property")
    public void userSelectsTheSearchCriteriaAsFullAddressAndEntersTheCompleteAddressOfTheProperty() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientSideQuotePg.preload));
        ClientSideQuotePg.ownerNameTextBox.sendKeys("Test Owner");
        ClientSideQuotePg.buyerNameTextBox.sendKeys("Test Buyer");

        ClientSideQuotePg.propertySearchTextBox.sendKeys("6565 Fannin Street Houston, TX, USA");
        wdwait.until(ExpectedConditions.visibilityOf(ClientSideQuotePg.addressAutoCompleteDropdown));
        wdwait.until(ExpectedConditions.visibilityOf(ClientSideQuotePg.addressAutoCompleteDropdown));
        ClientSideQuotePg.propertySearchTextBox.sendKeys(Keys.DOWN);
        ClientSideQuotePg.propertySearchTextBox.sendKeys(Keys.RETURN);
        wdwait.until(ExpectedConditions.invisibilityOf(ClientSideQuotePg.preload));


    }

    @Then("User clicks on the continue button")
    public void userClicksOnTheContinueButton() {
        wdwait.until(ExpectedConditions.visibilityOf(ClientSideQuotePg.continueButton));
        js.executeScript("arguments[0].click();", ClientSideQuotePg.continueButton);
        wdwait.until(ExpectedConditions.invisibilityOf(ClientSideQuotePg.preload));


    }

    @And("User enters the special instructions")
    public void userEntersTheSpecialInstructions() {
        ClientSideQuotePg.specialInstructions.sendKeys("Automation Test Order");


    }

    @Then("user gets redirected to Quote Details page")
    public void userGetsRedirectedToQuoteDetailsPage() {
        System.out.println(ClientSideQuotePg.quoteNumber.getAttribute("value")+" Quote is successfully Created.");
        Assert.assertTrue(driver.getCurrentUrl().contains("view"));
    }


    @When("User clicks on req quote button")
    public void userClicksOnReqQuoteButton() {
        wdwait.until(ExpectedConditions.visibilityOf(ClientSideQuotePg.reqQuoteButton));
        js.executeScript("arguments[0].click();", ClientSideQuotePg.reqQuoteButton);
        wdwait.until(ExpectedConditions.invisibilityOf(ClientSideQuotePg.preload));

    }
}
