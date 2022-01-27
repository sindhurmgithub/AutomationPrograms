package webDriverMethods;


import org.openqa.selenium.firefox.FirefoxDriver;

public class ToCloseParentWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.close();
		
		


	}

}
