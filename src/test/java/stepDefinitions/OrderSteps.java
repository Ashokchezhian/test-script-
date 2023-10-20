package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjects.*;

import java.util.List;


public class OrderSteps extends BaseClass{

    static JavascriptExecutor js;
    String orderNum = null;

    @When("User click on Create Order")
    public void userClickOnCreateOrder() throws InterruptedException {
        HomePg = new HomePage(driver);
        LoginPg= new LoginPage(driver);
        Orderpg= new OrderPage(driver);
        js=(JavascriptExecutor)driver;

        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        wdwait.until(ExpectedConditions.elementToBeClickable(HomePg.btnCreateOrder));
        HomePg.btnCreateOrder.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
    }

    @Then("{string} and {string} page displayed")
    public void andPageDisplayed(String strHeader, String strStepNumber) throws InterruptedException {
        Orderpg=new OrderPage(driver);
        waitForElement(Orderpg.txtStep);
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.txtStep));
        if(Orderpg.txtHeader.getText().equalsIgnoreCase(strHeader) && Orderpg.txtStep.getText().contains(strStepNumber))
        {
            System.out.println(strHeader+" page displayed with step number as "+strStepNumber);
        }
        else
        {
            Assert.assertTrue("Place New Order page displayed instead of Place New Order".equalsIgnoreCase(Orderpg.txtHeader.getText()+" page displayed instead of "+strHeader));
        }

    }

    @When("User select Customer as {string} and product as {string} and client reference as {string}")
    public void userSelectCustomerAsAndProductAsAndClientReferenceAs(String strClient, String strProduct, String strClientRef) {

        //Select customer
        Orderpg.drpDownCustomer.click();
        wdwait.until(ExpectedConditions.elementToBeClickable(Orderpg.inputClient));
        Orderpg.inputClient.sendKeys(strClient);
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.optionClient));
        Orderpg.optionClient.click();

        //Select Product
        Orderpg.drpDownProduct.click();
        wdwait.until(ExpectedConditions.elementToBeClickable(Orderpg.inputProduct));
        Orderpg.inputProduct.sendKeys(strProduct);
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.optionProduct));
        Orderpg.optionProduct.click();

        //Enter Client Ref Number
        Orderpg.inputClientRefNum.sendKeys(strClientRef);

    }

    @And("click on Continue To Property Search")
    public void clickOnContinueToPropertySearch() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView(true);", Orderpg.btnContinue);
        wdwait.until(ExpectedConditions.elementToBeClickable(Orderpg.btnContinue));
        Orderpg.btnContinue.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

    }


    @And("click on Continue To Processing")
    public void clickOnContinueToProcessing()throws InterruptedException {
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.btnContinueOrderPricing));
        js.executeScript("arguments[0].click();", Orderpg.btnContinueOrderPricing);
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
    }

    @When("User click on Place Order")
    public void userClickOnPlaceOrder()throws InterruptedException {

        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        js.executeScript("arguments[0].click();", Orderpg.btnPlaceOrder);
        js.executeScript("window.scrollBy(0,1400)");
        js.executeScript("arguments[0].click();", Orderpg.btnPlaceOrder);
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

    }

    @Then("Order created")
    public void orderCreated() {
        Orderpg= new OrderPage(driver);

        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(0,-350)");
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

        waitForElement(Orderpg.txtOrderNum);
        orderNum = Orderpg.txtOrderNum.getAttribute("value");
        if(!orderNum.isEmpty())
            System.out.println("Order created successfully with Order # "+ orderNum);
        else
        {
            //Take Screen shot of the page
            takeScreenShot(driver);
            Assert.assertTrue(false , "Order is not created");
        }
    }

    @And("Order details {string} and {string} and {string} and {string} displayed in the Order Info page.")
    public void orderDetailsAndAndAndDisplayedInTheOrderInfoPage(String strClientRefNum, String strProduct, String strState, String strCounty) {

        String appClientRef = Orderpg.txtClientRef.getAttribute("value");
        String appProduct= Orderpg.txtProduct.getAttribute("value");
        String appState=Orderpg.txtState.getAttribute("value");
        String appCounty=Orderpg.txtCounty.getAttribute("value");
        if(appClientRef.equalsIgnoreCase(strClientRefNum) && appProduct.equalsIgnoreCase(strProduct) && appState.equalsIgnoreCase(strState) && appCounty.equalsIgnoreCase(strCounty))
        {
            System.out.println("Order details displayed correctly "+" , Client Reference Number: "+strClientRefNum+ " , Product: "+strProduct+" , State: "+ strState +" , County: "+ strCounty);
        }
        else
        {
            takeScreenShot(driver);
            Assert.assertTrue( false,"Order details displayed incorrectly "+" , Client Reference Number: "+appClientRef+" , Product: "+appProduct+" , State: "+ appState +" , County: "+ appCounty);
        }
    }

    @When("User select Search Criteria as {string} and Address type as {string} and Address as {string} and Address Line as {string}")
    public void userSelectSearchCriteriaAsAndAddressTypeAsAndAddressAsAndAddressLineAs(String strSearchCriteria, String strAddressType, String strAddress,String strAddressLine1) throws InterruptedException {
        LoginPg= new LoginPage(driver);

        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

        //Select Search Criteria
        Orderpg.drpDownSearchCriteria.click();

        if(strSearchCriteria.equalsIgnoreCase("Full Address"))
        {
            Orderpg.optionFullSearch.click();
        }

        //Selecting Address
        if(strAddressType.equalsIgnoreCase("Auto Address"))
        {
            Orderpg.rdBtnAddressType.click();
        }
        Orderpg.inputAddress.sendKeys(strAddress);
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.addressAutoCompleteDropdown));
        Orderpg.inputAddress.sendKeys(Keys.DOWN);
        Orderpg.inputAddress.sendKeys(Keys.RETURN);
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));



    }

    @Then("Order Info page displayed with {string} option")
    public void order_info_page_displayed_with_option(String strOption) throws InterruptedException {
        Orderpg= new OrderPage(driver);
        if (strOption.equalsIgnoreCase("assign to screener"))
        {
            wdwait.until(ExpectedConditions.visibilityOf(Orderpg.btnAssignToScreener));
            Assert.assertTrue(Orderpg.btnAssignToScreener.isDisplayed(), strOption+"  button displayed in Order Info page");
        }
        else if (strOption.equalsIgnoreCase("confirm"))
        {
            wdwait.until(ExpectedConditions.visibilityOf(Orderpg.btnConfirm));
            Assert.assertTrue(Orderpg.btnConfirm.isDisplayed(), strOption+" button displayed in Order Info page");
        }
        else if (strOption.equalsIgnoreCase("assign to process"))
        {
            wdwait.until(ExpectedConditions.visibilityOf(Orderpg.btnAssignToProcess));
            Assert.assertTrue(Orderpg.btnAssignToProcess.isDisplayed(), strOption+" button displayed in Order Info page");
        }
        else if (strOption.equalsIgnoreCase("complete"))
        {
            wdwait.until(ExpectedConditions.visibilityOf(Orderpg.btnComplete));
            Assert.assertTrue(Orderpg.btnComplete.isDisplayed(), strOption+" button displayed in Order Info page");
        }
    }

    @When("User click {string} and select admin user {string} and Confirm")
    public void user_click_and_select_admin_user_and_confirm(String strOption, String strAdminUser) throws InterruptedException {

        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

        if (strOption.equalsIgnoreCase("assign to screener"))
        {
            wdwait.until(ExpectedConditions.elementToBeClickable(Orderpg.btnAssignToScreener));
            Orderpg.btnAssignToScreener.click();
            wdwait.until(ExpectedConditions.visibilityOf(Orderpg.dialogWindow));
            wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
            String title = Orderpg.txtWindowTitle.getText();
            Assert.assertTrue(Orderpg.dialogWindow.isDisplayed(), title + " window displayed");
            wdwait.until(ExpectedConditions.elementToBeClickable(Orderpg.assigntoMe));
            Orderpg.assigntoMe.click();
            Orderpg.inputHours.sendKeys("10");
        }
        else if (strOption.equalsIgnoreCase("assign to process"))
        {
            wdwait.until(ExpectedConditions.elementToBeClickable(Orderpg.btnAssignToProcess));
            Orderpg.btnAssignToProcess.click();
            wdwait.until(ExpectedConditions.visibilityOf(Orderpg.dialogWindow));
            wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
            String title = Orderpg.txtWindowTitle.getText();
            Assert.assertTrue(Orderpg.dialogWindow.isDisplayed(), title + " window displayed");
            wdwait.until(ExpectedConditions.elementToBeClickable(Orderpg.assigntoMe));
            Orderpg.assigntoMe.click();
            Orderpg.inputHours.sendKeys("12");
        }
        Orderpg.btnConfirmScreener.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
    }

    @Then("Order assigned to admin user {string}")
    public void order_assigned_to_admin_user(String strAdminUser) {

        wdwait.until(ExpectedConditions.elementToBeClickable(Orderpg.txtHandledBy));
        String appAdminUser = Orderpg.txtHandledBy.getAttribute("value");
       // Assert.assertTrue(appAdminUser.equalsIgnoreCase(strAdminUser), "Order assigned to "+ appAdminUser + "successfully");
        Orderpg.txtHandledBy.click();
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.dialogWindow));
        Assert.assertTrue(Orderpg.dialogWindow.isDisplayed(), "Handled By field value is hyperlinked");
        Orderpg.btnCancel.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

    }

    @When("User click {string} and Confirm address")
    public void user_click_and_confirm_address(String string) throws InterruptedException {
        Orderpg= new OrderPage(driver);
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        Orderpg.btnConfirm.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.dialogWindow));
        Assert.assertTrue(Orderpg.dialogWindow.isDisplayed(), "Confirm Address window displayed");
        Orderpg.rdBtnValidatedAddress.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

        Orderpg.btnConfirmAddress.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.txtHeader));
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        Assert.assertTrue(Orderpg.txtHeader.getText().equalsIgnoreCase("confirm new order"), "Confirm New Order window displayed");
        js.executeScript("arguments[0].scrollIntoView(true);", Orderpg.btnConfirmOrder);
        js.executeScript("arguments[0].click();", Orderpg.btnConfirmOrder);

        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.windowCalendar));
        if(Orderpg.windowCalendar.isDisplayed())
        {
            Orderpg.txtTodaysDate.click();
            wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

            js.executeScript("arguments[0].click();", Orderpg.btnConfirmOrder);
            wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

        }
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.btnProgressBar));
        
    }

    @Then("Order Confirmed")
    public void order_confirmed() {

        Assert.assertTrue(Orderpg.txtConfirmStatus.getText().equalsIgnoreCase("confirmed"), "Confirm order status displayed");
    }

    @When("User click {string} and enter data in check list window")
    public void userClickAndEnterDataInCheckListWindow(String arg0) throws InterruptedException {
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        Orderpg.btnComplete.click();
        waitForElement(Orderpg.dialogWindow);
        Assert.assertTrue(Orderpg.dialogWindow.isDisplayed());
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

        //check list window first screen
        String title = Orderpg.txtWindowTitle.getText();
        Assert.assertTrue(title.equalsIgnoreCase("Completion (1 of 3) - Documents review"));
        Orderpg.btnChkListNext1.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

        //check list window second screen
//        waitForElement(Orderpg.dialogWindow);
//        title = Orderpg.txtWindowTitle.getText();
//        Assert.assertTrue(title.equalsIgnoreCase("Completion (2 of 4) - Order Checklist"));
//
//
//        Orderpg.orderChecklistIdentificationToggle.click();
//        Orderpg.orderChecklistDeliveryMethodToggle.click();
//        Orderpg.orderChecklistAssessmentAndTaxesToggle.click();
//        Orderpg.orderChecklistLegalDescriptionToggle.click();
//        Orderpg.orderChecklistJudgementsToggle.click();
//        Orderpg.orderChecklistTitleChainToggle.click();
//        Orderpg.orderChecklistProceedingsToggle.click();
//        Orderpg.orderChecklistSecurityInstrumentsToggle.click();
//        Orderpg.orderChecklistDocumentsToggle.click();
//        js.executeScript("window.scrollBy(0,1000)");
//        Orderpg.orderChecklistSOPsToggle.click();
//        Orderpg.orderChecklistCostsAndFeesToggle.click();
//        wdwait.until(ExpectedConditions.elementToBeClickable(Orderpg.btnChkListNext2));
//        Orderpg.btnChkListNext2.click();
//        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

        //check list window third screen
        waitForElement(Orderpg.dialogWindow);
        title = Orderpg.txtWindowTitle.getText();
        Assert.assertTrue(title.equalsIgnoreCase("Completion (2 of 3) - Comments"));
        Orderpg.btnChkListNext3.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));

        //check list window Fourth screen
        waitForElement(Orderpg.dialogWindow);
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        title = Orderpg.txtWindowTitle.getText();
        Assert.assertTrue(title.equalsIgnoreCase("Completion (3 of 3) - Review complete package"));
        Orderpg.btnChkListComplete.click();
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));


    }

    @Then("Order completed")
    public void orderCompleted() {
        js.executeScript("window.scrollBy(0,1000)");
        Assert.assertTrue(Orderpg.txtCompleteStatus.getText().contains("completed"));
    }

    @Then("User turns on the Priority toggle")
    public void userTurnsOnThePriorityToggle() {
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        waitForElement(Orderpg.inputSpecialInstr);
        Orderpg.inputSpecialInstr.click();
        Orderpg.inputSpecialInstr.sendKeys("Automation Test Order");
        js.executeScript("arguments[0].click();", Orderpg.priorityToggle);
    }

    @Then("User turns on the Escalated toggle")
    public void userTurnsOnTheEscalatedToggle() {
        wdwait.until(ExpectedConditions.invisibilityOf(LoginPg.preload));
        waitForElement(Orderpg.inputSpecialInstr);
        Orderpg.inputSpecialInstr.click();
        Orderpg.inputSpecialInstr.sendKeys("Automation Test Order");
        js.executeScript("arguments[0].click();", Orderpg.escalatedToggle);
    }

    @Then("User clicks on the Cancel Order button")
    public void userClicksOnTheCancelOrderButton() {
        Orderpg.cancelOrderButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));

    }


    @Then("User clicks on cancel order button to send the message")
    public void userClicksOnCancelOrderButtonToSendTheMessage() {
        Orderpg.cancelMessageButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));

    }

    @And("User selects the Reason for cancellation from the dropdown")
    public void userSelectsTheReasonForCancellationFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));
        Orderpg.selectDropdown.click();
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));
        Orderpg.selectReason.click();
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));
    }


    @Then("User navigates to the Homepage")
    public void userNavigatesToTheHomepage() {
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));
        Orderpg.homePageLogo.click();
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));

    }

    @And("User enters the order id in the searchbox")
    public void userEntersTheOrderIdInTheSearchbox() {
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));
        Orderpg.orderIdSearchBox.sendKeys(orderNum);
        Orderpg.orderIdSearchBox.sendKeys(Keys.ENTER);
