package JavaSeleniumFramework;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import PageObjects.CartPage;
import PageObjects.CheckoutPage;
import PageObjects.Common;
import PageObjects.ConfirmationPage;
import PageObjects.LoginPage;
import PageObjects.ProductCatalog;


public class StandAloneTestUsingPageObjects {

	public static void main(String[] args) {
		String ProductName = "ADIDAS ORIGINAL";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		LoginPage LoginObject = new LoginPage(driver);
		LoginObject.driverURL();
		
		
//		driver.findElement(By.id("userEmail")).sendKeys("prachil972000@gmail.com");
//		driver.findElement(By.id("userPassword")).sendKeys("Password@123");
//		driver.findElement(By.id("login")).click();
		LoginObject.LoginApplication("prachil972000@gmail.com", "Password@123");
		
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
//		List<WebElement> items = driver.findElements(By.cssSelector(".mb-3"));
		ProductCatalog PCObject = new ProductCatalog(driver);
		PCObject.getItemList();
		
		
//		WebElement requiredItem = items.stream().filter(item -> item.findElement(By.cssSelector("b")).getText().equals("ADIDAS ORIGINAL")).findFirst().orElse(null);
//		requiredItem.findElement(By.cssSelector(".card-body button:last-child")).click();
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("toast-container")));
//		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		PCObject.addProductToCart(ProductName);
		
		
//		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		CartPage cartPageObject = new CartPage(driver);
		cartPageObject.goToCart();
		
		
//		List<WebElement> cartItems = driver.findElements(By.xpath("//div[@class='cartSection']/h3"));
//		Boolean match = cartItems.stream().anyMatch(item -> item.getText().equalsIgnoreCase("ADIDAS ORIGINAL"));
		CartPage CartObject = new CartPage(driver);
		Boolean match = CartObject.ItemsInCart(ProductName);
		Assert.assertTrue(match);
		
		
//		driver.findElement(By.xpath("//li[@class='totalRow']/ button")).click();
		CartObject.CheckoutOrder();
		
		
//		Actions a = new Actions(driver);
//		a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "india").build().perform();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[contains(@class, 'ta-results')]")));
//		driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
		CheckoutPage CheckoutObject = new CheckoutPage(driver);
		CheckoutObject.selectCountry("India");
		
		
//		driver.findElement(By.xpath("//a[contains(@class, 'action__submit')]")).click();
		CheckoutObject.submitOrder();
		
		
//		String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		ConfirmationPage ConfirmObject = new ConfirmationPage(driver);
		String message = ConfirmObject.getOrderMessage();
		Assert.assertTrue(message.equalsIgnoreCase("Thankyou for the order."));
		
		driver.close();

	}

}

/*
Instead of creating the new page object every time to optimize it --> If you are sure that last method before creating page object
Is navigating you to that page object's page then add step of object creation in that method and when you call that method stored that in one object with name of that page
and using that object you can access the methods of that page
*/
