package src.test.java.com.CucumberPilot;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


public class CucumberRunnerTest {
	@RunWith(Cucumber.class) 
	@CucumberOptions(
		features = {"C:/Users/Laxman/workspace/CucumberPilot/feature/Case1.feature"},
		glue = {"src.test.java.com.CucumberPilot.StepDefinitions"},
		tags = {"@tag1"},
		snippets = SnippetType.CAMELCASE
	)
	//@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 

	public class runTest { }

}
