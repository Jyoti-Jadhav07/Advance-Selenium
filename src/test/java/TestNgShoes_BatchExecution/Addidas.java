package TestNgShoes_BatchExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Addidas {
	@Test(groups="regression")
	public void addidas() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.nike.com/in/w/womens-shoes-5e1x6zy7ok");
		Thread.sleep(2000);
		driver.close();
	}

}
