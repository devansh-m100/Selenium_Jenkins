Feature: Validating the login functionality for orange HRM

	@ValidCredentials
	Scenario:  Validating the login with user name and password

	Given user should be on URL page
	When user enters username and password
	And click on login button
	Then whether user successfully logged in
