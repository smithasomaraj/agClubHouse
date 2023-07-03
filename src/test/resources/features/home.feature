@clubhouse
Feature: Feature file to test home page

  Scenario: Verify clubhouse home page
    Given Login to clubhouse as "basicUser"
    And I verify clubhouse home page
    Then I select loadRound buton
    And verify initial load rond page

  Scenario: Creating range to play and send to sim
    Given Login to clubhouse as "basicUser"
    Then I select loadRound buton
    And Load a Range with "Mountain Venue" for "10" minutes

  Scenario: Creating round to play and send to sim
    Given Login to clubhouse as "basicUser"
    Then I select loadRound buton
    And Load a Round for "10" minutes

  Scenario: Send Message UI verification
    Given Login to clubhouse as "basicUser"
    Then I select send message icon
    And verify send message popup
    Then I send a message
    And verify I got a success message

  
  Scenario: Move Round popup verification
    Given Login to clubhouse with email "smitha.somaraj@aboutgolf.com" and password "q8mnhbMA"
    Then I select move round icon
    And verify move round popup
    #Then I move the round to selected sim --This needs other sim to be available
