Feature: Testing Dunelm

  @Runme
  Scenario: Searching for pillows
    Given I am on the homepage
    When I search for "pillows"
    Then the page title is "Pillows & V Shaped Pillows | Feather Pillows & More | Dunelm"