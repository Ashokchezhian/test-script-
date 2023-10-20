package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjects.*;

public class ClientOrderSteps extends BaseClass {

    static JavascriptExecutor js;


    @When("User click on place Order")
    public void userClickOnPlaceOrder() {
        ClientLoginPg = new ClientLoginPage(driver);
        ClientOrderPg = new ClientOrderPage(driver);
        ClientSideQuotePg = new ClientSideQuotePage(driver);
        js=(JavascriptExecutor)driver;

        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));
        wdwait.until(ExpectedConditions.elementToBeClickable(ClientOrderPg.btnPlaceOrder));
        ClientOrderPg.btnPlaceOrder.click();
    }

    @Then("{string} and {string} client page displayed")
    public void andClientPageDisplayed(String strHeader, String strStepNumber) {
            waitForElement(ClientOrderPage.textStep);
            wdwait.until(ExpectedConditions.visibilityOf(ClientOrderPage.textStep));
            if(ClientOrderPg.textHeader.getText().equalsIgnoreCase(strHeader) && ClientOrderPg.textStep.getText().contains(strStepNumber))
            {
                System.out.println(strHeader+" page displayed with step number as "+strStepNumber);
            }
            else
            {
                //Assert.assertEquals(OrderPage.txtHeader.getText()+" page displayed instead of "+strHeader, "Place New Order page displayed instead of Place New Order");
                Assert.assertTrue("Place New Order page displayed instead of Place New Order".equalsIgnoreCase(ClientOrderPage.textHeader.getText()+" page displayed instead of "+strHeader));
            }

        }

    @When("User select Product as {string}")
    public void userSelectProductAs(String strProduct) {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));
        ClientOrderPg.rbtCurrentOwnerSearch.click();

    }

    @When("User select Search Criteria as {string} and Address type as {string} and Address as {string}")
    public void userSelectSearchCriteriaAsAndAddressTypeAsAndAddressAs(String strSearchCriteria, String strAddressType, String strAddress) throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView(true);", ClientOrderPg.fullSearch);
        Thread.sleep(500);

        if(strAddressType.equalsIgnoreCase("Auto Address"))
        {
            ClientOrderPg.rdBtnAutoComplete.click();
        }
        ClientOrderPg.propertySearchTextBox.sendKeys("12342 Coit Road Dallas, TX, USA");
        wdwait.until(ExpectedConditions.visibilityOf(ClientOrderPg.addressAutoCompleteDropdown));
        ClientOrderPg.propertySearchTextBox.sendKeys(Keys.DOWN);
        ClientOrderPg.propertySearchTextBox.sendKeys(Keys.RETURN);
        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));
    }

    @Then("User enters client reference as {string}")
    public void userEntersClientReferenceAs(String strReference) throws InterruptedException {
            js.executeScript("arguments[0].scrollIntoView(true);", ClientOrderPg.additionalInfo);
            wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));
            ClientOrderPg.inputClientRefNum.sendKeys(strReference);
    }

    @When("User click on Complete Button")
    public void userClickOnCompleteButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));
        ClientOrderPg.continueButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));

    }

    @When("User click on on the accept terms and conditions checkbox and clicks on the submit button")
    public void userClickOnOnTheAcceptTermsAndConditionsCheckboxAndClicksOnTheSubmitButton() throws InterruptedException {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));
        //js.executeScript("window.scrollBy(0,1000)");
        js.executeScript("arguments[0].scrollIntoView(true);", ClientOrderPg.submitButton);
        Thread.sleep(500);
        ClientOrderPg.checkBoxClick.click();
        ClientOrderPg.submitButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));


    }


    @Then("User click on the continue button")
    public void userClickOnTheContinueButton() {
        wdwait.until(ExpectedConditions.visibilityOf(ClientOrderPg.continueButton1));
        js.executeScript("arguments[0].click();", ClientOrderPg.continueButton1);
        wdwait.until(ExpectedConditions.invisibilityOf(ClientOrderPg.preload));


    }
}




