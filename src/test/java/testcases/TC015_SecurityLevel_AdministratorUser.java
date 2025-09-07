package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PcorpWrappers;

public class TC015_SecurityLevel_AdministratorUser extends PcorpWrappers {
	@Test(dataProvider="fetchData_UserRoles")
	public void login(String emailid,String password, String Roles) throws InterruptedException, FileNotFoundException, IOException {

			new LoginPage()
			.enterUsername(emailid)
			.enterPassword(password)
			.clickLoginButton()
			.clickHumburger()
			.clickAdminiStration()
		    .userManagement()
		    .userName()
		    .ClickSearchAdmin()
		    .VerifyRoles("Administrator", Roles)
		    .clickLogoff();
	}
	
	@BeforeClass
	public void beforeClass() {
	dataSheetName="UserRoles";
	requiredData="Administrator";
	testCaseName="Security access:Administrator";
	testDescription="Check whether Administrator is able to Security access for Page level";
	}
}
