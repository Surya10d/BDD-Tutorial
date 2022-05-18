package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import cucumber.api.java.*;
import cucumber.api.junit.*;
import org.openqa.selenium.*;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import page_model.InputActions;

@RunWith(Cucumber.class)
public class InputAction {	
	WebDriver driver;
	InputActions ip;
	
	
	@After
	public void kill_driver() {
		driver.quit();
	}
	
	@Given("^go to practice page \"([^\"]*)\"$")
	public void go_to_practice_page(String arg1){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ip = new InputActions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(arg1);
	}

	@When("^I select radio button$")
	public void i_select_radio_button(){
		ip.i_select_radio_button();
	}

	@When("^I enter \"([^\"]*)\" in suggestion box$")
	public void i_enter_in_suggestion_box(String arg1){
	    ip.i_enter_in_suggestion_box(arg1);
	}
	
	@When("^I select india option in suggestion box$")
	public void i_select_india_option_in_suggestion_box() {
		ip.i_select_india_option_in_suggestion_box();
	}

	@When("^I select option_two in dropdown box$")
	public void i_select_option_two_in_dropdown_box(){
	    ip.i_select_option_in_dropdown_box();
	}

	@When("^I click on option_two checkbox$")
	public void i_click_on_option_two_checkbox(){
	    ip.i_select_option_checkbox();
	}
	
	@When("^I click on open window button$")
	public void i_click_on_open_window_button(){
		ip.i_click_on_open_window_button();
	}

	@When("^I need to switch to window$")
	public void i_need_to_switch_to_window(){
		try {
			ip.i_need_to_switch_to_window(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^I close the child Window$")
	public void i_close_the_child_Window(){
	    ip.close_tab_or_window(driver);
	}

	@Then("^I switch to parent window$")
	public void i_switch_to_parent_window(){
	    ip.i_switch_to_parent_window(driver);
	}

	@When("^I click on open tab button$")
	public void i_click_on_open_tab_button(){
	    ip.i_click_on_open_tab_button();
	}

	@When("^I need to switch to tab$")
	public void i_need_to_switch_to_tab(){
	    try {
			ip.i_need_to_switch_to_tab(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^I close the child tab$")
	public void i_close_the_child_tab(){
	    ip.close_tab_or_window(driver);
	}

	@When("^I enter \"([^\"]*)\" in switch to textbox$")
	public void i_enter_in_switch_to_textbox(String arg1){
	    ip.i_enter_in_switch_to_textbox(arg1);
	}

	@When("^I click on alert button$")
	public void i_click_on_alert_button(){
	    ip.i_click_on_alert_button();
	}

	@When("^I need to switch to alert mode$")
	public void i_need_to_switch_to_alert_mode(){
	    ip.i_need_to_switch_to_alert_mode(driver);
	}

	@Then("^I click on Ok on alert popup$")
	public void i_click_on_Ok_on_alert_popup(){
	    ip.i_click_on_Ok_on_alert_popup();
	}

	@When("^I click on confirm button$")
	public void i_click_on_confirm_button(){
	    ip.i_click_on_confirm_button();
	}

	@Then("^I click on cancel on alert popup$")
	public void i_click_on_cancel_on_alert_popup(){
	    ip.i_click_on_cancel_on_alert_popup();
	}
	
}
