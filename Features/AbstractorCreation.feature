Feature: Create Abstractor from admin panel
  Scenario Outline: Create Abstractor from admin panel
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    Then User Scrolls down and click on Abstractors Link
    When User clicks on Create Abstractor Button
    Then User gets redirected to create Abstractors form
    When User enters abstractor "<Name>" and enter email and confirm email address
    When User clicks on Confirm Button
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser


    Examples:
      | Url                                    | UserName                        | Password     |Name|
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|Abstractnew|