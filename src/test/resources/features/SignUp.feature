@regression
Feature: Sing Up


  Scenario: User creates new account
    Given user is on Sign Up page
    When user inputs valid credentials
    Then user successfully registered

#    Scenario: User attempts to create new account
#      Given User is on Sign Up page
#      When User inputs invalid credentials
#      Then User gets error message
