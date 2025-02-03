Feature: Search
@Regression @Search
Scenario Outline: Validate when user enters text in the search text field then the search result must be displayed

Given Browser is open and URL is navigated Welcome page is displayed
When user enters "<Search text>" in search text field
Then Search results must be displayed

Examples: 
  | Search text  |
  | Computer     |
  | Books        |
  | Electronics  |
  | 10.2         |
  | 10           |
  | true         |
  
 
  
  


