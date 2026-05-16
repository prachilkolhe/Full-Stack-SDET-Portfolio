package JavaRESTAssuredAPITesting;

import static io.restassured.RestAssured.given;
import Data.PayLoad;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

// Example - De-serialization POJO class
public class POJODemoDeserial {

	public static void main(String[] args) {
		
		// Add a new place using AddPlace API (POST) --> Update the address using UpdatePlace API (PUT) --> Validate that new address is update using GetPlace API (GET)
		
		// Add new place
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		
		String response = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")			// In .given() method we pass all the parameters except resources and HTTP method
		.body(PayLoad.APIbody()).when().post("maps/api/place/add/json")																// In .when() method we pass the resources and HTTP methods
		
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))															// In .then() method we validate the response data
		.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		
		JsonPath jsp = new JsonPath(response); 						//Takes string as input and convert it into JSON, which will help to extract the data from that JSON
		String Place_ID = jsp.getString("place_id");				// .getString() method required the path of the key of which you want extract its value, for complex JSON use . for path
		System.out.println(Place_ID);
		
		
		
		// Update the place
		String newAddress = "Line No.3, Pimpri Chinchwad, Pune";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\n"
				+ "  \"place_id\": \""+Place_ID+"\",\n"
				+ "  \"address\": \""+newAddress+"\",\n"
				+ "  \"key\": \"qaclick123\"\n"
				+ "}")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		
		// Verify the updated address
		// Injected POJO class here
		POJOClass GetAPIaddress = given().queryParam("key", "qaclick123").queryParam("place_id", Place_ID).expect().defaultParser(Parser.JSON)			// Explicitly telling that the response generated will be JSON format
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).extract().response().as(POJOClass.class);	// Inserted POJOClass as class					// For assertion we can use -- .body("address", equalTo(newAddress))
		
		System.out.println("Printing the value stored in POJO class variables");
		
		// Printing the value stored in POJO class variables
		System.out.println(GetAPIaddress.getAddress());
		System.out.println(GetAPIaddress.getName());
		System.out.println(GetAPIaddress.getLocation().getLatitude());
		
		
	}

}
