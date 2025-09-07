package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;

import wrappers.PcorpWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

//whether user is able to login successfully and navigate to all pages.

public class TC0023_WorkAssignment_JobDetailsPageVerification extends PcorpWrappers {

	@Test(dataProvider = "fetchData")
	public void login(String emailid, String password, String breadcrumbs1, String breadcrumbs2, String breadcrumbs3,
			String breadcrumbs4, String threvalue) throws InterruptedException, FileNotFoundException, IOException {

		new LoginPage().enterUsername(emailid).enterPassword(password).clickLoginButton().clickHumburger().clickMenu3()
				.clickMenu30()
				//.Verifybreadcrumbs("Ops Center > Work Assignments")
				.ClickCallicon()
				.ClickClose()
				.clickLogoff();
	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName = "AddThresold";
		testCaseName = "WA_JobDetailsPageVerification";
		testDescription = "Check whether user is able to open all links and tabs";
	}
}
