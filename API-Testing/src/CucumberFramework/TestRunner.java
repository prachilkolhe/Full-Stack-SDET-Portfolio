package CucumberFramework;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/CucumberFramework/FeatureFile.feature",		// Pass the path of feature file directory to run or dedicated single feature file can be pass
		glue = "CucumberFramework"									// TestRunner file and SteDefination file should have the same parent folder and just mentioned StepDefination only not specific file path
		)


public class TestRunner {

}
