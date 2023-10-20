package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.BaseClass;
import pageObjects.CompanyPage;


import java.time.Duration;

public class CompanyCreationSteps extends BaseClass {

    static JavascriptExecutor js;

    @And("User Scrolls down and click on Company Link")
    public void userScrollsDownAndClickOnCompanyLink() throws InterruptedException {
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
        CompanyPg= new CompanyPage(driver);
        js=(JavascriptExecutor)driver;

        js.executeScript("arguments[0].scrollIntoView(true);", CompanyPg.companyLink);
        wdwait.until(ExpectedConditions.invisibilityOf(CompanyPg.preload));
        CompanyPg.companyLink.click();
    }

    @When("User clicks on Create Company Button")
    public void userClicksOnCreateCompanyButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(CompanyPg.preload));
        wdwait.until(ExpectedConditions.elementToBeClickable(CompanyPg.createCompanyButton));
        CompanyPg.createCompanyButton.click();

    }

    @Then("User gets redirected to create company form")
    public void userGetsRedirectedToCreateCompanyForm() {
        wdwait.until(ExpectedConditions.invisibilityOf(CompanyPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("organization/new"));
    }

    @And("User enters Company Name as {string} Notes and Salesperson as {string}")
    public void UserEntersCompanyNameAsNotesAndSalespersonAs(String companyName, String salesPersonName) throws InterruptedException {
        //Generate a Random Company Name
        int RandomNumber = CompanyPg.generateRandomNumber();
        System.out.println(RandomNumber);
        String RandomCompanyName = companyName+RandomNumber;

        CompanyPg.companyName.sendKeys(RandomCompanyName);
        CompanyPg.companyDescription.sendKeys("Automation Test Company");
        CompanyPg.salesPersonNameDropDown.click();
        CompanyPg.salesPersonName.sendKeys(salesPersonName);
        CompanyPg.selectSalesPersonName.click();
        CompanyPg.confirmButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(CompanyPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("organization/list"));

    }


}
