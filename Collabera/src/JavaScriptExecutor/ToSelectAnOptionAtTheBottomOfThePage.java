package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSelectAnOptionAtTheBottomOfThePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver. get("https://www.google.com/doodles");
			JavascriptExecutor js=(JavascriptExecutor) driver;
			for(;;) {
				try {
					driver.findElement(By.linkText("Children's Day 2021 (November 20)")).click();
					break;
				}catch(NoSuchElementException e){
						js.executeScript("window.scrollBy(0,250)");
					}
				}
			}

	}


