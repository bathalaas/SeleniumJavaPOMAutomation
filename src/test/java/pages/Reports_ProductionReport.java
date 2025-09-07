package pages;



//div[text()='District/Route Saturation Report']
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Reports_ProductionReport extends PcorpWrappers{
	public Reports_ProductionReport() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Reports_ProductionReport Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public Reports_ProductionReport clickStartdate() throws InterruptedException {
		
		clickById(prop.getProperty("RSR.calStartDate.id"));
		return this;
		}
	
	public Reports_ProductionReport clickPreviousmonth() throws InterruptedException {
		
		clickById(prop.getProperty("RSR.previousMonth.id"));
		return this;
		}
	
	
	
	public Reports_ProductionReport pickDate() throws InterruptedException {
		clickByXpath(prop.getProperty("RSR.pickDate.Xpath"));
		return this;
		}
	
	public Reports_ProductionReport clickFilter() throws InterruptedException {
		clickById(prop.getProperty("RSR.filterButton.id"));
		return this;
		}
	
	public Reports_ProductionReports VerifyReportHeader(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsByXpath(prop.getProperty("PR.reportHeader.Xpath"), data);
	      driver.close();
	     switchToParentWindow();
		return new Reports_ProductionReports();
	}
	
	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

	}
