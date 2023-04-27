@clubhouse
Feature: Feature to test login functionality

Scenario: Verify clubhouse login page
    Given Go to clubhouse
    Then I verify clubhouse login page
    
  
 Scenario Outline: Login to clubhouse
    Given Login to clubhouse with email "<email>" and password "<password>"
    Then verify invalid login message
    
    Examples:
    |email												|password|
    |smitha.somaraj@aboutgolf.com |test@1234|
