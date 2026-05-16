Feature: Purchase the Item fromECommerce Website
# Converting the TestNG StandAloneTestUsingPOTestNG.java file into Cucumber Framework

Background:
Given I navigate to the ECommerce website

Scenario Outline: Submitting the order
Given I log in to website using Username <username> and Password <password>
When I add the product <productName> to the cart
And I checkout and submit the order
Then I verify "Thankyou for the order." message on Purchase Order page

Examples:
| username 				  | password 	 | productName 	   |
| prachil972000@gmail.com | Password@123 | ADIDAS ORIGINAL |
