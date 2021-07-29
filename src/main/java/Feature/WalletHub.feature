Feature: Facebook login feature

Scenario Outline: Facebook login test Scenario
Given User is already on login page
When title of the page is Facebook
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on Home page
Then user clicks on add post text field
Then user writes status as Hello World
Then user clicks on post button
Examples:
|username  | password  |
|s***********|********* |
