package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Baseclass.BaseClass2;
public class GiftCart2 extends BaseClass2 {
	static String rName;
	static String rEmail;
	static String yName;
	static String yEmail;
	static String message;
	static String count;

  
	  static void ReadExcel()throws EncryptedDocumentException, IOException {
		FileInputStream fils = new FileInputStream("D:\\SeleniumTestCase\\Login.xlsx");
		Workbook wb = WorkbookFactory.create(fils);
		Sheet sheet = wb.getSheet("Sheet1");
		rName = sheet.getRow(0).getCell(0).toString();
		rEmail = sheet.getRow(1).getCell(0).toString();
		yName = sheet.getRow(2).getCell(0).toString();
		yEmail = sheet.getRow(3).getCell(0).toString();
		message = sheet.getRow(4).getCell(0).toString();
		count = sheet.getRow(5).getCell(0).toString();
		
	}
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		preCondition("Chrome");
		//Thread.sleep(1000);
		logIn();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(1000);
		
		ReadExcel();
		
		WebElement rName = driver.findElement(By.id("giftcard_2_RecipientName"));
		rName.clear();
		rName.sendKeys("rName");
		Thread.sleep(1000);
		
		WebElement rEmail = driver.findElement(By.id("giftcard_2_RecipientEmail"));
		rEmail.clear();
		rEmail.sendKeys("rEmail");
		Thread.sleep(1000);
		
		WebElement your_name = driver.findElement(By.id("giftcard_2_SenderName"));
		your_name.clear();
		your_name.sendKeys("yName");
		Thread.sleep(1000);
		
		WebElement your_email = driver.findElement(By.id("giftcard_2_SenderEmail"));
		your_email.clear();
		your_email.sendKeys("yEmail");
		Thread.sleep(1000);
			
			driver.findElement(By.id("giftcard_2_Message")).sendKeys("messege");
			Thread.sleep(1000);
			
			WebElement quntity = driver.findElement(By.id("addtocart_2_EnteredQuantity"));
		    quntity.clear();
			quntity.sendKeys("counts");
									
			driver.findElement(By.id("add-to-cart-button-2")).click();
				
			driver.findElement(By.className("cart-label")).click();
				
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
				
				logOut();
				
				closeWindow();
				
				
				
			}

		}

	




	


