Feature: Create Quote from Client panel
  Scenario Outline: Create Quote from Client panel
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Client Email as "<UserName>" and Password as "<Password>"
    When Click on Login Button
    And User clicks on request quote button
    And User selects the search Criteria as Full Address and enters the complete address of the property
    Then User clicks on the continue button
    And User enters the special instructions
    Then User clicks on the continue button
    When User clicks on req quote button
    Then user gets redirected to Quote Details page
    When User click on client Log out link
    Then "Admin Console" Header should be displayed
    And Close browser
    Examples:
      | Url | UserName | Password |
      |https://appqa.pippintitle.com/login|Induser3@mailinator.com|Users#76392@!|

