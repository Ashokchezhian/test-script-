Feature: Edit Orders & Quotes from Admin panel
  Scenario Outline: Edit Order from SuperAdmin credentials
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
    And  Order details "<ClientRefNumber>" and "<Product>" and "<State>" and "<County>" displayed in the Order Info page.
    Then Order Info page displayed with "Assign To screener" option
    When User click "Assign To screener" and select admin user "Assign to me" and Confirm
    Then Order assigned to admin user "Adm user"
    Then Order Info page displayed with "Confirm" option
    When User click "Confirm" and Confirm address
    Then Order Confirmed
    When User click on edit Order Button
    Then User gets redirected to the edit order page
    Then User edits the  fields like "<ClientRefNumber>" and address line
    And User changes the Order due date
    When User handles all the popup and clicks on save changes button
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|60-Year Search|SuperAdminEditOrderReference|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: Edit Quote from Admin panel with client reference number
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    When User click on Create Quote
    Then "Place New Quote" and "Step 1 of 3 - Quote Details" page displayed
    When User select Customer as "<Client>"
    When User select Search Criteria as "Full Address" and Address type as "Auto Address" and Address as "<Address>" and Address Line as "Address Line2"
    And User enters the client reference number
    And click on Continue Button
    Then "Place New Quote" and "Step 2 of 3 - Quote Documentation" page is displayed
    Then user enters Special Instructions as "<SpecialIns>" Place Order
    When user clicks on the Continue button in Spl Instruction
    Then "Place New Quote" and "Step 3 of 3 - Quote Review" page is displayed
    When user clicks on the Request Quote button
    Then Quote Info page displayed

    When User click on edit Quote Button
    Then User edits the  quote fields like "<ClientRefNumber>" and address line
    When User handles all the popup and clicks on save changes button

    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Address|SpecialIns|ClientRefNumber|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|12342 Coit Road Dallas, TX, USA|TestInstructions|AutomationTestClientReferenceNumber|
