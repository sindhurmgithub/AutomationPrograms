package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectLastOptionInGivenDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		driver.get("https://www.facebook.com/signup");
	
		WebElement monthListBox=driver.findElement(By.id("month"));

		
		//By using Actions class also can handle drop down
	//	List<WebElement> months=driver.findElements(By.xpath("//select[@id='month']/option")); // all month options will get
	//	for(WebElement ele:months) {
	//	System.out.println(ele.getText());
	//	}
		
		//Select class
		
		Select monthSelect=new Select(monthListBox);
		System.out.println(monthSelect.isMultiple());//false
		
		
		//to get options of days
		List<WebElement> monthListBoxOptions=monthSelect.getOptions();
		for(WebElement ele:monthListBoxOptions) {
			System.out.println(ele.getText());
		}
		
		
				
			
				monthSelect.selectByIndex(((List<WebElement>) monthSelect).size()-1); //select DEC

				



	}

}
