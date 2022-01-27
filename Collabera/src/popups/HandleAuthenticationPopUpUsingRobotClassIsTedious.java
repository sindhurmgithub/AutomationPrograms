package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationPopUpUsingRobotClassIsTedious {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			driver.get("https://the-internet.herokuapp.com/basic_auth");
			Robot robot=new Robot();
			
			//by default cursor is in username text field
			robot.keyPress(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyPress(KeyEvent.VK_H);
			robot.keyPress(KeyEvent.VK_U);
			
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_H);
			robot.keyRelease(KeyEvent.VK_U);
			Thread.sleep(2000);
			//to move to password text field(move to other element) use TAB
			robot.keyPress(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_1);
			robot.keyPress(KeyEvent.VK_2);
			robot.keyPress(KeyEvent.VK_3);
			
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_3);
			
			robot.keyRelease(KeyEvent.VK_TAB);
			
			
			
			//to move to other element sign in and submit use TAB and ENTER
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
					
			
	}

}
