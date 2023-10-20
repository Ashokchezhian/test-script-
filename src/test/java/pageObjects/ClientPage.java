package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class ClientPage extends BaseClass {

    public ClientPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//a[@href='/clients']")
    public WebElement clientLink;

    @FindBy(xpath="//mat-spinner")
    public WebElement preload;

    @FindBy(xpath = "//a[@href='/client/create']")
    public WebElement createClientButton;

    @FindBy(xpath = "//mat-radio-button[@id='regIA']/label/div[@class='mat-radio-container']")
    public  WebElement individualAccountRadioButton;

    @FindBy(xpath = "//mat-radio-button[@id='regCA']/label/div[@class='mat-radio-container']")
    public  WebElement companyAccountRadioButton;

    @FindBy(id="regS1Next")
    public  WebElement createButton;

    @FindBy(xpath = "//mat-select[@aria-label='Select company']")
    public  WebElement selectCompanyDropdown;

    @FindBy(xpath = "//input[@placeholder='Search..']")
    public  WebElement selectCompanyDropdownInputField;

    @FindBy(id="User_First_Name")
    public WebElement firstName;

    @FindBy(id="User_Last_Name")
    public WebElement lastName;

    @FindBy(id="Email_Address")
    public WebElement email;

    @FindBy(id="Confirm_Email_Address")
    public WebElement confirmEmail;


    @FindBy(xpath = "//mat-select[@aria-label='Select Salesperson']")
    public  WebElement selectSalespersonDropdown;


    @FindBy(xpath = "//input[@placeholder='Search']")
    public  WebElement selectSalespersonDropdownInputField;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    public WebElement selectFromDropDown;

    @FindBy(id = "registration")
    public WebElement confirmButton;

    @FindBy(xpath = "//mat-option[@class='mat-option ng-star-inserted mat-active']")
    public WebElement selectCompanyFromDropDown;






}
