package Extent_Report;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.DwsScreenShot;
@Listeners(com.crm.Listener1.ScreenShotWithFailed.class)
public class TakeScreenShotOnFailedTestCase extends DwsScreenShot  {
@Test
public void loginFunction()
{
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.findElement(By.xpath("//a[text()='Log out']")).click();
	
	
   }
	
}
