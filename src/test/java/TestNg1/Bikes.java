package TestNg1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bikes {
	@Test
	public void Royal_Enfield_GT() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalenfield.com/in/en/motorcycles/continental-gt/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void Kavasaki_Ninja() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bikewale.com/kawasaki-bikes/ninja/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void Hayabusa() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bikewale.com/suzuki-bikes/hayabusa/");
		Thread.sleep(2000);
		driver.close();	
	}
	@Test
	public void BMW() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bmw-motorrad.in/en/models/modeloverview.html");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void KTM() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ktmindia.com/ktm-bikes/travel/ktm-390-adventure");
		Thread.sleep(2000);
		driver.close();
	}
	

}
