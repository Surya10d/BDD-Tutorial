package Cucumber.UIAutomation;

import org.junit.runner.RunWith;
import cucumber.api.*;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/AllActions.feature",
				glue="stepDefinitionUI",
				monochrome=true,
				tags={"@E2ERun"})
public class InputRun {

}
