Feature: Login to Admin Panel

	Scenario Outline:	Login to Admin panel with valid credentials
		Given User Launch Chrome browser
		When User Opens URL "<Url>"
		And User enters Email as "<UserName>" and Password as "<Password>"
		And Click on Login
		Then Application Home page should be displayed
		When User click on Log out link
		Then "Admin Console" Header should be displayed
		And Close browser

		Examples:
			|Url|UserName|Password|
			|https://appadminqa.pippintitle.com/login|superadmin@pippintechnologies.com|Pippinqa@2021$|




