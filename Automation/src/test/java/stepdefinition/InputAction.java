package stepdefinition;

import java.util.List;
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
		this.driver = new ChromeDriver();
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
	
	@Then("^Get course details for jmeter$")
	public void get_course_details_for_jmeter(){
	    String course_detais = ip.get_course_details_for_Jmeter(driver);
	    System.out.println(course_detais);
	}

	@Then("^Get \"([^\"]*)\" city name selection data$")
	public void get_Chennai_city_name_selection_data(String str){
	    List<String> str_data = ip.get_chennai_city_name_based_selection(driver, str);
	    System.out.println("Check string "+str+" Data:\n");
	    for(String i: str_data) {
	    	System.out.println(i);
	    }
	}

	@When("^I click on hide button$")
	public void i_click_on_hide_button(){
	    ip.i_click_on_hide_button();
	}

	@Then("^Input textbox should not show$")
	public void input_textbox_should_not_show(){
		boolean state = ip.check_hide_textbox_is_present_or_not(driver);
		try {
			assert state == false;
		}catch (Exception e){
			System.out.println("Assertion failed, Element is not in hidden state");
		}
	}

	@When("^I click on Show button$")
	public void i_click_on_Show_button(){
	    ip.i_click_on_Show_button();
	}

	@Then("^Input textbox should show$")
	public void input_textbox_should_show(){
		boolean state = ip.check_hide_textbox_is_present_or_not(driver);
		try {
			assert state == true;
		}catch (Exception e){
			System.out.println("Assertion failed, Element is not in visible state");
		}
	}
	
	@When("^I click reload on mouse hover button$")
	public void i_click_reload_on_mouse_hover_button() {
		ip.click_reload_on_mouse_hover_button(driver);
	}
	
	@When("^I switch to iframe$")
	public void i_switch_to_iframe(){
		ip.switch_to_iframe(driver);
	}

	@Then("^I click contact button$")
	public void hover_on_mouse_hover_button(){
		ip.click_on_contact_button_on_more(driver);
	}

	@And("^Verify the contact page$")
	public void verify_the_contact_page(){
		String contact = ip.get_text_for_contact_us(driver);
		String main_contact = "contact@rahulshettyacademy.com";
		assert main_contact.equals(contact);
	}
	
	@And("^Switch to main content$")
	public void switch_to_main_content() {
		ip.Switch_out_of_the_frame(driver);
	}
	
}
