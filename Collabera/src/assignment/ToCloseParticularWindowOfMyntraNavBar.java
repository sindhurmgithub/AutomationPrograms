package assignment;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToCloseParticularWindowOfMyntraNavBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		
		
		
		
		List<WebElement> navBarElements=driver.findElements(By.xpath("//a[@data-type='navElements']"));
		Actions actions=new Actions(driver);
		
		for(WebElement ele:navBarElements)
		{
		 //Keys.CONTROL---open in new tab
			//actions.keyDown(Keys.CONTROL).click(ele).perform();
			//action.keyUp(Keys.CONTROL).click(ele).perform();
			
			//KEYS.SHIFT--open in new window
			actions.keyDown(Keys.SHIFT).click(ele).perform();
			actions.keyUp(Keys.SHIFT).perform();
		}
		
		Set<String> allWindowsIds=driver.getWindowHandles();
		String expectedWindowTitle="Home and Living - Buy Interior Decoration Products and Accessories Online in India";
		
		for(String windowId:allWindowsIds)
		{
			driver.switchTo().window(windowId);
			String actualWindowTitle=driver.getTitle();
			if(expectedWindowTitle.equals(actualWindowTitle)) {
			
			driver.close();
		}
		
		}
	}
}


