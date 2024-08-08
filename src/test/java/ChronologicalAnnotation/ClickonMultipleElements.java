package ChronologicalAnnotation;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Baseclass.BaseclassOfDWS;



public class ClickonMultipleElements extends BaseclassOfDWS{
	@Test
 public void elementtoclick() throws InterruptedException
 {
	 String url = "https://demowebshop.tricentis.com/news/rss/1";
//	 WebDriver driver = new ChromeDriver();
//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	 driver.get("https://demowebshop.tricentis.com/");
//	 driver.findElement(By.className("ico-login")).click();
//	 driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
//	 driver.findElement(By.id("Password")).sendKeys("admin01");
//	 driver.findElement(By.xpath("//input[@value='Log in']"));
	 
	 //TESTCASE DATA//
	 
	 
	 Actions act = new Actions(driver);
	 act.keyDown(Keys.PAGE_DOWN).build().perform();
	 act.keyDown(Keys.PAGE_DOWN).build().perform();
	 Thread.sleep(2000);
	 List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
	 for (WebElement web : links) {
		 String currenturl = driver.getCurrentUrl();
		 if (url.equals(currenturl)) {
			 driver.navigate().back();
			 Thread.sleep(2000);
			
		}
		 web.click();
		
	}
//	 driver.findElement(By.className("ico-logout"));
//	 driver.close();
//	 
     }
 

  }
