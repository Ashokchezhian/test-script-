Feature: Create & Cancel Order from Admin panel
  Scenario Outline: Create Escalated Order from SuperAdmin credentials
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
    Then User turns on the Escalated toggle
    When User click on Place Order
    Then Order created
    And  Order details "<ClientRefNumber>" and "<Product>" and "<State>" and "<County>" displayed in the Order Info page.
    Then Order Info page displayed with "Assign To screener" option
    When User click "Assign To screener" and select admin user "Assign to me" and Confirm
    Then Order assigned to admin user "Adm user"
    Then Order Info page displayed with "Confirm" option
    When User click "Confirm" and Confirm address
    Then Order Confirmed
    Then Order Info page displayed with "Assign To Process" option
    When User click "Assign To Process" and select admin user "Assign to me" and Confirm
    When User click "Complete" and enter data in check list window
    Then Order completed
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|60-Year Search|SuperAdminEscalatedOrderReference|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: Create Order from SuperAdmin credentials
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
    Then Order Info page displayed with "Assign To Process" option
    When User click "Assign To Process" and select admin user "Assign to me" and Confirm
    When User click "Complete" and enter data in check list window
    Then Order completed
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|Two Owner Search|SuperAdminOrderReference|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: Create Priority Order from SuperAdmin credentials
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
    Then User turns on the Priority toggle
    When User click on Place Order
    Then Order created
    And  Order details "<ClientRefNumber>" and "<Product>" and "<State>" and "<County>" displayed in the Order Info page.
    Then Order Info page displayed with "Assign To screener" option
    When User click "Assign To screener" and select admin user "Assign to me" and Confirm
    Then Order assigned to admin user "Adm user"
    Then Order Info page displayed with "Confirm" option
    When User click "Confirm" and Confirm address
    Then Order Confirmed
    Then Order Info page displayed with "Assign To Process" option
    When User click "Assign To Process" and select admin user "Assign to me" and Confirm
    When User click "Complete" and enter data in check list window
    Then Order completed
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|40-Year Search|SuperAdminPriorityOrderReference|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: Create Order from Normal Admin credentials
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
    Then Order Info page displayed with "Assign To Process" option
    When User click "Assign To Process" and select admin user "Assign to me" and Confirm
    When User click "Complete" and enter data in check list window
    Then Order completed
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
     |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
     |https://appadminqa.pippintitle.com/login|mburnwal+1@pippintitle.com|Test@123|admin123@mailinator.com|Two Owner Search|NormalAdminOrderReference|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: Create Priority Order from Normal Admin credentials
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
    Then User turns on the Priority toggle
    When User click on Place Order
    Then Order created
    And  Order details "<ClientRefNumber>" and "<Product>" and "<State>" and "<County>" displayed in the Order Info page.
    Then Order Info page displayed with "Assign To screener" option
    When User click "Assign To screener" and select admin user "Assign to me" and Confirm
    Then Order assigned to admin user "Adm user"
    Then Order Info page displayed with "Confirm" option
    When User click "Confirm" and Confirm address
    Then Order Confirmed
    Then Order Info page displayed with "Assign To Process" option
    When User click "Assign To Process" and select admin user "Assign to me" and Confirm
    When User click "Complete" and enter data in check list window
    Then Order completed
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|mburnwal+1@pippintitle.com|Test@123|admin123@mailinator.com|40-Year Search|SuperAdminPriorityOrderReference|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: Create Escalated Order from NormalAdmin credentials
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
    Then User turns on the Escalated toggle
    When User click on Place Order
    Then Order created
    And  Order details "<ClientRefNumber>" and "<Product>" and "<State>" and "<County>" displayed in the Order Info page.
    Then Order Info page displayed with "Assign To screener" option
    When User click "Assign To screener" and select admin user "Assign to me" and Confirm
    Then Order assigned to admin user "Adm user"
    Then Order Info page displayed with "Confirm" option
    When User click "Confirm" and Confirm address
    Then Order Confirmed
    Then Order Info page displayed with "Assign To Process" option
    When User click "Assign To Process" and select admin user "Assign to me" and Confirm
    When User click "Complete" and enter data in check list window
    Then Order completed
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|mburnwal+1@pippintitle.com|Test@123|admin123@mailinator.com|60-Year Search|SuperAdminEscalatedOrderReference|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: Cancel the order for Individual client and send message to cancel the order
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
    Then User clicks on the Cancel Order button
    And User selects the Reason for cancellation from the dropdown
    Then User clicks on cancel order button to send the message
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|individual579@mailinator.com|Two Owner Search|Indi Test Order|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: Cancel the order for Company client and send message to cancel the order
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
    Then User clicks on the Cancel Order button
    And User selects the Reason for cancellation from the dropdown
    Then User clicks on cancel order button to send the message
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|Two Owner Search|Comp Test Order|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: Cancel the order from Normal Admin credentials send message to cancel the order
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
    Then User clicks on the Cancel Order button
    And User selects the Reason for cancellation from the dropdown
    Then User clicks on cancel order button to send the message
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|mburnwal+1@pippintitle.com|Test@123|cmpclient23111@mailinator.com|Two Owner Search|Test Normal Order|12342 Coit Road Dallas, TX, USA|TX|DALLAS|
