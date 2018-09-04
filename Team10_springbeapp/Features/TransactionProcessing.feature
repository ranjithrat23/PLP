@TransactionProcessing
Feature: Transaction Processing
  I want to use this template for my feature file

  @Card
  Scenario: Credit or Debit card
    Given I am in payment option page
    When I select card payment
    And I enter valid details and click submit
    Then Money is added to CapStore
    And Deducted from user account
 
 @NetBanking
  Scenario: NetBanking
    Given I am in payment option page
    When I select NetBanking payment
    And I enter valid details and click submit
    Then Money is added to CapStore
    And Deducted from user account