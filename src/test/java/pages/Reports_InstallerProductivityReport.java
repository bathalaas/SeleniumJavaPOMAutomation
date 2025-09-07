package pages;



//div[text()='District/Route Saturation Report']
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Reports_InstallerProductivityReport extends PcorpWrappers{
	public Reports_InstallerProductivityReport() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Reports_InstallerProductivityReport Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public Reports_InstallerProductivityReport clickStartingFromDate() throws InterruptedException {
		
		clickById(prop.getProperty("IPR.calStartDate.id"));
		return this;
		}
	
	public Reports_InstallerProductivityReport clickPreviousmonth() throws InterruptedException {
		
		clickById(prop.getProperty("IPR.previousMonth.id"));
		return this;
		}
	
	
	
	public Reports_InstallerProductivityReport pickDate() throws InterruptedException {
		clickByXpath(prop.getProperty("RSR.pickDate.Xpath"));
		return this;
		}
	
	public Reports_InstallerProductivityReport clickFilter() throws InterruptedException {
		clickById(prop.getProperty("RSR.filterButton.id"));
		return this;
		}
	
	public Reports_ProductionReports VerifyReportHeader(String data) throws InterruptedException {
		verifyTextContainsByXpath(prop.getProperty("IPR.reportHeader.Xpath"), data);
	      driver.close();
	     switchToParentWindow();
		return new Reports_ProductionReports();
	}
	
	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

	}
