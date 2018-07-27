package com.LVweb.TestCases;

import org.testng.annotations.BeforeMethod;

import com.LVweb.Pages.EstimateBenefitsPage;
import com.LVweb.Pages.HomePage;
import com.LVweb.Pages.LoginPage;
import com.LVweb.TestBase.TestBase;

public class EstimateBenefitTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	EstimateBenefitsPage estimatebenefits;

	@BeforeMethod
	 public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login();
		estimatebenefits = homepage.estBenefitClick();
		estimatebenefits.disclaimerBtnClick();
		
	 }
}



