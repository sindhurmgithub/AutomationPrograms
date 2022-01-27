package seleniumassignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseThirdWindowInNaukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		String WindowId = driver.getWindowHandle();

		Set<String> AllWindowId = driver.getWindowHandles();
		AllWindowId.remove(WindowId);

		String expectedUrl="https://company.naukri.com/popups/icici/23072021/index.html";
	

		for(String Window:AllWindowId) {
			driver.switchTo().window(Window);
			String actualUrl=driver.getCurrentUrl();
			if(expectedUrl.equals(actualUrl))
				driver.close();
		}
	}

}
