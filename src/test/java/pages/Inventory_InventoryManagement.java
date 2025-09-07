package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Inventory_InventoryManagement extends PcorpWrappers{
	public Inventory_InventoryManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Inventory_InventoryManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	
	public Inventory_InventoryManagement ClickInstallersHeader() throws InterruptedException {
		clickByXpath(prop.getProperty("IM.Installersheader.Xpath"));
		return this;
		}
	
	public Inventory_InventoryManagement ClickAnInstaller() throws InterruptedException {
		clickByXpath(prop.getProperty("IM.Installers.Xpath"));
		return this;
		}
		
	public Inventory_InventoryManagement Verifyinstaller(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyAttributeContainsById(prop.getProperty("IM.Assignto.id"), data);
		return this;
	}
	
	public Inventory_InventoryManagement VerifyCount(String data) throws InterruptedException {
		verifyTextByXpath(prop.getProperty("IM.Recordcount.Xpath"), data);
	return this;
	}

	
		public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

		public MainMenu clickMenu2() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Menu2.Xpath"));
			return new MainMenu() ;
			}

		public Inventory_InventoryManagement clickHumburger() throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return this;
			}
}
