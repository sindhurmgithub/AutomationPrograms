package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebPageScreenShotByCasting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.skillrary.com/");
		
		//casting
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tempFile=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		
		//creating a errorshots folder in project
		
		File destFile=new File("./errorshots/zomato.png");
		 
		//to replace screenshot
		FileUtils.copyFile(tempFile,destFile);
	}

}
