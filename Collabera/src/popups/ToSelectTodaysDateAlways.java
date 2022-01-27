package popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSelectTodaysDateAlways {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(LocalDateTime.now());  //2022-01-18 with time
		LocalDateTime ldt=LocalDateTime.now();
		String month=ldt.getMonth().name();
		month=month.substring(0,1).toUpperCase()+month.substring(1,month.length()).toLowerCase();
		int date=ldt.getDayOfMonth();
		int year=ldt.getYear();
		//System.out.println(month);//January
		//System.out.println(ldt.getMonth().name());//JANUARY
		//System.out.println(ldt.getDayOfMonth()); //18
		//System.out.println(ldt.getYear()); //2022
		//System.out.println(ldt.getDayOfYear()); //18
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
			
			driver.get("https://www.agoda.com/en-in/region/oyo-state-ng.html?site_id=1891440&tag=efcf8aea-bf23-42bd-a1a6-8ca4b3f922d7");
			Actions actions=new Actions(driver);
			actions.click().perform();
			driver.findElement(By.xpath("//div[text()='Check-in']")).click();
			Thread.sleep(2000);
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0,100);");
		//	for(int i=1;i<=6;i++)
			//{
				//driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				Thread.sleep(2000);
		//	}
			
			//Thread.sleep(2000);
				for(;;) {
					try {
						//select todays date always
						driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//span[text()='"+date+"']")).click();//click on current date i.e January 2022 18 todays date
						//driver.findElement(By.xpath("//div[text()='July "+year+"']/../..//span[text()='"+date+"']")).click();//click on July 18th,can change to any month
						break;
					
				}catch(NoSuchElementException e)
					{
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
					}
				}
	}
}
			
					



			
			
			
