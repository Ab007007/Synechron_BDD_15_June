@actitime
Feature: Validate Delete Cuctomer Functionality

  Background: 
    Given user is on login page
    When user enter valid admin and manager
    And user click on login button
    Then user should be able to see Dashboard page

  Scenario: Delete Multiple Customer and Validate success message
    When user click on tasks and validate the task page
    And user search for the existing customer "BDD-JuneCustomer-DT1"
    When user click on Actions Button present in CustomerDetails page
    And click on Delete button
    Then click on Delete pemanently and validate the success message
    And user logout of the application
