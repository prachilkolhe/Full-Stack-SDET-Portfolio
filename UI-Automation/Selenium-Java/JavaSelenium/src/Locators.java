import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {		//'throws InterruptedException' added here because of explicit wait 'Thread.sleep(2000);'
		//System.setProperty("webdriver.driver.chrome", "/opt/homebrew/bin/chromedriver"); 
		// From the 3.4.0 Selenium version, we can skip this driver set property step as it handle automatically with Selenium Manager
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 				// Open browser window in maximize mode
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
//		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice\"");		// .navigate() is the similar method like driver.get, but it does not wait for the page to load fully
//		driver.navigate().back();							// Navigates to the last page
//		driver.navigate().forward();						// Navigates to the next page
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("Password");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		//Here, we have added the explicit wait to load the elements on change
		//Added 'throws InterruptedException' in main method name
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mymaila@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();	
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder, 'User')]")).sendKeys("John");
		driver.findElement(By.xpath("//form[@class='form']/input[2]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.cssSelector("button[class*='submit signInBtn']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h1")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText());
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		
		driver.close();
	}

}

/*
Locators supported by WebDriver:-
ID
XPath
CSS Selector
name
Class Tame
Tag Name
Link Text
Partial Link Text

CSS Selector:-
Class Name --> tag_name.class_name
ID --> tag_name#id
tag_name[attribute= 'Value']
tag_name[attribute*='patial_value']		--> To locate using partial value
//tag_name[@attribute= 'Value']:nth-child(index) --> Child Items
Parent_tagname Child_tagname

XPath:-
//tag_name[@attribute='Value']
//tag_name[contains(@attribute,'patial_value')]		--> To locate using partial value
//tag_name[@attribute='Value'][index]
//Parent_tagname/Child_tagname
Sibling XPath Traverse --> //header/div/button[1]/following-sibling::tag_name
Child to Parent XPath Traverse --> //header/div/button[1]/parent::tag_name


To verify the CSS Selector in Console
Go to console and type --> $('')
Enter the CSS Selector in '' and click enter
 */