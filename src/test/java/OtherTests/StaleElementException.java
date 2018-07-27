package OtherTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementException {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://dev2.lynchval.com/LVFinanceEmployer/Home.aspx");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@id='btnContinue']")).click();
		
		WebElement employer= driver.findElement(By.xpath("//select[@id='ddlEmployer']"));
		Select select= new Select(employer);
		select.selectByVisibleText("Bermuda Extreme Careers - 80006");
		
	    //Thread.sleep(3000);
		
		WebElement employer1=driver.findElement(By.xpath("//select[@id='ddlEmployer']"));
		WebDriverWait wait =new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(employer1));
		Select select1= new Select(employer1);
		select1.selectByVisibleText("Hive & Honey Bermuda - 80004");
		
		//driver.close();
		
		
		

	}

}
