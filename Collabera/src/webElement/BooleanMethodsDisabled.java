package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethodsDisabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("insta.com/");;
		Thread.sleep(2000);
		WebElement usernameTextField=driver.findElement(By.name("username"));
		WebElement passwordTextField=driver.findElement(By.name("password"));
		WebElement loginButton=driver.findElement(By.xpath("//button[.='Log In']"));
		
		//System.out.println(loginButton.isEnabled());
		
		 usernameTextField.sendKeys("sindhu");
		 passwordTextField.sendKeys("65gfh");
		 
		 System.out.println(loginButton.isDisplayed());
		 

	}

}
