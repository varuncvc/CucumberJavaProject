@EndToEnd
Feature: End To End 


Scenario: Login With Valid Data
Given I am in the Home Page
When I click on the login page
And I enter the username and passwod
And I click the login button
Then I should see username on top righthand corner

Scenario: Search with Valid Data
Given I am in the Home Page
When I enter the search term in search box
And I click the search button
Then I should see the search results

Scenario: Add To Basket
Given I am in the Home Page
And I select the product size and quantity and add to basket
When I click the checkout button I see my shopping bag
And I click proceed to check out and I see all my delivery options
And I choose click & collect and click proceed button
Then it should ask my nearest participating Click & Collect store

Scenario: Store Locator
Given I am in the Home Page
When I enter my postcode and click on find store button 
And I select my nearest store and I see the order summary page
Then I click on continue payment I see the order Total page

