Feature:  Creating Clients from the Admin Panel

  Scenario Outline: Create a  Individual Client
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    And User Scrolls down and click on Clients Link
    When User clicks on Create Client Button
    Then User gets redirected to create Client form
    When User chooses client as Individual client
    And User enters Client FirstName "<IndClientFirstName>" LastName "<IndClientLastName>" Email and Salesperson as "<SalesPerson>"
    And User clicks on Confirm button
    Then Client is created successfully
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser
    Examples:
      | Url                                    | UserName                        | Password     | IndClientFirstName | IndClientLastName | SalesPerson   |
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$| IndClientFN        | IndClientLN       | Supreme Admin |


  Scenario Outline: Create a  Company Client
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    And User Scrolls down and click on Clients Link
    When User clicks on Create Client Button
    Then User gets redirected to create Client form
    When User chooses client as Company client and enters the "<Company>"
    And User enters Client FirstName "<ComClientFirstName>" LastName "<ComClientLastName>" Email
    And User clicks on Confirm button
    Then Client is created successfully
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      | Url                                    | UserName                        | Password     | ComClientFirstName | ComClientLastName | Company   |
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$| ComClientFN        | ComClientLN       | AutomationTestCompany |
