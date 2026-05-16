package JavaSeleniumFramework;

import java.util.HashMap;
import java.util.Optional;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v138.emulation.Emulation;
 
// Notes present in SeleniumGrid.txt
public class ChromeDevTools {

	public static void main(String[] args) throws InterruptedException {
		
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		// Create an object for DevTools with .getDevTools method
		DevTools devTools = driver.getDevTools();
		
		// Create a session to send commands from selenium
		devTools.createSession();
		
		//Send commands to CDP
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
						// These commands are selenium built in commands are wrapper methods that invokes CDP domain functions
						// Visit to know command (https://chromedevtools.github.io/devtools-protocol/tot/Network/)
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.className("navbar-toggler-icon")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@routerlink='/library']")).click();
	
	}

/*	
	// To execute the command using .executeCdpCommand method instead of passing it directly to driver
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		HashMap deviceMetrics = new HashMap();
		deviceMetrics.put("width", 600);
		deviceMetrics.put("height", 1000);
		deviceMetrics.put("deviceScaleFactor", 50);
		deviceMetrics.put("mobile", true);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);		// 1st arg - command name to execute, 2nd arg - its parameters
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.className("navbar-toggler-icon")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@routerlink='/library']")).click();
	}
*/
}
