package stepDefinitions;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjects.BaseClass;
import pageObjects.ClientPanelPage;

public class ClientPanelListingSteps extends BaseClass {

    @io.cucumber.java.en.When("User Clicks on In Progress button")
    public void userClicksOnInProgressButton() {
        ClientPanelPg = new ClientPanelPage(driver);
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        ClientPanelPg.inProgressButton.click();


    }

    @io.cucumber.java.en.Then("User gets redirected to current orders page")
    public void userGetsRedirectedToCurrentOrdersPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("current"));

    }

    @io.cucumber.java.en.And("User Clicks on Completed button")
    public void userClicksOnCompletedButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        ClientPanelPg.completedButton.click();

    }


    @io.cucumber.java.en.Then("User gets redirected to History orders page")
    public void userGetsRedirectedToHistoryOrdersPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("history"));


    }

    @io.cucumber.java.en.And("User Clicks on Cancelled button")
    public void userClicksOnCancelledButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        ClientPanelPg.cancelledButton.click();

    }

    @io.cucumber.java.en.Then("User gets redirected to cancelled orders page")
    public void userGetsRedirectedToCancelledOrdersPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("cancelled"));

    }

    @io.cucumber.java.en.And("User Clicks on Inbox button")
    public void userClicksOnInboxButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        ClientPanelPg.inboxButton.click();

    }

    @io.cucumber.java.en.Then("User gets redirected to order messages page")
    public void userGetsRedirectedToOrderMessagesPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("messages"));

    }

    @io.cucumber.java.en.And("User Clicks on Pricing button")
    public void userClicksOnPricingButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        ClientPanelPg.pricingButton.click();

    }

    @io.cucumber.java.en.Then("User gets redirected to price listing page")
    public void userGetsRedirectedToPriceListingPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("pricing"));

    }

    @io.cucumber.java.en.And("User Clicks on Invoices button")
    public void userClicksOnInvoicesButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        ClientPanelPg.invoicesButton.click();

    }

    @io.cucumber.java.en.Then("User gets redirected to order Invoices page")
    public void userGetsRedirectedToOrderInvoicesPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("invoice"));

    }

    @io.cucumber.java.en.And("User Clicks on Quotes button")
    public void userClicksOnQuotesButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        ClientPanelPg.quotesButton.click();

    }

    @io.cucumber.java.en.Then("User gets redirected to quotes page")
    public void userGetsRedirectedToQuotesPage() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPanelPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("quotes"));

    }
}
