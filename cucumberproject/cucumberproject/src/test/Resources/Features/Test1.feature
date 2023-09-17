Feature: Validating the login functionality for orange HRM
Scenario:  Validating the login with user name and password

Given user should be on "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" page
When user enters Admin and admin123
And click on login button
Then whether user successfully logged in


