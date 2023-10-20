Feature:  Verifying the Excel & CSV Exports in the Admin Panel

  Scenario Outline: Verify the Excel Exports for all the order pages
    Given User Launch Chrome browser
    When User Opens URL "<Url>"
    And User enters Email as "<UserName>" and Password as "<Password>"
    And Click on Login
    Then Application Home page should be displayed

    When User Clicks on the New Orders section
    Then User gets redirected to new orders page
    And User clicks on the excel export button
    And User clicks on the csv export button


    When User Clicks on the Confirmed Orders section
    Then User gets redirected to Confirmed orders page
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User Clicks on the Orders in progress section
    Then User gets redirected to Orders in progress page
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User Clicks on the Orders Due section
    Then User gets redirected to orders due page
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User Clicks on the completed orders section
    Then User gets redirected to completed orders page
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User Clicks on the paused order section
    Then User gets redirected to paused orders page
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User Clicks on the cancelled orders section
    Then User gets redirected to cancelled order page
    When User selects the all radio button to display all the cancelled orders
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User Clicks on the quote request section
    Then User gets redirected to quote requested page
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User Clicks on the priority client orders section
    Then User gets redirected to priority client orders page
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User Clicks on the ready for billing section
    Then User gets redirected to ready for billing page
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User Clicks on the priority orders section
    Then User gets redirected to priority orders page
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User Clicks on the escalations section
    Then User gets redirected to escalated orders page
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User Clicks on the watched order section
    Then User gets redirected to watched orders page
    And User clicks on the excel export button
    And User clicks on the csv export button

    When User click on Log out link
    Then "Admin Console" Header should be displayed
    And Close browser


    Examples:
      | Url                                     | UserName                       | Password     |
      |https://appadminqa.pippintitle.com/login|mburnwal@pippintitle.com|Muskan@21|
