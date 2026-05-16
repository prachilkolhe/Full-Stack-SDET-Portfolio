package JavaSeleniumFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageObjects.LoginPage;

public class DriverSetup {
	
	public WebDriver driver;
	LoginPage LoginObject;
	
	public WebDriver DriverInitialize() throws IOException {
		
		// Properties class used to read the file which has .properties extension and it required file path as File Input Stream
		Properties prop = new Properties();
		FileInputStream FilePath = new FileInputStream("/Users/PKE17/eclipse-workspace/JavaSelenium/JavaSeleniumFramework/src/main/java/Resources/GlobalBrowser.properties");
		// To reduce the long path --> usr.dir stores the path until /Users/PKE17/eclipse-workspace/JavaSelenium/JavaSeleniumFramework
//		FileInputStream FIS = new FileInputStream(System.getProperty("usr.dir") + "//src//main//java//Resources//GlobalBrowser.properties");
		prop.load(FilePath);
		String BrowserName = prop.getProperty("Browser");
		
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
	
		else if (BrowserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		
		else if (BrowserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
	}
	
	@BeforeMethod
	public LoginPage LandingPage() throws IOException {
		driver = DriverInitialize();
		LoginObject = new LoginPage(driver);
		LoginObject.driverURL();
		return LoginObject; 		// Returning LoginObject because using this next method is calling in test case
									// To make this object accessible to this whole class --> Create at class level
	}
	
	
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}

}
