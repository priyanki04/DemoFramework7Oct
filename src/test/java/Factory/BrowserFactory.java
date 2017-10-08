package Factory;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {

	    static WebDriver driver;
		
		public static WebDriver getApplication(String browser){
			
			if(browser.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
			}
			
			else if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getChromePath());
				driver = new ChromeDriver();
			}
			
			/*else if(browser.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.ie.driver", "");
				driver = new InternetExplorerDriver();
			}*/
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			return driver;
		}	
		
		public static void closeBrowser(WebDriver driver1){
			driver1.quit();
		}
		
}



