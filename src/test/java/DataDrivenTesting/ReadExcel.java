package DataDrivenTesting;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcel {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			     
				FileInputStream fis=new FileInputStream("D:\\SeleniumTestCase\\Login.xlsx");
				
				Workbook wb = WorkbookFactory.create(fis);
				
				Sheet sheet = wb.getSheet("Sheet1");
				
				// String email = sheet.getRow(0).getCell(0).toString();
				// String password = sheet.getRow(0).getCell(1).toString();
				 String rName =  sheet.getRow(0).getCell(0).toString();
				 String rEmail = sheet.getRow(1).getCell(0).toString();
				 String yName = sheet.getRow(2).getCell(0).toString();
				 String yEmail = sheet.getRow(3).getCell(0).toString();
				 String message = sheet.getRow(4).getCell(0).toString();
				 String count = sheet.getRow(5).getCell(0).toString();
				 
				 
				 //System.out.println(email);
				 //System.out.println(password);
				 
				 System.out.println(rName);
				 System.out.println(rEmail);
				 System.out.println(yName);
				 System.out.println(yEmail);
				 System.out.println(message);
				 System.out.println(count);
				
				
				
			}

		}

	



