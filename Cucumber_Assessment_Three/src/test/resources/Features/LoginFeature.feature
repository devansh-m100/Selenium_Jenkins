Feature: Validate login functionality 

Scenario: Login with valid credential
Given User should be on the login page of the demowebshop tricentis "https://demowebshop.tricentis.com/login".
When Enter username and password.
Then user should be able to login successfully and new page open. 

Scenario: Login with invalid credential
Given User should be on the login page of the demowebshop tricentis  "https://demowebshop.tricentis.com/login".
When Enter username and password.
Then user should fail to login.

