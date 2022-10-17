Feature: User should be able to login using correct credentials

  @wip
  Scenario: Positive Login scenario
    Given user is on the login page of the wer table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see URL contains orders