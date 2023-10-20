Feature: To check all the listing Pages in the admin panel
  Scenario Outline:	To check different listing pages in the admin Panel
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed

    When User Clicks on the Inbox section
    Then User gets redirected to inbox page

    When User Clicks on the New Orders section
    Then User gets redirected to new orders page

    When User Clicks on the Confirmed Orders section
    Then User gets redirected to Confirmed orders page

    When User Clicks on the Orders in progress section
    Then User gets redirected to Orders in progress page

    When User Clicks on the Orders Due section
    Then User gets redirected to orders due page

    When User Clicks on the Orders search section
    Then User gets redirected to orders search page

    When User Clicks on the completed orders section
    Then User gets redirected to completed orders page

    When User Clicks on the paused order section
    Then User gets redirected to paused orders page

    When User Clicks on the cancelled orders section
    Then User gets redirected to cancelled order page

    When User Clicks on the quote request section
    Then User gets redirected to quote requested page

    When User Clicks on the priority client orders section
    Then User gets redirected to priority client orders page

    When User Clicks on the ready for billing section
    Then User gets redirected to ready for billing page

    When User Clicks on the priority orders section
    Then User gets redirected to priority orders page

    When User Clicks on the escalations section
    Then User gets redirected to escalated orders page

    When User Clicks on the watched order section
    Then User gets redirected to watched orders page

    When User Clicks on the Abstractors section
    Then User gets redirected to Abstractors page

    When User Clicks on the Admins section
    Then User gets redirected to admin page

    When User Clicks on the client section
    Then User gets redirected to clients page

    When User Clicks on the company section
    Then User gets redirected to company's page

    When User Clicks on the email templates section
    Then User gets redirected to email templates page

    When User Clicks on the eula section
    Then User gets redirected to eula page

    When User Clicks on the groups section
    Then User gets redirected to groups page

    When User Clicks on the Invoices section
    Then User gets redirected to invoices page

    When User Clicks on the notifications section
    Then User gets redirected to notifications page

    When User Clicks on the pricing custom section
    Then User gets redirected to custom pricing page

    When User Clicks on the pricing product section
    Then User gets redirected to product pricing page

    When User Clicks on the products section
    Then User gets redirected to products page

    When User Clicks on the quick links section
    Then User gets redirected to config page

    When User Clicks on the Reports section
    Then User gets redirected to report page

    When User Clicks on the scheduling section
    Then User gets redirected to scheduling page

    When User Clicks on the search masters section
    Then User gets redirected to search masters page

    When User Clicks on the tags section
    Then User gets redirected to tags page

    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      | Url                                    | UserName                        | Password     |
      |https://appadminqa.pippintitle.com/login|mburnwal@pippintitle.com         |Muskan@21     |

  Scenario Outline: To assign an order in a received state from the order listing page
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
      Then User navigates to the Homepage
      When User Clicks on the Orders search section
      Then User gets redirected to orders search page
      And User enters the order id in the searchbox
      Then user clicks on click to assign link on the order listing page
      And User assigns the order to a user and enters the time to complete and clicks  on confirm
      When User click on Log out link
      Then "Admin Console" Header should be displayed
      And Close browser

      Examples:
        |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
        |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|40-Year Search|OrderReferenceNumber|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: To assign an order in a confirmed state from the order listing page
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

    Then User navigates to the Homepage
    When User Clicks on the Orders search section
    Then User gets redirected to orders search page
    And User enters the order id in the searchbox
    Then user clicks on click to assign link on the order listing page
    And User assigns the order to a user and enters the time to complete and clicks  on confirm
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|40-Year Search|OrderReferenceNumber|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: To assign 2 orders in a Confirmed state from the order listing page
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    When User Clicks on the Confirmed Orders section
    Then User gets redirected to Confirmed orders page
    And User select 2 orders by clicking on the checkbox
    Then User clicks on assign button
    And User assigns the order to a user and enters the time to complete and clicks  on confirm
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|40-Year Search|OrderReferenceNumber|12342 Coit Road Dallas, TX, USA|TX|DALLAS|

  Scenario Outline: To assign 3 orders in a Confirmed state from the order listing page
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    When User Clicks on the Confirmed Orders section
    Then User gets redirected to Confirmed orders page
    And User select 3 orders by clicking on the checkbox
    Then User clicks on assign button
    And User assigns the order to a user and enters the time to complete and clicks  on confirm
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Client|Product|ClientRefNumber|Address|State|County|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|abcmod@mailinator.com|40-Year Search|OrderReferenceNumber|12342 Coit Road Dallas, TX, USA|TX|DALLAS|



