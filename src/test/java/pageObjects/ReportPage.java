package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class ReportPage extends BaseClass{

    public ReportPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//i[@mattooltip='Click to generate Title Report']")
    public  WebElement titleReportButton;

    @FindBy(xpath="//mat-spinner")
    public  WebElement preload;

    @FindBy(xpath="//textarea[@id='Search_Package_Other_Information']")
    public  WebElement additionalInfo;

    @FindBy(xpath="//textarea[@id='Search_Package_Internal_Notes']")
    public  WebElement internalNote;

    @FindBy(xpath="//textarea[@id='Search_Package_Parcel']")
    public  WebElement parcelField;

    @FindBy(xpath="//textarea[@id='Search_Package_Legal_Description']")
    public  WebElement legalField;

    @FindBy(xpath="//textarea[@id='Search_Package_Comments']")
    public  WebElement propertyComments;

    @FindBy(xpath="//div[@class='mat-select-value']")
    public  WebElement drpDownEstateType;

    @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Fee simple']")
    public  WebElement optionFeeSimple;

    @FindBy(xpath="//span[contains(text(),'PUD')]/ancestor::label/div/div")
    public  WebElement pudButton;

    @FindBy(xpath="//textarea[@id='Search_Package_Development_Name']")
    public WebElement developmentField;

    @FindBy(xpath="//span[contains(text(),'Mobile Home')]/ancestor::label/div/div")
    public  WebElement mobileButton;

    @FindBy(xpath="//label[normalize-space()='Property Data']")
    public  WebElement propertData;

    @FindBy(xpath="//span[contains(text(),'Add party')]//parent::div/button")
    public  WebElement addSearchPartiesBtn;

    @FindBy(xpath="//button[normalize-space()='Individual Owner']")
    public  WebElement addIndividualOwnerBtn;

    @FindBy(xpath="//button[normalize-space()='Individual Buyer']")
    public  WebElement addIndividualBuyerBtn;

    @FindBy(xpath="//button[normalize-space()='Corporate Owner']")
    public  WebElement addCorporateOwnerBtn;

    @FindBy(xpath="//button[normalize-space()='Corporate Buyer']")
    public  WebElement addCorporateBuyerBtn;

    @FindBy(xpath="//label[contains(text(),' Individual Owner ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[1]/mat-form-field/div/div/div/textarea")
    public  WebElement indOwnerFname;

    @FindBy(xpath="//label[contains(text(),' Individual Owner ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[2]/mat-form-field/div/div/div/textarea")
    public  WebElement indOwnerLname;

    @FindBy(xpath="//label[contains(text(),' Individual Owner ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[3]/mat-form-field/div/div/div/textarea")
    public  WebElement indOwnerMname;

    @FindBy(xpath="//label[contains(text(),' Individual Owner ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[4]/mat-form-field/div/div/div/textarea")
    public  WebElement indOwnerAka;

    @FindBy(xpath="//label[contains(text(),' Individual Owner ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[7]/mat-form-field/div/div/div/textarea")
    public  WebElement indOwnerProbate;

    @FindBy(xpath="//label[contains(text(),' Individual Owner ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[8]/mat-form-field/div/div/div/textarea")
    public  WebElement indOwnerDivorce;

    @FindBy(xpath="//label[contains(text(),' Individual Owner ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[9]/mat-form-field/div/div/div/textarea")
    public  WebElement indOwnerCivil;

    @FindBy(xpath="//label[contains(text(),' Individual Owner ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[10]/mat-form-field/div/div/div/textarea")
    public  WebElement indOwnerComments;

    @FindBy(xpath="//span[contains(text(),'Add assessment')]//parent::div/button")
    public  WebElement addAssessmentBtn;

    @FindBy(xpath="//button[normalize-space()='Assessment']")
    public  WebElement assessmentButton;

    @FindBy(xpath="//input[@id='SP_Assessment_Year']")
    public  WebElement assessmentYearField;

    @FindBy(xpath="//input[@id='SP_Assessment_Land']")
    public  WebElement landValue;

    @FindBy(xpath="//input[@id='SP_Assessment_Building']")
    public  WebElement buildingValue;

    @FindBy(xpath="//input[@id='SP_Assessment_Extras']")
    public  WebElement extrasValue;

    @FindBy(xpath="//input[@id='SP_Assessment_Total']")
    public  WebElement totalValue;

    @FindBy(xpath="//textarea[@id='SP_Assessment_Comments']")
    public  WebElement assessmentComments;

    @FindBy(xpath="//span[contains(text(),'Add taxes')]//parent::div/button")
    public  WebElement taxesButton;

    @FindBy(xpath="//button[normalize-space()='Annual Taxes']")
    public  WebElement annualTaxes;

    @FindBy(xpath="//label[contains(text(),' Annual Taxes ')]/ancestor::div[@class='sectionHeader error-item-border-header']/following-sibling::section/div/div[1]/mat-form-field/div/div/div/input")
    public  WebElement annualTaxYearField;

    @FindBy(xpath="//label[contains(text(),' Annual Taxes ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[4]/mat-form-field/div/div/div/textarea")
    public  WebElement annualTaxParcelField;

    @FindBy(xpath="//label[contains(text(),' Annual Taxes ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[5]/mat-form-field/div/div/div/input")
    public  WebElement annualTaxAmountField;

    @FindBy(xpath="//label[contains(text(),' Annual Taxes ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[8]/mat-form-field/div/div/div/textarea")
    public  WebElement annualTaxComments;

    @FindBy(xpath="//label[contains(text(),' Annual Taxes ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[2]/mat-form-field/div/div/div/mat-select")
    public  WebElement annualPriorDropdown;

    @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Yes']")
    public  WebElement selectsAnnualPriorYesOption;

    @FindBy(xpath="//label[contains(text(),' Annual Taxes ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[3]/mat-form-field/div/div/div/mat-select")
    public  WebElement annualSourceDropdown;

    @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Online']")
    public  WebElement selectsAnnualOnlineOption;

    @FindBy(xpath="//label[contains(text(),' Annual Taxes ')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[6]/mat-form-field/div/div/div/mat-select")
    public  WebElement annualStatusDropdown;

    @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Paid']")
    public  WebElement selectsPaidOption;

    @FindBy(xpath="//span[contains(text(),'Add Vesting Deed')]//parent::div/button")
    public  WebElement vestingDeedButton;

    @FindBy(xpath="//button[normalize-space()='Deed']")
    public  WebElement deedOption;

    @FindBy(xpath="//app-report-vesting-data//label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[1]/mat-form-field/div/div/div/textarea")
    public  WebElement vestingDeedGrantorField;

    @FindBy(xpath="//app-report-vesting-data//label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[2]/mat-form-field/div/div/div/mat-select")
    public  WebElement vestingDeedInstrumentDropdown;

    @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Warranty Deed']")
    public  WebElement warrantyDeedOption;

    @FindBy(xpath="//app-report-vesting-data//label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[3]/mat-form-field/div/div/div/textarea")
    public  WebElement vestingDeedBookField;

    @FindBy(xpath="//app-report-vesting-data//label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[4]/mat-form-field/div/div/div/textarea")
    public  WebElement vestingDeedPageField;

    @FindBy(xpath="//app-report-vesting-data//label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[5]/mat-form-field/div/div/div/textarea")
    public  WebElement vestingDeedGranteeField;

    @FindBy(xpath="//app-report-vesting-data//label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[6]/mat-form-field/div/div/div/input")
    public  WebElement vestingDeedConsiderationField;

    @FindBy(xpath="//app-report-vesting-data//label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[9]/mat-form-field/div/div/div/textarea")
    public  WebElement vestingDeedComments;

    @FindBy(xpath="//span[contains(text(),'Add title chain')]//parent::div/button")
    public  WebElement chainOfTitleButton;

    @FindBy(xpath="//span[contains(text(),'Add security instrument')]//parent::div/button")
    public  WebElement securityButton;

    @FindBy(xpath="//app-report-title-data/div/section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantor']")
    public  WebElement chainGrantorField;

    @FindBy(xpath="//app-report-title-data/div/section/div/div/mat-form-field/div/div/div/mat-select[@id='SP_Chain_Instrument_Type_ID']/div[@class='mat-select-arrow-wrapper']")
    public  WebElement chainInstrumentDropdown;

    @FindBy(xpath="//app-report-title-data/div/section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Book_Instrument_Num']")
    public  WebElement chainBookField;

    @FindBy(xpath="//app-report-title-data/div/section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Page']")
    public  WebElement chainPageField;
    @FindBy(xpath="//app-report-title-data/div/section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantee']")
    public  WebElement chainGranteeField;

    @FindBy(xpath="//app-report-title-data/div/section/div/div/mat-form-field/div/div/div/input[@id='SP_Deed_Consideration']")
    public  WebElement chainConsiderationField;

    @FindBy(xpath="//app-report-title-data/div/section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Chain_Of_Title_Comments']")
    public  WebElement chainDeedComments;

    @FindBy(xpath="//div[@class='cdk-overlay-container']//mat-card[1]")
    public  WebElement mortgageOption;

    @FindBy(xpath="//textarea[@id='SP_Mortgage_Borrower']")
    public  WebElement mortgageBorrower;

    @FindBy(xpath="//input[@id='SP_Mortgage_Amount']")
    public  WebElement mortgagePrincipal;

    @FindBy(xpath="//textarea[@id='Mortgage_Book']")
    public  WebElement mortgageBook;

    @FindBy(xpath="//textarea[@id='Mortgage_Page']")
    public  WebElement mortgagePage;

    @FindBy(xpath="//textarea[@id='SP_Mortgage_Lender']")
    public  WebElement mortgageLender;

    @FindBy(xpath="//textarea[@id='SP_Mortgage_Assignments']")
    public  WebElement mortgageAssignments;

    @FindBy(xpath="//textarea[@id='SP_Mortgage_Rider']")
    public  WebElement mortgageRider;

    @FindBy(xpath="//textarea[@id='SP_Mortgage_Comments']")
    public  WebElement mortgageComments;

    @FindBy(xpath="//span[contains(text(),'Add lien or judgement')]//parent::div/button")
    public  WebElement lienOrJudgementButton;

    @FindBy(xpath="//button[normalize-space()='Lien']")
    public  WebElement lienOption;

    @FindBy(xpath="//textarea[@id='SP_Lien_Judgement_Debtor_Defendant']")
    public  WebElement lienDebtor;

    @FindBy(xpath="//mat-select[@id='SP_Lien_Judgement_Type_ID']//div[@class='mat-select-arrow-wrapper']")
    public  WebElement lienType;

    @FindBy(xpath="//span[normalize-space()='Association - Other']")
    public  WebElement lienAssociation;

    @FindBy(xpath="//textarea[@id='SP_Lien_Judgement_Book_Case']")
    public  WebElement lienBook;

    @FindBy(xpath="//textarea[@id='SP_Lien_Judgement_PG_Case']")
    public  WebElement lienPage;

    @FindBy(xpath="//textarea[@id='Against_Or_Infavorof']")
    public  WebElement lienHolder;

    @FindBy(xpath="//input[@id='SP_Lien_Judgement_Amount']")
    public  WebElement lienAmount;

    @FindBy(xpath="//textarea[@id='SP_Lien_Judgement_Comments']")
    public  WebElement lienComments;

    @FindBy(xpath="//span[contains(text(),'Add Item')]//parent::div/button")
    public  WebElement encumbrancesAndRestrictionsButton;

    @FindBy(xpath="//button[normalize-space()='Encumbrance']")
    public  WebElement encumbrancesOption;

    @FindBy(xpath="//textarea[@id='SP_ERA_Detail']")
    public  WebElement encumbrancesDetail;

    @FindBy(xpath="//textarea[@id='SP_ERA_Book_Instrument']")
    public  WebElement encumbrancesBook;

    @FindBy(xpath="//textarea[@id='SP_ERA_Page']")
    public  WebElement encumbrancesPage;

    @FindBy(xpath="//input[@id='reportBuilderPrevBtn']")
    public  WebElement previewReportButton;

    @FindBy(xpath="//label[contains(text(),'Individual Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[1]/mat-form-field/div/div/div/textarea")
    public  WebElement indBuyerFname;

    @FindBy(xpath="//label[contains(text(),'Individual Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[2]/mat-form-field/div/div/div/textarea")
    public  WebElement indBuyerLname;

    @FindBy(xpath="//label[contains(text(),'Individual Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[3]/mat-form-field/div/div/div/textarea")
    public  WebElement indBuyerMname;

    @FindBy(xpath="//label[contains(text(),'Individual Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[4]/mat-form-field/div/div/div/textarea")
    public  WebElement indBuyerAka;

    @FindBy(xpath="//label[contains(text(),'Individual Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[6]/mat-form-field/div/div/div/textarea")
    public  WebElement indBuyerProbate;

    @FindBy(xpath="//label[contains(text(),'Individual Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[7]/mat-form-field/div/div/div/textarea")
    public  WebElement indBuyerDivorce;

    @FindBy(xpath="//label[contains(text(),'Individual Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[8]/mat-form-field/div/div/div/textarea")
    public  WebElement indBuyerCivil;

    @FindBy(xpath="//label[contains(text(),'Individual Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[9]/mat-form-field/div/div/div/textarea")
    public  WebElement indBuyerComments;

    @FindBy(xpath="//label[contains(text(),'Corporate Owner')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[1]/mat-form-field/div/div/div/textarea")
    public  WebElement corpOwnerName;

    @FindBy(xpath="//label[contains(text(),'Corporate Owner')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[4]/mat-form-field/div/div/div/textarea")
    public  WebElement corpOwnerProbate;

    @FindBy(xpath="//label[contains(text(),'Corporate Owner')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[5]/mat-form-field/div/div/div/textarea")
    public  WebElement corpOwnerDivorce;

    @FindBy(xpath="//label[contains(text(),'Corporate Owner')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[6]/mat-form-field/div/div/div/textarea")
    public  WebElement corpOwnerCivil;

    @FindBy(xpath="//label[contains(text(),'Corporate Owner')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[7]/mat-form-field/div/div/div/textarea")
    public  WebElement corpOwnerComments;

    @FindBy(xpath="//label[contains(text(),'Corporate Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[1]/mat-form-field/div/div/div/textarea")
    public  WebElement corpBuyerName;

    @FindBy(xpath="//label[contains(text(),'Corporate Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[3]/mat-form-field/div/div/div/textarea")
    public  WebElement corpBuyerProbate;

    @FindBy(xpath="//label[contains(text(),'Corporate Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[4]/mat-form-field/div/div/div/textarea")
    public  WebElement corpBuyerDivorce;

    @FindBy(xpath="//label[contains(text(),'Corporate Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[5]/mat-form-field/div/div/div/textarea")
    public  WebElement corpBuyerCivil;

    @FindBy(xpath="//label[contains(text(),'Corporate Buyer')]//ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[6]/mat-form-field/div/div/div/textarea")
    public  WebElement corpBuyerComments;

    @FindBy(xpath="//label[normalize-space()='Assessments']")
    public  WebElement assessmentHeader;

    @FindBy(xpath="//label[normalize-space()='Taxes']")
    public  WebElement taxesHeader;

    @FindBy(xpath="//button[normalize-space()='Semi-Annual Taxes']")
    public  WebElement semiAnnualTaxes;

    @FindBy(xpath="//label[contains(text(),'Semi-Annual Taxes')]/ancestor::div[@class='sectionHeader error-item-border-header']/following-sibling::section/div/div[1]/mat-form-field/div/div/div/input")
    public  WebElement semiAnnualTaxYearField;

    @FindBy(xpath="//label[contains(text(),'Semi-Annual Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[4]/mat-form-field/div/div/div/textarea")
    public  WebElement semiAnnualTaxParcelField;

    @FindBy(xpath="//label[contains(text(),'Semi-Annual Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[5]/mat-form-field/div/div/div/input")
    public  WebElement firstSemiAnnualTaxAmountField;

    @FindBy(xpath="//label[contains(text(),'Semi-Annual Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[8]/mat-form-field/div/div/div/input")
    public  WebElement secondSemiAnnualTaxAmountField;

    @FindBy(xpath="//label[contains(text(),'Semi-Annual Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[11]/mat-form-field/div/div/div/textarea")
    public  WebElement semiAnnualTaxComments;

    @FindBy(xpath="//label[contains(text(),'Semi-Annual Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[2]/mat-form-field/div/div/div/mat-select")
    public  WebElement semiAnnualPriorDropdown;

    @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Yes']")
    public  WebElement selectsPriorYesOption;

    @FindBy(xpath="//label[contains(text(),'Semi-Annual Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[3]/mat-form-field/div/div/div/mat-select")
    public  WebElement semiAnnualSourceDropdown;

    @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Online']")
    public  WebElement semiAnnualOnlineOption;

    @FindBy(xpath="//label[contains(text(),'Semi-Annual Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[6]/mat-form-field/div/div/div/mat-select")
    public  WebElement firstAnnualStatusDropdown;

    @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Paid']")
    public  WebElement semiAnnualPaidOption;

    @FindBy(xpath="//label[contains(text(),'Semi-Annual Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[9]/mat-form-field/div/div/div/mat-select")
    public  WebElement secondAnnualStatusDropdown;

    @FindBy(xpath="//button[normalize-space()='Quarterly Taxes']")
    public  WebElement quaterlyTaxes;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader error-item-border-header']/following-sibling::section/div/div[1]/mat-form-field/div/div/div/input")
    public  WebElement quaterlyTaxYearField;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[4]/mat-form-field/div/div/div/textarea")
    public  WebElement quaterlyTaxParcelField;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[17]/mat-form-field/div/div/div/textarea")
    public  WebElement quaterlyTaxComments;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[5]/mat-form-field/div/div/div/input")
    public  WebElement firstQuaterlyTaxAmountField;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[8]/mat-form-field/div/div/div/input")
    public  WebElement secondQuaterlyTaxAmountField;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[11]/mat-form-field/div/div/div/input")
    public  WebElement thirdQuaterlyTaxAmountField;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[14]/mat-form-field/div/div/div/input")
    public  WebElement fourthQuaterlyTaxAmountField;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[2]/mat-form-field/div/div/div/mat-select")
    public  WebElement quaterlyPriorDropdown;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[3]/mat-form-field/div/div/div/mat-select")
    public  WebElement quaterlySourceDropdown;

    @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Online']")
    public  WebElement quaterlyOnlineOption;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[6]/mat-form-field/div/div/div/mat-select")
    public  WebElement firstQuaterlyStatusDropdown;

    @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Paid']")
    public  WebElement quaterlyPaidOption;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[9]/mat-form-field/div/div/div/mat-select")
    public  WebElement secondQuaterlyStatusDropdown;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[12]/mat-form-field/div/div/div/mat-select")
    public  WebElement thirdQuaterlyStatusDropdown;

    @FindBy(xpath="//label[contains(text(),'Quarterly Taxes')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[15]/mat-form-field/div/div/div/mat-select")
    public  WebElement fourthQuaterlyStatusDropdown;

    @FindBy(xpath="//button[normalize-space()='Special Assessment']")
    public  WebElement specialAssessmentTaxes;

    @FindBy(xpath="//label[contains(text(),'Special Assessment')]/ancestor::div[@class='sectionHeader error-item-border-header']/following-sibling::section/div/div[1]/mat-form-field/div/div/div/input")
    public  WebElement specialAssessmentTaxYearField;

    @FindBy(xpath="//label[contains(text(),'Special Assessment')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[4]/mat-form-field/div/div/div/textarea")
    public  WebElement specialAssessmentParcelField;

    @FindBy(xpath="//label[contains(text(),'Special Assessment')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[5]/mat-form-field/div/div/div/input")
    public  WebElement specialAssessmentAmountField;

    @FindBy(xpath="//label[contains(text(),'Special Assessment')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[8]/mat-form-field/div/div/div/textarea")
    public  WebElement specialAssessmentComments;

    @FindBy(xpath="//label[contains(text(),'Special Assessment')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[2]/mat-form-field/div/div/div/mat-select")
    public  WebElement specialAssessmentPriorDropdown;

    @FindBy(xpath="//label[contains(text(),'Special Assessment')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[3]/mat-form-field/div/div/div/mat-select")
    public  WebElement specialAssessmentSourceDropdown;

    @FindBy(xpath="//label[contains(text(),'Special Assessment')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[6]/mat-form-field/div/div/div/mat-select")
    public  WebElement specialAssessmentStatusDropdown;

    @FindBy(xpath = "//label[contains(text(),'Encumbrance')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_ERA_Detail']")
    public  WebElement encumbranceDetailField;

    @FindBy(xpath = "//label[contains(text(),'Encumbrance')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_ERA_Book_Instrument']")
    public  WebElement encumbranceBookInstrumentField;

    @FindBy(xpath = "//label[contains(text(),'Encumbrance')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_ERA_Page']")
    public  WebElement encumbrancePageField;

    @FindBy(xpath = "//label[contains(text(),'Encumbrance')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Dated']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public  WebElement encumbranceDatedCalenderButton;

    @FindBy(xpath = "//label[contains(text(),'Encumbrance')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Recorded']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public  WebElement encumbranceRecordedCalenderButton;


    @FindBy(xpath = "//label[contains(text(),'Restriction')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_ERA_Detail']")
    public  WebElement restrictionDetailField;

    @FindBy(xpath = "//label[contains(text(),'Restriction')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_ERA_Book_Instrument']")
    public  WebElement restrictionBookInstrumentField;

    @FindBy(xpath = "//label[contains(text(),'Restriction')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_ERA_Page']")
    public  WebElement restrictionPageField;

    @FindBy(xpath = "//label[contains(text(),'Restriction')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Dated']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public  WebElement restrictionDatedCalenderButton;

    @FindBy(xpath = "//label[contains(text(),'Restriction')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Recorded']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public  WebElement restrictionRecordedCalenderButton;

    @FindBy(xpath = "//label[contains(text(),'Adverse Item')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_ERA_Detail']")
    public  WebElement adverseItemDetailField;

    @FindBy(xpath = "//label[contains(text(),'Adverse Item')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_ERA_Book_Instrument']")
    public  WebElement adverseItemBookInstrumentField;

    @FindBy(xpath = "//label[contains(text(),'Adverse Item')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_ERA_Page']")
    public  WebElement adverseItemPageField;

    @FindBy(xpath = "//label[contains(text(),'Adverse Item')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Dated']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public  WebElement adverseItemDatedCalenderButton;

    @FindBy(xpath = "//label[contains(text(),'Adverse Item')]/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Recorded']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public  WebElement adverseItemRecordedCalenderButton;

    @FindBy(xpath = "//label[normalize-space()='Lien']/ancestor::div[@class='sectionHeader error-item-border-header']//following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Lien_Judgement_Debtor_Defendant']")
    public WebElement lienDebtorTextField;

    @FindBy(xpath = "//label[normalize-space()='Lien']/ancestor::div[@class='sectionHeader error-item-border-header']//following-sibling::section/div/div/mat-form-field/div/div/div/mat-select[@id='SP_Lien_Judgement_Type_ID']")
    public WebElement lienTypeDropdown;

    @FindBy(xpath = "//label[normalize-space()='Lien']/ancestor::div[@class='sectionHeader error-item-border-header']//following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Lien_Judgement_Book_Case']")
    public WebElement lienBookInstrumentTextField;

    @FindBy(xpath = "//label[normalize-space()='Lien']/ancestor::div[@class='sectionHeader error-item-border-header']//following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Lien_Judgement_PG_Case']")
    public WebElement lienPageTextField;

    @FindBy(xpath = "//label[normalize-space()='Lien']/ancestor::div[@class='sectionHeader error-item-border-header']//following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='Against_Or_Infavorof']")
    public WebElement lienHolderTextField;

    @FindBy(xpath = "//label[normalize-space()='Lien']/ancestor::div[@class='sectionHeader error-item-border-header']//following-sibling::section/div/div/mat-form-field/div/div/div/input[@id='SP_Lien_Judgement_Amount']")
    public WebElement lienAmountField;

    @FindBy(xpath = "//label[normalize-space()='Lien']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Dated']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public  WebElement lienDatedCalenderButton;

    @FindBy(xpath = "//label[normalize-space()='Lien']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Recorded']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public  WebElement lienRecordedCalenderButton;

    @FindBy(xpath = "//label[normalize-space()='Vesting Deed']")
    public WebElement vestingDeedHeader;

    @FindBy(xpath = "//label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Estate_Of']")
    public WebElement estateEstateOfTextField;

    @FindBy(xpath = "//label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/mat-select[@id='SP_Chain_Instrument_Type_ID']")
    public WebElement estateInstrumentTypeDropdown;

    @FindBy(xpath = "//label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Book_Instrument_Num']")
    public WebElement estateBookOrInstrumentTextField;

    @FindBy(xpath = "//label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Page_Instrument_Num']")
    public WebElement estatePageTextField;

    @FindBy(xpath = "//label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Beneficiaries']")
    public WebElement estateBeneficiariesTextField;

    @FindBy(xpath = "//label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/input[@id='SP_Deed_Consideration']")
    public WebElement estateConsiderationTextField;

    @FindBy(xpath = "//label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Date of Death']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement estateDateOfDeathCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Recorded']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement estateRecordedCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Chain_Of_Title_Comments']")
    public WebElement estateCommentsTextField;

    @FindBy(xpath = "//label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantor']")
    public WebElement deedSurvivorShipGrantorTextField;

    @FindBy(xpath = "//label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/mat-select[@id='SP_Chain_Instrument_Type_ID']")
    public WebElement deedSurvivorShipInstrumentDropdown;

    @FindBy(xpath = "//label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Book_Instrument_Num']")
    public WebElement deedSurvivorShipBookOrInstrumentTextField;

    @FindBy(xpath = "//label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Page_Instrument_Num']")
    public WebElement deedSurvivorShipPageTextField;

    @FindBy(xpath = "//label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantee']")
    public WebElement deedSurvivorShipGranteeTextField;

    @FindBy(xpath = "//label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/input[@id='SP_Deed_Consideration']")
    public WebElement deedSurvivorShipConsiderationTextField;

    @FindBy(xpath = "//label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Dated']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement deedSurvivorShipDateOfDeathCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Recorded']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement deedSurvivorShipRecordedCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Chain_Of_Title_Comments']")
    public WebElement deedSurvivorShipCommentsTextField;


    @FindBy(xpath = "//label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantor']")
    public WebElement leaseholdDeedGrantorTextField;

    @FindBy(xpath = "//label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/mat-select[@id='SP_Chain_Instrument_Type_ID']")
    public WebElement leaseholdDeedInstrumentDropdown;

    @FindBy(xpath = "//label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Book_Instrument_Num']")
    public WebElement leaseholdDeedBookOrInstrumentTextField;

    @FindBy(xpath = "//label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Page_Instrument_Num']")
    public WebElement leaseholdDeedPageTextField;

    @FindBy(xpath = "//label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantee']")
    public WebElement leaseholdDeedGranteeTextField;

    @FindBy(xpath = "//label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/input[@id='SP_Deed_Consideration']")
    public WebElement leaseholdDeedConsiderationTextField;

    @FindBy(xpath = "//label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Dated']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement leaseholdDeedDateOfDeathCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Recorded']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement leaseholdDeedRecordedCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Chain_Of_Title_Comments']")
    public WebElement leaseholdDeedCommentsTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantor']")
    public WebElement chainOfTitleDeedGrantorTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div//label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div[2]/mat-form-field/div/div/div/mat-select")
    public WebElement chainOfTitleDeedInstrumentTypeDropdownField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div//label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Book_Instrument_Num']")
    public WebElement chainOfTitleDeedBookOrInstrumentTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div//label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Page']")
    public WebElement chainOfTitleDeedPageTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div//label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantee']")
    public WebElement chainOfTitleDeedGranteeTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/input[@id='SP_Deed_Consideration']")
    public WebElement chainOfTitleDeedConsiderationTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Dated']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement chainOfTitleDeedDatedCalenderButton;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Recorded']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement chainOfTitleDeedRecordedCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Chain_Of_Title_Comments']")
    public WebElement chainOfTitleDeedCommentsTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed']")
    public WebElement chainOfTitleDeedHeader;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Estate']")
    public WebElement chainOfTitleEstateHeader;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed- Survivorship']")
    public WebElement chainOfTitleDeedSurvivorshipHeader;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Leasehold Deed']")
    public WebElement chainOfTitleLeaseholdDeedHeader;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Estate_Of']")
    public WebElement chainOfTitleEstateEstateOfTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/mat-select[@id='SP_Chain_Instrument_Type_ID']")
    public WebElement chainOfTitleEstateInstrumentTypeDropdown;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Book_Instrument_Num']")
    public WebElement chainOfTitleEstateBookOrInstrumentTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Book_Instrument_Num']")
    public WebElement chainOfTitleEstatePageTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Beneficiaries']")
    public WebElement chainOfTitleEstateBeneficiariesTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/input[@id='SP_Deed_Consideration']")
    public WebElement chainOfTitleEstateConsiderationTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Date of Death']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement chainOfTitleEstateDateOfDeathCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Recorded']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement chainOfTitleEstateRecordedCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Estate']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Chain_Of_Title_Comments']")
    public WebElement chainOfTitleEstateCommentsTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantor']")
    public WebElement chainOfTitleDeedSurvivorShipGrantorTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/mat-select[@id='SP_Chain_Instrument_Type_ID']")
    public WebElement chainOfTitleDeedSurvivorShipInstrumentDropdown;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Book_Instrument_Num']")
    public WebElement chainOfTitleDeedSurvivorShipBookOrInstrumentTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Page']")
    public WebElement chainOfTitleDeedSurvivorShipPageTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantee']")
    public WebElement chainOfTitleDeedSurvivorShipGranteeTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/input[@id='SP_Deed_Consideration']")
    public WebElement chainOfTitleDeedSurvivorShipConsiderationTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Dated']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement chainOfTitleDeedSurvivorShipDateOfDeathCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Recorded']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement chainOfTitleDeedSurvivorShipRecordedCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Deed- Survivorship']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Chain_Of_Title_Comments']")
    public WebElement chainOfTitleDeedSurvivorShipCommentsTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantor']")
    public WebElement chainOfTitleLeaseholdDeedGrantorTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/mat-select[@id='SP_Chain_Instrument_Type_ID']")
    public WebElement chainOfTitleLeaseholdDeedInstrumentDropdown;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Book_Instrument_Num']")
    public WebElement chainOfTitleLeaseholdDeedBookOrInstrumentTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Page']")
    public WebElement chainOfTitleLeaseholdDeedPageTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Deed_Grantee']")
    public WebElement chainOfTitleLeaseholdDeedGranteeTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/input[@id='SP_Deed_Consideration']")
    public WebElement chainOfTitleLeaseholdDeedConsiderationTextField;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Dated']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement chainOfTitleLeaseholdDeedDateOfDeathCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/app-pippin-dates/mat-form-field/div/div/div/input[@placeholder='Recorded']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement chainOfTitleLeaseholdDeedRecordedCalendarButton;

    @FindBy(xpath = "//label[normalize-space()='Chain of Title']/parent::div/following-sibling::div/app-report-title-data/div/div/div/div/label[normalize-space()='Leasehold Deed']/ancestor::div[@class='sectionHeader']/following-sibling::section/div/div/mat-form-field/div/div/div/textarea[@id='SP_Chain_Of_Title_Comments']")
    public WebElement chainOfTitleLeaseholdDeedCommentsTextField;













}
