package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnElementOfSpecificTitledWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purplle.com/brand/m-a-c");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='M.A.C Shreya Jain Festive Kit - Get Lippy with Verve, Twig & Chilli - 44% Savings']")).click();
		Thread.sleep(2000);
        driver.close();

	}

}

	

	


