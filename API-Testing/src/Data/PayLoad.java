package Data;

public class PayLoad {
	
	public static String APIbody() {
	
	return "{\n"
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
			+ "}";
	}
	
	
	public static String CoursePrice() {
		return "{\n"
				+ "  \"dashboard\": {\n"
				+ "    \"purchaseAmount\": 910,\n"
				+ "    \"website\": \"rahulshettyacademy.com\"\n"
				+ "  },\n"
				+ "  \"courses\": [\n"
				+ "    {\n"
				+ "      \"title\": \"Selenium Python\",\n"
				+ "      \"price\": 50,\n"
				+ "      \"copies\": 6\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"title\": \"Cypress\",\n"
				+ "      \"price\": 40,\n"
				+ "      \"copies\": 4\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"title\": \"RPA\",\n"
				+ "      \"price\": 45,\n"
				+ "      \"copies\": 10\n"
				+ "    }\n"
				+ "  ]\n"
				+ "}";
	}
	
	
	public static String addBook(String isbn, String aisle) {
		String payload = "{\n"
				+ "\"name\": \"Learn Appium Automation with Java\",\n"
				+ "\"isbn\": \""+isbn+"\",\n"
				+ "\"aisle\": \""+aisle+"\",\n"
				+ "\"author\": \"John foe\"\n"
				+ "}";
		return payload;
	}
	
	
	// For each run put unique isbn and aisle code to run perfectly
	public static String addBookPayload() {
		return "{\n"
				+ "\"name\": \"Write RestAssured with Prachil Kolhe\",\n"
				+ "\"isbn\": \"bcfgcvede\",\n"
				+ "\"aisle\": \"2098941\",\n"
				+ "\"author\": \"John Sina 2\"\n"
				+ "}";
	}

	

}


// Directly copied the body content from AddPlace API

