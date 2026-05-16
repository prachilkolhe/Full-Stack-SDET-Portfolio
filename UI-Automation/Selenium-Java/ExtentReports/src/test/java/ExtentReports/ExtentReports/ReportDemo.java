package ExtentReports.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportDemo {
	
	// Declaring at global level all other methods of this class can access it
	ExtentReports extent;
	
	@BeforeTest
	public void ReportConfig() {
		
		// Setting up the path for the html report file
		String path = System.getProperty("user.dir")+"//Reports//index.html";
		
		// ExtentSparkReporter needs the path as an argument
		// reporter object is now responsible to make configuration of the report
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		// Setting up the report name and title using reporter object
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		// ExtentSparkReporter does configuration for the reports
		// ExtentReports class creates a report and consolidate all the configured data with test results in that report
		// So, we need to pass ExtentSparkReporter class object to ExtentReports class object
		extent = new ExtentReports();		// Here no need write ExtentReports for object because we have declared this variable at global level as well
		extent.attachReporter(reporter);
		
		// Using .setSystemInfo() method, we are setting up some test info in key value pair arguments
		extent.setSystemInfo("Tester", "Prachil Kolhe");
		
		// After setting up the extent report we need to pass this object to required test method so need to declare at global level 
		// so that all other methods of this class can access it.
	}
	
	@Test
	public void getTitle() {
		
		// Calling the extent object and created one test case
		extent.createTest("Get Title Test");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	
	@AfterTest
	public void tearDown() {
		// It finalizes the report and writes all data to the file
		extent.flush();
	}

}
/*
	For the Extent Reports, we need to add a dependency for Extent Reports in pom.xml file 
	Also add the dependency for Selenium JAVA and testNG as this is new project pom.xml file
 */