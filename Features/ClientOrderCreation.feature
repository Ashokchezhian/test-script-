Feature: Create order from client panel

  Scenario Outline:	Create Non Prepaid Individual Order From client Panel
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Client Email as "<UserName>" and Password as "<Password>"
    When Click on Login Button
    When User click on place Order
    Then "Place New Order" and "Step 1 of 2 - Order Type" client page displayed
    When User select Product as "Current Owner Search"
    When User select Search Criteria as "Full Address" and Address type as "Auto Address" and Address as "<Address>"
    Then User enters client reference as "<ClientRef>"
    When User click on Complete Button
    Then "Place New Order" and "Step 2 of 2 - Review Order" client page displayed
    When User click on on the accept terms and conditions checkbox and clicks on the submit button
    When User click on client Log out link
    Then "Admin Console" Header should be displayed
    And Close browser



    Examples:
      |Url|UserName|Password|Address|ClientRef|
      |https://appqa.pippintitle.com/login|Induser3@mailinator.com|Users#76392@!|12342 Coit Road Dallas, TX, USA|ClientTestOrder|

  Scenario Outline:	Create Non Prepaid Company Order From client Panel
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Client Email as "<UserName>" and Password as "<Password>"
    When Click on Login Button
    When User click on place Order
    Then "Place New Order" and "Step 1 of 2 - Order Type" client page displayed
    When User select Product as "Current Owner Search"
    When User select Search Criteria as "Full Address" and Address type as "Auto Address" and Address as "<Address>"
    Then User enters client reference as "<ClientRef>"
    When User click on Complete Button
    Then "Place New Order" and "Step 2 of 2 - Review Order" client page displayed
    When User click on on the accept terms and conditions checkbox and clicks on the submit button
    When User click on client Log out link
    Then "Admin Console" Header should be displayed
    And Close browser



    Examples:
      |Url|UserName|Password|Address|ClientRef|
      |https://appqa.pippintitle.com/login|Cmpuser8@mailinator.com|Users#76392@!|12342 Coit Road Dallas, TX, USA|ClientTestOrder|

  Scenario Outline:	Create Prepaid Individual Client Order From client Panel
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Client Email as "<UserName>" and Password as "<Password>"
    When Click on Login Button
    When User click on place Order
    Then "Place New Order" and "Step 1 of 3 - Order Type" client page displayed
    When User select Product as "Current Owner Search"
    When User select Search Criteria as "Full Address" and Address type as "Auto Address" and Address as "<Address>"
    Then User enters client reference as "<ClientRef>"
    When User click on Complete Button
    Then "Place New Order" and "Step 2 of 3 - Pricing & Billing" client page displayed
    Then User click on the continue button
    Then "Place New Order" and "Step 3 of 3 - Review Order" client page displayed
    When User click on on the accept terms and conditions checkbox and clicks on the submit button
    When User click on client Log out link
    Then "Admin Console" Header should be displayed
    And Close browser



    Examples:
      |Url|UserName|Password|Address|ClientRef|
      |https://appqa.pippintitle.com/login|testinduser2@mailinator.com|Users#76392@!|12342 Coit Road Dallas, TX, USA|ClientTestOrder|

  Scenario Outline:	Create Prepaid Company Client Order From client Panel
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Client Email as "<UserName>" and Password as "<Password>"
    When Click on Login Button
    When User click on place Order
    Then "Place New Order" and "Step 1 of 3 - Order Type" client page displayed
    When User select Product as "Current Owner Search"
    When User select Search Criteria as "Full Address" and Address type as "Auto Address" and Address as "<Address>"
    Then User enters client reference as "<ClientRef>"
    When User click on Complete Button
    Then "Place New Order" and "Step 2 of 3 - Pricing & Billing" client page displayed
    Then User click on the continue button
    Then "Place New Order" and "Step 3 of 3 - Review Order" client page displayed
    When User click on on the accept terms and conditions checkbox and clicks on the submit button
    When User click on client Log out link
    Then "Admin Console" Header should be displayed
    And Close browser



    Examples:
      |Url|UserName|Password|Address|ClientRef|
      |https://appqa.pippintitle.com/login|Cmpuser2@mailinator.com|Omicron_2022##|12342 Coit Road Dallas, TX, USA|ClientTestOrder|
