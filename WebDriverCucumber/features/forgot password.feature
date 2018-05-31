Feature: Forgot Password
@ForgotPassword
Scenario: Forgot Password With Valid Data
Given I am in the Home Page
When I click on the login link
And I enter a valid username
And I click the forgot password button
Then I should see a new window asking me to enter my email address
And I click the submit button


Scenario: Forgot Password With invalid Data
Given I am in the Home Page
When I click on the login link
And I enter a invalid username
And I click the forgot password button
Then I should see a new window asking me to enter my email address
And I click the submit button