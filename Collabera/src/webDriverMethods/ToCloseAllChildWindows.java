package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		String parentWindowId=driver.getWindowHandle();
		Set<String> allWindowIds=driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			driver.close();
			
		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("Computer science");
		
		 
	}

	

}
