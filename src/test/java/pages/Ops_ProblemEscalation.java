package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Ops_ProblemEscalation extends PcorpWrappers {
	public Ops_ProblemEscalation() throws InterruptedException {
		if (!verifyTitle("PCORP-T Home"))
			;
		// Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		// Thread.sleep(5000);
	}

	public Ops_ProblemEscalation Verifybreadcrumbs(String data) throws InterruptedException {
		verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}

	public Ops_ProblemEscalation clickProblemstatusDropdown(String value) throws InterruptedException {
		selectById(prop.getProperty("ProblemEscalation.Status.id"), value);
		return this;
	}

	public Ops_ProblemEscalation selectCheckAll() throws InterruptedException {
		clickByXpath(prop.getProperty("ProblemEscalation.Checkall.Xpath"));
		return this;
	}

	public Ops_ProblemEscalation clickProblemStatus() throws InterruptedException {
		clickByXpath(prop.getProperty("PE.ProblemStatus.Xpath"));
		return this;
	}

	public Ops_ProblemEscalation clickSearch() throws InterruptedException {
		clickById(prop.getProperty("All.Search.id"));
		return this;
	}

	public Ops_ProblemEscalation clickApply() throws InterruptedException {
		clickById(prop.getProperty("CCD.search.id"));
		return this;
	}

	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
	}

	public MainMenu clickMenu3() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3.Xpath"));
		return new MainMenu();
	}

	public Ops_ProblemEscalation VerifyPE_FormBreadCrumb(String data) {
		verifyTextContainsByXpath(prop.getProperty("PE_Form.breadcrumbs.Xpath"), data);
		return this;
	}
}
