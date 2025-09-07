package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class TrainingPlus_UserTrainingCompliance extends PcorpWrappers {
	public TrainingPlus_UserTrainingCompliance() throws InterruptedException {
		if (!verifyTitle("PCORP-T Home"))
			;
		// Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		// Thread.sleep(5000);
	}

	public TrainingPlus_UserTrainingCompliance Verifybreadcrumbs(String data) throws InterruptedException {
		// Thread.sleep(3000);
		verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}

	public TrainingPlus_UserTrainingCompliance SelectSkillCompliance(String data) {
		selectById(prop.getProperty("UserCompliance.SkillCompliance.id"), data);
		return this;
	}

	public TrainingPlus_UserTrainingCompliance ClickSearch() throws InterruptedException {
		clickById(prop.getProperty("All.Search.id"));
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

	public TrainingPlus_UserTrainingCompliance clickHumburger() throws InterruptedException {
		clickById(prop.getProperty("Home.Humburger.id"));
		return this;
	}

}
