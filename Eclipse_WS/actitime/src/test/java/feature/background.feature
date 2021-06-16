@actitime
Feature: Validate CuctomerCreation Functionality

  Background: 
    Given user is on login page
    When user enter valid admin and manager
    And user click on login button
    Then user should be able to see Dashboard page

  Scenario: Create Customer and Validate success message
    When user click on tasks and validate the task page
    Then user click on create customer button
    And Enter "BDD-MayCustomer21" and "BDD-MayCustomer1Desc"
    Then click on create customer button to validate the success message
    And user logout of the application

  Scenario: Delete Customer and Validate success message
    When user click on tasks and validate the task page
    Then user click on create customer button
    And Enter "BDD-MayCustomer22" and "BDD-MayCustomer1Desc"
    Then click on create customer button to validate the success message
    And user logout of the application

  Scenario: Create Project to Customer and Validate success message
    When user click on tasks and validate the task page
    Then user click on create customer button
    And Enter "BDD-MayCustomer23" and "BDD-MayCustomer1Desc"
    Then click on create customer button to validate the success message
    And user logout of the application
