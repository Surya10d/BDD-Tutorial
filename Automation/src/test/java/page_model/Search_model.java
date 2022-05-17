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

import io.github.bonigarcia.wdm.WebDriverManager;
import page_objects.Search_objects;

public class Search_model {
	static WebDriver driver;
	
	public static WebDriver initialise() {
		WebDriverManager.chromedriver().setup();
    	ChromeOptions chromeOptions = new ChromeOptions();
    	driver = new ChromeDriver(chromeOptions);
    	driver.manage().window().maximize();
    	Properties property = new Properties();
		try {
			BufferedReader br = new BufferedReader(new FileReader("properties//propertyFilePath"));
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
	
	public static void get(String url) {
		driver.get(url);
	}
	
	public static WebElement byCss(String ele){
		WebElement element = driver.findElement(By.cssSelector(ele));
		return element;
	}
	
	public static WebElement byXpath(String ele){
		WebElement element = driver.findElement(By.xpath(ele));
		return element;
	}
	
	public static WebElement byId(String ele){
		WebElement element = driver.findElement(By.id(ele));
		return element;
	}
	
	public static WebElement byLinkText(String ele){
		WebElement element = driver.findElement(By.linkText(ele));
		return element;
	}
	
	public static WebElement byPartialLinkText(String ele){
		WebElement element = driver.findElement(By.partialLinkText(ele));
		return element;
	}
	
	public static WebElement byName(String ele){
		WebElement element = driver.findElement(By.name(ele));
		return element;
	}
	
	public static WebElement byTagName(String ele){
		WebElement element = driver.findElement(By.tagName(ele));
		return element;
	}
	
	public static WebElement byClassName(String ele){
		WebElement element = driver.findElement(By.className(ele));
		return element;
	}
	
	public static void i_type_something_in_search_bar(String strArg1) {
		WebElement Elem = Search_model.byCss(Search_objects.search_bar_input);
    	Elem.sendKeys(strArg1);
	}
	
	public static void i_click_on_search_bar_button() {
		WebElement Elem = Search_model.byCss(Search_objects.search_bar_btn);
    	Elem.click();
	}
	
	public static void i_click_on_the_python_link() {
    	WebElement Elem = Search_model.byXpath(Search_objects.python_link);
    	Elem.click();
    }
	
	public static void python_page_must_appear(String assertionCheck) {
    	WebElement Elem = Search_model.byCss(Search_objects.python_name_check);
    	String asserttext = Elem.getText();
    	assert assertionCheck.equals(asserttext);
    }
}
