@smoke
Feature: Printing all the Suggestions

	@google @uat
  Scenario: Printing all suggestions from Google
    Given user is on google page
    When user enter "Synechron" in serach box
    Then user will print all the  autosuggestions
    And close the browser
	@google @regression 
  Scenario: Printing all suggestions from Google
    Given user is on google page
    When user enter "IBM" in serach box
    Then user will print all the  autosuggestions
    And close the browser
	@google 
  Scenario: Printing all suggestions from Google
    Given user is on google page
    When user enter "Wipro" in serach box
    Then user will print all the  autosuggestions
    And close the browser
	@actitime
  Scenario: Printing all suggestions from Actitime
    Given user is on login page
    When user enter valid username and password
    And user click on login button
    Then user should be able to see Dashboard page
    When user search for task
    Then user will print all the autosuggestions
    And user logout of the application
