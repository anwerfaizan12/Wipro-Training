Feature: API Testing with Cucumber
Scenario: Verify GET API
Given I have the endpoint "/api/users"
When I send a GET request
Then the response status code should be 200

 Scenario: POST request
Given I set POST endpoint
And I set request body
When I send POST HTTP request
Then I receive valid HTTP response code 201

 Scenario: PUT request
Given I set PUT endpoint
And I set request body
When I send PUT HTTP request
Then I receive valid HTTP response code 200

 Scenario: DELETE request
Given I set DELETE endpoint
When I send DELETE HTTP request
Then I receive valid HTTP response code 200



 