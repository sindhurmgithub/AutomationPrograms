package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationPopUpUsingAutoItToolGUIEasyThanRobotThisIsCorrectCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

			driver.get("https://the-internet.herokuapp.com/basic_auth");
			Runtime.getRuntime().exec("./autoIt/autoPopUp.exe");
			
			//can avoid authentication pop up by sending un and pwd in url itself by one line
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			
	}

}
