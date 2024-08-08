package com.crm.Listener1;

	import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;

import Baseclass.BasiclistenersDWSpage;

	public class BasicListeners extends BasiclistenersDWSpage implements ITestListener {

		@Override
		public void onTestStart(ITestResult result) {
			//change
			String name = result.getMethod().getMethodName();
			//Reporter.log("onTestStart",true);
			Reporter.log(name,true);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			
			Reporter.log("onTestSuccess",true);
		}

		
		@Override
		public void onTestFailure(ITestResult result) {
			
			LocalDateTime Date = LocalDateTime.now();
			String time = Date.toString().replace(":", "-");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File from = ts.getScreenshotAs(OutputType.FILE);
 			File to = new File("./ScreenShot/DwsPage"+time+".png");
 			//File to = new File("D:\\jjEclipse\\crm.comSeleniumAdvanceA6\\ScreenShot"+time+".png");

			try {
				FileHandler.copy(from, to);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			//Reporter.log("onTestFailure",true);	
			}

		@Override
		public void onTestSkipped(ITestResult result) {
			
			Reporter.log("onTestSkipped",true);}

		@Override
		public void onStart(ITestContext context) {
			Reporter.log("onStart",true);	}

		@Override
		public void onFinish(ITestContext context) {
			Reporter.log("onFinish",true);
		}

	}


		
