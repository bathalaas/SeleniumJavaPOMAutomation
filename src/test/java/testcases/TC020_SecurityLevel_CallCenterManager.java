package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PcorpWrappers;

public class TC020_SecurityLevel_CallCenterManager extends PcorpWrappers {
	@Test(dataProvider="fetchData_UserRoles")
	public void login(String emailid,String password,String Roles) throws InterruptedException, FileNotFoundException, IOException {

			new LoginPage()
			.enterUsername(emailid)
			.enterPassword(password)
			.clickLoginButton()
			.clickHumburger()
		    .SecurityAccess(Roles)
		    .clickLogoff();
	}
	@BeforeClass
	public void beforeClass() {
	dataSheetName="UserRoles";
	requiredData="CallCenterManager";
	testCaseName="Security access:Call Center Manager";
	testDescription="Check whether Call Center Manager is able to Security access";
	}
}
