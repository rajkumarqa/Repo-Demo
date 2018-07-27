package com.LVweb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LVweb.TestBase.TestBase;
import com.LVweb.Util.TestUtil;

public class EstimateBenefitsPage extends TestBase {

	public EstimateBenefitsPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Find Webelements:
	
	@FindBy(xpath="//input[@id='btnread']")
	WebElement Disclaimerbtn;
	
	@FindBy (xpath="//img[@id='imgtxtuserdate']")
	WebElement specifyDateIconClick;
	
	@FindBy (xpath="//input[@id='txtuserdate']")
	WebElement specifyDateTxtbox;
	
	
	
	//Actions:
	
	public EstimateBenefitsPage SelectDateIcon()
	{
		specifyDateIconClick.click();
		
		return new EstimateBenefitsPage();
	}
	
	public  EstimateBenefitsPage disclaimerBtnClick()
	{
		Disclaimerbtn.click();
		return new EstimateBenefitsPage();
	}
	

	public EstimateBenefitsPage enterDate(String dateval)
	{
		System.out.println(dateval);
		//String dateval="08/02/2018";
		TestUtil.selectDateByJS(driver, specifyDateTxtbox, dateval);
     	return new EstimateBenefitsPage();
	}
	
	
	
	
}
