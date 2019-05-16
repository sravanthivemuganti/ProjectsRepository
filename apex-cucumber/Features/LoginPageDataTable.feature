@tag
Feature: Login Page Using Data Table
  I want to use this template for my feature file

  @tag1
  Scenario: Login Data Functionality
    Given Open Browser
    And Enter Login url "http://live.guru99.com/index.php/"
    And Click on the Account and Click on Login Link
    When Enter user login details
     | vgs_godha@gmail.com |     sravanthi |
    And Click on the Login Button
    Then I validate data
    And Close the Browser
    