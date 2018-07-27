package com.LVweb.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.LVweb.Pages.HomePage;
import com.LVweb.Pages.LoginPage;
import com.LVweb.Pages.MessageCenterPage;
import com.LVweb.TestBase.TestBase;

public class MessagePageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	MessageCenterPage messagecenterpage;
	String sheetName = "SubmitMessage";

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login();
		messagecenterpage = homepage.messageCenterClick();
		messagecenterpage.disclaimerBtnClick();

	}

	@DataProvider
	public Object[][] getLVwebTestData() {
		Object data[][] = com.LVweb.Util.TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "getLVwebTestData")
	public void submitMessage(String Prefcontactdropdown,String Mobiletxtbox,String Subjectdropdown, String Commentstxtbox ) {
		messagecenterpage.updateComments(Prefcontactdropdown,Mobiletxtbox,Subjectdropdown,Commentstxtbox);
	}

}
