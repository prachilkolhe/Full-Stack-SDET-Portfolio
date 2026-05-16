import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		// Above Relative Locator
		WebElement sourceElement = driver.findElement(By.name("name"));
		String aboveElement = driver.findElement(with(By.tagName("label")).above(sourceElement)).getText();
		System.out.println("Above Relative Locator is "+aboveElement);
		
		
		// Below Relative Locator
		WebElement gender = driver.findElement(By.xpath("//div[@class='form-group']/label[@for='exampleFormControlSelect1']"));
		String belowElement = driver.findElement(with(By.tagName("label")).below(gender)).getText();
		System.out.println("Below Relative Locator is "+belowElement);
		
		
		// Right Relative Locator
		WebElement empStatus = driver.findElement(By.xpath("//div[@class='form-group']/label[@for='exampleFormControlRadio1']"));
		String rightElement = driver.findElement(with(By.tagName("label")).toRightOf(empStatus)).getText();
		System.out.println("Right Relative Locator is "+rightElement);
		
		
		// Left Relative Locator
		// Checking the checkbox which left of checkboxText
		WebElement checkboxText = driver.findElement(By.xpath("//div[@class='form-check']/label[@for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkboxText)).click();					
		

	}

}


/*
Selenium Relative Locators | Friendly Locators --> To find the element which does not have unique locator with the help of element which have unique locator

		--> above(): Element located above with respect to the specified element.
		--> below(): Element located below with respect to the specified element.
		--> toLeftOf(): Element located to the left of specified element.
		--> toRightOf(): Element located to the right of the specified element.

Syntax:
		driver.findElement(withTagName("XX").above(WebElement))
		.above(WebElement)) --> WebElement should have the unique CSS locator, by giving its location we are finding another element using its tagName
		withTagName("XX") --> we can only find required element only using tagName --> with(By.tagName("label")
		
Import:
For this relative locators, we have import one STATIC package manually. Eclipse does not provide suggestion to import it because its a static package
import static org.openqa.selenium.support.locators.RelativeLocator.*;
*/