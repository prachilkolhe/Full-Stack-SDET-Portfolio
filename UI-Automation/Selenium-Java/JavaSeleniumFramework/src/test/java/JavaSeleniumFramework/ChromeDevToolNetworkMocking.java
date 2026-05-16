package JavaSeleniumFramework;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v138.fetch.Fetch;
import org.testng.Assert;

public class ChromeDevToolNetworkMocking {

//Documentation - https://chromedevtools.github.io/devtools-protocol/tot/Fetch/
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));		// While mocking we use Fetch domain and here we are enabling the network
		devTools.addListener(Fetch.requestPaused(), request ->					// We paused the request, mock it with new parameter
		{
			if (request.getRequest().getUrl().contains("shetty"))				// https://rahulshettyacademy.com/Library/GetBook.php?AuthorName=shetty
			{
				String mockedURL = request.getRequest().getUrl().replace("=shetty", "=BadGuy");
				System.out.println(mockedURL);									// https://rahulshettyacademy.com/Library/GetBook.php?AuthorName=BadGuy
				
				// Continuing the paused request, after modifying it
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(mockedURL), Optional.of(request.getRequest().getMethod()),
													Optional.empty(), Optional.empty(), Optional.empty()));
			}
			
			// If any URL does not contain 'shetty' then passing it without modifying it
			else {
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()), Optional.of(request.getRequest().getMethod()),
													Optional.empty(), Optional.empty(), Optional.empty()));
			}
		});
		
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "Oops only 1 Book available");
	}

}
