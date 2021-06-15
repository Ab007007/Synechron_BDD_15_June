Feature: Printing Search Results

  Scenario: Printing all suggestions from Google
    Given user is on google page
    When user enter Synechron in serach box
    And click on search button
    Then application should display more results
    And close the browser

  Scenario: Printing all suggestions from Google
    Given user is on google page
    When user enter Synechron best place to work in serach box
    And click on search button
    Then application should display more results
    And close the browser

  Scenario: Printing all suggestions from Google
    Given user is on google page
    When user enters asdfasdewrqweafdaewqreqwafderwq in serach box
    And click on search button
    Then application should display no result
    And close the browser

  Scenario: Printing all suggestions from Google
    Given user is on google page
    When user enter 3.142 in serach box
    And click on search button
    Then application should display more results
    And close the browser

  Scenario: Printing all suggestions from Google
    Given user is on google page
    When user enter 9988 in serach box
    And click on search button
    Then application should display more results
    And close the browser
