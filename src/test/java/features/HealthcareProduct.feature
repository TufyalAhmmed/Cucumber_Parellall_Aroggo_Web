Feature: Exploring Healthcare product Page

  Scenario: Verify Healthcare product page Explored by using Healthcare product Button

    Given  User on Homepage
    When User Clicked on Healthcare product on Top MenuBar Button
    And  Choose a product and click to Buy
    And  Scroll to see Product Description
    Then User on Homepage
