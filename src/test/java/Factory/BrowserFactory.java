package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import DataProvider.ConfigDataProvider;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browsername){
		
		if(browsername.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getChromeURL());
			driver = new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver",DataProviderFactory.getConfig().getIEURL());
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		return driver;
	}	
	
	public static void closeBrowser(WebDriver ldriver){
		ldriver.quit();
	}

}
