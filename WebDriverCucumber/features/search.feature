@Search
Feature: Search


Scenario: Search With Valid Data
Given I am in the Home Page
When I enter the search term in search box
And I click the search button
Then I should see the search results

Scenario: Search With Invalid Data
Given I am in the Home Page
When I enter the Invalid search term in search box
And I click the search button
Then I should see Sorry, no results for product

Scenario: Search With Empty Field
Given I am in the Home Page
When I click the search button with empty field
Then I should see a message to complete the product search