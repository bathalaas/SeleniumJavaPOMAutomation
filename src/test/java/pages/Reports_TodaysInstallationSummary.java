package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Reports_TodaysInstallationSummary extends PcorpWrappers{
	public Reports_TodaysInstallationSummary() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Reports_TodaysInstallationSummary Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	
	public Reports_TodaysInstallationSummary ClickProductstatusTab() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.Prodstatus.Xpath"));
		return this;
		}
	
	public Reports_TodaysInstallationSummary ClickInstallationsummaryTab() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.InsSummary.Xpath"));
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

	public Reports_TodaysInstallationSummary clickHumburger() throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return this;
	}

	}
