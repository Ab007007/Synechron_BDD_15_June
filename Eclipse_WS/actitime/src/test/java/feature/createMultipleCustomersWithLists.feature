Feature: Validate Multiple Cuctomer Creation Functionality

  Scenario: Create Multiple Customer and Validate success message
    Given user is on login page
    When user enter valid admin and manager
    And user click on login button
    Then user should be able to see Dashboard page
    When user click on tasks and validate the task page
    Then click create customer by entering customer details from list datatable
       | BDD-JuneCustomer-DT3 | BDD-JuneCustomer1-Desc |
       | BDD-JuneCustomer-DT4 | BDD-JuneCustomer1-Desc |
    And user logout of the application
