Feature: Create Admins from admin panel
  Scenario Outline: Create Admin for Individual client from Admin panel
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    And User Scrolls down and click on Admin Link
    When User clicks on Create Admin Button
    Then User gets redirected to create admin form
    And User enters "<Firstname>" and "<Lastname>" and enter Email and ConfirmEmail
    Then User clicks on the Confirm Button
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser

    Examples:
      |Url|UserName|Password|Firstname|Lastname|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|Test|CompanyAdmin|


  Scenario Outline: Create Admin for company from admin panel
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    And User Scrolls down and click on Admin Link
    When User clicks on Create Admin Button
    Then User gets redirected to create admin form
    And User enters "<Firstname>" and "<Lastname>" and enter Email and ConfirmEmail
    Then User clicks on the Confirm Button
    When User clicks on search tab and enters Email
    And User clicks on the created admin
    When User clicks on the select company and add the company

    Examples:
      |Url|UserName|Password|Firstname|Lastname|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|Test|IndAdmin|
