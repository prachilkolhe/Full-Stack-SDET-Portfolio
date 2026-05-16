package Data;

import io.restassured.path.json.JsonPath;

public class JSONParsing {
	
	public static JsonPath rawToJSON(String response) {
		
		//JsonPath() takes string as input and convert it into JSON, which will help to extract the data from that JSON
		JsonPath jsp1 = new JsonPath(response);
		return jsp1;
	}

}
