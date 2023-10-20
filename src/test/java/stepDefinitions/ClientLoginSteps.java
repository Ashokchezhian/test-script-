package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BaseClass;
import pageObjects.ClientLoginPage;
import pageObjects.LoginPage;

import java.time.Duration;

public class ClientLoginSteps extends BaseClass {

    @And("User enters Client Email as {string} and Password as {string}")
    public void userEntersClientEmailAsAndPasswordAs(String userName, String password) {
        ClientLoginPg = new ClientLoginPage(driver);
        LoginPg = new LoginPage(driver);
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));

        ClientLoginPg.setUserName(userName);
        ClientLoginPg.setPassword(password);
    }


    @When("Click on Login Button")
    public void clickOnLoginButton() {
        ClientLoginPg.loginButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));

    }

    @Then("User accepts the Terms and conditions")
    public void userAcceptsTheTermsAndConditions() {
        ClientLoginPg.acceptAndProceedButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));
    }

    @When("User click on client Log out link")
    public void userClickOnClientLogOutLink() {
        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));
        ClientLoginPg.clientNameDropdown.click();
        wdwait.until(ExpectedConditions.visibilityOf(ClientLoginPg.welcomeHomeDropDown));
        ClientLoginPg.logoutButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ClientLoginPg.preload));
    }
}
