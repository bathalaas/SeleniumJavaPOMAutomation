package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class TrainingPlus_CourseMapper extends PcorpWrappers{
	public TrainingPlus_CourseMapper() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
		//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public TrainingPlus_CourseMapper Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	
	public TrainingPlus_CourseMapper ClickTabRoleCertificationCourses() throws InterruptedException {
		clickByXpath(prop.getProperty("CM.RoleCertificationCourses.Xpath"));
		return this;
		}
	
	public TrainingPlus_CourseMapper ClickTabSkillCertificationCourses() throws InterruptedException {
		clickByXpath(prop.getProperty("CM.SkillCertificationCourses.Xpath"));
		return this;
		}
	
	public TrainingPlus_CourseMapper EditQAManager() throws InterruptedException {
		clickByXpath(prop.getProperty("CMRS.QAManager.Xpath"));
		switchToFrame();
		return this;
		}
		
	public TrainingPlus_CourseMapper clickCheckbox() throws InterruptedException {
		
	if (!verifyTextByXpath("//div[text()='No records to display.']", "No records to display."))
			clickByXpath(prop.getProperty("QAM.Checkbox.Xpath"));
	return this;
	}
	
	
	public TrainingPlus_CourseMapper clickCancel() throws InterruptedException {
		clickByXpath(prop.getProperty("QAM.Cancel.Xpath"));
		driver.switchTo().defaultContent();
		return this;
	}

	public MainMenu clickMenu6() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu6.Xpath"));
		return new MainMenu();
		}
	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

	public MainMenu clickHumburger() throws InterruptedException {
		clickById(prop.getProperty("Home.Humburger.id"));
		return new MainMenu();
	}
	

	}
