package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotePage  extends BaseClass {

    public QuotePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//mat-select[@aria-label='Select Customer *']")
    public WebElement drpDownCustomer;

    @FindBy(xpath="//textarea[@id='Property_Order_Instructions']")
    public WebElement splInsTab;

    @FindBy(xpath="//input[@aria-label='dropdown search']")
    public WebElement inputClient;

    @FindBy(xpath ="//mat-option[@tabindex='0']")
    public WebElement optionClient;

    @FindBy(id="newOrd2BtnOrdPricg")
    public WebElement btnContinueQuote;

    @FindBy(id="newOrd3BtnPlaceOrd")
    public WebElement btnContinueQuoteSpl;

    @FindBy(id="newOrd3BtnPlaceOrd")
    public WebElement btnRequestQuote;

    @FindBy(xpath="//input[@placeholder='Price']")
    public WebElement quotePrice;

    @FindBy(xpath="//input[@placeholder='Number of business days']")
    public WebElement quoteETA;

    @FindBy(xpath="//textarea[@id='editTagInpTagDesc']")
    public WebElement quoteComment;

    @FindBy(id="orderChecklistOk")
    public  WebElement btnCompleteChecklist;

    @FindBy(xpath="//input[@value='Complete Quote']")
    public WebElement btnCompleteQuote;

    @FindBy(xpath="//mat-select[@id='newsOrd2SelCriteria']")
    public WebElement drpDownSearchCriteria;

    //@FindBy(xpath="//span[text()='Full Address']")
    @FindBy(xpath="//mat-option[@tabindex='0'][1]")
    public WebElement optionFullSearch;

    @FindBy(xpath="//mat-radio-button[@id='radioBtnAutoSearch']")
    public WebElement rdBtnAddressType;

    @FindBy(id="search-box")
    public WebElement inputAddress;

    @FindBy(xpath="//div[@class=\"pac-container pac-logo hdpi\"]")
    public WebElement autoSuggestionslist;

    @FindBy(xpath="//div[@class=\"pac-container pac-logo hdpi\"]")
    public WebElement selectAddress;

    @FindBy(id="Property_Address_2")
    public WebElement inputAddressLine2;

    @FindBy(id="newOrd2BtnOrdPricg")
    public WebElement btnContinue;


    @FindBy(id="newOrd3BtnPlaceOrd")
    public WebElement btnPlaceOrder;

    @FindBy(xpath="//input[@id='Order_ID']")
    public WebElement txtOrderNum;

    @FindBy(id="state")
    public WebElement txtState;

    @FindBy(id="county")
    public WebElement txtCounty;

    @FindBy(xpath="//span[@class='breakWord ng-star-inserted']")
    public  WebElement txtCompleteStatus;

    @FindBy(xpath = "//input[@placeholder='Client Reference']")
    public  WebElement clientReferenceNumber;

    @FindBy(xpath = "//input[@value='Convert to Order']")
    public  WebElement convertToOrderButton;

    @FindBy(xpath = "//mat-select[@aria-label='Select Product*']")
    public  WebElement selectProductDropdown;

    @FindBy(xpath ="//input[@placeholder='Search..']")
    public  WebElement inputProductName;

    @FindBy(xpath = "//textarea[@placeholder='Client Reference *']")
    public  WebElement clientRefNumberTextarea;

    @FindBy(xpath="//mat-spinner")
    public  WebElement preload;

    @FindBy(id = "ordDetBtnEditOrd")
    public WebElement editQuoteButton;

    @FindBy(xpath = "//*[@placeholder='Client Reference']")
    public  WebElement clientReferenceField;

    @FindBy(xpath = "//input[@placeholder='Address line 1 *']")
    public  WebElement addressLine1Field;

    @FindBy(id = "newOrd2BtnOrdPricg")
    public WebElement saveChangesButton;

}
