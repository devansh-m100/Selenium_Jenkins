Feature: validates users for saucedemo website
Scenario: Test successfull login for each user 
Given Browser should open saucedemo website
When user enter the credential values
| standard_user | secret_sauce |
| problem_user | secret_sauce |
Then valididate successfully login
