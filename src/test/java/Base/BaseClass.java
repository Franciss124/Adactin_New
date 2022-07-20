package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void loadUrl(String s) {
	driver.get(s);
	}

	public void sendKeys1(WebElement e, String s) {
		e.sendKeys(s);

	}
	
	public void click1(WebElement e) {
		e.click();
	}
	public void Select1(WebElement e,int n) {
		Select s=new Select(e);
		s.selectByIndex(n);
		
	}
	public void Francis() {
		System.out.println("Lavanya");
		
	}
	
	

}
