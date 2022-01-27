package seleniumassignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitleUrlOfFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//to get title of application
		String title=driver.getTitle();
		System.out.println(title);
		
		//to get current url of application
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		
		
		
		
	

	}

}
