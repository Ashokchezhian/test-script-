Feature: Report Builder generation
#
#  Scenario Outline: Create order from admin panel and enter one field under each section and generate report builder
#    Given User Launch Chrome browser
#    When User Opens URL "<Url>"
#    And User enters Email as "<UserName>" and Password as "<Password>"
#    And Click on Login
#    Then Application Home page should be displayed
#    When User click on Create Order
#    Then "Place New Order" and "Step 1 of 3 - Order Type" page displayed
#    When User select Customer as "<Client>" and product as "<Product>" and client reference as "<ClientRefNumber>"
#    And click on Continue To Property Search
#    Then "Place New Order" and "Step 2 of 3 - Order Details" page displayed
#    When User select Search Criteria as "Full Address" and Address type as "Auto Address" and Address as "<Address>" and Address Line as "Address Line2"
#    And click on Continue To Processing
#    Then "Place New Order" and "Step 3 of 3 - Pricing Details" page displayed
#    When User click on Place Order
#    Then Order created
#    And User clicks on the Title report generation button
#    Then In the Report Data section User enters the Additional Information field value as "Add Info" and Internal Notes field value as "InternalNote"
#    And In the Property Data section User enters Parcel ID value as "1001" Legal Description field value as "Legal Descrip" and Comments field value as "Property comments"
#    Then User selects Estate Type as "Fee simple" from the dropdown
#    And User clicks on the toggle PUD and enter the Development name field value as "Development" and clicks on the toggle Mobile Home
#    When User clicks on add Search Parties button
#    Then User selects Individual Owner from the dropdown
#    And User enters IndOwnerFirst name field value as "Fname" and IndOwnerSecond name field value as "Lname" and IndOwnerMiddle name field value as "Mname" IndOwnerAKA field value as "aka"
#    Then User enters IndOwnerProbate field value as "TestCourt" and IndOwnerDivorce field value as "Family" and IndOwnerCivil field value as "Court" and IndOwnercomments field value as "Ind Owner comments"
#    When User clicks on add Assessment button and selects Assessment
#    Then User enters Assessment year field as "2020" and Land field value as "1302" and Building field value as "1420" Extras field value as "2100" Total field value as "4822" and comments fiels value as "Assessment Comments"
#    When User clicks on add Taxes button
#    Then User selects Annual Taxes from the dropdown
#    And User enters annual Tax year field value as "2021" and enters annual Parcel as "10002" and enters annual Amount as "2210" and annual comments field value as "Tax comments"
#    Then User clicks on annual Prior Delinquencies and selects Yes from the dropdown
#    And User clicks on annual Source and selects Online from the dropdown
#    Then User clicks on annual Status and selects Paid from the dropdown
#    And User selects Date from the date field
#    When User clicks on add Vesting Deed button
#    Then User selects VestingDeed from the dropdown
#    And User enters VestingDeed Grantor field value as "ABC" and VestingDeed Instrument Type and selects VestingDeed Warranty Deed from the dropdown and enters VestingDeed Book value as "452" and VestingDeed Page value as "445"
#    Then User enters VestingDeed Grantee field value as "XYZ" and VestingDeed Consideration value as "2130" and enters VestingDeed Date and enters VestingDeed Recorded Date and enters VestingDeed Comments field value as "vesting deed comments"
#    When User clicks on add Chain of Title button
#    Then User selects ChainDeed from the dropdown
#    And User enters ChainGrantor field value as "ABC" and ChainInstrument Type and selects ChainWarranty Deed from the dropdown and enters ChainBook value as "452" and ChainPage value as "445"
#    Then User enters ChainGrantee field value as "XYZ" and ChainConsideration value as "2130" and enters ChainDate and enters ChainRecorded Date and enters Chaincomments field value as "Chain deed comments"
#    When User clicks on add Security Instruments button
#    Then User selects Mortgage from the dropdown
#    And User enters MortgageBorrower field value as "JKL" and MortgagePrincipal value as "3323" and MortgageBook value as "1212" and MortgagePage value as "9890"
#    Then User enters MortgageLender field value as "MNO" and MortgageAssignments value as "Test" and MortgageRider field value as "GHJ" and MortgageComments field value as "Security Mortgage Comments"
#    And User enters MortgageMaturity date and MortgageDate and MortgageRecorded Date
#    When User clicks on add Liens or Judgement button
#    Then User selects Liens from the dropdown
#    And User enters LienDebtor field value as "ABC" and selects lien type as Association-Other and LienBook value as "4455" and LienPage value as "8877"
#    Then User enters LienDate and LienRecorded Date
#    And User enters LienHolder field value as "XYZ" and Amount value as "45120" and LienComments field value as "Lien comments"
#    When User clicks on add Encumbrances and Restrictions button
#    Then User selects Encumbrance from the dropdown
#    And User enters EncumbranceDetail field value as "Detail" and EncumbranceBook value as "441" and EncumbrancePage value as "552"
#    Then User enters EncumbranceDate and EncumbranceRecorded Date
#    Then User click on the Preview Report Button
#
#    Examples:
#      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
#      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|60-Year Search|TestOrder123|12342 Coit Road Dallas, TX, USA|TX|DALLAS|
#
#
#  Scenario Outline: Create order from admin panel and enter all fields under search parties and generate report builder
#    Given User Launch Chrome browser
#    When User Opens URL "<Url>"
#    And User enters Email as "<UserName>" and Password as "<Password>"
#    And Click on Login
#    Then Application Home page should be displayed
#    When User click on Create Order
#    Then "Place New Order" and "Step 1 of 3 - Order Type" page displayed
#    When User select Customer as "<Client>" and product as "<Product>" and client reference as "<ClientRefNumber>"
#    And click on Continue To Property Search
#    Then "Place New Order" and "Step 2 of 3 - Order Details" page displayed
#    When User select Search Criteria as "Full Address" and Address type as "Auto Address" and Address as "<Address>" and Address Line as "Address Line2"
#    And click on Continue To Processing
#    Then "Place New Order" and "Step 3 of 3 - Pricing Details" page displayed
#    When User click on Place Order
#    Then Order created
#    And User clicks on the Title report generation button
#    When User clicks on add Search Parties button
#    Then User selects Individual Owner from the dropdown
#    When User clicks on add Search Parties button
#    Then User selects Individual Buyer from the dropdown
#    When User clicks on add Search Parties button
#    Then User selects Corporate Owner from the dropdown
#    When User clicks on add Search Parties button
#    Then User selects Corporate Buyer from the dropdown
#    And User enters IndOwnerFirst name field value as "Fname" and IndOwnerSecond name field value as "Lname" and IndOwnerMiddle name field value as "Mname" IndOwnerAKA field value as "aka"
#    Then User enters IndOwnerProbate field value as "TestCourt" and IndOwnerDivorce field value as "Family" and IndOwnerCivil field value as "Court" and IndOwnercomments field value as "Ind Owner comments"
#    And User enters IndBuyerFirst name field value as "Fname" and IndBuyerSecond name field value as "Lname" and IndBuyerMiddle name field value as "Mname" IndBuyerAKA field value as "aka"
#    Then User enters IndBuyerProbate field value as "TestCourt" and IndBuyerDivorce field value as "Family" and IndBuyerCivil field value as "Court" and IndBuyercomments field value as "Ind Buyer comments"
#    And User enters CorpOwner name field value as "CorpName" and CorpOwnerProbate field value as "TestCourt" and CorpOwnerDivorce field value as "Family" and CorpOwnerCivil field value as "Court" and CorpOwnercomments field value as "Corp Owner comments"
#    Then User enters CorpBuyer name field value as "CorpName" and CorpBuyerProbate field value as "TestCourt" and CorpBuyerDivorce field value as "Family" and CorpBuyerCivil field value as "Court" and CorpBuyercomments field value as "Corp Buyer comments"
#    Then User click on the Preview Report Button
#
#
#    Examples:
#      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
#      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|60-Year Search|TestOrder123|12342 Coit Road Dallas, TX, USA|TX|DALLAS|
#
#
#  Scenario Outline: Create order from admin panel and enter all fields under Taxes and generate report builder
#    Given User Launch Chrome browser
#    When User Opens URL "<Url>"
#    And User enters Email as "<UserName>" and Password as "<Password>"
#    And Click on Login
#    Then Application Home page should be displayed
#    When User click on Create Order
#    Then "Place New Order" and "Step 1 of 3 - Order Type" page displayed
#    When User select Customer as "<Client>" and product as "<Product>" and client reference as "<ClientRefNumber>"
#    And click on Continue To Property Search
#    Then "Place New Order" and "Step 2 of 3 - Order Details" page displayed
#    When User select Search Criteria as "Full Address" and Address type as "Auto Address" and Address as "<Address>" and Address Line as "Address Line2"
#    And click on Continue To Processing
#    Then "Place New Order" and "Step 3 of 3 - Pricing Details" page displayed
#    When User click on Place Order
#    Then Order created
#    And User clicks on the Title report generation button
#    When User clicks on add Taxes button
#    Then User selects Annual Taxes from the dropdown
#    And User enters annual Tax year field value as "2021" and enters annual Parcel as "10002" and enters annual Amount as "2210" and annual comments field value as "Tax comments"
#    Then User clicks on annual Prior Delinquencies and selects Yes from the dropdown
#    And User clicks on annual Source and selects Online from the dropdown
#    Then User clicks on annual Status and selects Paid from the dropdown
#    And User selects Date from the date field
#    Then User selects Semi Annual Taxes from the dropdown
#    And User enters Semiannual Tax year field value as "2021" and enters Semiannual Parcel as "10002" and enters First Semiannual Amount as "2210" and enters Second Semiannual Amount as "3110" and Semiannual comments field value as "Tax comments"
#    Then User clicks on Semiannual Prior Delinquencies and selects Yes from the dropdown
#    And User clicks on Semiannual Source and selects Online from the dropdown
#    Then User clicks on First Semiannual Status and selects Paid from the dropdown
#    And User clicks on Second Semiannual Status and selects Paid from the dropdown
#    When User selects Quaterly Taxes from the dropdown
#    And User enters Quaterly Tax year field value as "2021" and enters Quaterly Parcel as "10002" and Quaterly comments field value as "Tax comments"
#    Then User enter First Quaterly Amount as "2210" and enters Second Quaterly Amount as "3110" and Third Quaterly Amount as "3102" and Fourth Quaterly Amount as "4510"
#    And User clicks on Quaterly Prior Delinquencies and selects Yes from the dropdown
#    Then User clicks on Quaterly Source and selects Online from the dropdown
#    And User clicks on First Quaterly Status and selects Paid from the dropdown
#    Then User clicks on Second Quaterly Status and selects Paid from the dropdown
#    And User clicks on Third Quaterly Status and selects Paid from the dropdown
#    Then User clicks on Fourth Quaterly Status and selects Paid from the dropdown
#    When User selects Special Assessment Taxes from the dropdown
#    And User enters Special Assessment Tax year field value as "2021" and enters Special Assessment Parcel as "10002" and enters Special Assessment Amount as "2210" and Special Assessment comments field value as "Tax comments"
#    Then User clicks on Special Assessment Prior Delinquencies and selects Yes from the dropdown
#    And User clicks on Special Assessment Source and selects Online from the dropdown
#    Then User clicks on Special Assessment Status and selects Paid from the dropdown
#    Then User click on the Preview Report Button
#
#
#    Examples:
#      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
#      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|60-Year Search|TestOrder123|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: Create order from admin panel and enter all fields under Vesting Deed and generate report builder
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    When User click on Create Order
    Then "Place New Order" and "Step 1 of 3 - Order Type" page displayed
    When User select Customer as "<Client>" and product as "<Product>" and client reference as "<ClientRefNumber>"
    And click on Continue To Property Search
    Then "Place New Order" and "Step 2 of 3 - Order Details" page displayed
    When User select Search Criteria as "Full Address" and Address type as "Auto Address" and Address as "<Address>" and Address Line as "Address Line2"
    And click on Continue To Processing
    Then "Place New Order" and "Step 3 of 3 - Pricing Details" page displayed
    When User click on Place Order
    Then Order created
    And User clicks on the Title report generation button
    Then User selects VestingDeed from the dropdown
    And User enters VestingDeed Grantor field value as "ABC" and VestingDeed Instrument Type and selects VestingDeed Warranty Deed from the dropdown and enters VestingDeed Book value as "452" and VestingDeed Page value as "445"
    Then User enters VestingDeed Grantee field value as "XYZ" and VestingDeed Consideration value as "2130" and enters VestingDeed Date and enters VestingDeed Recorded Date and enters VestingDeed Comments field value as "vesting deed comments"


    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|60-Year Search|TestOrder123|12342 Coit Road Dallas, TX, USA|TX|DALLAS|