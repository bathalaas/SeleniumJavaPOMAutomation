package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class CourseMapper extends PcorpWrappers{
	public CourseMapper() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public CourseMapper Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	
	public CourseMapper ClickTabRoleCertificationCourses() throws InterruptedException {
		clickByXpath(prop.getProperty("CM.RoleCertificationCourses.Xpath"));
		return this;
		}
	
	public CourseMapper ClickTabSkillCertificationCourses() throws InterruptedException {
		clickByXpath(prop.getProperty("CM.SkillCertificationCourses.Xpath"));
		return this;
		}
	
	public CourseMapper EditQAManager() throws InterruptedException {
		clickByXpath(prop.getProperty("CMRS.QAManager.Xpath"));
		return this;
		}
	
	
	public CourseMapper clickCheckbox() throws InterruptedException {
		switchToFrame();
		clickByXpath(prop.getProperty("QAM.Checkbox.Xpath"));
	return this;
	}
	
	
	public CourseMapper clickCancel() throws InterruptedException {
		clickByXpath(prop.getProperty("QAM.Cancel.Xpath"));
		driver.switchTo().defaultContent();
		return this;
	}

	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

			}
