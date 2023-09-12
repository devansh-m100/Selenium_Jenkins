Feature: open SauceDemo feature with datable

Scenario Outline: open sauceDemo feature with datatable example

Given browser should open saucedemo website
When user enters the credentials values
| standard_user | secret_sauce |
| standard_user1 | secret_sauce1 |
When the user click and gets permitted to website
Then validate login successfully