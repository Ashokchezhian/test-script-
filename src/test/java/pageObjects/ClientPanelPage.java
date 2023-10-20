package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPanelPage extends BaseClass{

    public ClientPanelPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//circle")
    public WebElement preload;
    @FindBy(xpath = "//a[contains(text(),'In Progress')]")
    public WebElement inProgressButton;

    @FindBy(xpath = "//a[contains(text(),'Completed')]")
    public WebElement completedButton;

    @FindBy(xpath = "//a[contains(text(),'Cancelled')]")
    public WebElement cancelledButton;

    @FindBy(xpath = "//a[contains(text(),'Inbox')]")
    public WebElement inboxButton;

    @FindBy(xpath = "//a[contains(text(),'Pricing')]")
    public WebElement pricingButton;

    @FindBy(xpath = "//a[contains(text(),'Invoices')]")
    public WebElement invoicesButton;
    @FindBy(xpath = "//a[contains(text(),'Quotes')]")
    public WebElement quotesButton;


}
