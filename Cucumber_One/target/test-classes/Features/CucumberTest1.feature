Feature: Validating the login functionality for the website Orange HRM.

Scenario: Validating the login with user name & password.

Given User should be on Login Page. 
When User provides Admin and admin123.
And click on login button.
Then Check whether user successfully returned on the login page.

