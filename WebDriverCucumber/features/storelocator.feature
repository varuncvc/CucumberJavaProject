@StoreLocator
Feature: Store Locator


Scenario: Store Locator With Valid Data
Given I am in the Home Page
When I click on the Store Locator Button
And I see the store locator page
Then I enter a valid location
And I click the search button
And I see all the nearest store


Scenario: Store Locator With Invalid Data
Given I am in the Home Page
When I click on the Store Locator Button
And I see the store locator page
Then I enter a invalid location
And I click the search button
And I see a message as no result found
