#Autor: Jean Caballero

@stories
Feature: practice.automationtesting
  As a user, I want to enter the practice Automation Demo Side.

  @RC-HP-1
  Scenario: Access the Web auto practice automationtesting.

    Given that Jean wants to access the Web practice Automation Demo
    When He adds two items to the cart
    Then he verifies that the screen is loaded with the expected amount
