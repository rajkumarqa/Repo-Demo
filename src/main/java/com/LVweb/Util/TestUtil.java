package com.LVweb.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import com.LVweb.TestBase.TestBase;

public class TestUtil extends TestBase {
	
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\rajkumar\\eclipse-workspace\\LVweb\\src\\main\\java\\com\\LVweb\\TestData\\LVweb_Participant_TestData.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i <=1; i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				System.out.println(data[i][k]);
			}
		}
		return data;
	}
	
	

	public static void takeScreenshot(ITestResult result)  {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//String currentDir = System.getProperty("user.dir");
		try {
			//FileUtils.copyFile(scrFile, new File("D:\\LVscreenshots\\homepage_" + System.currentTimeMillis() + ".png"));
			FileUtils.copyFile(scrFile, new File("D:\\LVscreenshots\\PassedScreenshots\\" + result.getName() + "_Screenshot_Pass.png"));
			}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		}
	
	
	public static void takeScreenshotOnTestFailure(ITestResult result)  {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//String currentDir = System.getProperty("user.dir");
		try {
			FileUtils.copyFile(scrFile, new File("D:\\LVscreenshots\\FailedScreenshots\\" + result.getName() + "_Screenshot_Fail.png"));
			}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		}
	
	/*public void switchToFrame(){
		driver.switchTo().frame("mainpanel");
	}*/
	
	public static void selectDateByJS(WebDriver driver, WebElement element,String dateval)
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
	}
	
		}

