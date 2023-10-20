package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OrderPage;
import pageObjects.BaseClass;

import pageObjects.QuotePage;

public class QuoteSteps extends BaseClass {

    static JavascriptExecutor js;

    @When("User click on Create Quote")
    public void userClickOnCreateQuote() {
        HomePg = new HomePage(driver);
        LoginPg= new LoginPage(driver);
        Orderpg= new OrderPage(driver);
        QuotePg = new QuotePage(driver);
        js=(JavascriptExecutor)driver;

        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        wdwait.until(ExpectedConditions.elementToBeClickable(HomePg.btnCreateQuote));
        HomePg.btnCreateQuote.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

    }

    @When("User select Customer as {string}")
    public void userSelectCustomerAs(String strClient) {
        QuotePg.drpDownCustomer.click();
        wdwait.until(ExpectedConditions.elementToBeClickable(QuotePg.inputClient));
        QuotePg.inputClient.sendKeys(strClient);
        wdwait.until(ExpectedConditions.visibilityOf(QuotePg.optionClient));
        QuotePg.optionClient.click();

    }

    @And("click on Continue Button")
    public void clickOnContinueButton() throws InterruptedException {
        js.executeScript("arguments[0].click();", QuotePg.btnContinueQuote);

    }

    @Then("user enters Special Instructions as {string} Place Order")
    public void userEntersSpecialInstructionsAsPlaceOrder(String SpecialIns) {
        QuotePg.splInsTab.click();
        QuotePg.splInsTab.sendKeys(SpecialIns);
    }


    @Then("Quote Info page displayed")
    public void quoteInfoPageDisplayed() {
    }


    @When("user clicks on the Continue button in Spl Instruction")
    public void userClicksOnTheContinueButtonInSplInstruction() throws InterruptedException {
        wdwait.until(ExpectedConditions.elementToBeClickable(QuotePg.btnContinueQuoteSpl));
        QuotePg.btnContinueQuoteSpl.click();
    }

    @When("user clicks on the Request Quote button")
    public void userClicksOnTheRequestQuoteButton() throws InterruptedException {
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        wdwait.until(ExpectedConditions.elementToBeClickable(QuotePg.btnRequestQuote));
        QuotePg.btnRequestQuote.click();

    }

    @When("User clicks Complete Quote")
    public void userClicksCompleteQuote() throws InterruptedException {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        QuotePg.btnCompleteQuote.click();
        wdwait.until(ExpectedConditions.visibilityOf( QuotePg.quotePrice));
        QuotePg.quotePrice.sendKeys("1000");
        wdwait.until(ExpectedConditions.visibilityOf( QuotePg.quoteETA));
        QuotePg.quoteETA.sendKeys("2");
        wdwait.until(ExpectedConditions.visibilityOf( QuotePg.quoteComment));
        QuotePg.quoteComment.sendKeys("Automation Test Quote Comments");
        wdwait.until(ExpectedConditions.elementToBeClickable(QuotePg.btnCompleteChecklist));
        QuotePg.btnCompleteChecklist.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

    }

    @Then("Quote is completed")
    public void quoteIsCompleted() {
        js.executeScript("window.scrollBy(0,1000)");
    }

    @Then("{string} and {string} page is displayed")
    public void andPageIsDisplayed(String strHeader, String strStepNumber) {
        Orderpg= new OrderPage(driver);
        waitForElement(Orderpg.txtStep);
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.txtStep));
        if(Orderpg.txtHeader.getText().equalsIgnoreCase(strHeader) && Orderpg.txtStep.getText().contains(strStepNumber))
        {
            System.out.println(strHeader+" page displayed with step number as "+strStepNumber);
        }
        else
        {
            Assert.assertEquals(Orderpg.txtHeader.getText()+" page displayed instead of "+strHeader, "Place New Quote page displayed instead of Place New Quote");
        }
    }

    @And("User enters the client reference number")
    public void userEntersTheClientReferenceNumber() {
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        QuotePg.clientReferenceNumber.sendKeys("AutomationTestClientReferenceNumber");
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

    }

    @When("User clicks on convert to order")
    public void userClicksOnConvertToOrder() {
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        QuotePg.convertToOrderButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

    }

    @Then("a dialog box for converting a quote to an order is prompted and user selects a product and enter the client reference number")
    public void aDialogBoxForConvertingAQuoteToAnOrderIsPromptedAndUserSelectsAProductAndEnterTheClientReferenceNumber() {
        QuotePg.selectProductDropdown.click();
        QuotePg.inputProductName.sendKeys("Attorney");
        QuotePg.inputProductName.sendKeys(Keys.ENTER);
        QuotePg.clientRefNumberTextarea.clear();
        QuotePg.clientRefNumberTextarea.sendKeys("AutomationTestClientReferenceNumber");
    }

    @And("User converts the quote into an order")
    public void userConvertsTheQuoteIntoAnOrder() {
        QuotePg.btnCompleteChecklist.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

    }

    @When("User click on edit Quote Button")
    public void userClickOnEditQuoteButton() {
        QuotePg = new QuotePage(driver);
        wdwait.until(ExpectedConditions.invisibilityOf(QuotePg.preload));
        QuotePg.editQuoteButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(QuotePg.preload));


    }

    @Then("User edits the  quote fields like {string} and address line")
    public void userEditsTheQuoteFieldsLikeAndAddressLine(String ClientRefNumber) {
        QuotePg.clientReferenceField.clear();
        String newClientRefNumber = ClientRefNumber+ " test";
        QuotePg.clientReferenceField.sendKeys(newClientRefNumber);
        String addressLine1 = QuotePg.addressLine1Field.getText();
        String newAddressLine1 = addressLine1 + " test";
        QuotePg.addressLine1Field.sendKeys(newAddressLine1);

        wdwait.until(ExpectedConditions.invisibilityOf(QuotePg.preload));
        js.executeScript("arguments[0].click();", QuotePg.saveChangesButton);
    }
}
