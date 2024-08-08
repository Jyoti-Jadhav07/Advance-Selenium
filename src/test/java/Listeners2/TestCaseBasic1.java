package Listeners2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.BasiclistenersDWSpage;


@Listeners(com.crm.Listener1.BasicListeners.class)
public class TestCaseBasic1 extends BasiclistenersDWSpage{
	@Test
public void main1() 
{
	String expected_result ="https://demowebshop.tricentis.com/";
	String actual_result = driver.getCurrentUrl();
	assertEquals(expected_result, actual_result);
	
	
}
	@Test
	public void main2() 
	{
	
		String expected_result ="https://demowebshop.tricentis.com";
		String actual_result = driver.getCurrentUrl();
		assertEquals(expected_result, actual_result);
		
		
		

	}
}
	
	


