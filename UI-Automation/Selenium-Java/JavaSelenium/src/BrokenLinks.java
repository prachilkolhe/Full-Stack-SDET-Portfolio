import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Get all the links address present in the page
		List<WebElement> allURLs = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		for (WebElement URL: allURLs) {
			
			String link = URL.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(link).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int response = conn.getResponseCode();
			System.out.println(response);
			if (response>400){
				System.out.println("Test Execution is failed beacuse of this broken link '"+URL.getText()+"' with status code "+response);
			}		
		}

	}

}
