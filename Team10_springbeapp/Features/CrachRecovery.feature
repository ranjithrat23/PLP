@CrachRecovery
Feature: Crach Recovery
  I want to use this template for my feature file

  @RecoveryAfterLogout
  Scenario: recovery of product in cart after logging out
    Given I added a product to the cart
    When I log out of the session
    And I log in to the session
    Then The cart page should show the product added

  @AfterRemoving
  Scenario: Removing Product from cart
    Given I added a product to the cart
    When I click on remove button
    Then The product should be removed from the cart

  @AfterPurchasing
  Scenario: Purchasing Product from cart
    Given I added a product to the cart
    When I click on purchase button
    And Payment are done completely
    Then The product should be removed from the cart
