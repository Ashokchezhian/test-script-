package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {

    public LoginPage(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(id="Email_Address")
    public WebElement inputEmail;

    @FindBy(id="Password")
    public WebElement inputPassword;

    @FindBy(id="logLogin")
    WebElement btnLogin;

    @FindBy(linkText="Logout")
    WebElement lnkLogout;

    @FindBy(xpath="//mat-spinner")
    public WebElement preload;

    @FindBy(xpath = "//div[@class='welcome-home-dropdown ng-star-inserted']")
    public WebElement welcomeHomeDropDown;

    public void setUserName(String uname)
    {
        inputEmail.clear();
        inputEmail.sendKeys(uname);
    }

    public void setPassword(String pwd)
    {
        inputPassword.clear();
        inputPassword.sendKeys(pwd);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }
    public void clickLogout()
    {
        lnkLogout.click();
    }

}
