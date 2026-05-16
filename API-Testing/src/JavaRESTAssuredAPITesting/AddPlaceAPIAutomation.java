package JavaRESTAssuredAPITesting;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class AddPlaceAPIAutomation {

	public static void main(String[] args) {
		System.out.println("Hello");
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		// log().all() method used to log all the details --> We can add this for each method
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")			// In .given() method we pass all the parameters except resources and HTTP method
		.body("{\n"
				+ "  \"location\": {\n"
				+ "    \"lat\": -38.383494,\n"
				+ "    \"lng\": 33.427362\n"
				+ "  },\n"
				+ "  \"accuracy\": 50,\n"
				+ "  \"name\": \"PK House\",\n"
				+ "  \"phone_number\": \"(+91) 983 893 9797\",\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\n"
				+ "  \"types\": [\n"
				+ "    \"shoe park\",\n"
				+ "    \"shop\"\n"
				+ "  ],\n"
				+ "  \"website\": \"http://google.com\",\n"
				+ "  \"language\": \"French-IN\"\n"
				+ "}")
		.when().post("maps/api/place/add/json")					// In .when() method we pass the resources and HTTP methods
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))			// In .then() method we validate the response data
		.header("Server", "Apache/2.4.52 (Ubuntu)");	
		

		

	}

}
/*
REST Assured works on the 3 keywords --> Given, When, Then
Given --> All input details
When --> Submit API request (Includes resources and HTTP methods)
Then --> Validate the response
*/
