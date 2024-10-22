Feature: item listing page

  Scenario: verify elements on item listing page
    Given user is on item listing page 
    When first item name should be same as item searched
    When item dicount price is less then lakh
    Then user is able to click on add to cart

  