//        js.executeScript("window.scrollBy(0,800)");

    }

    @Then("user clicks on click to assign link on the order listing page")
    public void userClicksOnClickToAssignLinkOnTheOrderListingPage() throws InterruptedException {
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(3000,0)");
        Orderpg.clickToAssignButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));

    }

    @And("User assigns the order to a user and enters the time to complete and clicks  on confirm")
    public void userAssignsTheOrderToAUserAndEntersTheTimeToCompleteAndClicksOnConfirm() {
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.dialogWindow));
        wdwait.until(ExpectedConditions.elementToBeClickable(Orderpg.assigntoMe));
        Orderpg.assigntoMe.click();
        Orderpg.inputHours.sendKeys("10");
        Orderpg.btnConfirmScreener.click();
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));


    }

    @And("User select {int} orders by clicking on the checkbox")
    public void userSelectOrdersByClickingOnTheCheckbox(int numberOfCheckbox) {
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']//parent::div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));
        int count=0;
        for (WebElement i:checkBoxes) {
            if(count>=numberOfCheckbox){
                break;
            }
            i.click();
            count++;
        }

    }

    @Then("User clicks on assign button")
    public void userClicksOnAssignButton() {
        Orderpg= new OrderPage(driver);
        Orderpg.assignButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));

    }

    @When("User click on edit Order Button")
    public void userClickOnEditOrderButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));
        Orderpg.editOrderButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));

    }

    @Then("User gets redirected to the edit order page")
    public void userGetsRedirectedToTheEditOrderPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("edit"));
        js.executeScript("window.scrollBy(0,-350)");


    }

    @Then("User edits the  fields like {string} and address line")
    public void userEditsTheFieldsLikeAndAddressLine(String ClientRefNumber) {
        Orderpg.clientReferenceField.clear();
        String newClientRefNumber = ClientRefNumber+ " test";
        Orderpg.clientReferenceField.sendKeys(newClientRefNumber);
        String addressLine1 = Orderpg.addressLine1Field.getText();
        String newAddressLine1 = addressLine1 + " test";
        Orderpg.addressLine1Field.sendKeys(newAddressLine1);

    }

    @And("User changes the Order due date")
    public void userChangesTheOrderDueDate() {
        wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));
        wdwait.until(ExpectedConditions.visibilityOf(Orderpg.windowCalendar));
        if(Orderpg.windowCalendar.isDisplayed())
        {
            Orderpg.orderDueDateCalendar.click();
            Orderpg.getWindowCalendarNextMonth.click();
            Orderpg.getGetWindowCalendarNextMonthDay1.click();
            wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));
            js.executeScript("arguments[0].click();", Orderpg.saveChangesButton);

        }
    }

    @When("User handles all the popup and clicks on save changes button")
    public void userHandlesAllThePopupAndClicksOnSaveChangesButton() {

        if(Orderpg.reasonForChange.isDisplayed())
        {
            Orderpg.reasonForChangeTextBox.sendKeys("Automation Due Date change");
            Orderpg.confirmButton.click();
            wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));

        }
        if(Orderpg.etaNote.isDisplayed())
        {
            Orderpg.confirmButton.click();
            wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));

        }
        if(Orderpg.orderETAChange.isDisplayed()){
            Orderpg.reasonForETAChange.click();
            wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));
            Orderpg.reasonForETAChange.sendKeys(Keys.ENTER);
            wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));
            Orderpg.reasonForChangeTextBox.sendKeys("Automation Due Date change");
            Orderpg.confirmButton.click();
            wdwait.until(ExpectedConditions.invisibilityOf(Orderpg.preload));

        }

    }
}
