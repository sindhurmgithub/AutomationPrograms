package takesScreenShot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebPageScreenShotStoreAndStoreInFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.zomato.com/");
		File tempFile=driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		
		//creating a errorshots folder in project
		
		File destFile=new File("./errorshots/zomato.png");
		//renameTo() will not replace the screenshot
		tempFile.renameTo(destFile);


	}

}
