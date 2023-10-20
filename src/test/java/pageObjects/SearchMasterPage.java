package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMasterPage extends BaseClass{

    public SearchMasterPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//a[@href='/searchmaster/list']")
    public WebElement searchMasterLink;

    @FindBy(xpath="//mat-spinner")
    public WebElement preload;

    @FindBy(xpath = "//a[@href='/searchmaster/new']")
    public WebElement createMasterButton;
    @FindBy(id="User_First_Name")
    public WebElement firstName;

    @FindBy(id="User_Last_Name")
    public WebElement lastName;

    @FindBy(id="Email_Address")
    public WebElement email;

    @FindBy(id="Confirm_Email_Address")
    public WebElement confirmEmail;

    @FindBy(id = "MasterUserEditBtnConfirm")
    public WebElement confirmButton;

    @FindBy(xpath = "//div[@class='mat-slide-toggle-thumb']")
    public WebElement externalSearchMasterToggle;

}
