package page_model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(how=How.XPATH,using="//tr/td[contains(text(),'JMETER')]/parent::tr")
	private WebElement jmeter_course;
	
	@FindBy(how=How.CSS, using="input[id='show-textbox']")
	private WebElement show_btn;
	
	@FindBy(how=How.CSS, using="input[id='hide-textbox']")
	private WebElement hide_btn;

	@FindBy(how=How.XPATH, using="(//li/a[@class='dropdown-toggle'])[1]")
	private WebElement more_in_frame;
	
	private String hiding_textbox="input[id='displayed-text']";
	
	private String Employee_table = "div[class='tableFixHead'] table tbody tr";
	
	private String mouse_hover_btn = "button[id='mousehover']";
	
	private String reload_hover_option = "//a[text()='Reload']";
	
	private String iframe_element = "//iframe[@id='courses-iframe']"; 
	
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
	
	public String get_course_details_for_Jmeter(WebDriver driver) {
		return jmeter_course.getText();
	}
	
	public void i_click_on_hide_button() {
		hide_btn.click();
	}
	
	public void i_click_on_Show_button() {
		show_btn.click();
	}
	
	public boolean check_hide_textbox_is_present_or_not(WebDriver driver) {
		boolean element_visibility = driver.findElement(By.cssSelector(hiding_textbox)).isDisplayed();
		return element_visibility;
	}
	
	public List<String> get_chennai_city_name_based_selection(WebDriver driver, String check_string) {
		List<WebElement> employee_table = driver.findElements(By.cssSelector(Employee_table));
		List<String> employee_data = new ArrayList<String>();
		for(int i=0;i<employee_table.size();i++) {
			boolean get_text = false;
			List<WebElement> td_emp_table = employee_table.get(i).findElements(By.cssSelector("td"));
			for(int j=0;j<td_emp_table.size();j++) {
				if(td_emp_table.get(j).getText().equals(check_string)) {
					get_text = true;
					break;
				}
			}
			if(get_text == true) 
			{
				String str = employee_table.get(i).getText();
				employee_data.add(str);
			}
		}
		return employee_data;
	}

	public void click_reload_on_mouse_hover_button(WebDriver driver) {
		Actions actions = new Actions(driver);
		WebElement move_to_elem = driver.findElement(By.cssSelector(mouse_hover_btn));
		actions.moveToElement(move_to_elem).build().perform();
		WebElement reload_option = driver.findElement(By.xpath(reload_hover_option));
		actions.moveToElement(reload_option).click().build().perform();
		waitThread();
	}
	
	public void switch_to_iframe(WebDriver driver) {
		WebElement frames = driver.findElement(By.xpath(iframe_element));
		driver.switchTo().frame(frames);
	}
	
	public void click_on_contact_button_on_more(WebDriver driver) {
		Actions chains = new Actions(driver);
		WebElement target_ele = driver.findElement(By.xpath("(//li/a[@class='dropdown-toggle'])[1]"));
		chains.moveToElement(target_ele).perform();
		WebElement contact_elem = driver.findElement(By.xpath("(//a[@href='contact-us'])[1]"));
		chains.moveToElement(contact_elem).click().perform();	
		waitThread();
	}
	
	public String get_text_for_contact_us(WebDriver driver) {
		WebElement contact_us = driver.findElement(By.xpath("//li[text()=' contact@rahulshettyacademy.com']"));
		return contact_us.getText();
	}
	
	public void Switch_out_of_the_frame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}	

}
