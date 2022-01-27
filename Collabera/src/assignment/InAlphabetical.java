package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InAlphabetical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		
		
	        d1.navigate().to("http://live.guru99.com/index.php/");
	        d1.manage().window().maximize();
	        if (d1.getTitle().equals("Home page")) {
	            System.out.println("title matched");
	        } else {
	            System.out.println("title not matched expected title is "
	                + d1.getTitle());
	        }
	        d1.findElement(By.xpath("//nav[@id='nav']/ol/li[1]/a")).click();
	        Thread.sleep(2000);
	        if (d1.getTitle().equals("Mobile")) {
	            System.out.println("title matched");
	        } else {
	            System.out.println("title not matched expected title is "
	                + d1.getTitle());
	        }
	        Select s1 = new Select(d1.findElement(By.xpath("//html[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
	        s1.selectByVisibleText("Name");

	}

}
