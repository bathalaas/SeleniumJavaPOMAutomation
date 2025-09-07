package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Ops_CallcenterEscallations extends PcorpWrappers{
	public Ops_CallcenterEscallations() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
		//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Ops_CallcenterEscallations verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
			
	public Ops_CallcenterEscallations clickSearch() throws InterruptedException {
		clickById(prop.getProperty("CCEWQ.Search.id"));
		return this;
		}
		
		public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

		public MainMenu clickMenu3() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Menu3.Xpath"));
			return new MainMenu() ;
			}

		public MainMenu clickHumburger() throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return new MainMenu();
			}
}
