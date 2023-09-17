Feature: Validate the Login Credentials

Scenario Outline: Test the validate login

Given User is on Loginpage
When User enters <username> and <password>
And Click the login button 
Then User should land on Homepage 

@Positive
Examples:
|username|password|
|admin|admin123|
|admin|admin1234|

@Negative
Examples:
|username|password|
|admin1|admin1234|