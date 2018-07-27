package com.LVweb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LVweb.TestBase.TestBase;

public class HomePage extends TestBase {
	
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Find Webelement and store it in Object variable:
	
	@FindBy (xpath="//a[contains(text(),'Sign Off')]")
	WebElement Signoffbtn;
	
	@FindBy(xpath="//img[@src='https://dev2.lynchval.com/LVwebWC/PrivateLabel/Logo/WC-Logo-2011-FC-sm.gif']")
	WebElement CompanyLogo;
	
	@FindBy(xpath="//a[contains(text(),'Announcements')]")
	WebElement AnnouncementLink;
	
	@FindBy(xpath="//a[contains(text(),'FAQs')]")
	WebElement FaqsLink;
	
	@FindBy
	(xpath="//a[@id='lnkbenproj']")
	WebElement Estbenefitlink;
	
	@FindBy
	(xpath="//a[@id='lnkbenstatement']")
	WebElement Pensummarylink;
	
	@FindBy
	(xpath="//a[@id='lnkparticipantinfo']")
	WebElement Persinfolink;
	
	@FindBy
	(xpath="//a[@id='lnkResourcefiles']")
	WebElement Resourceslink;
	
	
	@FindBy
	(xpath="//a[@id='lnkContactUs']")
	WebElement Messagecenterlink;
	
	
	//Actions or Methods:
	
	public LoginPage signOff()
	{
		Signoffbtn.click();
		return new LoginPage();
	}
	public boolean logoDisplay() 
	{
		return CompanyLogo.isDisplayed();
	}
	public AnnouncementPage announcementClick()
	{
		AnnouncementLink.click();
		return new AnnouncementPage();
	}
	public FaqsPage faqsClick()
	{
		FaqsLink.click();
		return new FaqsPage();
	}
	
	public EstimateBenefitsPage estBenefitClick()
	{
		Estbenefitlink.click();
		return new EstimateBenefitsPage();
	}
	
	public PensionSummaryPage penSummaryClick()
	{
		Pensummarylink.click();
		return new PensionSummaryPage();
	}
	
	public PersonalInformationPage persinfoClick()
	{
		Persinfolink.click();
		return new PersonalInformationPage();
	}
	
	public ResourcesPage resourcesClick()
	{
		Resourceslink.click();
		return new ResourcesPage();
	}
	
	public MessageCenterPage messageCenterClick()
	{
		Messagecenterlink.click();
		return new MessageCenterPage();
	}
	
	
	
	
	

}
