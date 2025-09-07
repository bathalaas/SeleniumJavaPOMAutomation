package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Ops_DayRouting extends PcorpWrappers{
	public Ops_DayRouting() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Ops_DayRouting verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	
	public Ops_DayRouting clickAddLot() throws InterruptedException {
		clickById(prop.getProperty("All.Add.id"));
		switchToLastWindow();
		return this;
}
	
	
	public Ops_DayRouting clickclose() throws InterruptedException {
		clickById(prop.getProperty("Dayrouting.Close.id"));
	   // closeCurrentBrowser();
		switchToParentWindow();
		return this;
		}
	
		
	public Ops_DayRouting ClickSearch() throws InterruptedException {
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
