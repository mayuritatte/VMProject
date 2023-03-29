package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HRMLoginPage{
	WebDriver driver;
	public HRMLoginPage(WebDriver driver) {

		driver=this.driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@name='username']")
	WebElement username;

	@FindBy(xpath="//*[@name='password']")
	WebElement password;

	@FindBy(css="button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
	WebElement btnLogin;

	public void enterUserName(String userName1)
	{
		username.sendKeys(userName1);
	}

	public void enterPwd(String pwd)
	{
		password.sendKeys(pwd);	
	}

	public void hitLogin() {
		btnLogin.click();
	}
}
