package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.AdminPage;
import pageObjects.BaseClass;
import pageObjects.CompanyPage;

import java.awt.*;
import java.time.Duration;

public class AdminCreationSteps extends BaseClass {
    public String Email;
    static JavascriptExecutor js;

    @And("User Scrolls down and click on Admin Link")
    public void userScrollsDownAndClickOnAdminLink() throws InterruptedException{
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
        AdminPg= new AdminPage(driver);
        js=(JavascriptExecutor)driver;
        wdwait.until(ExpectedConditions.invisibilityOf(AdminPg.preload));
        js.executeScript("arguments[0].scrollIntoView(true);", AdminPg.adminLink);
        wdwait.until(ExpectedConditions.invisibilityOf(AdminPg.preload));
        AdminPg.adminLink.click();

    }

    @When("User clicks on Create Admin Button")
    public void userClicksOnCreateAdminButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(AdminPg.preload));
        wdwait.until(ExpectedConditions.elementToBeClickable(AdminPg.createAdminButton));
        AdminPg.createAdminButton.click();
        
    }

    @Then("User gets redirected to create admin form")
    public void userGetsRedirectedToCreateAdminForm() {
        wdwait.until(ExpectedConditions.invisibilityOf(AdminPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("/user"));
        
    }

    @And("User enters {string} and {string} and enter Email and ConfirmEmail")

    public void userEntersAndAndEnterEmailAndConfirmEmail(String Firstname, String Lastname) {
        int RandomNumber = AdminPg.generateRandomNumber();
        String RandomLastName = Lastname+RandomNumber;
        Email = Firstname+RandomLastName+"@mailinator.com";
        AdminPg.adminFirstName.click();
        AdminPg.adminFirstName.sendKeys(Firstname);
        AdminPg.adminLastName.click();
        AdminPg.adminLastName.sendKeys(RandomLastName);
        AdminPg.adminEmail.click();
        AdminPg.adminEmail.sendKeys(Firstname+RandomLastName+"@mailinator.com");
        AdminPg.adminConfirmEmail.click();
        AdminPg.adminConfirmEmail.sendKeys(Firstname+RandomLastName+"@mailinator.com");

    }

    @Then("User clicks on the Confirm Button")
    public void userClicksOnTheConfirmButton() {
        AdminPg.adminConfirmButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(AdminPg.preload));
        }


    @When("User clicks on search tab and enters Email")
    public void userClicksOnSearchTabAndEntersEmail() {
        wdwait.until(ExpectedConditions.invisibilityOf(AdminPg.preload));
        wdwait.until(ExpectedConditions.elementToBeClickable(AdminPg.searchTab));
        AdminPg.searchTab.click();
        AdminPg.searchTab.sendKeys(Email);

    }

    @And("User clicks on the created admin")
    public void userClicksOnTheCreatedAdmin() {
        wdwait.until(ExpectedConditions.invisibilityOf(AdminPg.preload));
        AdminPg.adminTab.click();

    }

    @When("User clicks on the select company and add the company")
    public void userClicksOnTheSelectCompanyAndAddTheCompany() throws AWTException {
        wdwait.until(ExpectedConditions.invisibilityOf(AdminPg.preload));
        AdminPg.companyTab.click();
        AdminPg.selectCompany.click();
        Actions actions = new Actions(driver);
        Robot robot = new Robot();
        robot.mouseMove(50,50);
        actions.click().build().perform();
        robot.mouseMove(200,70);
        actions.click().build().perform();
        AdminPg.addCompany.click();
        AdminPg.confirmButtonCompany.click();

    }
}
