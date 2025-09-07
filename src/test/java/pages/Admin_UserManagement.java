package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Admin_UserManagement extends PcorpWrappers{
	public Admin_UserManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Admin_UserManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public Admin_UserManagement clickAdduser() throws InterruptedException {
		clickByXpath(prop.getProperty("Um.Adduser.Xpath"));
		return this;
		}
	
	public Admin_UserManagement AddFirstName(String data) {
		switchToFrame();
		enterById(prop.getProperty("Adduser.Firstname.id"), data);
		return this;
	}
	
	public Admin_UserManagement AddLastName(String data) {
		enterById(prop.getProperty("Adduser.Lastname.id"), data);
		return this;
		}
	
	public Admin_UserManagement clickCancel() throws InterruptedException {
		clickByXpath(prop.getProperty("Adduser.Cancel.Xpath"));
		driver.switchTo().defaultContent();
		return this;
	}
	
	public MainMenu clickMenu7() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu7.Xpath"));
		return new MainMenu();
		}
	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

	public MainMenu clickHumburger() throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return new MainMenu();
			}


	}
