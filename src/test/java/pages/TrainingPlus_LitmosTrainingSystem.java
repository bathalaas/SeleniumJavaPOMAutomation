package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class TrainingPlus_LitmosTrainingSystem extends PcorpWrappers {
	public TrainingPlus_LitmosTrainingSystem() throws InterruptedException {
		if (!verifyTitle("PCORP-T Home"))
			;
		// Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		// Thread.sleep(5000);
	}

	public TrainingPlus_LitmosTrainingSystem Verifybreadcrumbs(String data) throws InterruptedException {
		// Thread.sleep(3000);
		verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}

}
