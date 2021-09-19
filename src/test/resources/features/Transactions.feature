@regression
Feature: Digital Bank Transactions

  Background: User should successfully be logged in to home page
    Given User navigates to Digital Bank login page
    And Verify that web title is "Digital Bank"
    When User logs in with "qa6@gmail.com" and "Passwordvalid45"
    Then User successfully logged in to home page

@smoke
  Scenario: Submitting deposit without account
    Given User navigates to Deposit page
    When User submits a deposit with the following info
      | account                               | amount |
      | ---------- Select Account ----------- | 112    |
    Then Verify field error message "Please select an item in the list." is displayed
@smoke
  Scenario: Submitting deposit without deposit
    Given User navigates to Deposit page
    When User submits a deposit with the following info
      | account                 | amount |
      | ABC (Standard Checking) |        |
    Then Verify field error message "Please fill out this field." is displayed

@smoke
  Scenario: Submitting deposit with zero deposit amount
    Given User navigates to Deposit page
    When User submits a deposit with the following info
      | account                 | amount |
      | ABC (Standard Checking) | 0      |
    Then Verify alert error message "Error The deposit amount ($0.00) must be greater than $0.00" is displayed

  Scenario: Submitting valid deposit¬
    Given User navigates to Deposit page
#    When User submits a deposit with the following info
#      | account                 | amount |
#      | ABC (Standard Checking) | 200    |
    Then Verify that deposit amount has been applied with the following
      | account                 | amount |
      | ABC (Standard Checking) | 200    |
@smoke
  Scenario: Submitting withdraw without account
    Given User navigates to Withdraw page
    When User User submits a withdraw with following information
      | account                               | amount |
      | ---------- Select Account ----------- | 500    |
    Then Verify field error message "Please select an item in the list." is displayed
@smoke
  Scenario: Submitting withdraw without deposit
    Given User navigates to Withdraw page
    When User User submits a withdraw with following information
      | account                 | amount |
      | ABC (Standard Checking) |        |
    Then Verify field error message "Please fill out this field." is displayed
@smoke
  Scenario: Submitting withdraw with zero deposit amount
    Given User navigates to Withdraw page
    When User User submits a withdraw with following information
      | account                 | amount |
      | ABC (Standard Checking) |  0     |
    Then Verify alert error message "Error The withdraw amount ($0.00) must be greater than $0.00" is displayed
@smoke
  Scenario: Submitting valid withdraw
    Given User navigates to Withdraw page
    And User selects withdraw account as "Money Market (Standard Checking)"
    When User submits a withdraw with "20" amount
    Then Verify that withdraw amount has been applied

  