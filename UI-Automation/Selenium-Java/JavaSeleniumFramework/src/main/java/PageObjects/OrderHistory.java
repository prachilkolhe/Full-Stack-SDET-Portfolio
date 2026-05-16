package PageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory extends Common {
	
	WebDriver driver;
	
	public OrderHistory(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css= "[routerlink*='myorders']")
	WebElement orderIcon;
	
	@FindBy(xpath= "//td[contains(text(),'ADIDAS ORIGINAL')]")
	List<WebElement> totalOrderedItems;
	
	
	
	public void goToOrdersPage() {
		orderIcon.click();
		
	}
	
	public Boolean orderedItems(String OrderedItem) {
		Boolean match = totalOrderedItems.stream().anyMatch(item -> item.getText().equalsIgnoreCase(OrderedItem));
		return match;
		
	}

}
