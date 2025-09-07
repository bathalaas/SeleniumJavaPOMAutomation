package pages;



//div[text()='District/Route Saturation Report']
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Reports_ProductionDetailReport extends PcorpWrappers{
	public Reports_ProductionDetailReport() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Reports_ProductionDetailReport Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public Reports_ProductionDetailReport clickStartdate() throws InterruptedException {
		
		clickById(prop.getProperty("RSR.calStartDate.id"));
		return this;
		}
	
	public Reports_ProductionDetailReport clickPreviousmonth() throws InterruptedException {
		
		clickById(prop.getProperty("RSR.previousMonth.id"));
		return this;
		}
	
	
	
	public Reports_ProductionDetailReport pickDate() throws InterruptedException {
		clickByXpath(prop.getProperty("RSR.pickDate.Xpath"));
		return this;
		}
	
	public Reports_ProductionDetailReport clickFilter() throws InterruptedException {
		clickById(prop.getProperty("RSR.filterButton.id"));
		return this;
		}
	
	public Reports_ProductionReports VerifyReportHeader(String data) throws InterruptedException {
		//Thread.sleep(3000);
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("PDR.reportHeader.Xpath"))));
		  verifyTextContainsByXpath(prop.getProperty("PDR.reportHeader.Xpath"), data);
	      driver.close();
	     switchToParentWindow();
		return new Reports_ProductionReports();
	}
	
	
	public Reports_ProductionReports VerifyReportHeaderIR(String data) throws InterruptedException {
		//Thread.sleep(3000);
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("IR.reportHeader.Xpath"))));
		  verifyTextContainsByXpath(prop.getProperty("IR.reportHeader.Xpath"), data);
	      driver.close();
	     switchToParentWindow();
		return new Reports_ProductionReports();
	}
	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

	}
