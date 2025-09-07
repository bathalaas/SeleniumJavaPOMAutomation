package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Ops_CallcenterEscallationWithoutQueue extends PcorpWrappers{
	public Ops_CallcenterEscallationWithoutQueue() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Ops_CallcenterEscallationWithoutQueue Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	
	public Ops_CallcenterEscallationWithoutQueue ClickProblemGroupDropdown() throws InterruptedException {
		clickById(prop.getProperty("CCEWQ.Group.id"));
		return this;
		}
	
	public Ops_CallcenterEscallationWithoutQueue ClickProblemGroupDropdownArrow() throws InterruptedException {
		clickById(prop.getProperty("CCEWQ.GroupDD.id"));
		Thread.sleep(8000);
		//new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.id("CCEWQ.Type.id")));
	    //	new WebDriverWait(driver, 60).until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_MainPH_RadAjaxLoadingPanel1ctl00_MainPH_dpProblemType")));
		//System.out.println("waiting for loader to go");
		//new WebDriverWait(driver, 60).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='raDiv']")));
		return this;
		}
	
	public Ops_CallcenterEscallationWithoutQueue SelectGroupValue() throws InterruptedException {
		clickByXpath(prop.getProperty("CCEWQ.Groupval.Xpath"));
		return this;
		}
		
	public Ops_CallcenterEscallationWithoutQueue ClickProblemTypeDropdown() throws InterruptedException {
		Thread.sleep(2000);
		clickById(prop.getProperty("CCEWQ.Type.id"));
		Thread.sleep(7000);
		return this;
		}
	
	public Ops_CallcenterEscallationWithoutQueue ClickProblemTypeDropdownArrow() throws InterruptedException {
		clickById(prop.getProperty("CCEWQ.TypeDD.id"));
		return this;
		}
	
	
	
	public Ops_CallcenterEscallationWithoutQueue SelectTypeValue() throws InterruptedException {
		clickById(prop.getProperty("CCEWQ.Type.id"));
		System.out.println("clicked once again");
		clickByXpath(prop.getProperty("CCEWQ.Typeval.Xpath"));
		System.out.println("super");
		return this;
		}
	
	public Ops_CallcenterEscallationWithoutQueue ClickSearch() throws InterruptedException {
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
