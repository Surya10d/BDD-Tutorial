package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// When using format in CucumberOptions it will print the steps of features in console 

//format = {"pretty", "html:target/cucumber"}

// When dryRun is used in CucumberOptions, 
// It will skip scenarios which are created and mapped with feature file
// and give the structures of unmapped scenarios in feature file

// dryRun = true

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/search.feature",
		glue="stepdefinition",
		tags = {"@OnlyScenarioTest, @ScenarioOutlineTest"}
		)
public class TestRunner {

}
