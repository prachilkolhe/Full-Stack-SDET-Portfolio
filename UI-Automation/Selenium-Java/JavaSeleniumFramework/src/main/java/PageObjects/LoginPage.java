package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Common{
	
	// Create driver variable for this class
	WebDriver driver;
	
	// Constructor method use the same name as of class name
	// Constructor Method with driver as a parameter
	// Constructor method is the first method to execute inside the class
	public LoginPage(WebDriver driver) {
		// Using super keyword it will send the driver from this child class to parent class Common
		// For any parent class we are serving super(driver) then all of its child class should have that super(driver)
		super(driver);
		this.driver = driver;
		
		// .initElements() method initialize all the element of this class --> Requires two args --> driver and this(using 'this' current class's driver is passed)
		PageFactory.initElements(driver, this);
	}
	
	
	// Enter URL method
	public void driverURL() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	// Creating WebElements using locators
	// At runtime it will run like => WebElement UserMail = driver.findElement(By.id("userEmail"));
	@FindBy(id="userEmail")
	WebElement UserMail;
	
	@FindBy(id="userPassword")
	WebElement UserPassword;
	
	@FindBy(id="login")
	WebElement Login;
	
	@FindBy(css= "[class*='flyInOut']")
	WebElement loginError;
	
	// Method for login using WebElements
	public void LoginApplication(String givenUserEmail, String givenUserPassword) {
		WaitUntilWebElementVisible(UserMail);
		UserMail.clear();
		UserMail.sendKeys(givenUserEmail);
		
		WaitUntilWebElementVisible(UserPassword);
		UserPassword.clear();
		UserPassword.sendKeys(givenUserPassword);
		
		WaitUntilWebElementVisible(Login);
		Login.click();
		
	}
	
	public String getErrorMessage() {
		return loginError.getText();
	}

}
