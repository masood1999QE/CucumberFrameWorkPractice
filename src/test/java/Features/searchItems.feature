Feature: Search Order Scenario

@SmokeTest
Scenario Outline: To Verify the Search Items Functionality in Lambda Ecommerce Site
Given User lands in the home page
When User enter "<Item Name>" and Click on Search Button
Then Verify the title of the page contains the "<Item Name>"
And  Verify the "<Item Name>" is displayed in the page

Examples:
|Item Name|
|Apple|
|Samsung|