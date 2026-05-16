import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList = items.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(originalList);
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		
		// Print the price of Rice (Beans)
		List<String> price;
		do {
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));				// Added here bcz in each iteration, we will get new vegetables column so in every iteration we have to collect all that elements
		price = veggies.stream().filter(s -> s.getText().contains("Beans")).map(s -> getVegiePrice(s)).collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));
		
		// If Beans is not present on the first page, so it will go in if loop and click Next page button
		if (price.size()<1) {
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		} while (price.size()<1);				// do-while loop will execute until while condition is false
		
		
		
		// Verify search query result
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> searchResult = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> verifyResult = searchResult.stream().filter(s -> s.getText().contains("Rice")).collect(Collectors.toList());
		List<String> Result = verifyResult.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(Result);
	
		
	
	}
		
	
	
	
	private static String getVegiePrice(WebElement s) {
		String PriceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return PriceValue;
	}

	
}
