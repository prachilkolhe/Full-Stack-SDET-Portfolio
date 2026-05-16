package TestNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {
	
	
	// This method will require the data to execute
	// To inject the data, we have use dataProvider="" functionality 
	// How many parameters we are passing through data provider that much variables we need to declare here
	@Test(dataProvider="getData")
	public void LoginMethod(String UserName, String UserPassword) {
		System.out.println("This is data reuired method based on DataProvider");
		System.out.println(UserName);
		System.out.println(UserPassword);
	}
	
	
	
	// This is data provider method
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];		// Object[3][2] means we are going to provide three sets of data with 2 values of each set --> These are just numbers not indexes
												// Object[][] --> Its called as Multi-dimensional Array
		
		// 1st Set
		data[0][0] = "FirstUserName";			// data[0][0] means the first values for first set of data --> These is index
		data[0][1] = "FirstUserPassword";		// data[0][1] means the second value for first set of data --> These is index
		
		// 2nd Set
		data[1][0] = "SecondUserName";			// data[1][0] means the first value for second set of data --> These is index
		data[1][1] = "SecondUserPassword";		// data[1][1] means the second value for second set of data --> These is index
		
		//3rd Set
		data[2][0] = "ThirdUserName";			// data[2][0] means the first values for third set of data --> These is index
		data[2][1] = "ThirdUserPassword";		// data[2][1] means the second values for third set of data --> These is index
		
		return data;
	}

}

/*
Two ways of Parameterisation --> Declaring Parameters in testng.xml file
							 --> DataProvider annotation
1. Using testng.xml we used to declare our data using Parameter tag with name and value at Suite and Test level so respective test method can use that data
2. In DataProvider we create a data providing method where we declare our data using multi dimensional array object Object[][] --> In which we declared in how many sets how many parameters we will pass
				That data provider method is passed to respective test method using dataProvider="" annotation in @Test and create variables equals to parameters and called that variables 
 */
 
