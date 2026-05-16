Feature: Verify Order Transaction
  Tests Related to Purchase Order Transactions

  # If you want to pass param through feature scenario then it should have title 'Scenario Outline', like we have done here, and for each scenario outline there should be Example created where we pass the values to params
  # If no params are passed through scenario then that should have title like 'Scenario' only, so there is not requirement of Examples section
  # In feature file we pass the argument in <> while in step definition file we pass in {} and add parsers.parse in @given() annotation
  Scenario Outline: Verify Order Success Message Over Order Details Page
    Given Create an Order Using <Username> and <Password> Using API
    And The User is on Login Page
    When I Login to Portal With <Username> and <Password>
    And I Navigate to Orders Page
    And I Select the Order
    Then I Verify Order Success Message is Successfully Displayed
    Examples:
      | Username          | Password    |
      | anshika@gmail.com | Iamking@000 |