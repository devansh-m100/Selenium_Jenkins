Feature: Validate the admin Pannel

Scenario:  Validating the login with user name and password
Given user should be on login page
When user enters user and password
And click on login button
Then whether user successfully logged in

Scenario: Validating the admin pannel
Given user should be successfully logged in
When user click on admin tab
Then validate the admin page 