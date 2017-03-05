package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties Pro;
	public ConfigDataProvider() {
		File src = new File("C:\\Users\\smriti\\workspace\\ETLProject\\Configuration\\Config.properties");
		try {
			FileInputStream fil = new FileInputStream(src);

			Pro = new Properties();
			Pro.load(fil);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is:"+e.getMessage());

		}
		 
		
		
	}
public String getPageURL(){
	
	String URL = Pro.getProperty("URL");
	return URL;
}

public String getChromeURL(){
	
	String URL = Pro.getProperty("ChromeDriver");
	return URL;
}

public String getIEURL(){
	
	String URL = Pro.getProperty("IEDriver");
	return URL;
}

public String getExcelURL(){
	
	String URL = Pro.getProperty("ExcelPath");
	return URL;
}
}
