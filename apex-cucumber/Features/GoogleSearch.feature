@tag
Feature: Google Search
  I want to use this template for my feature file

  @tag1
  Scenario: Google search page
    Given I want toOpen Browser
    When I enter url "https://www.google.com/"
    And search the data and click search
    Then I validate search data
    And Close Browser
