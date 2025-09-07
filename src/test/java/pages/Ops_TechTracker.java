package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Ops_TechTracker extends PcorpWrappers{
	public Ops_TechTracker() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Ops_TechTracker verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public Ops_TechTracker VerifyReportHeaderTDA(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextContainsByXpath(prop.getProperty("TDA.reportHeader.Xpath"), data);
		return this;
	}
	
	public Ops_TechTracker VerifyReportHeaderWIF(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextByXpath(prop.getProperty("WIF.reportHeader.Xpath"), data);
		return this;
	}
	
	public Ops_TechTracker VerifyReportHeaderSWS(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextByXpath(prop.getProperty("SWS.reportHeader.Xpath"), data);
		return this;
	}
	
	public Ops_TechTracker VerifyReportHeaderSA(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextByXpath(prop.getProperty("SA.reportHeader.Xpath"), data);
		return this;
	}
	
	public Ops_TechTracker VerifyReportHeaderPE2(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextByXpath(prop.getProperty("PE2.reportHeader.Xpath"), data);
		return this;
	}
	
	public Ops_TechTracker VerifyReportHeaderWA2(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextByXpath(prop.getProperty("WA2.reportHeader.Xpath"), data);
		return this;
	}
	
	public Ops_TechTracker VerifyTitleMeetingOrg(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTitle("meeting org");
	    closeCurrentBrowser();
	  	switchToParentWindow();
		return this;
	}
	
	
		public LoginPage clickLogoff() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Logoff.Xpath"));
		return new LoginPage();
		}
		
		
		
		public Ops_TechTracker clickCreateNewRouteBatch() throws InterruptedException {
			clickById(prop.getProperty("WA2.CreateNewRouteBatch.id"));
		   return this;
			}
		
		public Ops_TechTracker clickCancel() throws InterruptedException {
			clickByXpath(prop.getProperty("WA2.Cancel.Xpath"));
		   return this;
			}

		public MainMenu clickMenu3() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Menu3.Xpath"));
			return new MainMenu() ;
			}
		public MainMenu clickMenu30() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Menu30.Xpath"));
			return new MainMenu() ;
			}

		public MainMenu clickHumburger() throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return new MainMenu();
			}
}
