package page_model;

import java.util.Set;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class InputActions {

	public InputActions(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CSS, using="input[value='radio1']")
	private WebElement radiobtn;

	@FindBy(how=How.CSS,using="input[id='autocomplete']")
	private WebElement suggestion_box;
	
	@FindBy(how=How.CSS, using="ul[id='ui-id-1']>li:nth-of-type(2)")
	private WebElement suggestion_select;
	
	@FindBy(how=How.CSS,using="[id='dropdown-class-example']")
	private WebElement dropdown;
	
	@FindBy(how=How.CSS, using="[id='dropdown-class-example'] option[value='option2']")
	private WebElement dropdown_select;

	@FindBy(how=How.CSS,using="[id='checkBoxOption2']")
	private WebElement checkbox;
		
	@FindBy(how=How.CSS, using="[id='openwindow']")
	private WebElement open_window_btn;
	
	@FindBy(how=How.CSS, using="[id='opentab']")
	private WebElement open_tab;
	
	@FindBy(how=How.CSS, using="[id='name']")
	private WebElement alert_input;
	
	@FindBy(how=How.CSS, using="[id='alertbtn']")
	private WebElement alert_btn;
	
	@FindBy(how=How.CSS, using="[id='confirmbtn']")
	private WebElement alert_confirm_btn;

	private Alert alertMode;

	public void i_select_radio_button() {
		radiobtn.click();
	}
	
	public void i_enter_in_suggestion_box(String arg1) {
		suggestion_box.sendKeys(arg1);
	}
	
	public void i_select_india_option_in_suggestion_box() {
		suggestion_select.click();
	}
	
	public void i_select_option_in_dropdown_box() {
		dropdown.click();
		dropdown_select.click();
	}
	
	public void i_select_option_checkbox() {
		checkbox.click();
	}
	
	public void i_click_on_open_window_button(){
		open_window_btn.click();
	}
	
	public void i_need_to_switch_to_window(WebDriver driver) throws Exception{
		Set<String> window = driver.getWindowHandles();
		for(String i: window) {
			driver.switchTo().window(i);
		}
		waitThread();
	}

	public void close_tab_or_window(WebDriver driver){
		driver.close();
	}

	public void i_switch_to_parent_window(WebDriver driver){
		Set<String> window = driver.getWindowHandles();
		for(String i: window) {
			driver.switchTo().window(i);
		}
		waitThread();
	}

	public void i_click_on_open_tab_button(){
		open_tab.click();
	}

	public void i_need_to_switch_to_tab(WebDriver driver) throws Exception{
		Set<String> window = driver.getWindowHandles();
		for(String i: window) {
			driver.switchTo().window(i);
		}
		waitThread();
	}

	public void waitThread() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void i_enter_in_switch_to_textbox(String arg1){
		alert_input.sendKeys(arg1);
		waitThread();
	}

	public void i_click_on_alert_button(){
		alert_btn.click();
	}

	public void i_need_to_switch_to_alert_mode(WebDriver driver){
		alertMode = driver.switchTo().alert();
	}

	public void i_click_on_Ok_on_alert_popup(){
		waitThread();
		alertMode.accept();
	}

	public void i_click_on_confirm_button(){
		alert_confirm_btn.click();
	}

	public void i_click_on_cancel_on_alert_popup(){
		waitThread();
	    alertMode.dismiss();
	}
	
}
