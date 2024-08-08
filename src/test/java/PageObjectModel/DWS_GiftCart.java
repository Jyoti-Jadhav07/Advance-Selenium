package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class DWS_GiftCart {
	@Test
	public <Dws_GiftCard> void main()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	POM.DWS_GiftCart ref = new POM.DWS_GiftCart(driver);
	ref.link();
	ref.sort();
	ref.display();
	ref.view();
	ref.giftCart1();
	ref.giftCart2("kalyani","kalyani01@gmail.com", "suchitra", "suchitra07@gmail.com","helloo.. please receive your gift", "5");
	ref.giftCart3();
	ref.giftCart4();

}
}