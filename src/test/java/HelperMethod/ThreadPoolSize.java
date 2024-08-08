package HelperMethod;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//platform to execute the test cas parallaly

public class ThreadPoolSize {
	
		@Test(priority=1, invocationCount=2,threadPoolSize=2)

		public void dws() throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			driver.close();
			

		}
		@Test(priority=0,invocationCount=2)                   
		public void csk() throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.chennaisuperkings.com/");
			Thread.sleep(2000);
			driver.close();
		}
		@Test (priority=2,invocationCount=2,threadPoolSize=2)
		public void Rcb() throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.royalchallengers.com/");
			Thread.sleep(2000);
			driver.close();
		
		}

	}


