Feature:Login 

Scenario: User should be able to subscribe to newsletter using valid email id

Given browser is open to welcome page
And Login page is displayed
When user enters valid email id and clicks on subscribe button
Then user should be able to successfully subscribe
