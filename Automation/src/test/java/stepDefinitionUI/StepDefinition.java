package stepDefinitionUI;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import page_model.Search_model;

@RunWith(Cucumber.class)
public class StepDefinition{
	Search_model sm = new Search_model();
	
	// @Before hooks file is used to execute the Pre-conditions for this particular scenario,
	//	it will execute only one time	
//	@Before
//    private void initialiseDriver() {
//		
//    }

//	@Before(order=0)
//	public void firstMethodtoExecute() {
//		System.out.println("Use Order='number series' starts from 0 for maintining the order.\nSame for @After also");
//	}
	
	// @After is used to execute the Post-conditions for this particular scenario, 
	//	it will execute only one time
    @After
    private void killDriver(){
    	sm.killDriver();
    }
    //  In every scenario mapping - ^ $ is been at first and last character for mapping the conditions
    
    @Given("^go to google search page$")
    public void go_to_google_search_page(DataTable urldata) {
    	
    	List<Map<String, String>> data = urldata.asMaps(String.class, String.class);
    	sm.get(data.get(0).get("url_value"));
    }

    @Given("^go to google page \"([^\"]*)\"$")
    public void go_to_google_page_something(String strArg1) throws Throwable {
    	sm.get(strArg1);
    }

    @When("^I type \"([^\"]*)\" in search bar$")
    public void i_type_something_in_search_bar(String strArg1) throws Throwable {
    	sm.i_type_something_in_search_bar(strArg1);
    }

    @And("^I click on search bar button$")
    public void i_click_on_search_bar_button() {
    	sm.i_click_on_search_bar_button();
    }
    
    @Then("^Search information for python must appear$")
    public void search_information_for_java_must_appear() throws Throwable {
    	Thread.sleep(2000);
    }
    
    @When("^I click on the python link$")
    public void i_click_on_the_python_link() {
    	sm.i_click_on_the_python_link();
    }
    
    @Then("^\"([^\"]*)\" page must appear$")
    public void python_page_must_appear(String assertionCheck) {
    	sm.python_page_must_appear(assertionCheck);
    }
    
}
