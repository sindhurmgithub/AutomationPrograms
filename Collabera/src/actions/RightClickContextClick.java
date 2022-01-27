package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickContextClick {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,10);
		driver.get("https://trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("rmsindhu017@gmail.com");
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Sindhu@trelloo");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("Sindhu@trelloo");
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.xpath("//div[text()='Sindhu']")).click();
		Thread.sleep(2000);
		
		WebElement cardElement=driver.findElement(By.xpath("//span[text()='Jira']"));
		Thread.sleep(2000);
		
		Actions actions=new Actions(driver);
		actions.contextClick(cardElement).perform();
		
		
		
		
	}


}
