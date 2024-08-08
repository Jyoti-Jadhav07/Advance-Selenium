package PageObjectModel;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	

	public class DWS_RegisterPage {
		
		@Test
		public void main() 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
			
			POM.DWS_RegisterPage ref = new POM.DWS_RegisterPage(driver);
			ref.register_button();
			ref.radio1();
			ref.radio2();
			ref.firstName("Suchitra");
			ref.lastName("Gavali");
			ref.email("suchitragavali07@gmail.com");
			ref.password("Suchitra@07");
			ref.cPassword("Suchitra@07");
			ref.register();
			driver.close();
			
			
		}

	}


