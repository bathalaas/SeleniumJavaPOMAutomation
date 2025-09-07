package pages;



//div[text()='District/Route Saturation Report']
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Reports_ProductQAReport extends PcorpWrappers{
	public Reports_ProductQAReport() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Reports_ProductQAReport Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public Reports_ProductQAReport clickStartdate() throws InterruptedException {
		
		clickById(prop.getProperty("PQR.calStartDate.id"));
		return this;
		}
	
	public Reports_ProductQAReport clickPreviousmonth() throws InterruptedException {
		clickById(prop.getProperty("PQR.previousMonth.id"));
		return this;
		}
	
		public Reports_ProductQAReport pickDate() throws InterruptedException {
		clickByXpath(prop.getProperty("RSR.pickDate.Xpath"));
		return this;
		}
	
	public Reports_ProductQAReport clickFilterBtn() throws InterruptedException {
		clickById(prop.getProperty("PQR.filterButton.id"));
		Thread.sleep(3000);
		return this;
		}
	
	public Reports_ProductionReports VerifyReportHeader(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsByXpath(prop.getProperty("PQR.reportHeader.Xpath"), data);
	      driver.close();
	     switchToParentWindow();
		return new Reports_ProductionReports();
	}
	
	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

	}
