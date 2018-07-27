package com.LVweb.Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LVweb.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="txtUserName") 
	WebElement Username;
	
	@FindBy(id="txtPassword") 
	WebElement Password;
	
	@FindBy(id="cmdLogin") 
	WebElement Loginbtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	//Actions/Methods:
	
	public HomePage login() 
	{
		Username.sendKeys("lynchval\\LDAPUser326");
		Password.sendKeys("LVweb1");
		Loginbtn.click();
		return new HomePage();
	}
	

}
