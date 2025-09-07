package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class CC_MBM_ManageMailerBatch extends PcorpWrappers{
	public CC_MBM_ManageMailerBatch() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public CC_MBM_ManageMailerBatch Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}
	
	public MainMenu clickMenu2() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu2.Xpath"));
		return new MainMenu();
	
	}
	
	
	public CC_MBM_ManageMailerBatch clickMenu3() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3.Xpath"));
		return this;
	
	}

	public MainMenu clickMenu4() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu4.Xpath"));
		return new MainMenu();
	
	}
	
	public CC_MBM_ManageMailerBatch clickMenu41() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu41.Xpath"));
		return new CC_MBM_ManageMailerBatch();
	
	}

		public CC_MBM_ManageMailerBatch clickSignInButton1() throws InterruptedException  {
			clickByXpath(prop.getProperty("Login.SignInButton.Xpath"));
			Thread.sleep(2000);
			return this;
			}

		
		public CC_MBM_ManageMailerBatch switchback() throws InterruptedException {
			Thread.sleep(2000);
			switchToParentWindow();
			return new CC_MBM_ManageMailerBatch();			
			}

		public CC_MBM_ManageMailerBatch clickSearch1() throws InterruptedException {
			  // Gets control of javascript engine to execute scripts
		    JavascriptExecutor js = ((JavascriptExecutor) driver);
		  
		    //Scrolls to top of page
		    js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			
		    Thread.sleep(5000);
			
			clickByXpath(prop.getProperty("Home.ArizonaSearch.Xpath"));
			return this;
		}

		public CC_MBM_ManageMailerBatch clickSignOut() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Signout.Xpath"));
			return new CC_MBM_ManageMailerBatch();
		}

		public CC_MBM_ManageMailerBatch clickFindSearchDisabled() {
			clickByXpath(prop.getProperty("Home.FindsearchDisabled.Xpath"));
			return this;
		}

}
