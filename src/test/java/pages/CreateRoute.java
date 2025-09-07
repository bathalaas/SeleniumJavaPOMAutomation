package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class CreateRoute extends PcorpWrappers{
	public CreateRoute() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public CreateRoute Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public MainMenu clickMenu2() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu2.Xpath"));
		return new MainMenu();
	
	}
	
	public CreateRoute clickMenu3() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3.Xpath"));
		return this;
	
	}

	public MainMenu clickMenu4() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu4.Xpath"));
		return new MainMenu();
	
	}
	
	public CreateRoute clickMenu41() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu41.Xpath"));
		return new CreateRoute();
	
	}

		

}
