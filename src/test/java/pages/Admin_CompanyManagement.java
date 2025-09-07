package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Admin_CompanyManagement extends PcorpWrappers{
	public Admin_CompanyManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Admin_CompanyManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public Admin_CompanyManagement clickView() throws InterruptedException {
		clickByXpath(prop.getProperty("CM.view.Xpath"));
		return this;
		}
	
	public Admin_CompanyManagement clickClose() throws InterruptedException {
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

	}
