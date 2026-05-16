package CucumberFramework.Features;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/CucumberFramework/Features" , glue="CucumberFramework.StepDefinations" , monochrome=true , plugin= {"html:target/cucumber.html"} )
// 1st Parameter = Locate the path of feature files
// 2nd Parameter = Locate the path of step definition files using glue
// monochrome=true gives the result in readable format
// To generate report in .html format we use plugin and Key: as format of report and Value: as report path where to save it

public class TestNGTestRunner extends AbstractTestNGCucumberTests {			// To integrate TestNG and Cucumber -- we need to inherit this class AbstractTestNGCucumberTests

}
