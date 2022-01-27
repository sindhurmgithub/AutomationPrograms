package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
			// driver.get("https://www.oyorooms.com/");
		
		Robot robot=new Robot();
		//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		//Thread.sleep(2000);
		//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		//Thread.sleep(2000);
		//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		//Thread.sleep(2000);
		//ABMrobot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//robot.keyPress(KeyEvent.VK_ALT);
		//robot.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(2000);
		//robot.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(2000);
		//robot.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(2000);
	//	robot.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(2000);
		//robot.keyRelease(KeyEvent.VK_TAB);
	//	robot.keyRelease(KeyEvent.VK_ALT);
		
		
		// when run the code ,where i placed cursor their will get printed abm
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);//if given capslock prints ABM or if not mentioned prints abm
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_M);//ABM
        
       robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_B);//abm
        robot.keyRelease(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);


	}

}
