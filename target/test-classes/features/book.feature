Feature: Book

Background:
Given browser is open to welcome page
When User is logged in 
| Qa_manualtest@gmail.com | Qa_manualtest@gmail.com |
And user clicks on Book page
And Books page is displayed

Scenario: Validate user can sort the page alphabetically
And User chooses A-Z in sort by drop down
Then page should be sorted alphabetically

Scenario: Validate user can add Computing and Internet book to cart
And user clicks on add to cart button for Computin  g and Internet book
Then book Should be  added to cart

Scenario: Validate user can add Health book to cart
And user clicks on add to cart button for Health book to cart
Then book Should be  added to cart


