package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).click();
		//number of suggestions
		List<WebElement> listOfSuggestions=driver.findElements(By.xpath("//li[@role='presentation' and @jsaction]"));
		//from 1 to 11... full
		//List<WebElement> dataForSuggestion=driver.findElements(By.xpath("//li[@role='presentation' and @jsaction]"));
		//from 1 to 10 exactly 
		List<WebElement> dataForSuggestion=driver.findElements(By.xpath("//li[@role='presentation' and @jsaction]//span[text()]")); 
		System.out.println(listOfSuggestions.size());
		
		for(WebElement ele:dataForSuggestion) {
			System.out.println(ele.getText());
		}
	}

}
