Feature: launch homepage 

  Scenario Outline: launch homepage and search product
    Given I am on homePage
    When I search for item name "iphone 15 black"
    Then iphone listing page should reflect

    