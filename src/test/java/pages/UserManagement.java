package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class UserManagement extends PcorpWrappers{
	public UserManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public UserManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
		
	public UserManagement ClickAdduser() throws InterruptedException {
		clickByXpath(prop.getProperty("Um.Adduser.Xpath"));
		return this;
		}
	
	public UserManagement AddFirstName(String data) {
		switchToFrame();
		enterById(prop.getProperty("Adduser.Firstname.id"), data);
		return this;
	}
	
	public UserManagement AddLastName(String data) {
		enterById(prop.getProperty("Adduser.Lastname.id"), data);
		return this;
		}
	
	public UserManagement clickCancel() throws InterruptedException {
		clickByXpath(prop.getProperty("Adduser.Cancel.Xpath"));
		driver.switchTo().defaultContent();
		return this;
	}
		
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}
	
	}
