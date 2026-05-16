package JavaSeleniumFramework;

import java.util.Optional;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v138.network.Network;
import com.google.common.collect.ImmutableList;

public class ChromeDevToolsBlockNetwork {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg", "*.css")));
		long startTime = System.currentTimeMillis();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//a[text()='Browse Products']")).click();
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='sp']")).getText());
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);				// To check the time impact, run by commenting CDP event and without commenting CDP event
		

	}

}
