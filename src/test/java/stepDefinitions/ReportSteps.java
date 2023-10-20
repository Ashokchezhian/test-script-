package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.BaseClass;
import pageObjects.ReportPage;


public class ReportSteps extends BaseClass {

    static JavascriptExecutor js;

    @And("User clicks on the Title report generation button")
    public void userClicksOnTheTitleReportGenerationButton() throws InterruptedException {
        js=(JavascriptExecutor)driver;
        ReportPg = new ReportPage(driver);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        Thread.sleep(5000);
        ReportPg.titleReportButton.click();
    }

    @Then("In the Report Data section User enters the Additional Information field value as {string} and Internal Notes field value as {string}")
    public void inTheReportDataSectionUserEntersTheAdditionalInformationFieldValueAsAndInternalNotesFieldValueAs(String additionalInformation, String internalNotes) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.additionalInfo.sendKeys(additionalInformation);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.internalNote.sendKeys(internalNotes);
    }

    @And("In the Property Data section User enters Parcel ID value as {string} Legal Description field value as {string} and Comments field value as {string}")
    public void inThePropertyDataSectionUserEntersParcelIDValueAsLegalDescriptionFieldValueAsAndCommentsFieldValueAs(String parcelId, String legalDescription, String comments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.propertData);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.parcelField.sendKeys(parcelId);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.legalField.sendKeys(legalDescription);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.propertyComments.sendKeys(comments);


    }

    @Then("User selects Estate Type as {string} from the dropdown")
    public void userSelectsEstateTypeAsFromTheDropdown(String feeSimple) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.drpDownEstateType.click();

        if(feeSimple.equalsIgnoreCase("Fee Simple"))
        {
            ReportPg.optionFeeSimple.click();
        }
    }

    @And("User clicks on the toggle PUD and enter the Development name field value as {string} and clicks on the toggle Mobile Home")
    public void userClicksOnTheTogglePUDAndEnterTheDevelopmentNameFieldValueAsAndClicksOnTheToggleMobileHome(String developmentName) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.pudButton.click();
        ReportPg.developmentField.sendKeys(developmentName);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.mobileButton.click();

    }

    @When("User clicks on add Search Parties button")
    public void userClicksOnAddSearchPartiesButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.propertyComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.addSearchPartiesBtn.click();
    }

    @Then("User selects Individual Owner from the dropdown")
    public void userSelectsIndividualOwnerFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.addIndividualOwnerBtn.click();
    }

    @And("User enters IndOwnerFirst name field value as {string} and IndOwnerSecond name field value as {string} and IndOwnerMiddle name field value as {string} IndOwnerAKA field value as {string}")
    public void userEntersIndOwnerFirstNameFieldValueAsAndIndOwnerSecondNameFieldValueAsAndIndOwnerMiddleNameFieldValueAsIndOwnerAKAFieldValueAs(String strFname, String strLname, String strMname, String strAKA) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indOwnerFname.click();
        ReportPg.indOwnerFname.sendKeys(strFname);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indOwnerLname.click();
        ReportPg.indOwnerLname.sendKeys(strLname);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indOwnerMname.click();
        ReportPg.indOwnerMname.sendKeys(strMname);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indOwnerAka.click();
        ReportPg.indOwnerAka.sendKeys(strAKA);
    }

    @Then("User enters IndOwnerProbate field value as {string} and IndOwnerDivorce field value as {string} and IndOwnerCivil field value as {string} and IndOwnercomments field value as {string}")
    public void userEntersIndOwnerProbateFieldValueAsAndIndOwnerDivorceFieldValueAsAndIndOwnerCivilFieldValueAsAndIndOwnerCommentsFieldValueAs(String strProbate, String strDivorce, String strCivil, String strComments) {
        //js.executeScript("arguments[0].scrollIntoView(true);",ReportPg.spProbate);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indOwnerProbate.click();
        ReportPg.indOwnerProbate.sendKeys(strProbate);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indOwnerDivorce.click();
        ReportPg.indOwnerDivorce.sendKeys(strDivorce);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indOwnerCivil.click();
        ReportPg.indOwnerCivil.sendKeys(strCivil);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indOwnerComments.click();
        ReportPg.indOwnerComments.sendKeys(strComments);
    }

    @When("User clicks on add Assessment button and selects Assessment")
    public void userClicksOnAddAssessmentButtonAndSelectsAssessment() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.indOwnerComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.addAssessmentBtn.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.assessmentButton.click();

    }

    @Then("User enters Assessment year field as {string} and Land field value as {string} and Building field value as {string} Extras field value as {string} Total field value as {string} and comments fiels value as {string}")
    public void userEntersAssessmentYearFieldAsAndLandFieldValueAsAndBuildingFieldValueAsExtrasFieldValueAsTotalFieldValueAsAndCommentsFielsValueAs(String strAssYear, String strLand, String strBuilding, String strExtras, String strTotal, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.assessmentYearField.click();
        ReportPg.assessmentYearField.sendKeys(strAssYear);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.landValue.click();
        ReportPg.landValue.sendKeys(strLand);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.buildingValue.click();
        ReportPg.buildingValue.sendKeys(strBuilding);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.extrasValue.click();
        ReportPg.extrasValue.sendKeys(strExtras);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.totalValue.click();
        ReportPg.totalValue.sendKeys(strTotal);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.assessmentComments.click();
        ReportPg.assessmentComments.sendKeys(strComments);

    }

    @When("User clicks on add Taxes button")
    public void userClicksOnAddTaxesButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.assessmentHeader);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.taxesButton.click();
    }


    @Then("User selects Annual Taxes from the dropdown")
    public void userSelectsAnnualTaxesFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.annualTaxes.click();
    }

    @And("User enters annual Tax year field value as {string} and enters annual Parcel as {string} and enters annual Amount as {string} and annual comments field value as {string}")
    public void userEntersAnnualTaxYearFieldValueAsAndEntersAnnualParcelAsAndEntersAnnualAmountAsAndAnnualCommentsFieldValueAs(String strTaxYear, String strParcel, String strAnnual, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.annualTaxYearField.click();
        ReportPg.annualTaxYearField.sendKeys(strTaxYear);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.annualTaxParcelField.click();
        ReportPg.annualTaxParcelField.sendKeys(strParcel);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.annualTaxAmountField.click();
        ReportPg.annualTaxAmountField.sendKeys(strAnnual);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.annualTaxComments.click();
        ReportPg.annualTaxComments.sendKeys(strComments);

    }

    @Then("User clicks on annual Prior Delinquencies and selects Yes from the dropdown")
    public void userClicksOnannualPriorDelinquenciesAndSelectsYesFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.annualPriorDropdown.click();
        ReportPg.selectsAnnualPriorYesOption.click();

    }

    @And("User clicks on annual Source and selects Online from the dropdown")
    public void userClicksOnannualSourceAndSelectsOnlineFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.annualSourceDropdown.click();
        ReportPg.selectsAnnualOnlineOption.click();
    }

    @Then("User clicks on annual Status and selects Paid from the dropdown")
    public void userClicksOnannualStatusAndSelectsPaidFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.annualStatusDropdown.click();
        ReportPg.selectsPaidOption.click();
    }

    @And("User selects Date from the date field")
    public void userSelectsDateFromTheDateField() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));


    }

    @When("User clicks on add Vesting Deed button")
    public void userClicksOnAddVestingDeedButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.taxesHeader);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.vestingDeedButton.click();

    }

    @Then("User selects VestingDeed from the dropdown")
    public void userSelectsVestingDeedFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.deedOption.click();
    }

    @And("User enters VestingDeed Grantor field value as {string} and VestingDeed Instrument Type and selects VestingDeed Warranty Deed from the dropdown and enters VestingDeed Book value as {string} and VestingDeed Page value as {string}")
    public void userEntersVestingDeedGrantorFieldValueAsAndVestingDeedInstrumentTypeAndSelectsVestingDeedWarrantyDeedFromTheDropdownAndEntersVestingDeedBookValueAsAndVestingDeedPageValueAs(String strGrantor, String strBook, String strPage) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.vestingDeedGrantorField.click();
        ReportPg.vestingDeedGrantorField.sendKeys(strGrantor);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.vestingDeedInstrumentDropdown.click();
        ReportPg.warrantyDeedOption.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.vestingDeedBookField.click();
        ReportPg.vestingDeedBookField.sendKeys(strBook);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.vestingDeedPageField.click();
        ReportPg.vestingDeedPageField.sendKeys(strPage);
    }

    @Then("User enters VestingDeed Grantee field value as {string} and VestingDeed Consideration value as {string} and enters VestingDeed Date and enters VestingDeed Recorded Date and enters VestingDeed Comments field value as {string}")
    public void userEntersVestingDeedGranteeFieldValueAsAndVestingDeedConsiderationValueAsAndEntersVestingDeedDateAndEntersVestingDeedRecordedDateAndEntersVestingDeedCommentsFieldValueAs(String strGrantee, String strConsideration, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.vestingDeedGranteeField.click();
        ReportPg.vestingDeedGranteeField.sendKeys(strGrantee);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.vestingDeedConsiderationField.click();
        ReportPg.vestingDeedConsiderationField.sendKeys(strConsideration);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.vestingDeedComments.click();
        ReportPg.vestingDeedComments.sendKeys(strComments);
    }

    @When("User clicks on add Chain of Title button")
    public void userClicksOnAddChainOfTitleButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.vestingDeedComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.chainOfTitleButton.click();
    }


    @Then("User selects ChainDeed from the dropdown")
    public void userSelectsChainDeedFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.deedOption.click();
    }

    @And("User enters ChainGrantor field value as {string} and ChainInstrument Type and selects ChainWarranty Deed from the dropdown and enters ChainBook value as {string} and ChainPage value as {string}")
    public void userEntersChainGrantorFieldValueAsAndChainInstrumentTypeAndSelectsChainWarrantyDeedFromTheDropdownAndEntersChainBookValueAsAndChainPageValueAs(String strGrantor, String strBook, String strPage) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.chainGrantorField.click();
        ReportPg.chainGrantorField.sendKeys(strGrantor);
        //wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        //ReportPg.chainInstrumentDropdown.click();
        //ReportPg.chainwarrantyDeedOption.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.chainBookField.click();
        ReportPg.chainBookField.sendKeys(strBook);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.chainPageField.click();
        ReportPg.chainPageField.sendKeys(strPage);
    }

    @Then("User enters ChainGrantee field value as {string} and ChainConsideration value as {string} and enters ChainDate and enters ChainRecorded Date and enters Chaincomments field value as {string}")
    public void userEntersChainGranteeFieldValueAsAndChainConsiderationValueAsAndEntersChainDateAndEntersChainRecordedDateAndEntersChaincommentsFieldValueAs(String strGrantee, String strConsideration, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.chainGranteeField.click();
        ReportPg.chainGranteeField.sendKeys(strGrantee);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.chainConsiderationField.click();
        ReportPg.chainConsiderationField.sendKeys(strConsideration);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.chainDeedComments.click();
        ReportPg.chainDeedComments.sendKeys(strComments);
    }

    @When("User clicks on add Security Instruments button")
    public void userClicksOnAddSecurityInstrumentsButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.chainDeedComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.securityButton.click();
    }
    @Then("User selects Mortgage from the dropdown")
    public void userSelectsMortgageFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.mortgageOption.click();
    }

    @And("User enters MortgageBorrower field value as {string} and MortgagePrincipal value as {string} and MortgageBook value as {string} and MortgagePage value as {string}")
    public void userEntersMortgageBorrowerFieldValueAsAndMortgagePrincipalValueAsAndMortgageBookValueAsAndMortgagePageValueAs(String strBorrower, String strPrincipal, String strBook, String strPage) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.mortgageBorrower.click();
        ReportPg.mortgageBorrower.sendKeys(strBorrower);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.mortgagePrincipal.click();
        ReportPg.mortgagePrincipal.sendKeys(strPrincipal);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.mortgageBook.click();
        ReportPg.mortgageBook.sendKeys(strBook);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.mortgagePage.click();
        ReportPg.mortgagePage.sendKeys(strPage);
    }

    @Then("User enters MortgageLender field value as {string} and MortgageAssignments value as {string} and MortgageRider field value as {string} and MortgageComments field value as {string}")
    public void userEntersMortgageLenderFieldValueAsAndMortgageAssignmentsValueAsAndMortgageRiderFieldValueAsAndMortgageCommentsFieldValueAs(String strLender, String strAssignments, String strRider, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.mortgageLender.click();
        ReportPg.mortgageLender.sendKeys(strLender);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.mortgageAssignments.click();
        ReportPg.mortgageAssignments.sendKeys(strAssignments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.mortgageRider.click();
        ReportPg.mortgageRider.sendKeys(strRider);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.mortgageComments.click();
        ReportPg.mortgageComments.sendKeys(strComments);
    }

    @And("User enters MortgageMaturity date and MortgageDate and MortgageRecorded Date")
    public void userEntersMortgageMaturityDateAndMortgageDateAndMortgageRecordedDate() {

    }

    @When("User clicks on add Liens or Judgement button")
    public void userClicksOnAddLiensOrJudgementButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.mortgageComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.lienOrJudgementButton.click();
    }

    @Then("User selects Liens from the dropdown")
    public void userSelectsLiensFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.lienOption.click();
    }

    @And("User enters LienDebtor field value as {string} and selects lien type as Association-Other and LienBook value as {string} and LienPage value as {string}")
    public void userEntersLienDebtorFieldValueAsAndSelectsLienTypeAsAssociationOtherAndLienBookValueAsAndLienPageValueAs(String strDebtor, String strBook, String strPage) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.lienDebtor.click();
        ReportPg.lienDebtor.sendKeys(strDebtor);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.lienType.click();
        ReportPg.lienAssociation.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.lienBook.click();
        ReportPg.lienBook.sendKeys(strBook);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.lienPage.click();
        ReportPg.lienPage.sendKeys(strPage);
    }

    @Then("User enters LienDate and LienRecorded Date")
    public void userEntersLienDateAndLienRecordedDate() {

    }

    @And("User enters LienHolder field value as {string} and Amount value as {string} and LienComments field value as {string}")
    public void userEntersLienHolderFieldValueAsAndAmountValueAsAndLienCommentsFieldValueAs(String strHolder, String strAmount, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.lienHolder.click();
        ReportPg.lienHolder.sendKeys(strHolder);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.lienAmount.click();
        ReportPg.lienAmount.sendKeys(strAmount);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.lienComments.click();
        ReportPg.lienComments.sendKeys(strComments);

    }

    @When("User clicks on add Encumbrances and Restrictions button")
    public void userClicksOnAddEncumbrancesAndRestrictionsButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.lienComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.encumbrancesAndRestrictionsButton.click();
    }

    @Then("User selects Encumbrance from the dropdown")
    public void userSelectsEncumbranceFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.encumbrancesOption.click();
    }

    @And("User enters EncumbranceDetail field value as {string} and EncumbranceBook value as {string} and EncumbrancePage value as {string}")
    public void userEntersEncumbranceDetailFieldValueAsAndEncumbranceBookValueAsAndEncumbrancePageValueAs(String strDetail, String strBook, String strPage) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.encumbrancesDetail.click();
        ReportPg.encumbrancesDetail.sendKeys(strDetail);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.encumbrancesBook.click();
        ReportPg.encumbrancesBook.sendKeys(strBook);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.encumbrancesPage.click();
        ReportPg.encumbrancesPage.sendKeys(strPage);
    }

    @Then("User enters EncumbranceDate and EncumbranceRecorded Date")
    public void userEntersEncumbranceDateAndEncumbranceRecordedDate() {

    }

    @Then("User click on the Preview Report Button")
    public void userClickOnThePreviewReportButton() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.previewReportButton.click();
    }

    @Then("User selects Individual Buyer from the dropdown")
    public void userSelectsIndividualBuyerFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.addIndividualBuyerBtn.click();
    }

    @Then("User selects Corporate Owner from the dropdown")
    public void userSelectsCorporateOwnerFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.addCorporateOwnerBtn.click();
    }

    @Then("User selects Corporate Buyer from the dropdown")
    public void userSelectsCorporateBuyerFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.addCorporateBuyerBtn.click();
    }

    @And("User enters IndBuyerFirst name field value as {string} and IndBuyerSecond name field value as {string} and IndBuyerMiddle name field value as {string} IndBuyerAKA field value as {string}")
    public void userEntersIndBuyerFirstNameFieldValueAsAndIndBuyerSecondNameFieldValueAsAndIndBuyerMiddleNameFieldValueAsIndBuyerAKAFieldValueAs(String strFname, String strLname, String strMname, String strAKA) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.indOwnerComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indBuyerFname.click();
        ReportPg.indBuyerFname.sendKeys(strFname);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indBuyerLname.click();
        ReportPg.indBuyerLname.sendKeys(strLname);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indBuyerMname.click();
        ReportPg.indBuyerMname.sendKeys(strMname);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indBuyerAka.click();
        ReportPg.indBuyerAka.sendKeys(strAKA);
    }

    @Then("User enters IndBuyerProbate field value as {string} and IndBuyerDivorce field value as {string} and IndBuyerCivil field value as {string} and IndBuyercomments field value as {string}")
    public void userEntersIndBuyerProbateFieldValueAsAndIndBuyerDivorceFieldValueAsAndIndBuyerCivilFieldValueAsAndIndBuyercommentsFieldValueAs(String strProbate, String strDivorce, String strCivil, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indBuyerProbate.click();
        ReportPg.indBuyerProbate.sendKeys(strProbate);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indBuyerDivorce.click();
        ReportPg.indBuyerDivorce.sendKeys(strDivorce);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indBuyerCivil.click();
        ReportPg.indBuyerCivil.sendKeys(strCivil);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.indBuyerComments.click();
        ReportPg.indBuyerComments.sendKeys(strComments);
    }

    @And("User enters CorpOwner name field value as {string} and CorpOwnerProbate field value as {string} and CorpOwnerDivorce field value as {string} and CorpOwnerCivil field value as {string} and CorpOwnercomments field value as {string}")
    public void userEntersCorpOwnerNameFieldValueAsAndCorpOwnerProbateFieldValueAsAndCorpOwnerDivorceFieldValueAsAndCorpOwnerCivilFieldValueAsAndCorpOwnercommentsFieldValueAs(String strCorpName, String strProbate, String strDivorce, String strCivil, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.indBuyerComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.corpOwnerName.click();
        ReportPg.corpOwnerName.sendKeys(strCorpName);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.corpOwnerProbate.click();
        ReportPg.corpOwnerProbate.sendKeys(strProbate);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.corpOwnerDivorce.click();
        ReportPg.corpOwnerDivorce.sendKeys(strDivorce);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.corpOwnerCivil.click();
        ReportPg.corpOwnerCivil.sendKeys(strCivil);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.corpOwnerComments.click();
        ReportPg.corpOwnerComments.sendKeys(strComments);

    }

    @Then("User enters CorpBuyer name field value as {string} and CorpBuyerProbate field value as {string} and CorpBuyerDivorce field value as {string} and CorpBuyerCivil field value as {string} and CorpBuyercomments field value as {string}")
    public void userEntersCorpBuyerNameFieldValueAsAndCorpBuyerProbateFieldValueAsAndCorpBuyerDivorceFieldValueAsAndCorpBuyerCivilFieldValueAsAndCorpBuyercommentsFieldValueAs(String strCorpName, String strProbate, String strDivorce, String strCivil, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.corpOwnerComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.corpBuyerName.click();
        ReportPg.corpBuyerName.sendKeys(strCorpName);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.corpBuyerProbate.click();
        ReportPg.corpBuyerProbate.sendKeys(strProbate);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.corpBuyerDivorce.click();
        ReportPg.corpBuyerDivorce.sendKeys(strDivorce);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.corpBuyerCivil.click();
        ReportPg.corpBuyerCivil.sendKeys(strCivil);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.corpBuyerComments.click();
        ReportPg.corpBuyerComments.sendKeys(strComments);
    }


    @Then("User selects Semi Annual Taxes from the dropdown")
    public void userSelectsSemiAnnualTaxesFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.taxesButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.semiAnnualTaxes.click();
    }

    @And("User enters Semiannual Tax year field value as {string} and enters Semiannual Parcel as {string} and enters First Semiannual Amount as {string} and enters Second Semiannual Amount as {string} and Semiannual comments field value as {string}")
    public void userEntersSemiannualTaxYearFieldValueAsAndEntersSemiannualParcelAsAndEntersFirstSemiannualAmountAsAndEntersSecondSemiannualAmountAsAndSemiannualCommentsFieldValueAs(String strTaxYear, String strParcel, String strFirstAnnual, String strSecondAnnual, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.annualTaxComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.semiAnnualTaxYearField.click();
        ReportPg.semiAnnualTaxYearField.sendKeys(strTaxYear);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.semiAnnualTaxParcelField.click();
        ReportPg.semiAnnualTaxParcelField.sendKeys(strParcel);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.firstSemiAnnualTaxAmountField.click();
        ReportPg.firstSemiAnnualTaxAmountField.sendKeys(strFirstAnnual);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.secondSemiAnnualTaxAmountField.click();
        ReportPg.secondSemiAnnualTaxAmountField.sendKeys(strSecondAnnual);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.semiAnnualTaxComments.click();
        ReportPg.semiAnnualTaxComments.sendKeys(strComments);
    }

    @Then("User clicks on Semiannual Prior Delinquencies and selects Yes from the dropdown")
    public void userClicksOnSemiannualPriorDelinquenciesAndSelectsYesFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.semiAnnualPriorDropdown.click();
        ReportPg.selectsPriorYesOption.click();
    }

    @And("User clicks on Semiannual Source and selects Online from the dropdown")
    public void userClicksOnSemiannualSourceAndSelectsOnlineFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.semiAnnualSourceDropdown.click();
        ReportPg.semiAnnualOnlineOption.click();
    }

    @Then("User clicks on First Semiannual Status and selects Paid from the dropdown")
    public void userClicksOnFirstSemiannualStatusAndSelectsPaidFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.firstAnnualStatusDropdown.click();
        ReportPg.semiAnnualPaidOption.click();
    }

    @And("User clicks on Second Semiannual Status and selects Paid from the dropdown")
    public void userClicksOnSecondSemiannualStatusAndSelectsPaidFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.secondAnnualStatusDropdown.click();
        ReportPg.semiAnnualPaidOption.click();
    }

    @When("User selects Quaterly Taxes from the dropdown")
    public void userSelectsQuaterlyTaxesFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.assessmentHeader);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.taxesButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.quaterlyTaxes.click();
    }

    @And("User enters Quaterly Tax year field value as {string} and enters Quaterly Parcel as {string} and Quaterly comments field value as {string}")
    public void userEntersQuaterlyTaxYearFieldValueAsAndEntersQuaterlyParcelAsAndQuaterlyCommentsFieldValueAs(String strTaxYear, String strParcel, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.semiAnnualTaxComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.quaterlyTaxYearField.click();
        ReportPg.quaterlyTaxYearField.sendKeys(strTaxYear);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.quaterlyTaxParcelField.click();
        ReportPg.quaterlyTaxParcelField.sendKeys(strParcel);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.quaterlyTaxComments.click();
        ReportPg.quaterlyTaxComments.sendKeys(strComments);
    }

    @Then("User enter First Quaterly Amount as {string} and enters Second Quaterly Amount as {string} and Third Quaterly Amount as {string} and Fourth Quaterly Amount as {string}")
    public void userEnterFirstQuaterlyAmountAsAndEntersSecondQuaterlyAmountAsAndThirdQuaterlyAmountAsAndFourthQuaterlyAmountAs(String strFirstAnnual, String strSecondAnnual, String strThirdAnnual, String strFourthAnnual) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.firstQuaterlyTaxAmountField.click();
        ReportPg.firstQuaterlyTaxAmountField.sendKeys(strFirstAnnual);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.secondQuaterlyTaxAmountField.click();
        ReportPg.secondQuaterlyTaxAmountField.sendKeys(strSecondAnnual);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.thirdQuaterlyTaxAmountField.click();
        ReportPg.thirdQuaterlyTaxAmountField.sendKeys(strThirdAnnual);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.fourthQuaterlyTaxAmountField.click();
        ReportPg.fourthQuaterlyTaxAmountField.sendKeys(strFourthAnnual);
    }

    @And("User clicks on Quaterly Prior Delinquencies and selects Yes from the dropdown")
    public void userClicksOnQuaterlyPriorDelinquenciesAndSelectsYesFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.quaterlyPriorDropdown.click();
        ReportPg.selectsPriorYesOption.click();
    }

    @Then("User clicks on Quaterly Source and selects Online from the dropdown")
    public void userClicksOnQuaterlySourceAndSelectsOnlineFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.quaterlySourceDropdown.click();
        ReportPg.quaterlyOnlineOption.click();
    }

    @And("User clicks on First Quaterly Status and selects Paid from the dropdown")
    public void userClicksOnFirstQuaterlyStatusAndSelectsPaidFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.firstQuaterlyStatusDropdown.click();
        ReportPg.quaterlyPaidOption.click();
    }

    @Then("User clicks on Second Quaterly Status and selects Paid from the dropdown")
    public void userClicksOnSecondQuaterlyStatusAndSelectsPaidFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.secondQuaterlyStatusDropdown.click();
        ReportPg.quaterlyPaidOption.click();
    }

    @And("User clicks on Third Quaterly Status and selects Paid from the dropdown")
    public void userClicksOnThirdQuaterlyStatusAndSelectsPaidFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.thirdQuaterlyStatusDropdown.click();
        ReportPg.quaterlyPaidOption.click();
    }

    @Then("User clicks on Fourth Quaterly Status and selects Paid from the dropdown")
    public void userClicksOnFourthQuaterlyStatusAndSelectsPaidFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.fourthQuaterlyStatusDropdown.click();
        ReportPg.quaterlyPaidOption.click();
    }

    @When("User selects Special Assessment Taxes from the dropdown")
    public void userSelectsSpecialAssessmentTaxesFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.assessmentHeader);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.taxesButton.click();
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.specialAssessmentTaxes.click();
    }

    @And("User enters Special Assessment Tax year field value as {string} and enters Special Assessment Parcel as {string} and enters Special Assessment Amount as {string} and Special Assessment comments field value as {string}")
    public void userEntersSpecialAssessmentTaxYearFieldValueAsAndEntersSpecialAssessmentParcelAsAndEntersSpecialAssessmentAmountAsAndSpecialAssessmentCommentsFieldValueAs(String strTaxYear, String strParcel, String strSpecialAssessment, String strComments) {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        js.executeScript("arguments[0].scrollIntoView();", ReportPg.quaterlyTaxComments);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.specialAssessmentTaxYearField.click();
        ReportPg.specialAssessmentTaxYearField.sendKeys(strTaxYear);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.specialAssessmentParcelField.click();
        ReportPg.specialAssessmentParcelField.sendKeys(strParcel);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.specialAssessmentAmountField.click();
        ReportPg.specialAssessmentAmountField.sendKeys(strSpecialAssessment);
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.specialAssessmentComments.click();
        ReportPg.specialAssessmentComments.sendKeys(strComments);
    }

    @Then("User clicks on Special Assessment Prior Delinquencies and selects Yes from the dropdown")
    public void userClicksOnSpecialAssessmentPriorDelinquenciesAndSelectsYesFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.specialAssessmentPriorDropdown.click();
        ReportPg.selectsAnnualPriorYesOption.click();
    }

    @And("User clicks on Special Assessment Source and selects Online from the dropdown")
    public void userClicksOnSpecialAssessmentSourceAndSelectsOnlineFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.specialAssessmentSourceDropdown.click();
        ReportPg.selectsAnnualOnlineOption.click();
    }

    @Then("User clicks on Special Assessment Status and selects Paid from the dropdown")
    public void userClicksOnSpecialAssessmentStatusAndSelectsPaidFromTheDropdown() {
        wdwait.until(ExpectedConditions.invisibilityOf(ReportPg.preload));
        ReportPg.specialAssessmentStatusDropdown.click();
        ReportPg.selectsPaidOption.click();
    }


}
