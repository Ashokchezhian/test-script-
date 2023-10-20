package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.BaseClass;
import pageObjects.ClientPage;
import pageObjects.CompanyPage;

import java.time.Duration;

public class ClientCreationSteps extends BaseClass {
    static JavascriptExecutor js;
    int RandomNumber;

    @And("User Scrolls down and click on Clients Link")
    public void userScrollsDownAndClickOnClientsLink() {
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
        ClientPg= new ClientPage(driver);
        js=(JavascriptExecutor)driver;
        RandomNumber = ClientPg.generateRandomNumber();

        js.executeScript("arguments[0].scrollIntoView(true);",ClientPg.clientLink );
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPg.preload));
        ClientPg.clientLink.click();

    }

    @When("User clicks on Create Client Button")
    public void userClicksOnCreateClientButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPg.preload));
        wdwait.until(ExpectedConditions.elementToBeClickable(ClientPg.createClientButton));
        ClientPg.createClientButton.click();

    }

    @Then("User gets redirected to create Client form")
    public void userGetsRedirectedToCreateClientForm() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("client/create"));
    }

    @When("User chooses client as Individual client")
    public void userChoosesClientAsIndividualClient() {
        ClientPg.individualAccountRadioButton.click();
        ClientPg.createButton.click();

    }

    @And("User enters Client FirstName {string} LastName {string} Email and Salesperson as {string}")
    public void userEntersClientFirstNameLastNameEmailAndSalespersonAs(String firstName, String lastName, String salesPerson) {
        String RandomFirstName = firstName+RandomNumber;
        String RandomLastName = lastName+RandomNumber;
        String Email = "automationclient"+RandomNumber+"@mailinator.com";

        ClientPg.firstName.sendKeys(RandomFirstName);
        ClientPg.lastName.sendKeys(RandomLastName);
        ClientPg.email.sendKeys(Email);
        ClientPg.confirmEmail.sendKeys(Email);
        ClientPg.selectSalespersonDropdown.click();
        ClientPg.selectSalespersonDropdownInputField.sendKeys(salesPerson);
        ClientPg.selectFromDropDown.click();
    }

    @And("User clicks on Confirm button")
    public void userClicksOnConfirmButton() {
        ClientPg.confirmButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPg.preload));
    }

    @Then("Client is created successfully")
    public void ClientIsCreatedSuccessfully() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientPg.preload));
        Assert.assertTrue(driver.getCurrentUrl().contains("clients"));
    }

    @When("User chooses client as Company client and enters the {string}")
    public void userChoosesClientAsCompanyClientAndEntersThe(String companyName) {
        ClientPg.companyAccountRadioButton.click();
        ClientPg.selectCompanyDropdown.click();
        ClientPg.selectCompanyDropdownInputField.sendKeys(companyName);
        ClientPg.selectCompanyFromDropDown.click();
        ClientPg.createButton.click();

    }

    @And("User enters Client FirstName {string} LastName {string} Email")
    public void userEntersClientFirstNameLastNameEmail(String firstName, String lastName) {
        String RandomFirstName = firstName+RandomNumber;
        String RandomLastName = lastName+RandomNumber;
        String Email = "automationclient"+RandomNumber+"@mailinator.com";

        ClientPg.firstName.sendKeys(RandomFirstName);
        ClientPg.lastName.sendKeys(RandomLastName);
        ClientPg.email.sendKeys(Email);
        ClientPg.confirmEmail.sendKeys(Email);

    }



}
