// Invoking multiple browser windows/ tabs using single driver instance
// Scenario:- Navigate to https://rahulshettyacademy.com/angularpractice/ page and fill the 'Name' field with the first course name available on https://rahulshettyacademy.com
// 			  by opening another window for https://rahulshettyacademy.com
// Capture of the WebElement
// Capture height and width of WebElement

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsMultiple {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		// Opening new tab
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);		
		
		
		// Giving control of tabs/ windows to driver using getWindowHandles()
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String ParentWindow = it.next();
		String ChildWindow = it.next();
		
		// Switched to new window with driver control
		driver.switchTo().window(ChildWindow);
		driver.get("https://rahulshettyacademy.com");
		String CourseName = driver.findElement(By.xpath("//div[@class='upper-box']/h2/a[text()='All-Access Membership-Complete Access to 25+ Courses (and counting!)']")).getText();
		
		
		// Switched back to OG window with driver control
		driver.switchTo().window(ParentWindow);
		WebElement Name = driver.findElement(By.xpath("//input[@name='name'][contains(@class, 'form-control')]"));
		Name.sendKeys(CourseName);
		
		// Capture the screenshots of WebElement and O/P will be as a file
		File ssFile = Name.getScreenshotAs(OutputType.FILE);
		
		// for using FileUtils we added one dependency in pom.xml file and refresh the project to see generated SS file
		// Also need to throw an exception for this
		FileUtils.copyFile(ssFile, new File("Screenshot.png"));
		
		
		// Height Width of the WebElement
		System.out.println(Name.getRect().getDimension().height);
		System.out.println(Name.getRect().getDimension().width);

	}

}
