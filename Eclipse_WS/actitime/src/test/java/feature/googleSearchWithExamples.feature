@google
Feature: Printing Search Results

	@regression
  Scenario Outline: Printing all suggestions from Google
    Given user is on google page
    When user enter <searchText> in serach box
    And click on search button
    Then application should display more results
    And close the browser

    Examples: 
      | searchText |
      | Synechron  |
      | IBM        |
      | Wipro      |
      |Synechron best place to work|
