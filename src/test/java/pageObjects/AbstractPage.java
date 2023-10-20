package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage extends BaseClass{

    public AbstractPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//a[@href='/abstractor/list']")
    public WebElement abstractLink;

    @FindBy(xpath="//mat-spinner")
    public WebElement preload;

    @FindBy(xpath ="//a[@id='absListBtnCreateAbs']")
    public WebElement createAbstractButton;

    @FindBy(xpath ="//input[@id='User_First_Name']")
    public WebElement abstractName;

    @FindBy(xpath ="//input[@id='Email_Address']")
    public WebElement abstractEmail;

    @FindBy(xpath ="//input[@id='Confirm_Email_Address']")
    public WebElement abstractConfirmEmail;

    @FindBy(xpath ="//input[@id='absNewBtnConfirm']")
    public WebElement absConfirmButton;


}
