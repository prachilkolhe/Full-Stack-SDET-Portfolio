package CucumberFramework;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/CucumberFramework/APICucumber.feature",		// Pass the path of feature file directory to run or dedicated single feature file can be pass
		glue = "CucumberFramework",									// TestRunner file and SteDefination file should have the same parent folder and just mentioned StepDefination only not specific file path
		tags = "@AddPlace",											// Using tags attribute this runner will run only those scenarios which has this tag
		plugin = "json:target/JSONReports/Cucumber-JSON_report.json")		// Using plugin, it will create a JSON format report and will be stored in given path, which can be use further for advanced HTML reports


public class TestRunnerAPI {

}
