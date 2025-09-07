package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PcorpWrappers;

public class TC022_SecurityLevel_OperationsManager extends PcorpWrappers  {
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
		    .VerifyRoles("OperationsManager",Roles)
		    .clickLogoff();
	}
	
	@BeforeClass
	public void beforeClass() {
	dataSheetName="UserRoles";
	requiredData="OperationsManager";
	testCaseName="Security access:OperationsManager";
	testDescription="Check whether OperationsManager is able to Security access for Page level";
	}
}
