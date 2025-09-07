package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class QABatchManagement extends PcorpWrappers{
	public QABatchManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public QABatchManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	
	public QABatchManagement ClickReadQA() throws InterruptedException {
		clickByXpath(prop.getProperty("QABM.ReadQA.Xpath"));
		return this;
		}
	
	public QABatchManagement ClickImageQA() throws InterruptedException {
		clickByXpath(prop.getProperty("QABM.ImageQA.Xpath"));
		return this;
		}
		
	public QABatchManagement ClickSubbu() throws InterruptedException {
		switchToLastWindow();
		clickByXpath(prop.getProperty("ReadQA.Assignments.Xpath"));
		closeCurrentBrowser();
		switchToParentWindow();
		return this;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public QABatchManagement ClickTabSkillCertificationCourses() throws InterruptedException {
		clickByXpath(prop.getProperty("CM.SkillCertificationCourses.Xpath"));
		return this;
		}
	
	public QABatchManagement EditQAManager() throws InterruptedException {
		clickByXpath(prop.getProperty("CMRS.QAManager.Xpath"));
		return this;
		}
	
	
	public QABatchManagement clickCheckbox() throws InterruptedException {
		switchToFrame();
		clickByXpath(prop.getProperty("QAM.Checkbox.Xpath"));
	return this;
	}
	
	
	public QABatchManagement clickCancel() throws InterruptedException {
		clickByXpath(prop.getProperty("QAM.Cancel.Xpath"));
		driver.switchTo().defaultContent();
		return this;
	}

	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

			}
