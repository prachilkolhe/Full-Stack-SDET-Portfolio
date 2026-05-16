package JavaRESTAssuredAPITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import Data.PayLoad;
import io.restassured.path.json.JsonPath;

public class ComplexJSONParse {

	public static void main(String[] args) {
		
		// Response Mocking --> Directly declaring response as method in PayLoad file and passing it here
		JsonPath js = new JsonPath(PayLoad.CoursePrice());
		

		// Print number of courses return by API
		int count = js.getInt("courses.size()");			// .size() methods gives no. of elements present in that array
		System.out.println("Number of courses return by API " + count);
		
		
		// Print Purchase amount
		int total_amount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase amount is " + total_amount);
		
		
		// Print title of first course
		String firstCourse = js.getString("courses[0].title");
		System.out.println("Title of first course is " + firstCourse);
		
		
		// Print all courses title and and their respective prices
		for (int i=0; i<=count; i++) {
			String courseName = js.get("courses["+i+"].title");				// Here i is int variable so need concatenation to add with path string
			String coursePrice = js.get("courses["+i+"].price").toString();
			System.out.println("Course Name = " + courseName + " and its Price is = " + coursePrice);
			
			
			// Print number of copies sold by RPA course
			if (courseName.equalsIgnoreCase("RPA")) {
				int copies = js.get("courses["+i+"].copies");
				System.out.println("Number of copies for RPA course is = " + copies);
				
			}
		}	
		
	}
	
	// Verify if sum of all courses price matches with Purchase
	
	@Test
	public void sumValidation() {
		JsonPath js = new JsonPath(PayLoad.CoursePrice());
		
		int sum = 0;
		int count = js.getInt("courses.size()");
		
		for (int i=0; i<count; i++) {
			String course = js.get("courses["+i+"].title");
			int price = js.getInt("courses["+i+"].price");
			int copies = js.getInt("courses["+i+"].copies");
			int amount = price * copies;
			System.out.println("Amount of course '" + course + "' is = " + amount);
			sum = sum + amount;
	
		}
		System.out.println("Total amount of all courses is = " + sum);
		
		int PurchaseAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount of course package is " + PurchaseAmount);
		
		Assert.assertEquals(PurchaseAmount, sum);
	}
}
