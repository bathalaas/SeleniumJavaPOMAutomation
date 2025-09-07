package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Inventory_Consumables extends PcorpWrappers{
	public Inventory_Consumables() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Inventory_Consumables Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public MainMenu clickMenu2() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu2.Xpath"));
		return new MainMenu() ;
		}
		
	public Inventory_Consumables clickEdit() throws InterruptedException {
	        clickById(prop.getProperty("All.Edit.id"));
		return this;
		}
		
		
		public Inventory_Consumables clickCancel() throws InterruptedException {
					clickById(prop.getProperty("Consumables.Cancel.id"));
		return this;
		}


		
		public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

		public Inventory_Consumables clickHumburger() throws InterruptedException{
			clickById(prop.getProperty("Home.Humburger.id"));
			return this;
		}
	
		
			}




