package com.LVweb.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.LVweb.Pages.HomePage;
import com.LVweb.Pages.LoginPage;
import com.LVweb.TestBase.TestBase;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	
	@BeforeClass
	public void setUp() {
		initialization();
		loginpage = new LoginPage();

	}

	@Test(priority = 1)
	public void logintest() {
		homepage = loginpage.login();
		//TestUtil.takeScreenshot();
		

	}

	@Test(priority = 2)
	public void loginoffTest() {
		
		homepage = new HomePage();
		loginpage = homepage.signOff();
		//Assert.assertTrue(false);
		
		
	}

	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
