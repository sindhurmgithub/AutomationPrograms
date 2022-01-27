package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartSelectThirdProduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
	 
	 
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("Poco x3",Keys.ENTER);
		
		driver.findElement(By.xpath("(//div[@data-id])[3]")).click();
		
		//driver.findElement(By.xpath("//div[text()='POCO X3 (Cobalt Blue, 128 GB)']")).click();
	    //driver.findElement(By.xpath("(//div[@data-id])[3]")).click();
		/*String parentWindowId=driver.getWindowHandle();
		Set<String> allWindowIds=driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
	String expectedWindowTitle
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			String actualWindowTitle=driver.getTitle();
			if(actualWindowTitle.equals(expectedWindowTitle)) {
				System.out.println("driver switched control to correct page");
			}*/
		String number=driver.findElement(By.xpath("//div[text()='₹16,999']")).getText();
		//Integer con=Integer.valueOf(number);
	   String con=String.valueOf(number);
		System.out.println(con);
		
		
		
		
     
	}

}
