package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			
			Alert alertPopUp=driver.switchTo().alert();
			System.out.println(alertPopUp.getText());
			
			//to handle alert pop up
			alertPopUp.accept();   //in alert pop up both accept() and dismiss() click on Ok button ,both works same bcoz alert popup has only Ok button
			//alertPopUp.dismiss(); //click on Ok button
			
			
	}

}
