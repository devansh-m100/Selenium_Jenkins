Feature: Validate register functionality 

Scenario: Register with valid data
Given User should be on the register page of the demowebshop tricentis "https://demowebshop.tricentis.com/register".
When Enter the required data.
Then user should be able to register successfully and new page open.

