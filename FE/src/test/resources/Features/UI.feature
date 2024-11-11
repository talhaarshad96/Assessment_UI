@FrontEndTest
Feature: Test scenario for mumzworld

  Scenario: Search Project - Add quantity to 5 - checkout - register new user
    Given User navigates to mumzworld url
    When search for product "Toys"
    Then User verifies text "Fast free delivery" on search result page
      And User adds item num to cart 1
      And User clicks on shopping cart
      And User increases product quantity by 5
    Then User verifies that the product quantity on Cart is shown as 5
      And User clicks on Proceed checkout
      And User clicks on Create Account
      And User fills the registration form for new user
        | firstName | lastName | email             | password    |
        | Talha     | Arshad   | talha@example.com | password123 |