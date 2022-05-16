package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import page_objects.Search_objects;

@RunWith(Cucumber.class)
public class StepDefinition {
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Before
    public void initialiseDriver() {
    	WebDriverManager.chromedriver().setup();
    	ChromeOptions chromeOptions = new ChromeOptions();
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    } 
    
    @After
    public void killDriver(){
    	driver.quit();
    }
	
    @Given("^go to google page \"([^\"]*)\"$")
    public void go_to_google_page_something(String strArg1) throws Throwable {
    	driver.get(strArg1);
    	System.out.println("Given executed "+strArg1);
    }

    @When("^I type \"([^\"]*)\" in search bar$")
    public void i_type_something_in_search_bar(String strArg1) throws Throwable {
    	System.out.println("When Executed"+ strArg1);
    	driver.findElement(By.cssSelector(Search_objects.search_bar_input)).sendKeys(strArg1);
    }

    @And("^I click on search bar button$")
    public void i_click_on_search_bar_button() {
    	driver.findElement(By.cssSelector(Search_objects.search_bar_btn)).click();
    }
    
    @Then("^Search information for python must appear$")
    public void search_information_for_java_must_appear() throws Throwable {
    	System.out.println("Then Executed");
    	Thread.sleep(2000);
    }
    
    @When("^I click on the python link$")
    public void i_click_on_the_python_link() {
    	driver.findElement(By.xpath(Search_objects.python_link)).click();
    }
    
    @Then("^\"([^\"]*)\" page must appear$")
    public void python_page_must_appear(String assertionCheck) {
    	String asserttext = driver.findElement(By.cssSelector(Search_objects.python_name_check)).getText();
    	assert assertionCheck.equals(asserttext);
    }
    
    
}