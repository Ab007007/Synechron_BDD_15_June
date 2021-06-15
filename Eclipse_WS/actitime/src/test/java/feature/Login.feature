Feature: Validate Login Functionality
 Scenario: Login Test with Invalid Credentials
    Given user is on login page
    When user enter invalid username or password
    And user click on login button
    Then user should see error message
    And user stay back on login page