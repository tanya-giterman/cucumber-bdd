Feature: NopCommerce Login Feature
  Scenario: NopCommerce User Login Positive Scenario
    Given user is on the homepage
    When user clicks on the login link
    Then user should be navigated to login page
    When user enters users login creds "kevin.lee@gmail.com" and "Kevin123!" and clicks on login button
    Then user should be able to login

