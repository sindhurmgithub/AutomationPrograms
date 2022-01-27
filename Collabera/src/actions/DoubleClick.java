package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	WebDriverWait explicitWait=new WebDriverWait(driver,10);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement plusIcon=driver.findElement(By.id("add"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(plusIcon).doubleClick().perform();
	//	actions.doubleClick(plusIcon).perform();

   }
}