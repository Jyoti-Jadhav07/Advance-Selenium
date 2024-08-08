package DataDrivenTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Baseclass.DWSbase;


public class GiftCart extends DWSbase{
public static void main(String[] args) throws InterruptedException {
	
		preCondition("Chrome");
	
				logIn();
				
				driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
				driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Anu");
				driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("anu0707@gmail.com");
				WebElement your_name = driver.findElement(By.id("giftcard_2_SenderName"));
				your_name.clear();
				your_name.sendKeys("jyoti");
				WebElement your_email = driver.findElement(By.id("giftcard_2_SenderEmail"));
				your_email.clear();
				your_email.sendKeys("jj0707@gmail.com");
				driver.findElement(By.id("giftcard_2_Message")).sendKeys("hiiii..helloooo");
				WebElement quntity = driver.findElement(By.id("addtocart_2_EnteredQuantity"));
				
				quntity.clear();
				quntity.sendKeys("2");
									
				driver.findElement(By.id("add-to-cart-button-2")).click();
				
				driver.findElement(By.className("ico-cart")).click();
				
				WebElement gift_card = driver.findElement(By.xpath("(//a[text()='$25 Virtual Gift Card'])[2]"));
				
				if(gift_card.isDisplayed())
				{
					System.out.println("gift card is added successfully");
				}
				else
				{
					System.out.println("gift card is not added in shopping cart");
				}
				
				Thread.sleep(2000);
				
				//logOut();
				
				//closeWindow();
				
				
				
			}

		}

	


