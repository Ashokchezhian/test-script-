package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientLoginPage extends BaseClass{
    public ClientLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setPassword(String pwd)
    {
        inputClientPassword.clear();
        inputClientPassword.sendKeys(pwd);
    }

    public void setUserName(String uname)
    {
        inputEmail.clear();
        inputEmail.sendKeys(uname);
    }

    @FindBy(id="User_Password")
    public WebElement inputClientPassword;

    @FindBy(id="Email_Address")
    public WebElement inputEmail;

    @FindBy(xpath = "//input[@class='btn btn-primary btn-login']")
    public WebElement loginButton;

    @FindBy(id = "acceptEula")
    public WebElement acceptAndProceedButton;

    @FindBy(xpath = "//circle")
    public WebElement preload;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']/span")
    public WebElement clientNameDropdown;

    @FindBy(xpath = "//button[@class='mat-menu-item']")
    public WebElement welcomeHomeDropDown;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    public WebElement logoutButton;





}
