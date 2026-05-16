import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Print total links present on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// Print the links present in footer of the page
		WebElement FooterDriver = driver.findElement(By.id("gf-BIG"));				// This FooterDriver will act as driver which has scope of footer only
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		
		// Print the links present in first column of footer of the page
		WebElement ColumnDriver = FooterDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
		
		// Click all the links of the footer column and open in another window
		for (int i=1; i<ColumnDriver.findElements(By.tagName("a")).size(); i++) {
			
			String OpenLinkInTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(OpenLinkInTab);
			Thread.sleep(5000);
		}
			
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			}

	}

}
