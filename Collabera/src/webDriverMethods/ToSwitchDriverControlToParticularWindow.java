package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

public class ToSwitchDriverControlToParticularWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstnaukri.com/");
		
		Set<String> allWindowIds=driver.getWindowHandles();
		String expectedWindowTitle="Tech Mahindra";
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			String actualWindowTitle=driver.getTitle();
			if(expectedWindowTitle.equals(actualWindowTitle)) {
				driver.manage().window().maximize();
				break;
				
			}
		}
	}

}
