package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PcorpWrappers;

public class TC023_DashboardPages extends PcorpWrappers {

	@Test(dataProvider="fetchData")
public void login(String emailid,String password,String breadcrumbs1,String breadcrumbs2,String breadcrumbs3,String breadcrumbs4,String threvalue  ) throws InterruptedException, FileNotFoundException, IOException {

		new LoginPage()
		.enterUsername(emailid)
		.enterPassword(password)
		.clickLoginButton()
		.clickHumburger()
		.clickDashboard()
		.clickPMDashboard()
		.verifyLastUpdated()
		.clickHumburger()
		.clickDashboard()
		.clickPEDashboard()
		.verifyLastUpdated()
		.clickHumburger()
		.clickDashboard()
		.clickUtilityDashboard()
		.verifyLastUpdated()
		.clickHumburger()
		.clickDashboard()
		.clickSupervisorPerformanceDashboard()
		.clickLogoff();
	}
	@BeforeClass
	public void beforeClass() {
	dataSheetName="AddThresold";
	testCaseName="Dashboard All pages";
	testDescription="Check whether user is able to open all links and tabs";
	}

}
