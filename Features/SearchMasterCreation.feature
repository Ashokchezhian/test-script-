Feature:  Creating Search Masters from the Admin Panel

  Scenario Outline: Create a  Internal Search Master
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    And User Scrolls down and click on Search Master Link
    When User clicks on Create Master Button
    Then User gets redirected to create Search Master form
    When User enters FirstName "<FirstName>" LastName "<LastName>"
    And  User enters internal search master email
    And User click on the Confirm button
    Then Search Master is created successfully
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser
    Examples:
      | Url                                    | UserName                        | Password     | FirstName                      | LastName                     |
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$| internalSearchMasterFirstName  | internalSearchMasterLastName |

  Scenario Outline: Create a  External Search Master
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed
    And User Scrolls down and click on Search Master Link
    When User clicks on Create Master Button
    Then User gets redirected to create Search Master form
    When User enters FirstName "<FirstName>" LastName "<LastName>"
    And  User enters external search master email
    And Turn on the toggle for External SM
    And User click on the Confirm button
    Then Search Master is created successfully
    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser
    Examples:
      | Url                                    | UserName                        | Password     | FirstName                     | LastName                     |
      |https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$| externalSearchMasterFirstName | externalSearchMasterLastName |