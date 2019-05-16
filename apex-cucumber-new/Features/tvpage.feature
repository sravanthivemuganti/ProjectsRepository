
@tag
Feature: TV page to test
  I want to use this template for my feature file

  @tag1
  Scenario: TV Page
    Given Open Browser
    And Enter url "http://live.guru99.com/"
    When Click On TV link
    And Click Add to Cart
    And Go to Cart
    And Click checkout
    And Close Browser

 