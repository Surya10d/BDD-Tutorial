package Cucumber.api_automation;

import cucumber.api.junit.*;
import cucumber.api.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/Api_method.feature",
			glue="stepDefinitionAPI",
			monochrome=true,
			tags= {"@E2ERun"})
public class ApiRun {

}
