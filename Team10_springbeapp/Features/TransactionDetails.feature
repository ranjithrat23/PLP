@TransactionDetails
Feature: Transaction Details
  I want to use this template for my feature file

  @Card
  Scenario: For Credit or Debit Card
    Given I am in payment option page
    When I select Credit or Debit card
    Then Enter the card number should be shown
    When Valid card number, expiry date and CVV is entered
    Then User is Validated
    When InValid card number, expiry date and CVV is entered
    Then User is Not Validated

  @NetBanking
  Scenario: For Net Banking
    Given I am in payment option page
    When I select Net Banking
    Then select the bank should be displayed
    When I select the bank
    Then Enter the userid and password should display
    When valid userid and password are entered
    Then User is Validated
    When Invalid userid and password are entered
    Then User is Not Validated

  @CashOnDelivery
  Scenario: For Cash on Delivery
    Given I am in payment option page
    When I select Cash on Delivery
    Then confirmation should be displayed
