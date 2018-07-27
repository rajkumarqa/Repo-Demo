package com.LVweb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.LVweb.TestBase.TestBase;

public class MessageCenterPage extends TestBase {
	
	
	
	@FindBy(xpath="//input[@id='btnread']")
	WebElement Disclaimerbtn;
	
	@FindBy(xpath="//select[@id='ddlPerferCont']")
	WebElement Prefcontactdropdown;
	
	@FindBy(xpath="//input[@id='txtFrom']")
	WebElement Mobiletxtbox;
	
	@FindBy(xpath="//select[@id='ddlSubject']")
	WebElement Subjectdropdown;
	
	@FindBy(xpath="//textarea[@id='txtCooments']")
	WebElement Commentstxtbox;
	
	@FindBy(xpath="//input[@id='btnSend']")
	WebElement Sendbtn;
	
	public MessageCenterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions:
	
	public MessageCenterPage disclaimerBtnClick()
	{
		Disclaimerbtn.click();
		return new MessageCenterPage();
	}
	
	
	
	
	public MessageCenterPage updateComments(String prefcontactdropdown, String mobiletxtbox, String subjectdropdown, String commentstxtbox)
	
	{
		Select pcm=new Select(Prefcontactdropdown);
		pcm.selectByVisibleText(prefcontactdropdown);
		Mobiletxtbox.clear();
		Mobiletxtbox.sendKeys(mobiletxtbox);
		Select subject=new Select(Subjectdropdown);
		subject.selectByVisibleText(subjectdropdown);
		Commentstxtbox.sendKeys("commentstxtbox");
		Sendbtn.click();
		return new MessageCenterPage();
				
	}



}
