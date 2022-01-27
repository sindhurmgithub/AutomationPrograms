package basics;


import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefoxBrowser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hi\\Downloads\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	

	}
}
