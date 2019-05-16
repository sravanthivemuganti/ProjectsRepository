@tag
Feature: Magento Login Page
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Login Functionality
    Given I want to Open Browser
    And Enter the url "http://live.guru99.com/index.php/"
    And Click on Account and Click on Login Link
    When Enter username "<username>" and password "<password>" and validate "<validate>"
    And Click on Login Button
    Then I validate the page
    And Close Login Browser

    Examples: 
      | username  | password |validate|
      | vgs_godha@gmail.com |     sravanthi |valid|
      | vgs_godha@gmail.com |     vemuganti |invalid|
    