package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://licindia.in/Home/Policy-Loan-Options#");
			driver.findElement(By.linkText("Pay Direct (Without login)")).click();
			
			Alert confirmationPopUp=driver.switchTo().alert();
			System.out.println(confirmationPopUp.getText());
			
			//handle the confirmation popup
			confirmationPopUp.accept();       //click on Ok button
			//confirmatiomPopUp.dismiss();   //click on Cancel button
			
			//before handling(without using accept(),dismiss().. Alert mathods) if we use driver.close() will get an UnhandledAlertException
		

	}

}
