package takesScreenShot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebElementScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.swiggy.com/");
		File weScreenShot=driver.findElement(By.xpath("//span[text()='FIND FOOD']")).getScreenshotAs(OutputType.FILE);
		
		
		
		File weDestFile=new File("./errorshots/weSc.png");
		
		//renameTo() will not replace the screenshot
		weScreenShot.renameTo(weDestFile);

	}

}
