package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePomClass {
	public HomePagePomClass(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Data members or properties
	@FindBy(id="container_tasks") private WebElement taskModuleLink;
	
	@FindBy(id="container_reports") private WebElement reportModuleLink;
	
	@FindBy(id="container_users") private WebElement usersModuleLink;

	//getter methods
	public WebElement getTaskModuleLink() {
		return taskModuleLink;
	}

	public WebElement getReportModuleLink() {
		return reportModuleLink;
	}

	public WebElement getUsersModuleLink() {
		return usersModuleLink;
	}
	

}

