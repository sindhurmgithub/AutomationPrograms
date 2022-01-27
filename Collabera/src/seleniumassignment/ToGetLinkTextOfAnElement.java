package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetLinkTextOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://careers.foodpanda.com/");
		String Link= driver.findElement(By.linkText("Jobs")).getText();
		System.out.println("Link Text = " +Link);
		driver.close();
	}

	}


