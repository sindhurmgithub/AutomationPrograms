package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionAndGetAllSelectedOptionInMultiSelectDropDownBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("file:///C:/Users/Hi/Downloads/dropDown.html");
			WebElement multiSelectBox=driver.findElement(By.id("m1"));
			
			Select select=new Select(multiSelectBox);
			select.selectByVisibleText("Jackfruit");
			select.selectByVisibleText("Orange");
			
			WebElement firstOption=select.getFirstSelectedOption();
			System.out.println(firstOption.getText());//Orange which was first in dropdown list not user selected first option(Jackfruit)
			
			//to print all selected options from dropdown
			List<WebElement> optionsSelected=select.getAllSelectedOptions();
		    for(WebElement ele:optionsSelected) {
				System.out.println(ele.getText());//Orange Jackfruit(according to dropdown selected gives output
			}

	}
}


