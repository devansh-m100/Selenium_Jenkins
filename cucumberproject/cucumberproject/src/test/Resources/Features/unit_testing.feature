Feature: Validating the login functionality for orange HRM

Scenario:  Validating the login with user name and password
Given login page should be visible
When user enter Admin and admin123
And hit on login button
Then validate whether user successfully logged in


Scenario:  Validating the false login with user name and password
Given login page should be visible
When user enter admin and admin432
And hit on login button
Then validate whether user has not logged in

