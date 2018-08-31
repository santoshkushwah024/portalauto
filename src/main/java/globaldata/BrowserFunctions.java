package globaldata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFunctions {
	public static void launch(){
		
		System.setProperty("webdriver.chrome.driver", Constants.driverlocation);
		Constants.driver =new ChromeDriver();
		Constants.driver.manage().window().maximize();
		Constants.driver.manage().timeouts().implicitlyWait(Constants.wt, TimeUnit.SECONDS);
		Constants.driver.get(Constants.URL1);
		
		
	}

}
