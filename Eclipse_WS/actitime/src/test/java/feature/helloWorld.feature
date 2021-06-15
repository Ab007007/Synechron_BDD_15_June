@actitime
Feature: Validate Login Functionality

 @uat
  Scenario: Login Test with Valid Credentials
    Given user is on login page
    When user enter valid admin and manager
    And user click on login button
    Then user should be able to see Dashboard page
    And user logout of the application

  Scenario: Login Test with Invalid Credentials
    Given user is on login page
    When user enter invalid username or password
    And user click on login button
    Then user should see error message
    And user stay back on login page
