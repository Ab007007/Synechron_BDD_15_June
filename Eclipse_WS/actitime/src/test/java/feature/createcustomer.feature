Feature: Validate CuctomerCreation Functionality

  Scenario: Create Customer and Validate success message
    Given user is on login page
    When user enter valid admin and manager
    And user click on login button
    Then user should be able to see Dashboard page
    When user click on tasks and validate the task page
    Then user click on create customer button
    And Enter "BDD-MayCustomer2" and "BDD-MayCustomer1Desc" 
    Then click on create customer button to validate the success message
    And user logout of the application

