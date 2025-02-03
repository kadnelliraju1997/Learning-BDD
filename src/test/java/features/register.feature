Feature:Register
@Smoke @Regression
Scenario: User should be able to register using valid credentials

Given browser is open 
And url is navigated to register page
When  user enters valid credentials
 #Only applicable to this perticular step
| M | Test | Manualtest | Qa_manualtest222@gmail.com | Passwor@123 |
| M | Test | Manualtest | Qa_manualtest@gmail.com | Passwor@123 |
And clicks on register button
Then a new account should be created
And browser must be closed

