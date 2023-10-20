package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BaseClass {
    public AdminPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//a[@href='/users']")
    public WebElement adminLink;

    @FindBy(xpath="//mat-spinner")
    public WebElement preload;

    @FindBy(xpath = "//a[@id='userBtnCrtAdm']")
    public WebElement createAdminButton;


    @FindBy(xpath = "//input[@id='Admin_First_Name']")
    public WebElement adminFirstName;

    @FindBy(xpath = "//input[@id='Admin_Last_Name']")
    public WebElement adminLastName;

    @FindBy(xpath = "//input[@id='Admin_Email_Address']")
    public WebElement adminEmail;

    @FindBy(xpath = "//input[@id='Confirm_Email_Address']")
    public WebElement adminConfirmEmail;

    @FindBy(xpath="//input[@id='userEditBtnConfirm']")
    public WebElement adminConfirmButton;

    @FindBy(xpath="//input[@id='userInpSearch']")
    public WebElement searchTab;

    @FindBy(xpath="//tbody/tr[1]")
    public WebElement adminTab;

    @FindBy(xpath="//div/mat-select")
    public WebElement companyTab;

    @FindBy(xpath="//span[normalize-space()='abc2 abc2']")
    public WebElement selectCompany;

    @FindBy(xpath="//input[@id='userEditBtnAdd']")
    public WebElement addCompany;

    @FindBy(xpath="//input[@id='userEditBtnConfirm']")
    public WebElement confirmButtonCompany;

}
