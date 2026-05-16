package JavaSeleniumFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.Assert;
import PageObjects.CartPage;
import PageObjects.CheckoutPage;
import PageObjects.ConfirmationPage;
import PageObjects.OrderHistory;
import PageObjects.ProductCatalog;


public class StandAloneTestUsingPOTestNG extends DriverSetup {

	@Test
	public void E2EShopping() throws IOException, InterruptedException {
		
		String ProductName = "ADIDAS ORIGINAL";
		LoginObject.LoginApplication("prachil972000@gmail.com", "Password@123");
		ProductCatalog PCObject = new ProductCatalog(driver);
		PCObject.getItemList();
		PCObject.addProductToCart(ProductName);
		CartPage cartPageObject = new CartPage(driver);
		cartPageObject.goToCart();
		CartPage CartObject = new CartPage(driver);
		Boolean match = CartObject.ItemsInCart(ProductName);
		Assert.assertTrue(match);
		CartObject.CheckoutOrder();
		CheckoutPage CheckoutObject = new CheckoutPage(driver);
		CheckoutObject.selectCountry("India");
		CheckoutObject.submitOrder();
		ConfirmationPage ConfirmObject = new ConfirmationPage(driver);
		String message = ConfirmObject.getOrderMessage();
		Assert.assertTrue(message.equalsIgnoreCase("Thankyou for the order."));

	}
	
	@Test(dependsOnMethods="E2EShopping")			// dependsOnMethod means it will run E2EShopping method first and then OrderVerify
	public void OrderVerify() {
		String ProductName = "ADIDAS ORIGINAL";
		LoginObject.driverURL();
		LoginObject.LoginApplication("prachil972000@gmail.com", "Password@123");
		OrderHistory orderHistory = new OrderHistory(driver);
		orderHistory.goToOrdersPage();
		Boolean match = orderHistory.orderedItems(ProductName);
		Assert.assertTrue(match);
		
	}

}