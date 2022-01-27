package seleniumMiniProject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pom.ExcelUtility;
import pom.HomePagePomClass;
import pom.LoginPagePomClass;
/***
 * 
 * @author Sindhu
 *
 */

public class Script_001 {
@Test
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Test Data
				//Enter data in Excel sheet
public void createTc_01() {
				String testUrl=ExcelLib.readStringData("Sheet1",0,0);
				String username=ExcelLib.readStringData("Sheet1",0,1);
				String password=ExcelLib.readStringData("Sheet1",0,2);
				String expectedLoginPageTitle=ExcelLib.readStringData("Sheet1",1,0);
				String expectedHomePageTitle=ExcelLib.readStringData("Sheet1",1,1);
				String subject=ExcelLib.readStringData("Sheet1", 2, 0);
				String bill=ExcelLib.readStringData("Sheet1", 2, 1);
				String ship=ExcelLib.readStringData("Sheet1", 2, 2);
			//	CharSequence[] qty=ExcelLib.readStringData("Sheet1", 2, 3);
				String qty=ExcelLib.readNumericData("Sheet1", 2, 3);
			//	String searchOrganisation=ExcelLib.readStringData("Sheet1", 3, 0);
				
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
				TC_Login_001 loginPage=new TC_Login_001(driver);
				loginPage.loginToApp(username,password);
				String actualHomePageTitle=driver.getTitle();
				if(actualHomePageTitle.equals(expectedHomePageTitle)) {
					System.out.println("Login is Successfull");
				}
				
			//	String parentWindowId=driver.getWindowHandle();
			//	Set<String> allWindowIds=driver.getWindowHandles();
			//	allWindowIds.remove(parentWindowId);
				
			//	for(String windowId:allWindowIds) {
			//		driver.switchTo().window(windowId);
					
					
			//	}
				
				//Actions actions=new Actions(driver);
			    // WebElement moreModuleLink = null;
				//actions.moveToElement(moreModuleLink).perform(); 
				
				//HomePage
				
				TC_HomePage_001 homePage=new TC_HomePage_001(driver);
				homePage.getMoreModuleLink().click();
				
				
				TC_HomePage_001 homePage1=new TC_HomePage_001(driver);
				homePage1.getInvoiceModuleLink().click();
				
				//InvoicePage
				TC_InvoiceLookUpImage_001 invoiceLookUpImage=new TC_InvoiceLookUpImage_001(driver);
				invoiceLookUpImage.getInvoiceModuleLookUpImage().click();
				
				//CreatingNewInvoicePage
				TC_CreatingNewInvoice_001 creatingNewInvoice=new TC_CreatingNewInvoice_001(driver);
				creatingNewInvoice.enterSubject(subject);
				
				TC_CreatingNewInvoice_001 billingAddress=new TC_CreatingNewInvoice_001(driver);
				billingAddress.enterBillAddress(bill);
				 
				TC_CreatingNewInvoice_001 shippingAddress=new TC_CreatingNewInvoice_001(driver);
				shippingAddress.enterShipAddress(ship);
				
				TC_CreatingNewInvoice_001 clickLookUpImageOfOrganization=new TC_CreatingNewInvoice_001(driver);
				clickLookUpImageOfOrganization.getClickLookUpImageOranizationField().click();
				
				
				
		//		TC_CreatingNewInvoice_001 clickOnSearchOption=new TC_CreatingNewInvoice_001(driver);
		//		clickOnSearchOption.searchOrganisationName(searchOrganisation);
			
			
				String parentWindowId=driver.getWindowHandle();
				Set<String> allWindowIds=driver.getWindowHandles();
				allWindowIds.remove(parentWindowId);
				
				for(String windowId:allWindowIds) {
					driver.switchTo().window(windowId);
					TC_CreatingNewInvoice_001 selectNameInOrganisationWindow=new TC_CreatingNewInvoice_001(driver);
					selectNameInOrganisationWindow.getSelectOrganisationName().click();
					
					Alert confirmationPopUp=driver.switchTo().alert();
					System.out.println(confirmationPopUp.getText());
					
					//handle the confirmation popup
					//confirmationPopUp.accept();
					confirmationPopUp.dismiss();   
					
					
				}
				driver.switchTo().window(parentWindowId);
		//		TC_CreatingNewInvoice_001 selectNameInOrganisationWindow=new TC_CreatingNewInvoice_001(driver);
		//		selectNameInOrganisationWindow.getSelectOrganisationName().click();
				
				
				TC_CreatingNewInvoice_001 clickLookUpImageOfItemName=new TC_CreatingNewInvoice_001(driver);
				clickLookUpImageOfItemName.getClickLoopUpImageItemName().click();
				
				
				String parentWindowId1=driver.getWindowHandle();
				Set<String> allWindowId=driver.getWindowHandles();
				allWindowId.remove(parentWindowId1);
				
				for(String windowId:allWindowId) {
					driver.switchTo().window(windowId);
				TC_CreatingNewInvoice_001 clickOnProductItemWindow=new TC_CreatingNewInvoice_001(driver);
				clickOnProductItemWindow.getClickOnProductInItemWindow().click();
				}
				driver.switchTo().window(parentWindowId1);
				 
				
		//		TC_CreatingNewInvoice_001 clickProductsName=new TC_CreatingNewInvoice_001(driver);
		//		 clickProductsName. getSelectProductsFromProductWindow().click();
				
				
				
				TC_CreatingNewInvoice_001 enteringQty=new TC_CreatingNewInvoice_001(driver);
				enteringQty.enterQty(qty);
				
				TC_CreatingNewInvoice_001 clickSave=new TC_CreatingNewInvoice_001(driver);
				clickSave.getClickOnSave().click();
				
				TC_CreatingNewInvoice_001 clickAdministratorImage=new TC_CreatingNewInvoice_001(driver);
				clickAdministratorImage.getClickOnAdministratorImageLogout().click();
				
		//		TC_CreatingNewInvoice_001 clickOnTheSignOut=new TC_CreatingNewInvoice_001(driver);
		//		clickOnTheSignOut.getclickOnSignOut().click();
				
				
				
				
		
				
			}

	}


