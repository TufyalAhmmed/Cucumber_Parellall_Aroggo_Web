Feature: Explore FAQ Page

  Scenario: Verify FAQ Page Explored by using FAQ Button

    Given User on Homepage
    When User Scroll till Bottom of HomePage
    And User Clicked on FAQ
    And User Clicked on Medicine and HealthCare Order Button
    And User Clicked on Delivery Button
    And User Clicked on Referrals
    And User Clicked on Arogga Cash
    And User Clicked on Promotions Button
    And User Clicked on Return Button
    Then User on Homepage
