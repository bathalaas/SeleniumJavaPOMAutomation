package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PcorpWrappers;

public class TC013_SecurityLevel_UtilityManagerUser extends PcorpWrappers{
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
	    .VerifyRoles("Utility Manager", Roles)
		.clickLogoff();
	}
	@BeforeClass
	public void beforeClass() {
	dataSheetName="UserRoles";
	requiredData="UtilityManager";
	testCaseName="Security access:Utility Manager";
	testDescription="Check whether Utility Manager is able to Security access";
	}
}


