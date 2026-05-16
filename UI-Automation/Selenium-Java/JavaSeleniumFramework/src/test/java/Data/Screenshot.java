package Data;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import PageObjects.Common;

public class Screenshot extends Common {
	
	WebDriver driver;
	
	public Screenshot(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public String getScreenshot(String TestName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		// This will create screenshot file name based on test case name given by user
		String destPath = System.getProperty("user.dir") + "/Screenshots/" + TestName + ".png";
		File dest_file = new File(destPath);
		
		FileUtils.copyFile(source, dest_file);
		return destPath;

	}

}
