package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath ="//a[@class='sub-title-font userwelcome']")
    public WebElement lnkWelcomeMsg;

    @FindBy(xpath="//mat-spinner")
    public WebElement preload;

    @FindBy(id="sidebarBtnCrtOrd")
    public WebElement btnCreateOrder;

    @FindBy(id="newOrderBubble")
    public WebElement lnkNewOrders;

    @FindBy(xpath="//a[text()='Confirmed Orders']")
    public WebElement lnkConfirmOrders;

    @FindBy(xpath="//a[text()='Orders In Progress']")
    public WebElement lnkProgressOrders;

    @FindBy(id="homeInpSearch")
    public WebElement inputSearch;

    @FindBy(xpath="//table/tbody/tr[1]")
    public WebElement tblOrders;

    @FindBy(id="confirmOrdInpSearch")
    public WebElement inputConfirmOrderSearch;

    @FindBy(id="inprocessOrdInpSearch")
    public WebElement inputProgressOrderSearch;

    @FindBy(xpath="//strong[text()='Create Quote']")
    public WebElement btnCreateQuote;

    @FindBy(xpath = "//a[contains(text(),'Inbox')]")
    public WebElement inboxButton;

    @FindBy(xpath = "//a[contains(text(),'New Orders')]")
    public WebElement newOrdersButton;

    @FindBy(xpath = "//a[contains(text(),'Confirmed Orders')]")
    public WebElement confirmedOrdersButton;

    @FindBy(xpath = "//a[contains(text(),'Orders In Progress')]")
    public WebElement ordersInProgressButton;

    @FindBy(xpath = "//a[contains(text(),'Orders Due')]")
    public WebElement ordersDueButton;

    @FindBy(xpath = "//a[contains(text(),'Order Search')]")
    public WebElement orderSearchButton;

    @FindBy(xpath = "//a[contains(text(),'Completed Orders')]")
    public WebElement completedOrdersButton;

    @FindBy(xpath = "//a[contains(text(),'Paused Orders')]")
    public WebElement pausedOrdersButton;

    @FindBy(xpath = "//a[contains(text(),'Cancelled Orders')]")
    public WebElement cancelledOrdersButton;

    @FindBy(xpath = "//a[contains(text(),'Quote Requests')]")
    public WebElement quoteRequestsButton;

    @FindBy(xpath = "//a[contains(text(),'Priority Client Orders')]")
    public WebElement priorityClientOrdersButton;

    @FindBy(xpath = "//a[contains(text(),'Ready for Billing')]")
    public WebElement readyForBillingButton;

    @FindBy(xpath = "//a[contains(text(),'Priority Orders')]")
    public WebElement priorityOrdersButton;

    @FindBy(xpath = "//a[contains(text(),'Escalations')]")
    public WebElement escalatedOrdersButton;

    @FindBy(xpath = "//a[contains(text(),'Watched Orders')]")
    public WebElement watchedOrdersButton;

    @FindBy(xpath = "//a[contains(text(),'Abstractors')]")
    public WebElement abstractorsButton;

    @FindBy(xpath = "//a[contains(text(),'Admins')]")
    public WebElement adminsButton;

    @FindBy(xpath = "//a[contains(text(),'Clients')]")
    public WebElement clientsButton;

    @FindBy(xpath = "//a[contains(text(),'Company')]")
    public WebElement companyButton;

    @FindBy(xpath = "//a[contains(text(),'Email Templates')]")
    public WebElement emailTemplatesButton;

    @FindBy(xpath = "//a[contains(text(),'Eula')]")
    public WebElement eulaButton;

    @FindBy(xpath = "//a[contains(text(),'Groups')]")
    public WebElement groupsButton;

    @FindBy(xpath = "//a[contains(text(),'Invoices')]")
    public WebElement invoicesButton;

    @FindBy(xpath = "//a[contains(text(),'Notifications')]")
    public WebElement notificationsButton;

    @FindBy(xpath = "//a[contains(text(),'Pricing-Custom')]")
    public WebElement pricingCustomButton;

    @FindBy(xpath = "//a[contains(text(),'Pricing-Product')]")
    public WebElement pricingProductButton;

    @FindBy(xpath = "//a[contains(text(),'Products')]")
    public WebElement productsButton;

    @FindBy(xpath = "//a[contains(text(),'Quick Link Config')]")
    public WebElement configButton;

    @FindBy(xpath = "//a[contains(text(),'Reports')]")
    public WebElement reportsButton;

    @FindBy(xpath = "//a[contains(text(),'Scheduling')]")
    public WebElement schedulingButton;

    @FindBy(xpath = "//a[contains(text(),'Search Masters')]")
    public WebElement searchMastersButton;

    @FindBy(xpath = "//a[contains(text(),'Tags')]")
    public WebElement tagsButton;

    @FindBy(xpath = "//span[@id='createExcel']/i")
    public WebElement excelExportButton;

    @FindBy(xpath = "//span[@id='createCSV']/i")
    public WebElement csvExportButton;

    @FindBy(xpath = "//mat-radio-button[@id='orderFilterAll']/label/div[@class='mat-radio-container']")
    public WebElement allOrdersRadioButton;

}
