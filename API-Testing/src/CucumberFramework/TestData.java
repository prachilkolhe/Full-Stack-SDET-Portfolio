package CucumberFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import JavaRESTAssuredAPITesting.POJOClass;
import JavaRESTAssuredAPITesting.SubPOJOLocation;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TestData {
	public static RequestSpecification req;
	ResponseSpecification res;
	
	
	public POJOClass getTestData(String name, String language, String address) {
		POJOClass pj = new POJOClass();
		pj.setAccuracy(77);
		pj.setName(name);
		pj.setPhone_number("0987654321");
		pj.setAddress(address);
		pj.setWebsite("www.testingdemo.com");
		pj.setLanguage(language);
		
		List<String> myList = new ArrayList<String>();
		myList.add("Dadar Park");
		myList.add("Shivaji Park");
		pj.setTypes(myList);
		
		SubPOJOLocation loc = new SubPOJOLocation();
		loc.setLatitude(-38.555555);
		loc.setLongitude(33.444444);
		pj.setLocation(loc);
		
		return pj;
	}
	
	
	public static String getGlobalURL(String GlobalKey) throws IOException {
		Properties prop = new Properties();				// Using Properties class, it can read any value from file which has .properties extension 
		FileInputStream fis = new FileInputStream("/Users/PKE17/eclipse-workspace/RESTAssured/JavaRESTAssuredAPITesting/src/CucumberFramework/Global.properties");		// Using FileInputStream we are passing the input file from where value should read
		prop.load(fis); 		// Here we pass file path store in fis to prop
		return prop.getProperty(GlobalKey);
	}
	
	
	public RequestSpecification requestSpecification() throws IOException {
		
		// To avoid to create new log file for each test execution in single scenario, so applied if else loop
		if(req==null) {
		// To log the request we use PrintStream class
		PrintStream log = new PrintStream(new FileOutputStream("LogFile.txt"));
		req = new RequestSpecBuilder().setBaseUri(getGlobalURL("baseURL")).addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(log))			// Here we added the method to log the request and passing the log object which has ability to create new log file
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setContentType(ContentType.JSON).build();
		
		return req;
		}
		return req;
	}
	
	
	
	public ResponseSpecification responseSpecification() {
		
		res = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		return res;
	}
	
	
	public String deletePlacePayload(String placeId) {
		return "{\\r\\n    \\\"place_id\\\":\\\""+placeId+"\\\"\\r\\n}";
	}

}
