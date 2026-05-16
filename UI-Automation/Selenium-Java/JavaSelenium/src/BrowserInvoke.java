import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInvoke {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "/opt/homebrew/bin/chromedriver");  		// provided the already installed driver's path
		// From the 3.4.0 Selenium version, we can skip this driver set property step as it handle automatically with Selenium Manager
		
		// Instead of using setProperty method we can use WebDriverManager, which handles installation and setup of driver
		// WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit(); // .close(); method closes the current browser window while .quit(); method closes all the browser windows

	}

}

/*
Selenium WebDriver Architect: 
	•The Selenium code snippet which we written in VS Code/Eclipse will be converted into JSON format when we run the test  (This will work as a client)
	•This JSON format is sent to the respective browser through HTTP and the interaction will be happened through browser’s driver.
	•Driver will receive the response from the browser in JSON format again send it back to client

What is WebDriver:
	•It’s an interface, a group of related methods with empty bodies.
	•In simple terms, Interface enforces the Contract to class to follow.
	•We need to create the object of the class to access the methods present in the class. In JAVA, there are different classes for the ChromeDriver, FirefoxDriver, etc. So, when we create an object for any of these classe then that object will only be responsible to access methods of that class.

ChromeDriver driver = new ChromeDriver();

Here, driver is the object of ChromeDriver class and it will only able to access all the methods present in ChromeDriver class. If I write the script for chrome browser and want it run in Firefox then it will fail because the driver object won’t have access to FirefoxDriver class.
So, WebDriver comes here,

WebDriver driver = new ChromeDriver();

It creates an object of the ChromeDriver class and assigns it to a reference variable of the WebDriver interface.
	•Polymorphism: This syntax leverages polymorphism, a core principle of object-oriented programming. It allows the driver variable to refer to any class that implements the WebDriver interface (e.g., FirefoxDriver, EdgeDriver, SafariDriver).
	•Flexibility: It makes your code more flexible and adaptable. If you need to switch from testing on Chrome to Firefox, you only have to change one line of code:

WebDriver driver = new FirefoxDriver();

The rest of your code, which uses standard WebDriver methods like get(), findElement(), and close(), will work without any changes. This is crucial for cross-browser testing.

ChromeDriver driver = new ChromeDriver();

This approach creates an object of the ChromeDriver class and assigns it to a reference variable of the ChromeDriver concrete class.
	•Specific Access: The driver variable can only refer to ChromeDriver objects.
	•Limited Scope: It limits your access to methods defined only in the ChromeDriver class and any parent classes it inherits from. You won't be able to use this driver variable to switch to another browser like Firefox without changing the variable type and a significant amount of your code. This approach makes your code less flexible and harder to maintain for multi-browser testing.
	•To know Selenium, where the chromedriver is, we use System.setProperty to set the path of chromedriver to key webdriver.chrome.driver and path as its value

System.setProperty(“webdriver.chrome.driver”, “path_of_chromedriver”);
WebDriver driver = new ChromeDriver();

System.setProperty(“webdriver.gecko.driver”, “path_of_geckodriver”);
WebDriver driver = new FirefoxDriver();

System.setProperty(“webdriver.edge.driver”, “path_of_msedgedriver”);
WebDriver driver = new EdgeDriver();
*/