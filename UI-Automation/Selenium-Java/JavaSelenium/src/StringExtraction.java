import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringExtraction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String Password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.xpath("//input[contains(@placeholder, 'User')]")).sendKeys("John");
		driver.findElement(By.xpath("//form[@class='form']/input[2]")).sendKeys(Password);
		driver.findElement(By.cssSelector("button[class*='submit signInBtn']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h1")).getText());
		driver.close();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();	
		String text = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] splitText = text.split("'");
		//[0] index --> Please use temporary password 
		//[1] index --> rahulshettyacademy' to Login.
		
		String[] splitText2 = splitText[1].split("'");
		//[0] index --> rahulshettyacademy
		//[1] index -->  to Login.
		
		String password = splitText2[0];
		return password;
		
	}
}

//In this method getPassword, it don't the driver so passed the WebDriver driver as a argument
//As the output i.e. return type of this method is password i.e. string so String in method name
//TO use this method in self class so adding Static in method name
//For explicit wait 'throws InterruptedException'
// When calling this method in main block, then only passing 'driver' as a arg.
//And while calling the method, saving the return in variable that will be used where it required
