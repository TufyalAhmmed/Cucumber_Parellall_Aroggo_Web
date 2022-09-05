Feature: Explore Messenger on Homepage

  Scenario: Verify Messenger open by pop up when Clicking on Messenger button

    Given User on Homepage
    When User Clicked on Messenger Button
    But Continue as Guest
    Then Minimize Button