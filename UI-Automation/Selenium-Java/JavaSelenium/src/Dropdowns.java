/* Static and Dynamic Drop down
 * Check boxes
 * Radio Button
 * Text Box
 * Java Pop-up
 * Form method
 */

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		// AUTO SUGGEST DROPDOWN
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);			// to load the drop down
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));		// The common CSS locator will give list of string options so stored that in the list of web elements
		for (WebElement option: options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
			}
		}
		
		
		// RADIO BUTTON
		driver.findElement(By.xpath("//input[contains(@id, 'Trip_1')]")).click();
		driver.findElement(By.xpath("//input[@type='radio'][contains(@id, 'Trip_0')]")).click();
		
		
		// DYNAMIC DROPDOWN
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GWL']")).click();
		// driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GWL']")).click();			// Parent Child XPath to locate element uniquely instead of using index like below
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();							// for this XPath //a[@value='HYD'], its showing two elements (even for closed drop down) --> so added this in () and used indexes [2]
		// driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
		
		
		// CALENDER
		System.out.println(driver.findElement(By.xpath("//input[contains(@id, 'date1')][contains(@name, 'date1')]")).getAttribute("class"));		// When you want to print the value of any attribute of element use .getAttribute method
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		
		// DROPDOWN
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		// STATIC DROP DOWN
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));			// driver.findelement method finds the web element using CSS selector and we are storing that in one variable to used and import the WebElement here
		Select dropdown = new Select(staticDropdown);																// drop down element which has <select> tag name, then that handled with Select class and used its method by creating its class object (Only applicable when element has <select> tag name)
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		// CHECKOBXES
		System.out.println(driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).isSelected());
		driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).click();
		System.out.println(driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).isSelected());
		
		driver.findElement(By.xpath("//input[@type='submit'][contains(@id, 'FindFlights')]")).click();
		driver.quit();
		
	}

}


/*
 * Any drop down HTML element which has <select> tag name, then that is static drop down (most of time) and that is handle with Select class in Java and used its methods by creation object of it.

*/