package takesScreenShot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShotButNotDeletedUsingDummyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.zomato.com/");
		File tempFile=driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		
		
		File destFile=new File("E:\\jpg\\Zomato.jpeg");
		//renameTo() will not replace the screenshot
		tempFile.renameTo(destFile);
	}

}
