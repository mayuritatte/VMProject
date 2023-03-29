package com.ibm.stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ibm.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	
	  WebDriver driver; 
	   LoginPage lp;
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		 WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	         lp = new LoginPage(driver);
	        
	}

	@When("user open app URL {string}")
	public void user_open_app_URL(String string) {
		driver.get(string);
	   
	}

	@When("user enter email as {email} and password as {pass}")
	public void user_enter_email_as_and_password_as(String email, String pass) {
		lp.enterEmail(email);
		lp.enterPass(pass);
	    
	}

	@When("click on Login")
	public void click_on_Login() {
	    lp.hitLogin();
	}

	@When("user click on Logout link")
	public void user_click_on_Logout_link() {
	   
		lp.hitLogout();	
	}



}
