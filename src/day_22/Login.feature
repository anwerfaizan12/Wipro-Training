Feature: Checks the Login Facebook functionality

Scenario: Login Facebook
Given User is on Facebook page
When User enters username and password
Then User clicks the Login button

Scenario: Register the details in Facebook page
Given User is on Facebook page
When User enters details
Then User clicks the register button