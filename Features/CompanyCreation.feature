Feature:  Creating Company from the Admin Panel

  Scenario Outline: Create a Company
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    And User Scrolls down and click on Company Link
    When User clicks on Create Company Button
    Then User gets redirected to create company form
    And User enters Company Name as "<CompanyName>" Notes and Salesperson as "<SalesPerson>"
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      | Url                                     | UserName                       | Password     | CompanyName           | SalesPerson   |
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$| AutomationTestCompany | Supreme Admin |
