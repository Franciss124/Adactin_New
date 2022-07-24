package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;
import PagesObject.Login;
import PagesObject.SelectHotel;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass extends SelectHotel {
//public static WebDriver driver;
	@Given("I launch the Adactin web Application")
	public void i_launch_the_Adactin_web_Application() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://adactinhotelapp.com/");
	}

	@When("User enter the valid username and valid password")
	public void user_enter_the_valid_username_and_valid_password() {
	BaseClass b=new BaseClass();  
	Login l=new Login();
	WebElement userName = l.getUserName();
	b.sendKeys1(userName, "Francis3535");
	WebElement password = l.getPassword();
	b.sendKeys1(password, "Francis@123");
	}

	@When("User Clicks login button")
	public void user_Clicks_login_button() {
		BaseClass b=new BaseClass();  
		Login l=new Login();
		WebElement login = l.getLogin();
		b.click1(login);
	}

	@Then("User verify Home page is displayed")
	public void user_verify_Home_page_is_displayed() {
	   
	}


}
