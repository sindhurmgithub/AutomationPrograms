package seleniumassignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintTitlesOfAllWindowsOfNaukri {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			
			Set<String> allWindowId = driver.getWindowHandles();

			for(String windowId:allWindowId) {
				driver.switchTo().window(windowId);
				System.out.println(driver.getTitle());
				driver.close();
				}
			
            }


		}

