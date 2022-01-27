package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheHeightAndWidthOfTheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		
		Dimension dimension=driver.manage().window().getSize();
		int height=dimension.getHeight();
		int width=dimension.getWidth();
		
		
		System.out.println("Height:"+height+"and width:"+width);
	}

}
