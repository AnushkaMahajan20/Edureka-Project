#Author: Anushka
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Project on appvwo.com

  @tag1
  Scenario: User should be able to login when valid credentials are provided.
    Given user opens the browser
    When user navigates to login url
    And user inputs valid "anushka.malunjkar15@gmail.com" and "Qwerty@12"
    And clicks on sign in button
    Then home page is displayed
    And clicks on testing button
    And clicks on multivariate in dropdown
    Then Multivariate Tests page is displayed
    Then click on help button 
    Then closse the browser

  Scenario: User should get error message when invalid credentials are entered
  	Given user opens the browser
    When user navigates to login url
    And user inputs invalid "anushkamalunjkar15@gmail.com" and "Qwerty@"
    And clicks on sign in button
    Then error message is displayed
    Then closse the browser
    
  Scenario: User should get error message when invalid credentials are entered
  	Given user opens the browser
    When user navigates to login url
    And user inputs invalid "anushkamalunjkar15@gmail.com" and "Qwerty@"
    And clicks on sign in button
    Then error message is displayed
    And clear text of username
    And clear text of password
    And user inputs valid "anushka.malunjkar15@gmail.com" and "Qwerty@12"
    And clicks on sign in button
    Then home page is displayed
    Then closse the browser
    
    

    	