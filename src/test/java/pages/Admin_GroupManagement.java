package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Admin_GroupManagement extends PcorpWrappers{
	public Admin_GroupManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Admin_GroupManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
		
	public MainMenu clickMenu7() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu7.Xpath"));
		return new MainMenu();
		}
	
	public LoginPage clickLogoff() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Logoff.Xpath"));
		return new LoginPage();
		}

	
	public Admin_GroupManagement clickAddGroup() throws InterruptedException {
		clickByXpath(prop.getProperty("GroupManagement.AddGroup.Xpath"));
		return this;
		}
		
	public Admin_GroupManagement clickClose() throws InterruptedException {
		clickByXpath(prop.getProperty("AddGroupDetails.Close.Xpath"));
		//Thread.sleep(2000);
		return this;
	}

	}
