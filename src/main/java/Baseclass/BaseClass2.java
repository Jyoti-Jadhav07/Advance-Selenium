package Baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass2 {

		public static WebDriver driver;
		public static void preCondition(String browser) throws IOException
		{
			String bro  = JavaUtility.Logindata("browser");
			String url =JavaUtility.Logindata("url");
			
			if(browser.equalsIgnoreCase("Chrome"))
			{
				driver=new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("edge")) 
			{
				driver=new EdgeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) 
			{
				driver=new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("safari")) 
			{
				driver=new SafariDriver();
			}
			else if (browser.equalsIgnoreCase("IE")) 
			{
				driver=new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://demowebshop.tricentis.com/");
		}
		
		public static void logIn() throws InterruptedException, IOException 
		{
			String username = JavaUtility.Logindata("username");
			String password = JavaUtility.Logindata("password");
			driver.findElement(By.className("ico-login")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
		}
		
		public static void logOut()
		{
			driver.findElement(By.linkText("Log out")).click();
		}
		
		public static void closeWindow()
		{
			driver.close();
		}
		
		public static void closAllWindow()
		{
			driver.quit();
		}

	}
	


