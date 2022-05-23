package Cucumber.UIAutomation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// When using format in CucumberOptions it will print the steps of features in console 

//format = {"pretty"}, {"html:target/bdd.html"}, {"junit:target/bdd_xml.xml"}, {"json:target/bdd_json.json"}
// These are the other formatting types which can be used to get report
// Pretty is used to print the result of executed lines
// html is used to get the output as html file in folder
// junit is used to get the output as xml file in folder
// json is used to get the output as json file

// When dryRun is used in CucumberOptions, 
// It will skip scenarios which are created and mapped with feature file
// and give the structures of unmapped scenarios in feature file

// dryRun = true

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/search.feature",
		glue="stepDefinitionUI",
		tags = {"@OnlyScenarioTest, @ScenarioOutlineTest"},
		monochrome= true,
		format= {"pretty"}
		)
public class TestRunner {

}
