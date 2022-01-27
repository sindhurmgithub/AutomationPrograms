package synchronization;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class WaitingImplicitly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
	   /* List<WebElement> aut=driver.findElements(By.name("usernam"));//[]
	    System.out.println(aut);*/
		
		driver.findElement(By.name("username")).sendKeys("sindhu");
	

	}

}
