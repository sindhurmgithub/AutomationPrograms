package assignment;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptRediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//sign in
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		//username
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		
		//password
		driver.findElement(By.id("password")).sendKeys("Testing@123");

		//sign in button
		driver.findElement(By.name("proceed")).submit();
		
		//Write mail
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		
		driver.findElement(By.xpath("//input[@class='rd_inp_to as-input']")).sendKeys("sumanthElfBatch@rediffmail.com");
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value='sindhu';",writemail);
		//subject   //id
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("abc");
		Thread.sleep(2000);
		
		//summary
		//driver.findElement(By.xpath("//div[@class='rd_box_tabs']")).sendKeys("Hi");
		
	    WebElement frameElement=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
	    Thread.sleep(2000);
	    driver.switchTo().frame(frameElement);
	    driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hi good morning");
	    		driver.switchTo().defaultContent();
	    		Thread.sleep(2000);
	    		driver.findElement(By.linkText("Send")).click();
	    		driver.findElement(By.xpath("//span[text()='Continue sending mail']")).click();
	    		Thread.sleep(2000);
	    		
	    	
	    		Thread.sleep(2000);
	    		for(;;) {
	    			try {
	    		
	    		driver.findElement(By.xpath("//span[text()='abc']/..//cite[@title='Select mail']")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("//span[text()='Delete' and @class='rd_fil_del']")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("//button[text()='Ok']")).click();
	    		break;
	    			}catch(NoSuchElementException e) {
	    				driver.navigate().refresh();
	    			}
	    		}
	    		driver.close();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
