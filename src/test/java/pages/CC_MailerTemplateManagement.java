package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class CC_MailerTemplateManagement extends PcorpWrappers{
	public CC_MailerTemplateManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public CC_MailerTemplateManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public MainMenu clickMenu2() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu2.Xpath"));
		return new MainMenu();
		}
		
	public MainMenu clickMenu4() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu4.Xpath"));
		return new MainMenu();
	
	}
	
	public CC_MailerTemplateManagement clickMenu41() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu41.Xpath"));
		return new CC_MailerTemplateManagement();
	
	}

		public CC_MailerTemplateManagement clickSignInButton1() throws InterruptedException  {
			clickByXpath(prop.getProperty("Login.SignInButton.Xpath"));
			Thread.sleep(2000);
			return this;
			}

		
		public CC_MailerTemplateManagement switchback() throws InterruptedException {
			Thread.sleep(2000);
			switchToParentWindow();
			return new CC_MailerTemplateManagement();			
			}

		public CC_MailerTemplateManagement clickSearch1() throws InterruptedException {
			  // Gets control of javascript engine to execute scripts
		    JavascriptExecutor js = ((JavascriptExecutor) driver);
		  
		    //Scrolls to top of page
		    js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			
		    Thread.sleep(5000);
			
			clickByXpath(prop.getProperty("Home.ArizonaSearch.Xpath"));
			return this;
		}

		public CC_MailerTemplateManagement clickSignOut() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Signout.Xpath"));
			return new CC_MailerTemplateManagement();
		}

		public CC_MailerTemplateManagement clickFindSearchDisabled() {
			clickByXpath(prop.getProperty("Home.FindsearchDisabled.Xpath"));
			return this;
		}

		public MainMenu clickHumburger() throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return new MainMenu();
		}

		public CC_MailerTemplateManagement clickNextButton() throws InterruptedException {
			clickByXpath(prop.getProperty("Acc.nextbutton.Xpath"));
			return this;
		
		}

}
