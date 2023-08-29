Feature: This feature will be used to test the addTo Cart Fucntionality of Amazon
  Scenario: Add Product to the Cart
    Given I login to amazon application
    And I search for the product "airpods"
    And choose the product "airpods pro"
    When I complete Add To Cart
    Then the product is added to the Cart 
   