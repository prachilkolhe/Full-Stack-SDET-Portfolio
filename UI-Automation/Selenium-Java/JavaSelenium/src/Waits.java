import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		// EXPLICIT WAIT
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] VegArray = {"Cucumber","Brocolli","Beetroot"};
		addItems(driver, VegArray);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));			// Used w object of WebDriverWait class to access all the methods
		
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));							// Used w object of WebDriverWait class to access all the methods
		
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
//		driver.quit();

	}
	
	public static void addItems(WebDriver driver, String[] VegArray) {
		List<String> VeggiesList = Arrays.asList(VegArray);

		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i = 0; i < Products.size(); i++) {
			String productName = Products.get(i).getText();
			String[] splitName = productName.split("-");
			String formattedName = splitName[0].trim();
			if (VeggiesList.contains(formattedName)) {
				System.out.println(formattedName);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}
		
	}

}

/*
Implicit Wait --> An implicit wait is a global setting that applies to every element search command in your test script
			  --> driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(SECONDS));
			  --> If Selenium tries to find an element and fails instantly, it will keep trying to find the element for up to the time you specified before giving up and throwing a NoSuchElementException.
Explicit Wait --> It's a custom, one-time condition that tells Selenium to wait for a specific condition to become true before executing the next command.
			  --> WebDriverWait and FluentWait (allows you find the element at regular interval of time(called it as Polling) in max time mentioned and a list of exceptions to ignore)
			  --> WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				  wait.until(ExpectedConditions.elementToBeClickable(By.id("myElementId")));
			  --> Selenium will wait for this exact condition to be met for up to the maximum time specified. If the condition is met earlier, it moves on immediately. If not, it throws a TimeoutException.
*/