import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		
		// Setting control of windows to new opened child window
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String ParentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		
		// String Email = driver.findElement(By.xpath("//p[@class='im-para red']/strong/a")).getText();
		String Email = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];   // This expression I created --> Set Breakpoint -- Debug -- Expression Watch -- Add this expression there and modify accordingly
		
		// Switch back to parent window
		driver.switchTo().window(ParentId);
		
		driver.findElement(By.id("username")).sendKeys(Email);
		
		

	}

}
