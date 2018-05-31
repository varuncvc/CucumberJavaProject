@Login
Feature: Login


Scenario: Login With Valid Data
Given I am in the Home Page
When I click on the login page
And I enter the username and passwod
And I click the login button
Then I should see username on top righthand corner

Scenario: Login With Invalid Data
Given I am in the Home Page
When I click on the login page
And I enter the Invalid username and passwod
And I click the login button
Then I should get a message to check the field and try again

