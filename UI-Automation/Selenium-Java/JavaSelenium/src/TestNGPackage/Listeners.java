package TestNGPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	
	@Override
    public void onTestStart(ITestResult result) {
        System.out.println("Listeners: Test Case Started "+ result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Listeners: Test Case Passed "+ result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Listeners: Test Case Failed "+ result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Listeners: Test Case Skipped "+ result.getName());
    }

}

/*
ITestListeners is the interface which has all the method of TestNG listeners
This listeners file path we need to pass at Suite level in testng.xml file
With the result.getName() object we can find the test method which is failing or other.
*/