package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^go to google page \"([^\"]*)\"$")
    public void go_to_google_page_something(String strArg1) throws Throwable {
        System.out.println("Given Executed "+ strArg1);
    }

    @When("^I type \"([^\"]*)\" in search bar$")
    public void i_type_something_in_search_bar(String strArg1) throws Throwable {
    	System.out.println("When Executed"+ strArg1);
    }

    @Then("^Search information for java must appear$")
    public void search_information_for_java_must_appear() throws Throwable {
    	System.out.println("Then Executed");
    }

}