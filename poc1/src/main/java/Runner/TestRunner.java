package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Mahesh Mohan\\Desktop\\POC1\\poc1\\src\\main\\java\\Features\\login.feature",
		glue={"StepDefinitions"} )
	
public class TestRunner {

}
