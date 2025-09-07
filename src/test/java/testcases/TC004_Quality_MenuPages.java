package testcases;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;

import wrappers.PcorpWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

//whether user is able to login successfully and navigate to all pages.

public class TC004_Quality_MenuPages extends PcorpWrappers{
	
	@Test(dataProvider="fetchData")
public void login(String emailid,String password,String breadcrumbs1,String breadcrumbs2,String breadcrumbs3,String breadcrumbs4,String threvalue  ) throws InterruptedException, FileNotFoundException, IOException {

		new LoginPage()
		.enterUsername(emailid)
		.enterPassword(password)
		.clickLoginButton()
		.clickHumburger()
		.clickQualityModule()
		.clickMenu51()
		.Verifybreadcrumbs("Quality > Product QA Batch Management")
		.ClickReadQA()
		.click1QA()
		.ClickImageQA()
		.click1QA()
				.clickHumburger()
				.clickQualityModule()
				.clickDataQuality()
				//.Verifybreadcrumb("Quality > QA Meter Reads Review")
				.clickHumburger()
				.clickQualityModule()
				.ClickWorkmanshipQuality()
				//.Verifybreadcrumbs("Quality > QA Image Review")
				.clickHumburger()
				.clickQualityModule()
				.ClickSuperviserReview()
		.clickLogoff()
	;		
	}
@BeforeClass
public void beforeClass() {
dataSheetName="AddThresold";
testCaseName="Menu: Quality Module's Pages";
testDescription="Check whether user is able to open all links and tabs";
}
}
