package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjects.BaseClass;
import pageObjects.HomePage;

import java.io.File;

public class AdminPanelListingSteps extends BaseClass {

    static JavascriptExecutor js;
    @When("User Clicks on the Inbox section")
    public void userClicksOnTheInboxSection() {
        HomePg = new HomePage(driver);
        js=(JavascriptExecutor)driver;

        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.inboxButton.click();

    }

    @Then("User gets redirected to inbox page")
    public void userGetsRedirectedToInboxPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("inbox"));


    }

    @When("User Clicks on the New Orders section")
    public void userClicksOnTheNewOrdersSection() {
        HomePg = new HomePage(driver);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.newOrdersButton.click();
    }

    @Then("User gets redirected to new orders page")
    public void userGetsRedirectedToNewOrdersPage() {

        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/new"));
    }

    @When("User Clicks on the Confirmed Orders section")
    public void userClicksOnTheConfirmedOrdersSection() {
        HomePg = new HomePage(driver);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.confirmedOrdersButton.click();
    }

    @Then("User gets redirected to Confirmed orders page")
    public void userGetsRedirectedToConfirmedOrdersPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/confirmed"));
    }

    @When("User Clicks on the Orders in progress section")
    public void userClicksOnTheOrdersInProgressSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.ordersInProgressButton.click();
    }

    @Then("User gets redirected to Orders in progress page")
    public void userGetsRedirectedToOrdersInProgressPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/inprocess"));
    }

    @When("User Clicks on the Orders Due section")
    public void userClicksOnTheOrdersDueSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.ordersDueButton.click();
    }

    @Then("User gets redirected to orders due page")
    public void userGetsRedirectedToOrdersDuePage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("all/orders/due"));
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
    }

    @When("User Clicks on the Orders search section")
    public void userClicksOnTheOrdersSearchSection() {
        HomePg = new HomePage(driver);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.orderSearchButton.click();
    }

    @Then("User gets redirected to orders search page")
    public void userGetsRedirectedToOrdersSearchPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/search"));
    }

    @When("User Clicks on the completed orders section")
    public void userClicksOnTheCompletedOrdersSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.completedOrdersButton.click();
    }

    @Then("User gets redirected to completed orders page")
    public void userGetsRedirectedToCompletedOrdersPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/completed"));
    }

    @When("User Clicks on the paused order section")
    public void userClicksOnThePausedOrderSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.pausedOrdersButton.click();
    }

    @Then("User gets redirected to paused orders page")
    public void userGetsRedirectedToPausedOrdersPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/paused"));
    }

    @When("User Clicks on the cancelled orders section")
    public void userClicksOnTheCancelledOrdersSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.cancelledOrdersButton.click();
    }

    @Then("User gets redirected to cancelled order page")
    public void userGetsRedirectedToCancelledOrderPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/cancelled"));
    }

    @When("User Clicks on the quote request section")
    public void userClicksOnTheQuoteRequestSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.quoteRequestsButton.click();
    }

    @Then("User gets redirected to quote requested page")
    public void userGetsRedirectedToQuoteRequestedPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/requestquote"));
    }

    @When("User Clicks on the priority client orders section")
    public void userClicksOnThePriorityClientOrdersSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.priorityClientOrdersButton.click();
    }

    @Then("User gets redirected to priority client orders page")
    public void userGetsRedirectedToPriorityClientOrdersPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("new/client/orders"));
    }

    @When("User Clicks on the ready for billing section")
    public void userClicksOnTheReadyForBillingSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.readyForBillingButton.click();
    }

    @Then("User gets redirected to ready for billing page")
    public void userGetsRedirectedToReadyForBillingPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/billing"));
    }

    @When("User Clicks on the priority orders section")
    public void userClicksOnThePriorityOrdersSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.priorityOrdersButton.click();
    }

    @Then("User gets redirected to priority orders page")
    public void userGetsRedirectedToPriorityOrdersPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/priority"));
    }

    @When("User Clicks on the escalations section")
    public void userClicksOnTheEscalationsSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js=(JavascriptExecutor)driver;

        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.escalatedOrdersButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.escalatedOrdersButton.click();
    }

    @Then("User gets redirected to escalated orders page")
    public void userGetsRedirectedToEscalatedOrdersPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/escalated"));
    }

    @When("User Clicks on the watched order section")
    public void userClicksOnTheWatchedOrderSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.watchedOrdersButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.watchedOrdersButton.click();
    }

    @Then("User gets redirected to watched orders page")
    public void userGetsRedirectedToWatchedOrdersPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/watched"));
    }

    @When("User Clicks on the Abstractors section")
    public void userClicksOnTheAbstractorsSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.abstractorsButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.abstractorsButton.click();
    }

    @Then("User gets redirected to Abstractors page")
    public void userGetsRedirectedToAbstractorsPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("abstractor"));
    }

    @When("User Clicks on the Admins section")
    public void userClicksOnTheAdminsSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.adminsButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.adminsButton.click();
    }

    @Then("User gets redirected to admin page")
    public void userGetsRedirectedToAdminPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("users"));
    }

    @When("User Clicks on the client section")
    public void userClicksOnTheClientSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.clientsButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.clientsButton.click();
    }

    @Then("User gets redirected to clients page")
    public void userGetsRedirectedToClientsPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("clients"));
    }

    @When("User Clicks on the company section")
    public void userClicksOnTheCompanySection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.companyButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.companyButton.click();
    }

    @Then("User gets redirected to company's page")
    public void userGetsRedirectedToCompanySPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("organization"));
    }


    @When("User Clicks on the email templates section")
    public void userClicksOnTheEmailTemplatesSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.emailTemplatesButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.emailTemplatesButton.click();
    }

    @Then("User gets redirected to email templates page")
    public void userGetsRedirectedToEmailTemplatesPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("email-templates"));
    }

    @When("User Clicks on the eula section")
    public void userClicksOnTheEulaSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.eulaButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.eulaButton.click();
    }

    @Then("User gets redirected to eula page")
    public void userGetsRedirectedToEulaPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("eula"));
    }

    @When("User Clicks on the groups section")
    public void userClicksOnTheGroupsSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.groupsButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.groupsButton.click();
    }

    @Then("User gets redirected to groups page")
    public void userGetsRedirectedToGroupsPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("groups"));
    }

    @When("User Clicks on the Invoices section")
    public void userClicksOnTheInvoicesSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.invoicesButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.invoicesButton.click();
    }

    @Then("User gets redirected to invoices page")
    public void userGetsRedirectedToInvoicesPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/invoice"));
    }

    @When("User Clicks on the notifications section")
    public void userClicksOnTheNotificationsSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.notificationsButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.notificationsButton.click();
    }

    @Then("User gets redirected to notifications page")
    public void userGetsRedirectedToNotificationsPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("notifications/details"));
    }

    @When("User Clicks on the pricing custom section")
    public void userClicksOnThePricingCustomSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.pricingCustomButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.pricingCustomButton.click();
    }

    @Then("User gets redirected to custom pricing page")
    public void userGetsRedirectedToCustomPricingPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("custom-pricing/view"));
    }

    @When("User Clicks on the pricing product section")
    public void userClicksOnThePricingProductSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.pricingProductButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.pricingProductButton.click();
    }

    @Then("User gets redirected to product pricing page")
    public void userGetsRedirectedToProductPricingPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("product-pricing/view"));
    }

    @When("User Clicks on the products section")
    public void userClicksOnTheProductsSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.productsButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.productsButton.click();
    }

    @Then("User gets redirected to products page")
    public void userGetsRedirectedToProductsPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("product/list"));
    }

    @When("User Clicks on the quick links section")
    public void userClicksOnTheQuickLinksSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.configButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.configButton.click();
    }

    @Then("User gets redirected to config page")
    public void userGetsRedirectedToConfigPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("config"));
    }

    @When("User Clicks on the Reports section")
    public void userClicksOnTheReportsSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.reportsButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.reportsButton.click();
    }

    @Then("User gets redirected to report page")
    public void userGetsRedirectedToReportPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("reports/generate"));
    }

    @When("User Clicks on the scheduling section")
    public void userClicksOnTheSchedulingSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.schedulingButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.schedulingButton.click();
    }

    @Then("User gets redirected to scheduling page")
    public void userGetsRedirectedToSchedulingPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("scheduling"));
    }

    @When("User Clicks on the search masters section")
    public void userClicksOnTheSearchMastersSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.searchMastersButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.searchMastersButton.click();
    }

    @Then("User gets redirected to search masters page")
    public void userGetsRedirectedToSearchMastersPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("searchmaster/list"));
    }

    @When("User Clicks on the tags section")
    public void userClicksOnTheTagsSection() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", HomePg.tagsButton);
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.tagsButton.click();
    }

    @Then("User gets redirected to tags page")
    public void userGetsRedirectedToTagsPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("tags/list"));
    }

    @And("User clicks on the excel export button")
    public void userClicksOnTheExcelExportButton() throws InterruptedException {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.excelExportButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));

    }

    @And("User clicks on the csv export button")
    public void userClicksOnTheCsvExportButton() throws InterruptedException {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.csvExportButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
    }


    @When("User selects the all radio button to display all the cancelled orders")
    public void userSelectsTheAllRadioButtonToDisplayAllTheCancelledOrders() {
        wdwait.until(ExpectedConditions.invisibilityOf(HomePg.preload));
        HomePg.allOrdersRadioButton.click();
    }
}
