package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightLeftAlignmentOfUsernameTextFieldOfFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		/*driver.findElement(By.id("email"));
		Dimension dimension=driver.manage().window().getSize();
		int height=dimension.getHeight();
		int width=dimension.getWidth();
		
		
		System.out.println("Height:"+height+"and width:"+width);
		
		Point point= driver.manage().window().getPosition();
		System.out.println(point.getX());
		System.out.println(point.getY());*/
		
		Rectangle element=driver.findElement(By.id("email")).getRect();
		int heigth=element.getHeight();
		int widthh=element.getWidth();
		int x=element.getX();
		int y=element.getY();
		
		System.out.println(heigth);
		System.out.println(widthh);
		System.out.println(x);
		System.out.println(y);
		
		
		
		
	}

}
