package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//Properties prop = new Properties();
		//FileInputStream fils= new FileInputStream("D:\\jjEclipse\\crm.comSeleniumAdvanceA6\\configureFile\\LoginFunction.Properties");
	   // prop.load(fils);
	   // String email = prop.getProperty("email");
	   // System.out.println(email); 
	   // String password = prop.getProperty("password");
		
		String email=JavaUtility.Logindata("email");
		String password = JavaUtility.Logindata("password");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.className("ico-login")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Email")).sendKeys(email);
	    

	    driver.findElement(By.id("Password")).sendKeys(password);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	     
	}

}
