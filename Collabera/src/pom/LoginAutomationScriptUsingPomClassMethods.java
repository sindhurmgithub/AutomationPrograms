package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * 
 * @author Hi
 *
 */
public class LoginAutomationScriptUsingPomClassMethods { //public class TC_01

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test Data
		//Enter data in Excel sheet
		String testUrl=ExcelUtility.readStringData("Sheet1",0,0);
		String username=ExcelUtility.readStringData("Sheet1",0,1);
		String password=ExcelUtility.readStringData("Sheet1",0,2);
		String expectedLoginPageTitle=ExcelUtility.readStringData("Sheet1",1,0);
		String expectedHomePageTitle=ExcelUtility.readStringData("Sheet1",1,1);
		
		
		//property file pass url data
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser is launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized successfully");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);   
		
		driver.get(testUrl);
		String actualLoginPageTitle=driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle))
		{
			System.out.println("Login page is displayed successfully");
			
		}
		//call methods from pom class
		LoginPagePomClass loginPage=new LoginPagePomClass(driver);
		loginPage.loginToApp(username,password);
		String actualHomePageTitle=driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Login is Successfull");
		}
		
		HomePagePomClass homePage=new HomePagePomClass(driver);
		homePage.getUsersModuleLink().click();
		
		
		//HomePagePomClass homePage1=new HomePagePomClass(driver);
		//homePage1.getTaskModuleLink().click();
		
		
		//HomePagePomClass homePage2=new HomePagePomClass(driver);
		//homePage2.getReportModuleLink().click();
		

	
		

	}

}
