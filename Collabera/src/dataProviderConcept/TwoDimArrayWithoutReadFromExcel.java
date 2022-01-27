package dataProviderConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimArrayWithoutReadFromExcel {
	@DataProvider
	public String[][] credentials(){
	//	String[][] sarr=new String[2][2];
	//	sarr[0][0]="admin";
	//	sarr[0][1]="manager";
	//	sarr[1][0]="trainee";
	//	sarr[1][1]="trainee";
		String[][] sarr= {
			             	{"admin","manager"},
			             	{"trainee","trainee"}
		                 };
		return sarr;
		}
	@Test(dataProvider="credentials")
	
	public void readMultipleDataFromExcel(String[] data) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(data[0]);
		driver.findElement(By.name("pwd")).sendKeys(data[1]);
		driver.findElement(By.id("loginButton")).click();
	
	}
	}


