package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSourceCodeOfPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		String page=driver.getPageSource();
		System.out.println(page);
		driver.quit();
	

	}
}
