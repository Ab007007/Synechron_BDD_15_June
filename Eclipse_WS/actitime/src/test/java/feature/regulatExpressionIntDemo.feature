Feature: Printing all the Suggestions

  Scenario: Printing all suggestions from Google
    Given user is on google page
    When user enter "Synechron" in serach box
    Then user will verify 10 suggestions dispalyed
    And user will print all the  autosuggestions
    And close the browser
