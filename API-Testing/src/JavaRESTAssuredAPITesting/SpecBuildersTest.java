package JavaRESTAssuredAPITesting;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.List;


//Example - Spec-Builders
public class SpecBuildersTest {
	
	public static void main(String[] args) {
		
		// Create a object of POJO class to assign the value to variable to be use in request body
		POJOClass pj = new POJOClass();
		pj.setAccuracy(77);
		pj.setName("Serialization Demo");
		pj.setPhone_number("0987654321");
		pj.setAddress("Ravet Hinjewadi Pune MH");
		pj.setWebsite("www.testingdemo.com");
		pj.setLanguage("Marathi");
		
		List<String> myList = new ArrayList<String>();
		myList.add("Dadar Park");
		myList.add("Shivaji Park");
		pj.setTypes(myList);
		
		
		SubPOJOLocation loc = new SubPOJOLocation();
		loc.setLatitude(-38.555555);
		loc.setLongitude(33.444444);
		pj.setLocation(loc);
		
		
		
		
		// We can create a separate class for this Spec_builder to make more generic
		// Creating Spec Builder for request and response which is used in this test case
		// For RequestSpecBuilder we use set keyword to set the value
		// Return type will be RequestSpecification
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123")
		.setContentType(ContentType.JSON).build();
		
		
		// For ResponseSpecBuilder we use expect keyword to verify
		// Return type will be ResponseSpecification
		ResponseSpecification res = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		
		
		
		
		
		// Passing the Spec Builder to given() method as request body using .spec() and passing object in it
		RequestSpecification request = given().log().all().spec(req);									
		// We break the API request given() and when() by using ; and created object for that and return type is RequestSpecification
		// Using the request object for further when() method 
		String response = request.body(pj)
		.when().post("/maps/api/place/add/json")
		.then().spec(res).extract().response().asString();
		

		System.out.println("*************");
		
	}

}
