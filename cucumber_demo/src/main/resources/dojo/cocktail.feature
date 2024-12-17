Feature: Cocktail Ordering

  As a user, I want to offer a drink to someone so that we can discuss together (and maybe more).

  Scenario: Creating an empty order
    Given "Romeo" who wants to buy a drink
    When an order is declared for "Juliette"
    Then there are 0 cocktails in the order
