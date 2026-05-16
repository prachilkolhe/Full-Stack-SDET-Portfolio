package CucumberFramework;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.response.Response;
import static org.junit.Assert.*;

import java.io.IOException;

import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.given;

public class StepDefination {

	RequestSpecification request;
	Response response;
	TestData testData = new TestData();


	@Given("^User is on Netbanking landing page$")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("User is on Netbanking landing page");
	}
	
	
	@When("^User login with username and password$")
	public void when_user_login_with_username_and_password() {
		System.out.println("When User login with username and password");
	}
	
	
	@Then("^Home page is displayed$")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
	}
	
	
	@And("^All cards are displayed$")
	public void all_cards_are_displayed() {
		System.out.println("And All cards are displayed");
	}
	
	
	// --- API Step Definitions ---
	@Given("Add Place payload with {string} {string} {string}")
	public void add_place_payload(String name, String language, String address) throws IOException {
		request = given().spec(testData.requestSpecification()).body(testData.getTestData(name, language, address));
	}
	
	
	// We are making this step more generic like what resource we are passing in scenario, only that will be used in API request
	@When("user calls the {string} with {string} HTTP request")
	public void user_calls_the_with_post_http_request(String resourcePath, String method) {
		
		// It will trigger the constructor of enum class and will run the method whose name has resourcePath
		enumAPIResources api_resource = enumAPIResources.valueOf(resourcePath);
		System.out.println(api_resource.getResource());
		
		if(method.equalsIgnoreCase("POST")) {
		//response = request.when().post("/maps/api/place/add/json")
		response = request.when().post(api_resource.getResource())			// We are now calling the method of enum which we return the resource path
				.then().spec(testData.responseSpecification()).extract().response();
		}
		else if(method.equalsIgnoreCase("GET")) {
			response = request.when().get(api_resource.getResource())			// We are now calling the method of enum which we return the resource path
					.then().spec(testData.responseSpecification()).extract().response();
		}
	}
	
	
	@Then("API call is succeed with status code {int}")
	public void api_call_is_succeed_with_status_code(Integer expectedStatusCode) {
		assertEquals(response.statusCode(), (int)expectedStatusCode);
	}
	
}