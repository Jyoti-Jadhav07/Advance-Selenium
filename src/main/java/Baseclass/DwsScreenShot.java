package Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DwsScreenShot {
	public static WebDriver driver;
	@BeforeClass
	public void preCondition()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("WELCOME TO THE DWS SITE");
	}
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("THANK YOU FOR THE VISIT");
	}
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}
	

}
