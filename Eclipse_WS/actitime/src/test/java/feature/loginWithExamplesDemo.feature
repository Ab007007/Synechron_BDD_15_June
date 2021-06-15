Feature: Validate Login Functionality

  Scenario Outline: Login Test with Valid Credentials
    Given user is on login page
    When user enter valid <username> and <password>
    And user click on login button
    Then user should be able to see Dashboard page
    And user logout of the application

    Examples: 
      | username | password |
      | admin    | manager  |
      | admin    | manager  |

  Scenario Outline: Login Test with Invalid Credentials
    Given user is on login page
    When user enter invalid <username> and <password>
    And user click on login button
    Then user should see error message
    And user stay back on login page

    Examples: 
      | username | password |
      | admin1   | manager  |
      | admin    | manager1 |
