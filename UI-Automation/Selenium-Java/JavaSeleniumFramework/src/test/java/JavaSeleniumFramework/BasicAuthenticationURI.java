package JavaSeleniumFramework;

import java.net.URI;
import java.util.function.Predicate;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationURI {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		Predicate<URI> predicateURI = uri -> uri.getHost().contains("httpbin.org");
		
		((HasAuthentication)driver).register(predicateURI, UsernameAndPassword.of("foo", "bar"));	// It will check if there is any authentication,
																									// if host mentioned in predicateURI matched then it will enter the given user name password in that 
		driver.get("http://httpbin.org/basic-auth/foo/bar");	
		
	}

}
