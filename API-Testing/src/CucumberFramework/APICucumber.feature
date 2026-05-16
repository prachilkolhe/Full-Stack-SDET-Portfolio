Feature: Validating Place API

# When any test scenario has data, then that scenario should have Scenario Outline 
# If no data is present, then that scenario should have Scenario only

@AddPlace
Scenario Outline: Verify the place is being successfuully added using AddPlaceAPI
	Given Add Place payload with "<Name>" "<Language>" "<Address>"
	When user calls the "addPlaceAPI" with "POST" HTTP request
	Then API call is succeed with status code 200
	
	Examples:
	| Name 		  | Language | Address 				  |
	| White House | Spanish  | Street Number 2, Spain |
	| Black House | Urdu	 | Lahore, Pakistan		  |

