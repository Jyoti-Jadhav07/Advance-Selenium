package Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtility {
	public static String Logindata(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fils = new FileInputStream("D:\\jjEclipse\\crm.comSeleniumAdvanceA6\\configureFile\\LoginFunction.Properties");
		prop.load(fils);
		String data = prop.getProperty(key);
		return data;
	}
	

}
