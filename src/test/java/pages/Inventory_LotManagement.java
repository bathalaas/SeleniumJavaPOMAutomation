package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Inventory_LotManagement extends PcorpWrappers{
	public Inventory_LotManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Inventory_LotManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	
		public Inventory_LotManagement clickAddLot() throws InterruptedException {
						clickById(prop.getProperty("All.Add.id"));
		return this;
		}
		
		
		public Inventory_LotManagement clickCancel() throws InterruptedException {
			switchToFrame();
			clickByXpath(prop.getProperty("All.Cancel.Xpath"));
			driver.switchTo().defaultContent();
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

		public Inventory_LotManagement clickHumburger()throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return this;
		}
			}




