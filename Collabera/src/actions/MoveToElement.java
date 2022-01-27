package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	WebDriverWait explicitWait=new WebDriverWait(driver,10);
		driver.get("https://www.skillrary.com/user/login");
		WebElement passwordtextField=driver.findElement(By.name("password"));
		passwordtextField.sendKeys("yutu");
		
		Actions actions=new Actions(driver);
		actions.moveToElement(passwordtextField, 430, -100).click().perform();
		

  }
}
