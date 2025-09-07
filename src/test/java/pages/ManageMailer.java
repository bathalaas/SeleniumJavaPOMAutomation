package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class ManageMailer extends PcorpWrappers{
	public ManageMailer() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public ManageMailer Verifybreadcrumbs(String data) throws InterruptedException {
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
	
	
	public ManageMailer clickMenu3() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3.Xpath"));
		return this;
	
	}

	public MainMenu clickMenu4() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu4.Xpath"));
		return new MainMenu();
	
	}
	
	public ManageMailer clickMenu41() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu41.Xpath"));
		return new ManageMailer();
	
	}

		public ManageMailer clickSignInButton1() throws InterruptedException  {
			clickByXpath(prop.getProperty("Login.SignInButton.Xpath"));
			Thread.sleep(2000);
			return this;
			}

		
		public ManageMailer switchback() throws InterruptedException {
			Thread.sleep(2000);
			switchToParentWindow();
			return new ManageMailer();			
			}

		public ManageMailer clickSearch1() throws InterruptedException {
			  // Gets control of javascript engine to execute scripts
		    JavascriptExecutor js = ((JavascriptExecutor) driver);
		  
		    //Scrolls to top of page
		    js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			
		    Thread.sleep(5000);
			
			clickByXpath(prop.getProperty("Home.ArizonaSearch.Xpath"));
			return this;
		}

		public ManageMailer clickSignOut() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Signout.Xpath"));
			return new ManageMailer();
		}

		public ManageMailer clickFindSearchDisabled() {
			clickByXpath(prop.getProperty("Home.FindsearchDisabled.Xpath"));
			return this;
		}

}
