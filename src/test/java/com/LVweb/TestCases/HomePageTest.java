package com.LVweb.TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LVweb.Pages.AnnouncementPage;
import com.LVweb.Pages.EstimateBenefitsPage;
import com.LVweb.Pages.FaqsPage;
import com.LVweb.Pages.HomePage;
import com.LVweb.Pages.LoginPage;
import com.LVweb.Pages.MessageCenterPage;
import com.LVweb.Pages.PensionSummaryPage;
import com.LVweb.Pages.PersonalInformationPage;
import com.LVweb.Pages.ResourcesPage;
import com.LVweb.TestBase.TestBase;

public class HomePageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	AnnouncementPage announcementpage;
	FaqsPage faqpage;
	EstimateBenefitsPage estimatebenefits;
	PensionSummaryPage pensionsummarypage;
	PersonalInformationPage personalinformationPage;
	ResourcesPage resourcespage;
	MessageCenterPage messagecenterpage;

	public HomePageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login();
	}

	@Test(priority = 1)
	public void logoDisplayTest() {
		// homepage = new HomePage();
		boolean logo = homepage.logoDisplay();
		AssertJUnit.assertTrue(logo);
	}

	@Test(priority = 2)
	public void announcementClickTest() {
		announcementpage = homepage.announcementClick();
	}

	@Test(priority = 3)
	public void faqClickTest() {
		faqpage = homepage.faqsClick();
	}

	@Test(priority = 4)
	public void estBenefitClickTest() {
		estimatebenefits = homepage.estBenefitClick();
	}

	@Test(priority = 5)
	public void penSummaryClickTest() {
		pensionsummarypage = homepage.penSummaryClick();
	}

	@Test(priority = 6)
	public void persInfoClickTest() {
		personalinformationPage = homepage.persinfoClick();
	}
	
	@Test(priority = 7)
	public void resourcesClickTest() {
		resourcespage = homepage.resourcesClick();
	}
	
	@Test(priority = 8)
	public void messageCenterClickTest() {
	messagecenterpage=homepage.messageCenterClick();
	assertTrue(false);
	
	}
	

	
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
