package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Inventory_StoreManagement extends PcorpWrappers{
	public Inventory_StoreManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Inventory_StoreManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public MainMenu clickMenu2() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu2.Xpath"));
		return new MainMenu() ;
		}
		
	public Inventory_StoreManagement clickAddnewFacility() throws InterruptedException {
		clickByXpath(prop.getProperty("Store.AddNewFacility.Xpath"));
		return this;
		}
		
		
		public Inventory_StoreManagement clickClose() throws InterruptedException {
					clickByXpath(prop.getProperty("Store.Close.Xpath"));
		return this;
		}


		
		public LoginPage clickLogoff() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Logoff.Xpath"));
		return new LoginPage();
		}
	
		
		
			}




