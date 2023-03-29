package com.ibm.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver) {
		
		this.driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(css="input#Password")
	WebElement pass;
	
	@FindBy(tagName="button")
	WebElement btnLogin;
	
	@FindBy(partialLinkText="Logout")
	WebElement btnLogout;
	
	public void enterEmail(String emailID)
	{
		email.clear();
		email.sendKeys(emailID);
	}
	
	public void enterPass(String pwd)
	{
		pass.sendKeys(pwd);
	}
	
	public void hitLogin()
	{
		btnLogin.click();
	}
	
	public void hitLogout()
	{
		btnLogout.click();
	}
	

}
