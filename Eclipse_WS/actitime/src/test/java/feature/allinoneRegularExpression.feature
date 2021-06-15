Feature: Printing all the Suggestions

 
  Scenario: Printing all Person Values
    Given username is "Aravind11"
    And user has 5.8 height
    And user address is Pune
    When user prints the values
    Then values should be displayed 
    
  Scenario: Printing all Person Values
    Given username is "Aravind"
    And user has 5.8 height
    And user address is Bangalore
    When user prints the values
    Then values should be displayed 