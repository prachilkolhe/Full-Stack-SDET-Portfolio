package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	// static method --> no need to create object for this class to call this method
	public static ExtentReports getReportObject() {
		
		// For demo see this file --> JavaSelenium/ExtentReports/src/test/java/ExtentReports/ExtentReports/ReportDemo.java
		String reportPath = System.getProperty("user.dir")+"//ExtentReports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Web Automation Report");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Tester", "Prachil Kolhe");
		return extent;	
		
	}

}
