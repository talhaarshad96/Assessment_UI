@FrontEndTest
Feature: Test scenario for mumzworld


  Scenario: Search Project - Add quantity to 5 - checkout - register new user
    Given User navigates to mumzworld url
    When search for product "Toys"
    Then User verifies text "Fast free delivery" on search result page
    And User adds item num to cart 1
    And User clicks on shopping cart
    And User increases product quantity by 5
    Then User verifies that the product quantity on Cart is shown as 4
#    And User perform captcha and close the location alert   [1]


#  Scenario: Verify price on search, product and total summary on amazon.com
#      And User perform captcha and close the location alert
#    Then User verifies text "Today's Deals" on search result page
#    When search for product "Toys"
#      And User gets price of the product on search page for item 1
#      And User select item 1
#    Then User verifies text "Back to results" on product page
#      And User gets price of the product on product page for item 1
#    #now click AddToCart
#      And User clicks on Add to Cart
#    Then User verifies text "Added to Cart" on product page for cart
#    #And User clicks on search button
#    When search for product "Toys"
#      And User gets price of the product on search page for item 2
#      And User select item 2
#    Then User verifies text "Back to results" on product page
#      And User gets price of the product on product page for item 2
#      And User clicks on Add to Cart
#    Then User verifies text "Added to Cart" on product page for cart
#    #now Total Summary
#    Then User verifies the prices of products 1 and 2 on Search page, product page, Total Summary page

