Feature: Validate Multiple Cuctomer Creation Functionality

  Scenario Outline: Create Multiple Customer and Validate success message
    Given user is on login page
    When user enter valid admin and manager
    And user click on login button
    Then user should be able to see Dashboard page
    When user click on tasks and validate the task page
    Then user click on create customer button
    And Enter <customername> and <customerdesc> 
    Then click on create customer button to validate the success message
    And user logout of the application

    Examples:
			|customername|customerdesc|
			|BDD-JuneCustomer1|BDD-JuneCustomer1-Desc|
			|BDD-JuneCustomer2|BDD-JuneCustomer1-Desc|
			|BDD-JuneCustomer3|BDD-JuneCustomer1-Desc|
			|BDD-JuneCustomer4|BDD-JuneCustomer1-Desc|