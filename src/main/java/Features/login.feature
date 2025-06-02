Feature: login scenario

Scenario: login scenario test login 
Given User launch the url
When Click On Login Button
Then Application should navigate to Login page 

@SmokeTest
Scenario Outline: login scenario test login in login page
Given User in login page
When User enter "<user name>" and "<password>" On Login Page
And User click on login button
Then Application should navigate to Home page 

Examples:
|user name|password|
|masood1|pwd1|
|masood2|pwd2|