import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCertificates {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		// Firefox browser options
		FirefoxOptions options1 = new FirefoxOptions();
		options1.setAcceptInsecureCerts(true);
		
		// Firefox browser options
		EdgeOptions options2 = new EdgeOptions();
		options2.setAcceptInsecureCerts(true);
		
		
		// Proxy Setup
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("IPadd:4444");
		options.setCapability("proxy", proxy);
		
		
		// Add Extension to automated browser
		options.addExtensions(new File("file_path"));
		
		
		// Block pop-up windows
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		
		// Set the download directory
		Map<String, Object> pref = new HashMap<String, Object>();
		pref.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("pref", pref);
		
		
		WebDriver driver = new ChromeDriver(options);
		
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		
		// Delete all cookies
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("Specific Cookie Name");
		
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());			// When ChromeOption is not defined then its print Privacy Error title instead of expired.badssl.com

	}

}
/*
 When any web site has some privacy certificates error then manually we can do accept using Advanced option
 but in automation instead of clicking that buttons in selenium there is ChromeOptions class which do this automatically
 
 */