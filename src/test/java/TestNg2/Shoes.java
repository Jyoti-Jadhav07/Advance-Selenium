package TestNg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shoes {
	@Test
	public void Nike() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.nike.com/in/w/womens-shoes-5e1x6zy7ok");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void Skechers() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.skechers.in/women");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void Addidas() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.adidas.co.in/samba-og-shoes/B75806.html");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void Puma() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.puma.com/in/en/womens/womens-shoes");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void RedTape() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redtape.com/collections/women");
		Thread.sleep(2000);
		driver.close();
	}

}
