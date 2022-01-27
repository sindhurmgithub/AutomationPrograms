package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ChromeSettingsAndFirefoxSettingsLaunchBrowserInIncognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");//--disable-notifications
		WebDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://www.redbus.in/");
			
			//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//	FirefoxOptions foptions=new FirefoxOptions();
			//foptions.addArguments("dom.webnotifications.enabled=false");
			//WebDriver driver1=new FirefoxDriver(foptions);
			//driver1.manage().window().maximize();
			//driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			//driver1.get("https://www.easemytrip.com/");
			
			
			
			
			
	}

}
