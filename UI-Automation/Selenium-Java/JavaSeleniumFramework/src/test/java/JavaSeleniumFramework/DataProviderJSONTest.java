package JavaSeleniumFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Data.JSONDataReader;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.Assert;
import PageObjects.CartPage;
import PageObjects.CheckoutPage;
import PageObjects.ConfirmationPage;
import PageObjects.ProductCatalog;


public class DataProviderJSONTest extends DriverSetup {

	@Test(dataProvider= "getHashMapData")
	public void E2EShopping(HashMap<String, String> HashInput) throws IOException, InterruptedException {
		
		LoginObject.LoginApplication(HashInput.get("Email"), HashInput.get("Password"));		//To retrieve the values from hash map using key --> use .get method
		ProductCatalog PCObject = new ProductCatalog(driver);
		PCObject.getItemList();
		PCObject.addProductToCart(HashInput.get("ProductName"));
		CartPage cartPageObject = new CartPage(driver);
		cartPageObject.goToCart();
		CartPage CartObject = new CartPage(driver);
		Boolean match = CartObject.ItemsInCart(HashInput.get("ProductName"));
		Assert.assertTrue(match);
		CartObject.CheckoutOrder();
		CheckoutPage CheckoutObject = new CheckoutPage(driver);
		CheckoutObject.selectCountry("India");
		CheckoutObject.submitOrder();
		ConfirmationPage ConfirmObject = new ConfirmationPage(driver);
		String message = ConfirmObject.getOrderMessage();
		AssertJUnit.assertTrue(message.equalsIgnoreCase("Thankyou for the order."));

	}
	
	// HashMap stores the data in Key Value format
	// Need to mentioned the data types of key value in object creation
	@DataProvider
	public Object[][] getHashMapData() throws IOException {
		
		JSONDataReader JSONData = new JSONDataReader();
		List<HashMap<String, String>> data = JSONData.getJSONHashMap("/Users/PKE17/eclipse-workspace/JavaSelenium/JavaSeleniumFramework/src/test/java/Data/PurchaseData.json");
		
		return new Object[][] {{data.get(0)},{data.get(1)}};		// Retrieving the data from list of hash map using index here
		
	}
}
/* If you encounter any error like ElementClickInterception then run it in debugger with breakpoint at Ln 26 and 32
If we run same file with main() block, then its executes as compared to TestNG so try to run it with debugger
*/