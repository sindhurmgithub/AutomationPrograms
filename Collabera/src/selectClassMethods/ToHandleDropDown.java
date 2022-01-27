package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		driver.get("https://www.facebook.com/signup");
		WebElement dayListBox=driver.findElement(By.id("day"));
		WebElement monthListBox=driver.findElement(By.id("month"));
		WebElement yearListBox=driver.findElement(By.id("year"));
		
		//By using Actions class also can handle drop down
		List<WebElement> months=driver.findElements(By.xpath("//select[@id='month']/option")); // all month options will get
		for(WebElement ele:months) {
		System.out.println(ele.getText());
		}
		
		//Select class
		Select daySelect=new Select(dayListBox);
		System.out.println(daySelect.isMultiple());//false
		Select monthSelect=new Select(monthListBox);
		System.out.println(monthSelect.isMultiple());//false
		Select yearSelect=new Select(yearListBox);
		System.out.println(yearSelect.isMultiple());//false
		
		
		
		//to get options of days
		List<WebElement> dayListBoxOptions=daySelect.getOptions();
		for(WebElement ele:dayListBoxOptions) {
			System.out.println(ele.getText());
		}
		
		//to get options of months
				List<WebElement> monthListBoxOptions=monthSelect.getOptions();
				for(WebElement ele:monthListBoxOptions) {
					System.out.println(ele.getText());
				}
				
		//to get options of year
				List<WebElement> yearListBoxOptions=yearSelect.getOptions();
				for(WebElement ele:yearListBoxOptions) {
					System.out.println(ele.getText());
				}
				
				
				daySelect.selectByIndex(20); //select day 21
				
				monthSelect.selectByValue("12"); //select DEC

				yearSelect.selectByVisibleText("1994"); // select 1994

 

	}

}
