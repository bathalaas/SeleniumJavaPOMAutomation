package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Ops_WorkAssignment extends PcorpWrappers{
	public Ops_WorkAssignment() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Ops_WorkAssignment Verifybreadcrumbs(String data) throws InterruptedException {
	       verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	
	public Ops_WorkAssignment clickShowAdvanced() throws InterruptedException {
		clickById(prop.getProperty("WorkAssignments.Advanced.id"));
		return this;
		}
		
		public Ops_WorkAssignment ClickSearch() throws InterruptedException {
		clickById(prop.getProperty("All.Search.id"));
		return this;
		}
		
		public Ops_WorkAssignment ClickCallicon() throws InterruptedException {
			clickById(prop.getProperty("WorkAssignments.Logcall.id"));
			return this;
			}
		
		
		public Ops_WorkAssignment ClickClose() throws InterruptedException {
			clickByXpath(prop.getProperty("CCL.Close.Xpath"));
			switchToParentWindow();
			return this;
			}

		public Ops_WorkAssignment ClickAddress() throws InterruptedException {
			clickByXpath(prop.getProperty("WorkAssignments.Address.Xpath"));
			switchToLastWindow();
			return this;
			}

		public Ops_WorkAssignment ClickCommunicationTab() throws InterruptedException {
			clickByXpath(prop.getProperty("WorkAssignments.commtab.Xpath"));
			return this;
			}

		public Ops_WorkAssignment ClickPhoneicon() throws InterruptedException {
			clickByXpath(prop.getProperty("WorkAssignments.commtab.Xpath"));
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
