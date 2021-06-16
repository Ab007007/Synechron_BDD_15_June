@development
Feature: Validate Login Functionality

  Scenario: Login Test with Valid Credentials
    Given pom user has all page objects 
    And pomuser is on login page
    When pomuser enter valid "admin" and "manager"
    And pomuser click on login button
    Then pom user should be able to see Dashboard page
    And pomuser logout of the application