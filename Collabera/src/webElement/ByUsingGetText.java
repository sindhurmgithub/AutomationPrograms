package webElement;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//String expecterrormsg="";//not proper error msg is displayed
		String expecterrormsg="manager";
		WebElement errorMsgElement= driver.findElement(By.xpath("//b[text()='manager']"));
		String actualerrmsg=errorMsgElement.getText();
		
		
			if(expecterrormsg.equals(actualerrmsg)) {
				System.out.println("Proper error msg is displayed");
			}
			else
			{
				System.out.println("not Proper error msg is displayed");
			}
			
		
		

	}

}
