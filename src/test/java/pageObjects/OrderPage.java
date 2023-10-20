package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BaseClass{

    public OrderPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }




    @FindBy(xpath = "//mat-select[@aria-label='Select Product']")
    public  WebElement drpDownProduct;

    @FindBy(xpath="//input[@aria-label='dropdown search']")
    public  WebElement inputProduct;

    @FindBy(xpath="//mat-option[@tabindex='0']")
    public  WebElement optionProduct;

    @FindBy(id="newOrd3BtnPlaceOrd")
    public  WebElement btnPlaceOrder;


    @FindBy(xpath="//input[@id='Order_ID']")
    public  WebElement txtOrderNum;

    @FindBy(id="state")
    public  WebElement txtState;

    @FindBy(id="county")
    public  WebElement txtCounty;

    @FindBy(id="Property_Order_Number")
    public  WebElement inputClientRefNum;

    @FindBy(xpath="//mat-select[@aria-label='Select Customer *']")
    public  WebElement drpDownCustomer;

    @FindBy(xpath="//input[@aria-label='dropdown search']")
    public  WebElement inputClient;

    @FindBy(xpath ="//mat-option[@tabindex='0']")
    public WebElement optionClient;

    @FindBy(xpath="//mat-select[@id='newOrd2SelCriteria']")
    public  WebElement drpDownSearchCriteria;

    //@FindBy(xpath="//span[text()='Full Address']")
    @FindBy(xpath="//mat-option[@tabindex='0'][1]")
    public  WebElement optionFullSearch;

    @FindBy(xpath="//mat-radio-button[@id='radioBtnAutoSearch']")
    public  WebElement rdBtnAddressType;

    @FindBy(xpath="//div[@class=\"pac-container pac-logo hdpi\"]")
    public  WebElement autoSuggestionslist;

    @FindBy(xpath="//div[@class=\"pac-container pac-logo hdpi\"]")
    public  WebElement selectAddress;

    @FindBy(id="Property_Address_2")
    public  WebElement inputAddressLine1;

    @FindBy(id="search-box")
    public  WebElement inputAddress;

    @FindBy(id="newOrd1BtnPropSearch")
    public  WebElement btnContinue;

    @FindBy(id="newOrd2BtnOrdPricg")
    public  WebElement btnContinueOrderPricing;

    @FindBy(xpath="//h2")
    public  WebElement txtHeader;

    @FindBy(xpath="//div[@class='block']")
    public  WebElement txtStep;

    @FindBy(id="Order_Number")
    public  WebElement txtClientRef;

    @FindBy(id="Product_Description")
    public  WebElement txtProduct;

    @FindBy(id="orderDetailAsgnBtn")
    public  WebElement btnAssignToScreener;

    @FindBy(xpath="//div[@class='modal-content']")
    public  WebElement dialogWindow;

    @FindBy(xpath="//u[normalize-space()='Assign to me']")
    public  WebElement assigntoMe;

    @FindBy(xpath="//mat-select[contains(@id,'AdminId')]")
    public  WebElement drpDownAdminOrSM;

    @FindBy(xpath="//input[@placeholder='Search']")
    public  WebElement inputAdminOrSM;

    @FindBy(xpath ="//mat-option[@tabindex='0']")
    public  WebElement optionAdminOrSM;

    @FindBy(xpath="//input[contains(@id,'OkBtn')]")
    public  WebElement btnConfirmScreener;

    @FindBy(id="Admin_User_First_Name")
    public  WebElement txtHandledBy;

    @FindBy(xpath="//input[contains(@id,'CloseBtn')]")
    public  WebElement btnCancel;

    @FindBy(id="orderDetailCnfmBtn")
    public  WebElement btnConfirm;

    @FindBy(xpath="//mat-radio-button[@id='validOrdAddrRadio2']")
    public  WebElement rdBtnValidatedAddress;

    @FindBy(id="conOk")
    public  WebElement btnConfirmAddress;

    @FindBy(id="orderAccAccept")
    public  WebElement btnConfirmOrder;

    @FindBy(xpath="//table[@class='removeHover']/tbody/tr/td[3]/div[1]")
    public  WebElement txtConfirmStatus;

    @FindBy(id="orderDetailAcptBtn")
    public  WebElement btnAssignToProcess;

    @FindBy(xpath="//mat-datepicker-toggle/button[@class='mat-icon-button _mat-animation-noopable']")
    public  WebElement windowCalendar;

    @FindBy(xpath="//div[contains(@class,'mat-calendar-body-today')]")
    public  WebElement txtTodaysDate;

    @FindBy(xpath="//div[@id='progress']")
    public  WebElement btnProgressBar;

    @FindBy(xpath="//h4")
    public  WebElement txtWindowTitle;

    @FindBy(id="orderDetailCompBtn")
    public  WebElement btnComplete;

    @FindBy(xpath="//div[@class='interMsgColor ng-star-inserted']/b[contains(text(),'completed')]")
    public  WebElement txtCompleteStatus;

    @FindBy(id="dragDropOk")
    public  WebElement btnChkListNext1;

    @FindBy(xpath = "//span[contains(text(),'Identification')]/ancestor::div[@class='chklst-text checklist-invalid']")
    public WebElement orderChecklistIdentificationToggle;

    @FindBy(xpath = "//span[contains(text(),'Delivery Method')]/ancestor::div[@class='chklst-text checklist-invalid']")
    public WebElement orderChecklistDeliveryMethodToggle;

    @FindBy(xpath = "//span[contains(text(),'Assessment and Taxes')]/ancestor::div[@class='chklst-text checklist-invalid']")
    public WebElement orderChecklistAssessmentAndTaxesToggle;

    @FindBy(xpath = "//span[contains(text(),'Legal Description')]/ancestor::div[@class='chklst-text checklist-invalid']")
    public WebElement orderChecklistLegalDescriptionToggle;

    @FindBy(xpath = "//span[contains(text(),'Judgements')]/ancestor::div[@class='chklst-text checklist-invalid']")
    public WebElement orderChecklistJudgementsToggle;

    @FindBy(xpath = "//span[contains(text(),'Title Chain')]/ancestor::div[@class='chklst-text checklist-invalid']")
    public WebElement orderChecklistTitleChainToggle;

    @FindBy(xpath = "//span[contains(text(),'Proceedings')]/ancestor::div[@class='chklst-text checklist-invalid']")
    public WebElement orderChecklistProceedingsToggle;

    @FindBy(xpath = "//span[contains(text(),'Security Instruments')]/ancestor::div[@class='chklst-text checklist-invalid']")
    public WebElement orderChecklistSecurityInstrumentsToggle;

    @FindBy(xpath = "//span[contains(text(),'Documents')]/ancestor::div[@class='chklst-text checklist-invalid']")
    public WebElement orderChecklistDocumentsToggle;

    @FindBy(xpath = "//span[contains(text(),'SOPs')]/ancestor::div[@class='chklst-text checklist-invalid']")
    public WebElement orderChecklistSOPsToggle;

    @FindBy(xpath = "//span[contains(text(),'Costs and Fees')]/ancestor::div[@class='chklst-text checklist-invalid']")
    public WebElement orderChecklistCostsAndFeesToggle;




    @FindBy(xpath="//input[@placeholder='Please enter zipcode']")
    public  WebElement inputZipCode;

    @FindBy(xpath="//input[@placeholder='Please select effective date']")
    public  WebElement inputEffDate;

    @FindBy(xpath="//input[@placeholder='Please enter no of comments']")
    public  WebElement inputComments;

    @FindBy(xpath="//input[@placeholder='Please enter no of reports']")
    public  WebElement inputNoOfReports;

    @FindBy(xpath="//input[@placeholder='Please enter special instructions']")
    public  WebElement inputSpecInstr;

    @FindBy(id="orderChecklistOk")
    public  WebElement btnChkListNext2;

    @FindBy(id="compOrderOK")
    public  WebElement btnChkListNext3;

    @FindBy(id="reviewCompOrderOK")
    public  WebElement btnChkListComplete;

    @FindBy(xpath="//textarea[@id='Property_Order_Instructions']")
    public  WebElement inputSpecialInstr;


    @FindBy(xpath = "//input[@placeholder='Hours']")
    public  WebElement inputHours;

    @FindBy(xpath = "//label[@aria-owns='Property_Order_Instructions']")
    public  WebElement specialInstructionHeader;

    @FindBy(xpath = "//div[@class='pac-item']")
    public  WebElement addressAutoCompleteDropdown;

    @FindBy(xpath = "//b[contains(text(),'Priority')]/ancestor::label/div/div")
    public  WebElement priorityToggle;

    @FindBy(xpath = "//b[contains(text(),'Escalated')]/ancestor::label/div/div")
    public  WebElement escalatedToggle;

    @FindBy(xpath="//mat-spinner")
    public  WebElement preload;

    @FindBy(xpath="//input[@id='orderDetailCanBtn']")
    public  WebElement cancelOrderButton;

    @FindBy(xpath="//mat-select[@aria-label='Please select a reason for cancellation *']")
    public  WebElement selectDropdown;

    @FindBy(xpath="//input[@id='msgSend']")
    public  WebElement cancelMessageButton;

    @FindBy(xpath="//span[contains(text(),'Client did not accept delay')]")
    public  WebElement selectReason;

    @FindBy(xpath = "//a[@href='/']")
    public  WebElement homePageLogo;

    @FindBy(id = "ordSearchInpSearch")
    public  WebElement orderIdSearchBox;

    @FindBy(xpath = "//span[contains(text(),'Click to assign')]")
    public  WebElement clickToAssignButton;

    @FindBy(id = "confirmOrdAssign")
    public  WebElement assignButton;

    @FindBy(id = "ordDetBtnEditOrd")
    public WebElement editOrderButton;

    @FindBy(xpath = "//textarea[@placeholder='Client reference *']")
    public  WebElement clientReferenceField;

    @FindBy(xpath = "//input[@placeholder='Address line 1']")
    public  WebElement addressLine1Field;

    @FindBy(xpath = "//button[@aria-label='Next month']")
    public WebElement getWindowCalendarNextMonth;

    @FindBy(xpath = "//div[normalize-space()='1']")
    public WebElement getGetWindowCalendarNextMonthDay1;

    @FindBy(id = "editOrdDetBtnSaveChng")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//input[@placeholder='Order ETA Date (EST) *']/parent::div/following-sibling::div/mat-datepicker-toggle")
    public WebElement orderDueDateCalendar;

    @FindBy(xpath = "//textarea[@id='msgText']")
    public WebElement reasonForChangeTextBox;

    @FindBy(xpath = "//input[@value='Confirm']")
    public WebElement confirmButton;

    @FindBy(xpath = "//h4[normalize-space()='ETA Note']")
    public WebElement etaNote;

    @FindBy(xpath = "//h4[normalize-space()='Reason for change']")
    public WebElement reasonForChange;

    @FindBy(xpath = "//h4[normalize-space()='Order ETA change']")
    public WebElement orderETAChange;

    @FindBy(xpath = "//mat-select[@aria-label='Select Reason *']")
    public WebElement reasonForETAChange;

}

