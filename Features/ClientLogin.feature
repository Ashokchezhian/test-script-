Feature: Login to Client Panel

  Scenario Outline:	Login to Client panel with valid credentials
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Client Email as "<UserName>" and Password as "<Password>"
    When Click on Login Button
    When User click on client Log out link
    Then "Admin Console" Header should be displayed
    And Close browser



    Examples:
      |Url|UserName|Password|
      |https://appqa.pippintitle.com/login|Induser3@mailinator.com|Users#76392@!|
