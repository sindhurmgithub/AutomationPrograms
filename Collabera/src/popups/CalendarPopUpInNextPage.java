package popups;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		public class CalendarPopUpInNextPage {

	
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
				
				
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

							//click on arrow mark
					     driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				         	Thread.sleep(2000);
							driver.findElement(By.xpath("//div[text()='March 2022']/../..//span[text()='20']")).click();
						
						
					
			     }
			}			
			

