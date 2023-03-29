package com.stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HRMLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLoginStepDef {
	
	WebDriver driver;
	HRMLoginPage hlp;
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
         hlp = new HRMLoginPage(driver);
	}

	@When("user open app URL {string}")
	public void user_open_app_URL(String string) {
		driver.get(string);
	    
	}

	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String username1, String password1) {
		hlp.enterUserName(username1);
		hlp.enterPwd(password1);
	   
	}

	@When("click on Login")
	public void click_on_Login() {
	    hlp.hitLogin();
	}


}
