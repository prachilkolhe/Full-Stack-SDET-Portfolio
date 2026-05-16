package JavaSeleniumFramework;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.network.Network;
import org.openqa.selenium.devtools.v137.network.model.Request;
import org.openqa.selenium.devtools.v137.network.model.Response;

// Documentation - https://chromedevtools.github.io/devtools-protocol/tot/Network/

public class ChromeDevToolsNetworkCall {
	
	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));		//.enable method enables the network tracking and event and will delivered to the client ie, selenium
																									// .send method used to send a command network
																									// Optional.empty() means the parameter is empty, which does not mean it is null
		// Event creation which will be fired up
		devTools.addListener(Network.requestWillBeSent(), request ->								// .addListener will listen when 'Network.requestWillBeSent()' event is fired
																									// and what data is received after firing up will be store in request and applied the lambda function over it 
		{
			Request req = request.getRequest();
			System.out.println(req.getUrl());
			
		});
		
		devTools.addListener(Network.responseReceived(), response ->
		{
			Response res = response.getResponse();
			System.out.println(res.getStatus());
			if (res.getStatus().toString().startsWith("4"))
			{
				System.out.println(res.getUrl()+ " is failing with status code " + res.getStatus());
			}
			
		});
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
		
		
		
		
		
	}
}
