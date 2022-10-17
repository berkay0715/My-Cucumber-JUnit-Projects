Feature: User should be able to login using correct credentials

  Background: user is on the login page
    Given user is on the login page of the wer table app

  Scenario: Positive Login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see URL contains orders


  Scenario: Positive Login Scenario
      When user enters username "Test" and password "Tester" and logins
      Then user should see URL contains orders

      #1-implement this new step
      #2- create login method in WebTableLoginPage
      # this login method should have multiple different overload versions


  Scenario: User should be able to see all 12 months in months dropdown
    When user enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see URL contains orders