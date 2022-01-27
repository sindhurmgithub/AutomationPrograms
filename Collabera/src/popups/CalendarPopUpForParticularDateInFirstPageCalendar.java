package popups;

		import java.time.LocalDateTime;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		public class CalendarPopUpForParticularDateInFirstPageCalendar {

	
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
			//	LocalDateTime ldt= LocalDateTime.now().plusMonths(6);
				//LocalDateTime ldt= LocalDateTime.now().plusYears(6);
				//String month=ldt.getMonth().name();
			//	month=month.substring(0, 1).toUpperCase()+month.substring(1, month.length()).toLowerCase();
				//int date=ldt.getDayOfMonth();
				//int year=ldt.getYear();
				
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
					
					driver.get("https://www.agoda.com/en-in/region/oyo-state-ng.html?site_id=1891440&tag=efcf8aea-bf23-42bd-a1a6-8ca4b3f922d7");
					Actions actions=new Actions(driver);
					actions.click().perform();
					driver.findElement(By.xpath("//div[text()='Check-in']")).click();
					Thread.sleep(2000);
					
					//date will be in down not able to see 28,29,30,31 dates ,other element is overlap so use javascript to scroll
					JavascriptExecutor js=(JavascriptExecutor) driver;
					
					js.executeScript("window.scrollBy(0,100);");

							//inspect January 2022--independent path and 29--date dependent path 
					  // only January 2022 20 is clicked
				         	Thread.sleep(2000);
							driver.findElement(By.xpath("//div[text()='January 2022']/../..//span[text()='20']")).click();
						
						
					
			     }
			}			
			

