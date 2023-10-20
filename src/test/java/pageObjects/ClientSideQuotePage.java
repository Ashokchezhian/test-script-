package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientSideQuotePage extends BaseClass{

    public ClientSideQuotePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//circle")
    public WebElement preload;

    @FindBy(xpath = "//a[@class='btn quote-btn text-left mt-1 ng-star-inserted']")
    public WebElement requestQuoteButton;

    @FindBy(id = "Property_First_Name")
    public WebElement ownerNameTextBox;

    @FindBy(id = "Order_Buyer")
    public WebElement buyerNameTextBox;

    @FindBy(id = "search-box")
    public WebElement propertySearchTextBox;

    @FindBy(xpath = "//div[@class='pac-item']")
    public  WebElement addressAutoCompleteDropdown;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    @FindBy(id = "Property_Order_Instructions")
    public WebElement specialInstructions;

    @FindBy(xpath = "//input[@value='Request Quote']")
    public WebElement reqQuoteButton;

    @FindBy(xpath = "//input[@id='Order_ID']")
    public WebElement quoteNumber;


}
