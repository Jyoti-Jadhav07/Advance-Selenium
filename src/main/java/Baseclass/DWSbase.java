package Baseclass;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DWSbase {
	
	public static WebDriver driver;
	
	
	public static void preCondition(String browser)
	{
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
	
	public static void logIn() 
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("jj0707@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Jj@7777");
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