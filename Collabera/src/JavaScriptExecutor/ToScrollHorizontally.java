package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollHorizontally {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
			driver.get("https://www.skillrary.com/");
	//		WebElement elementScroll=driver.findElement(By.linkText("View all companies"));
			JavascriptExecutor js=(JavascriptExecutor) driver;
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000);"); 
			js.executeScript("window.scrollBy(0,1000);");//scroll 2 times
		
//	    js.executeScript("window.scrollTo(0,1000);");
//		js.executeScript("window.scrollTo(0,1000);");//scroll once


	}

}
