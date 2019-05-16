Feature: Myaccount-Login Feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Login with Valid Username and Password
    Given open Browser
    When Enter the url "http://www.demo.guru99.com/V4/"
    And Enter username "<usename>" and password "<password>"
    And Click on login Button
    Then Verify login
    And Close the Browser
    
    Examples:
    	|usename		|password			|
    	|mngr290100	|ehunurY			|
    	|mngr190180	|ehunurY			|
    	|mngr190100	|ehunurY			|
    	|						|							|
    	
   