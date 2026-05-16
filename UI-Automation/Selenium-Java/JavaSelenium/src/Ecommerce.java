import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);

		String[] VegArray = {"Cucumber","Brocolli","Beetroot"};
		// Check whether the name you extracted is present in Vegetables array
		// Convert the Vegetables array into list
		List<String> VeggiesList = Arrays.asList(VegArray);

		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i = 0; i < Products.size(); i++) {
			String productName = Products.get(i).getText();			//Remove the unwanted string part using .split() method
			String[] splitName = productName.split("-");
			String formattedName = splitName[0].trim();
			if (VeggiesList.contains(formattedName)) {
				System.out.println(formattedName);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}
		
		//CALENDER
		String Date = "15";
		String MonthNumber = "6";
		String Year = "2027";
		driver.findElement(By.linkText("Top Deals")).click();
		
		//Clicking on calendar open new window
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String ParentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(MonthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();
		
		List<WebElement> ActualDate = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i=0; i<ActualDate.size(); i++) {
			System.out.println(ActualDate.get(i).getAttribute("value"));
		}
		
		driver.quit();

	}

}
