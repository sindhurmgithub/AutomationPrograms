package seleniumassignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSourceOfFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		//to get pagesource of application
		String page=driver.getPageSource();
		System.out.println(page);

	}

}
