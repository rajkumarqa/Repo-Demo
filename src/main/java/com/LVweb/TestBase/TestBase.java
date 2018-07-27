package com.LVweb.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static  Properties props;
	public static WebDriver driver;
	
	public TestBase() 
	{
		
		try {
			props=new Properties();
			FileInputStream fis=new FileInputStream("C://Users//rajkumar//eclipse-workspace//LVweb//src//main//java//com//LVweb//Config//config.properties");
			
			props.load(fis);
			} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() 
	{
				String browsername =props.getProperty("browser");
		
		if (browsername.contains("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\chromedriver.exe");
			 driver =new ChromeDriver();
			
			/*//1.Define desired capabilities
			DesiredCapabilities cap= new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			
			//Chrome optionsdefination
			ChromeOptions options =new ChromeOptions();
			options.merge(cap);
			
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		/*DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WINDOWS);
			
			try {
				 driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}*/
		
		/*else if (browsername.contains("firefox")) 	
		{

			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Software\\geckodriver.exe");
			 driver =new FirefoxDriver();
		}
		*/
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(props.getProperty("url"));
		
		
	
	
}
}}
	
