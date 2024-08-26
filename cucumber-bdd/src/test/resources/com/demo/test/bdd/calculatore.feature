
@tag
Feature: Testing Operations of Calculatore
  I want test all the operations of Calculator

  @tag1
  Scenario: Test add method of Calculator
    Given create the object of Calculator
    When I pass 3 and 4
    Then add method should return 7

	@tag2
  Scenario: Test divid method of Calculator
    Given create the object of Calculator
    When I pass 8 and 4
    Then divid method should return 2
    
  @tag3
  Scenario: Test sub method of Calculator
    Given create the object of Calculator
    When I pass 8 and 4
    Then sub method should return 4
    
  @tag4
  Scenario: Test multi method of Calculator
    Given create the object of Calculator
    When I pass 4 and 4
    Then multi method should return 16
	
 
