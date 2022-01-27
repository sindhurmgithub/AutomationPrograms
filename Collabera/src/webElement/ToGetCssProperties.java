package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCssProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String propertyValue= driver.findElement(By.id("loginButton")).getCssValue("border-bottom-right-radius");//border-bottom-width
		System.out.println(propertyValue);
	
		

	}

}
