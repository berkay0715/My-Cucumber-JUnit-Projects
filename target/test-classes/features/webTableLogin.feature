Feature: User should be able to login using correct credentials

  Scenario: Positive Login scenario
    Given user is on the login page of the wer table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see URL contains orders

  @wip
  Scenario: Positive Login Scenario
      Given user is on the login page of the wer table app
      When user enters username "Test" and password "Tester" and logins
      Then user should see URL contains orders

      #1-implement this new step
      #2- create login method in WebTableLoginPage
      # this login method should have multiple different overload versions