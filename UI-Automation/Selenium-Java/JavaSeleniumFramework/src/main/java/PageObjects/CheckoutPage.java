package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Common {
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css= "input[placeholder='Select Country']")
	WebElement selectCountry;
	
	@FindBy(css= ".ta-item:nth-of-type(2)")
	WebElement requiredCountry;
	
	@FindBy(xpath= "//a[contains(@class, 'action__submit')]")
	WebElement submit;
	
	By countryOptions = By.xpath("//section[contains(@class, 'ta-results')]");
	
	public void selectCountry(String countryName) {
		Actions a = new Actions(driver);
		a.sendKeys(selectCountry, countryName).build().perform();
		WaitUntilElementToAppear(countryOptions);
		requiredCountry.click();
	}
	
	public void submitOrder() {
		submit.click();
	}

}
