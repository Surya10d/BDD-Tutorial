package page_model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search_model {
	private WebDriver driver;
	
	public Search_model() {
		this.driver = initialise(driver);
	    PageFactory.initElements(driver, this);	    
	}
	
	@FindBy(how=How.CSS, using = "input[name='q']")
	private WebElement search_bar_input;
	
	@FindBy(how=How.CSS, using = "input[name='btnK']")
	private WebElement search_bar_btn;
	
	@FindBy(how=How.XPATH, using = "//a[@href='https://www.python.org/']")
	private WebElement python_link;
	
	@FindBy(how=How.CSS, using = "a[title='The Python Programming Language']")
	private WebElement python_name_check;
	
	public WebDriver initialise(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
    	ChromeOptions chromeOptions = new ChromeOptions();
    	driver = new ChromeDriver(chromeOptions);
    	driver.manage().window().maximize();
    	Properties property = new Properties();
		try {
			BufferedReader br = new BufferedReader(new FileReader("src//test//java//properties//propertyFile.properties"));
			property.load(br);
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int time = Integer.parseInt(property.getProperty("implicitlyWait"));
    	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    	return driver;
	}
	
	public void killDriver() {
		driver.quit();
	}
	
	public void get(String url) {
		driver.get(url);
	}

	public void i_type_something_in_search_bar(String strArg1) {
		search_bar_input.sendKeys(strArg1);
	}
	
	public void i_click_on_search_bar_button() {
		search_bar_btn.click();
	}
	
	public void i_click_on_the_python_link() {
    	python_link.click();
    }
	
	public void python_page_must_appear(String assertionCheck) {
		String asserttext = python_name_check.getText();
    	assert assertionCheck.equals(asserttext);
    }
	
}
