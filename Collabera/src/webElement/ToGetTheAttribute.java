package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String username="sindhu";
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement usernameTF=driver.findElement(By.name("username"));
		usernameTF.clear();
		usernameTF.sendKeys(username);
		String actualDataEntered=usernameTF.getAttribute("value");
		System.out.println(actualDataEntered);
		if(actualDataEntered.equals(username))
		{
			System.out.println("username is entered properly");
		}
		

	}

}
