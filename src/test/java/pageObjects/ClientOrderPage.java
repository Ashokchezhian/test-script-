package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientOrderPage extends BaseClass{

    public ClientOrderPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//strong[normalize-space()='Place Order']")
    public static WebElement btnPlaceOrder;

    @FindBy(xpath = "//circle")
    public WebElement preload;

    @FindBy(xpath="//div[@class='css-j4rbl3 ng-star-inserted']")
    public static WebElement textStep;

    @FindBy(xpath="//h5")
    public static WebElement textHeader;

    @FindBy(xpath="//span[normalize-space()='Current Owner Search']")
    public static WebElement rbtCurrentOwnerSearch;

    @FindBy(xpath="")
    public static WebElement propertySearch;

    @FindBy(xpath="//span[normalize-space()='Full Address']")
    public static WebElement fullSearch;

    @FindBy(xpath="//span[normalize-space()='Auto Complete']")
    public static WebElement rdBtnAutoComplete;

    @FindBy(xpath="//div[@class='pac-item']")
    public static WebElement autoCompleteDropdown;

    @FindBy(id = "search-box")
    public WebElement propertySearchTextBox;

    @FindBy(xpath = "//div[@class='pac-item']")
    public  WebElement addressAutoCompleteDropdown;

    @FindBy(id="Property_Order_Number")
    public static WebElement inputClientRefNum;

    @FindBy(xpath="//div[@class='col-sm-10']//label[@id='search-criteria']")
    public static WebElement additionalInfo;

    @FindBy(xpath="//button[@class='btn btn-primary css-1qdd7d0']")
    public static WebElement continueButton;

    @FindBy(xpath="//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
    public static WebElement checkBoxClick;

    @FindBy(xpath="//button[@class='btn btn-primary']")
    public static WebElement submitButton;

    @FindBy(xpath="//h3[normalize-space()='Order Details']")
    public static WebElement clientHeader;

    @FindBy(xpath = "//h-stack/div/button[2]")
    public static WebElement continueButton1;


}
