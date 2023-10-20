Feature: To check all the listing Pages in the client panel

  Scenario Outline:	To check different listing pages in the client Panel
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Client Email as "<UserName>" and Password as "<Password>"
    When Click on Login Button
    When User Clicks on In Progress button
    Then User gets redirected to current orders page
    And User Clicks on Completed button
    Then User gets redirected to History orders page
    And User Clicks on Cancelled button
    Then User gets redirected to cancelled orders page
    And User Clicks on Inbox button
    Then User gets redirected to order messages page
    And User Clicks on Pricing button
    Then User gets redirected to price listing page
    And User Clicks on Invoices button
    Then User gets redirected to order Invoices page
    And User Clicks on Quotes button
    Then User gets redirected to quotes page
    When User click on client Log out link
    Then "Admin Console" Header should be displayed
    And Close browser
    Examples:
      |Url|UserName|Password|
      |https://appqa.pippintitle.com/login|Cmpuser8@mailinator.com|Users#76392@!|
