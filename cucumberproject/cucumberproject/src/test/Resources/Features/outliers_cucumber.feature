Feature: Validating the login 
Scenario Outline:  Validating the login 

Given user should be on loginpage
When users enters <username> and <password>
And click on login
Then user land on home page

Examples:
| username | password |
| Admin | admin123 |
| admin1 | admin1234 |


