package dataProviderConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OneDimensionalArrayUsingTryCatchBlocksReadFromExcel {
	@DataProvider(name="searchProducts",parallel=true)
	//@DataProvider
	public String[] sendMobileInfo() {
		Workbook workbook=null;
		try {
			FileInputStream fis=new FileInputStream("./testResources/singlearrary.xlsx");
			workbook=WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String[] arr= {"iphone","redmi","poco","oneplus"};
		//return arr;
		Sheet dataSheet=workbook.getSheet("Sheet1");
		int rowCount=dataSheet.getPhysicalNumberOfRows();
		String[] arr=new String[rowCount];
		for(int i=0;i<rowCount;i++) {
			arr[i]=dataSheet.getRow(i).getCell(0).getStringCellValue();
		}
		return arr;
	}
	@Test(dataProvider="searchProducts")
	//@Test(dataProvider="sendMobileInfo")  //method name
	public void createARequest(String mobileName) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mobileName,Keys.ENTER);
			driver.quit();

}
}
