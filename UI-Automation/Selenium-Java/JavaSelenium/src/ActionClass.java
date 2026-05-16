import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		// Creating a Action class
		Actions a = new Actions(driver);
		
		
		// WebPage Scrolling
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");			// This JS query is build in console and px with trial and error
		Thread.sleep(5000);
		
		
		// WebElement creation for better readability
		WebElement moveCursor = driver.findElement(By.id("mousehover"));
		WebElement searchQuery = driver.findElement(By.id("displayed-text"));
		
		
		// Move to particular element
		a.moveToElement(moveCursor).build().perform();					// .build() used to build the action and .perform() used to perform the built action
		
		
		// Right click using .contextClick()
		a.moveToElement(moveCursor).contextClick().build().perform();
		
		
		// Search using Capital letter and select it using double click
		a.moveToElement(searchQuery).click().keyDown(Keys.SHIFT).sendKeys("prachil").doubleClick().build().perform();
		
		
		// Child Window Scroll
		js.executeScript("window.scrollBy(0, -300)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop='1000'");
		
		
		// Verify the sum of the values present in the child table
		List<WebElement> Values = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		int sum = 0;
		for (int i=0; i<Values.size(); i++) {
			System.out.println(Integer.parseInt(Values.get(i).getText()));
			sum = sum + Integer.parseInt(Values.get(i).getText());
		}
		System.out.println("Sum is = "+sum);
		System.out.println(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText());
	}

}

/*
 Action Class :-
 This class provides the different action methods
 
 
JavascriptExecutor :-
To interact with JS of the web page then JavascriptExecutor class helps out
To get the JS query, go to the console of webpage and write the JS query there
*/