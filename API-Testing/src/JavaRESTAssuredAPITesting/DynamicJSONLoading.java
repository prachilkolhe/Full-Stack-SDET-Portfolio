package JavaRESTAssuredAPITesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Data.JSONParsing;
import Data.PayLoad;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJSONLoading {
	
	@Test(dataProvider="BookData")
	public void addBook(String isbn, String aisle) {
		RestAssured.baseURI = "http://216.10.245.166";
		String addBook_response = given().header("Content-Type", "application/json")
		.body(PayLoad.addBook(isbn, aisle))										// Made .addBook() PayLoad method with args which will be pass to PayLoad directly
		.when().post("/Library/Addbook.php")
		.then().assertThat().statusCode(200)
		.extract().response().asString();
		
		JsonPath js = JSONParsing.rawToJSON(addBook_response);
		String ID = js.get("ID");
		
		System.out.println(ID);
	
	}
	

	@DataProvider(name="BookData")
	public Object[][] getData() {
		Object[][] obj = new Object[][] {{"poiuy", "45672"}, {"tyghb", "09876"}, {"azxcd", "98641"}};
		
		return obj;
		
	}

}
