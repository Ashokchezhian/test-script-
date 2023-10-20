package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage extends BaseClass {
    public CompanyPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//a[@href='/organization/list']")
    public WebElement companyLink;

    @FindBy(xpath="//mat-spinner")
    public WebElement preload;

    @FindBy(xpath = "//a[@id='orglistBtnCrtComp']")
    public WebElement createCompanyButton;

    @FindBy(xpath = "//input[@id='Organization_Name']")
    public WebElement companyName;

    @FindBy(xpath = "//textarea[@id='Organization_Description']")
    public WebElement companyDescription;

    @FindBy(xpath = "//input[@id='mat-input-14']")
    public WebElement salesPersonName;

    @FindBy(xpath = "//mat-select[@id='mat-select-5']")
    public WebElement salesPersonNameDropDown;

    @FindBy(xpath="//mat-option")
    public WebElement selectSalesPersonName;

    @FindBy(id="newOrgBtnConfirm")
    public WebElement confirmButton;



}
