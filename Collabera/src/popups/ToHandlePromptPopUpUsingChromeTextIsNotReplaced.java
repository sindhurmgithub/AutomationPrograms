package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptPopUpUsingChromeTextIsNotReplaced {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			//moves to alert pop
			Alert promptAlert=driver.switchTo().alert();
			System.out.println(promptAlert.getText());
			Thread.sleep(1000);
			promptAlert.sendKeys("Selenium collabera");
			Thread.sleep(1000);
			//handle prompt pop up using Alert interface methods(accept()....)
			promptAlert.accept();
			//alert.dismiss();
			
			//all this we have to compare expected and actual and print

	}

}
