package JavaRESTAssuredAPITesting;

import static io.restassured.RestAssured.given;
import Data.PayLoad;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;


public class APIExcelDataDrivenTest {

	
	@Test
	public void addBookAPIusingPayloadMethod() {
		
		
		RestAssured.baseURI = "http://216.10.245.166";

		String response = given().log().all().header("Content-Type", "application/json")			// In .given() method we pass all the parameters except resources and HTTP method
		.body(PayLoad.addBookPayload()).when().post("/Library/Addbook.php")							// In .when() method we pass the resources and HTTP methods
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
		
		JsonPath jsp = new JsonPath(response); 			//Takes string as input and convert it into JSON, which will help to extract the data from that JSON
		String id = jsp.getString("ID");				// .getString() method required the path of the key of which you want extract its value, for complex JSON use . for path
		System.out.println(id);
		
	}
	
	
	@Test
	public void addBookAPIusingHashMap() {
		
		// The above payload PayLoad.addBookPayload() can be send as HashMap instead of passing the method name of another class
		// And pass this object to body of API
				
					HashMap<String, Object> JsonAsMap = new HashMap<>();
					JsonAsMap.put("name", "Passing Json as HashMap");
					JsonAsMap.put("isbn", "0998934123");
					JsonAsMap.put("aisle", "560027261");
					JsonAsMap.put("author", "Prachil Kolhe");
		
		// If we have nested JSON then, we can create one HashMap for parent/outer JSON and another HashMap for child JSON
					
			RestAssured.baseURI = "http://216.10.245.166";

			String response = given().log().all().header("Content-Type", "application/json")			// In .given() method we pass all the parameters except resources and HTTP method
			.body(JsonAsMap).when().post("/Library/Addbook.php")									    // In .when() method we pass the resources and HTTP methods
			.then().assertThat().statusCode(200).extract().response().asString();
			
			System.out.println(response);
			
			JsonPath jsp = new JsonPath(response); 			//Takes string as input and convert it into JSON, which will help to extract the data from that JSON
			String id = jsp.getString("ID");				// .getString() method required the path of the key of which you want extract its value, for complex JSON use . for path
			System.out.println(id);
		
	}
	
	
	@Test
	// To drive the excel data to API test case
	public void addBookAPIfromExcel() throws IOException {
		ExcelDataDriven data = new ExcelDataDriven();
		ArrayList datalist = data.getExcelData("RestAddBook");
		
		HashMap<String, Object> JsonAsMap = new HashMap<>();
		JsonAsMap.put("name", datalist.get(1));
		JsonAsMap.put("isbn", datalist.get(2));
		JsonAsMap.put("aisle", datalist.get(3));
		JsonAsMap.put("author", datalist.get(4));

		// If we have nested JSON then, we can create one HashMap for parent/outer JSON and another HashMap for child JSON
				
		RestAssured.baseURI = "http://216.10.245.166";
		
		String response = given().log().all().header("Content-Type", "application/json")			// In .given() method we pass all the parameters except resources and HTTP method
		.body(JsonAsMap).when().post("/Library/Addbook.php")									    // In .when() method we pass the resources and HTTP methods
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
		
		JsonPath jsp = new JsonPath(response); 			//Takes string as input and convert it into JSON, which will help to extract the data from that JSON
		String id = jsp.getString("ID");				// .getString() method required the path of the key of which you want extract its value, for complex JSON use . for path
		System.out.println(id);
		
	}
	

}
