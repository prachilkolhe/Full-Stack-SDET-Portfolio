Feature: Verifying the error for invalid login credentials
# Converting the TestNG StandAloneTestUsingPOTestNGErrorValidation.java file into Cucumber Framework

Scenario Outline: Verify Error message for invalid login creadentials
Given I navigate to the ECommerce website
When I log in to website using Username <username> and Password <password>
Then I should the error message "Incorrect email or password."


Examples:
| username 				  	 | password 	 	 | productName 	   |
| WHOprachil972000@gmail.com | WrongPassword@123 | ADIDAS ORIGINAL |
