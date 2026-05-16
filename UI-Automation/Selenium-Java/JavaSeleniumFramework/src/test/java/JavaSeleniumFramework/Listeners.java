package JavaSeleniumFramework;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import Data.Screenshot;
import Resources.ExtentReportNG;


public class Listeners implements ITestListener {
	

	ExtentReports extent = ExtentReportNG.getReportObject();		// No need to create object for this class, as it has static method
	
	// Creating a test variable which will store all the data of method execution
	ExtentTest test;
	WebDriver driver;
	
	
	@Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());		// Creates test case with the name of test method which is executing
        
    }

	
    @Override
    public void onTestSuccess(ITestResult result) {
        // Code to run when a test method passes.
    	test.log(Status.PASS, "Test Case Passed");
    }

    
    @Override
    public void onTestFailure(ITestResult result) {
        // Code to run when a test method fails.
        test.fail(result.getThrowable());
        
        // You can add code here to take a screenshot or log more details.
        // getScreenshot method returns the path of screenshot, storing it in one variable here
        try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
        
        String ssPath = null;
        try
		{
        	Screenshot sc = new Screenshot(driver);
			ssPath = sc.getScreenshot(result.getMethod().getMethodName(), driver);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		} 
        
        test.addScreenCaptureFromPath(ssPath, result.getMethod().getMethodName());
        //  .addScreenCaptureFromPath method requires 2 arguments --> First is Path of stored screenshot and Second is how do you want to print it in report
    }


    @Override
    public void onTestSkipped(ITestResult result) {
        // Code to run when a test method is skipped.
        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // This method is for specific scenarios and is not commonly used.
    }

    @Override
    public void onFinish(ITestContext context) {
        // Code to run at the very end of the test suite.
        extent.flush();
    }

}

// If any test case is failing because of flake scenario, then we can re-run that test case using IRetryAnalyzer interface
// If we run test cases parallely, there might be test cases failed because of another test case i.e concurrency so by making ThreadLocal we can resolve that --> in which we can assign unique id to test
