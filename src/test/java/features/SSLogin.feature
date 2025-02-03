Feature: ShopperStackLogin
@Smoke @Regression
Scenario:
 Validate shopper can login using valid credentials

Given Browser is Opened Url Navigated
And login page is displayed
And Shopper Login page is displayed
When User enters "qa_testmerchantdell@gmail.com" and "Password@123"
And clicks on login button
Then Shopper is successfully logged in
And Browser is closed

@Smoke @Regression
Scenario: Validate merchant can login using valid credentials

Given Browser is Opened Url Navigated
And login page is displayed
And Merchat Login page is displayed
When Merchat enters "raju.h.gogi@gmail.com" and "Raju@1996"
And clicks on login button
Then Merchant is successfully logged in
And Browser is closed

@Regression 
Scenario: Validate Admin can login using valid credentials

Given Browser is Opened Url Navigated
And login page is displayed
And Admin Login page is displayed
When Admin enters "qa_testadmindell@gmail.com" and "Password@123" 
And clicks on login button
Then Admin is successfully logged in
And Browser is closed

