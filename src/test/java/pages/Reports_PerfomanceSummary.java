package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Reports_PerfomanceSummary extends PcorpWrappers{
	public Reports_PerfomanceSummary() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Reports_PerfomanceSummary Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	
	public Reports_PerfomanceSummary ClickInstallationPerformanceSummaryReportTab() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.IPSR.Xpath"));
		return this;
		}
	
	public Reports_PerfomanceSummary ClickInstallationPerformanceSummaryTab() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.IPS.Xpath"));
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

	public Reports_PerfomanceSummary clickHumburger() throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return this;
	}

	}
