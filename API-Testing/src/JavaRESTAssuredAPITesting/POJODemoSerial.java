package JavaRESTAssuredAPITesting;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.List;


//Example - De-serialization POJO class
public class POJODemoSerial {
	
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
		
		
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key", "qaclick123")
		// Passing the variables created in this file, just by passing the object of that class
		.body(pj)
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		

		System.out.println("*************");
		
	}

}
