package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAnElementUsingNameAndIdLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("sonu");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("rtys");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		

	}

}
