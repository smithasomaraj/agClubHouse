@clubhouse
Feature: Feature file to test event creation and modification

  Scenario: Create an event in clubhouse
    Given Login to clubhouse as "basicUser"
    And select events menu item
    Then Select Online Events
    #And Create an Online Event
    And verify the event is created successfully
    Then I edit the newly created event
    