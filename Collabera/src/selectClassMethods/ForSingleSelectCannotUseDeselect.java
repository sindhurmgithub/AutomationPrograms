package selectClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ForSingleSelectCannotUseDeselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("file:///C:/Users/Hi/Downloads/dropDown.html");
			WebElement singleSelectBox=driver.findElement(By.id("s1"));
			
			Select select=new Select(singleSelectBox);
			select.selectByVisibleText("Selenium");
			//select.deselectByVisibleText("Selenium"); //if we use deselect method in single select will get an UnsuppotedOperationException

	}

}
