package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	
	WebDriver driver;
	WebDriverWait wait;
	
	// Here in this constructor method there no need od super(driver) because using super we are sending driver from child to parent class i.e. Common class
	// Here just need to create a constructor method and give knowledge of local driver to test case driver
	public Common(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	
	public void WaitUntilElementToAppear(By findBy) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));		//visibilityOfElementLocated method required arg By.id() not from driver.findElement(By.id("")) --> So used the By
		
	}
	
	public void WaitUntilWebElementVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void WaitUntilElementToDisappear(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void WaitUntilElementToBeClickable(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
