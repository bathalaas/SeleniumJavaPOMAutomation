package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Quality_QABatchManagement extends PcorpWrappers{
	public Quality_QABatchManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Quality_QABatchManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	public Quality_QABatchManagement Verifybreadcrumb(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextContainsById(prop.getProperty("All.QAMeterReadsReview.xpath"), data);
		return this;
	}
	
	
	public Quality_QABatchManagement ClickReadQA() throws InterruptedException {
		clickByXpath(prop.getProperty("QABM.ReadQA.Xpath"));
		return this;
		}
	
	public Quality_QABatchManagement ClickImageQA() throws InterruptedException {
		clickByXpath(prop.getProperty("QABM.ImageQA.Xpath"));
		return this;
		}
		
	public Quality_QABatchManagement click1QA() throws InterruptedException {
		switchToLastWindow();
		clickByXpath(prop.getProperty("ReadQA.Assignments.Xpath"));
		closeCurrentBrowser();
		switchToParentWindow();
		return this;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Quality_QABatchManagement ClickTabSkillCertificationCourses() throws InterruptedException {
		clickByXpath(prop.getProperty("CM.SkillCertificationCourses.Xpath"));
		return this;
		}
	
	public Quality_QABatchManagement EditQAManager() throws InterruptedException {
		clickByXpath(prop.getProperty("CMRS.QAManager.Xpath"));
		return this;
		}
	
	
	public Quality_QABatchManagement clickCheckbox() throws InterruptedException {
		switchToFrame();
		clickByXpath(prop.getProperty("QAM.Checkbox.Xpath"));
	return this;
	}
	
	
	public Quality_QABatchManagement clickCancel() throws InterruptedException {
		clickByXpath(prop.getProperty("QAM.Cancel.Xpath"));
		driver.switchTo().defaultContent();
		return this;
	}

	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

    public MainMenu clickHumburger()throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return new MainMenu();

    }
}
