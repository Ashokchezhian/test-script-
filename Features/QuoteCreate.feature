Feature: Create Quote from Admin panel

  Scenario Outline: Create Quote from Admin panel with client reference number
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
    When User clicks Complete Quote
    Then Quote is completed
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Address|SpecialIns|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|12342 Coit Road Dallas, TX, USA|TestInstructions|

  Scenario Outline: Create Quote from Admin panel
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    When User click on Create Quote
    Then "Place New Quote" and "Step 1 of 3 - Quote Details" page displayed
    When User select Customer as "<Client>"
    When User select Search Criteria as "Full Address" and Address type as "Auto Address" and Address as "<Address>" and Address Line as "Address Line2"
    And click on Continue Button
    Then "Place New Quote" and "Step 2 of 3 - Quote Documentation" page is displayed
    Then user enters Special Instructions as "<SpecialIns>" Place Order
    When user clicks on the Continue button in Spl Instruction
    Then "Place New Quote" and "Step 3 of 3 - Quote Review" page is displayed
    When user clicks on the Request Quote button
    Then Quote Info page displayed
    When User clicks Complete Quote
    Then Quote is completed
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Address|SpecialIns|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|12342 Coit Road Dallas, TX, USA|TestInstructions|

  Scenario Outline: Create Quote and convert it into an order with client reference number
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    When User click on Create Quote
    Then "Place New Quote" and "Step 1 of 3 - Quote Details" page displayed
    When User select Customer as "<Client>"
    When User select Search Criteria as "Full Address" and Address type as "Auto Address" and Address as "<Address>" and Address Line as "Address Line2"
    And click on Continue Button
    Then "Place New Quote" and "Step 2 of 3 - Quote Documentation" page is displayed
    Then user enters Special Instructions as "<SpecialIns>" Place Order
    When user clicks on the Continue button in Spl Instruction
    Then "Place New Quote" and "Step 3 of 3 - Quote Review" page is displayed
    When user clicks on the Request Quote button
    Then Quote Info page displayed
    When User clicks Complete Quote
    Then Quote is completed
    When User clicks on convert to order
    Then a dialog box for converting a quote to an order is prompted and user selects a product and enter the client reference number
    And User converts the quote into an order
    Then Order created
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Address|SpecialIns|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|12342 Coit Road Dallas, TX, USA|TestInstructions|