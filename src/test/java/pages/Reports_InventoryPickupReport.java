package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Reports_InventoryPickupReport extends PcorpWrappers{
	public Reports_InventoryPickupReport() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
	}
	
	public Reports_InventoryPickupReport Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public Reports_InventoryPickupReport Selectwarehouse(String data) throws InterruptedException {
		selectById(prop.getProperty("IPR.Warehousedd.id"), data);
		return this;
		}
	
	public Reports_InventoryPickupReport ClickFilterbutton() throws InterruptedException {
		clickById(prop.getProperty("IPR.Filterbutton.id"));
		return this;
		}
	
	public Reports_InventoryPickupReport VerifyReportHeader(String data) throws InterruptedException {
        verifyTextContainsByXpath(prop.getProperty("IPR.ReportHeader.Xpath"), data);
		return this;
	}
	
	public MainMenu clickMenu8() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8.Xpath"));
		return new MainMenu();
		}
	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

	}
