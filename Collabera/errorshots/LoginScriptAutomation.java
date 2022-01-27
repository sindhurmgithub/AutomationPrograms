package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginScriptAutomation {

	public static void main(String[] args) throws   {
		// Test Data
		String testUrl="https://app.invoiceninja.com/login";
	    String username="vikasragothamarao@gmail.com";
		String password="Vikas@123";
		String expectedLoginPageTitle="";
		String expectedHomePageTitle="";
		
		//Step 1: Open the browser enter the url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser is launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized successfully");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,20);
		driver.get(testUrl);
		String actualLoginPageTitle=driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle))
		{
			System.out.println("Login page is displayed successfully");
			
		}
		else {

			System.out.println("Login page is displayed successfully");
			
		}
		
		//Step 2: Enter Username into username text field
		WebElement usernameTextField=driver.findElement(By.id("email"));

		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		String actualUsernameEntered=usernameTextField.getAttribute("value");
		
			if(actualUsernameEntered.equals(username))
			{
				System.out.println("username is entered successfully");
			}
			else
			{
				System.out.println("username is not entered successfully");
			
		}
			
			//Step 3:Enter Password into password text field
			WebElement passwordTextField=driver.findElement(By.id("password"));
			passwordTextField.clear();
			passwordTextField.sendKeys(password);
			String actualPasswordEntered=passwordTextField.getAttribute("value");
			
				if(actualPasswordEntered.equals(password))
				{
					System.out.println("password is entered successfully");
				}
				else
				{
					System.out.println("password is not entered successfully");
				
			}
				
				//Step 4: Click on login button
				
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
				
				String actualHomePageTitle=driver.getTitle();
				if(actualHomePageTitle.equals(expectedHomePageTitle))
				{
					System.out.println("Home page is displayed successfully");
				}
				else
				{
					System.out.println("Home page is not displayed successfully");
				}

	}

}
