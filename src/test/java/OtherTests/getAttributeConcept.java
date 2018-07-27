package OtherTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver.exe");
		 driver =new ChromeDriver();
		 
		 //driver.get("https://www.facebook.com/YIPMAA/photos/a.637092509656777.1073741825.637091429656885/2083640428335304/?type=3&theater");
		 
		 driver.get("https://www.facebook.com/");
		 
		System.out.println(driver.findElement(By.name("email")).getAttribute("class"));
		System.out.println(driver.findElement(By.name("email")).getSize().getHeight());
		System.out.println(driver.findElement(By.name("email")).getSize().getWidth());
		System.out.println(driver.findElement(By.name("email")).getCssValue("color"));
		System.out.println(driver.findElement(By.name("email")).getCssValue("background-color"));
		 
		//driver.navigate().to("https:/www.facebook.com/");
		
		 
		 //driver.navigate().back();
	}

}
