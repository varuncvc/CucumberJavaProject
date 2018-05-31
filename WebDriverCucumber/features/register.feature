@Register
Feature: Register


Scenario: Register With Valid Data
Given I am in the Home Page
When I click on the Login or register main button
And I click on the register button
Then I enter valid details on the register page
And I click the terms & conditions check box 
And I click on the complete registration button
And I should see a Thank you for registering message

Scenario: Register With Invalid Data
Given I am in the Home Page
When I click on the Login or register main button
And I click on the register button
Then I enter invalid details on the register page
And I click the terms & conditions check box 
And I click on the complete registration button
And I should see a message to enter correct details
