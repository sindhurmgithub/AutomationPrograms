package webDriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultScrollActionByFindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		// by default findElement scroll down if click(),submit(),sendKeys() used
		driver.findElement(By.linkText("career")).click();
		
		driver.findElement(By.linkText("career")).submit();
		
		driver.findElement(By.linkText("career")).sendKeys("sindhu");
		//will get text but not scroll down
		/*String txt=driver.findElement(By.linkText("career")).getText();
		System.out.println(txt);*/ //career
	}

}
