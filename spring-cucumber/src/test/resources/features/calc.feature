Feature: arithmetic operations
 
  Scenario: client wants to add two numbers
  When the client calls /calc/add with values 1 and 2
  Then the client receives answer as 3
  
  
  Scenario: client wants to substract two numbers
  When the client calls /calc/sub with values 10 and 5
  Then the client receives answer as 5
  
  Scenario Outline: client wants to multiply two numbers
    When the client calls /calc/mul with values <number1> and <number2>
    Then the client receives answer as <result>
 
    Examples:
      | number1 | number2 | result |
      | 2       | 3       | 6      |
      | 4       | 6       | 24     |
      | 7       | 8       | 56     |