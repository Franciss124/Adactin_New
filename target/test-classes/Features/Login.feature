Feature: Validate the Login page of Adacting

Scenario: TC01_Validating login page using valid username and valid password
Given I launch the Adactin web Application
When User enter the valid username and valid password
And User Clicks login button
Then User verify Home page is displayed



