package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.PcorpWrappers;

public class TC011_SecurityLevel_SupervisorUser extends PcorpWrappers {
	
	@Test(dataProvider="fetchData_UserRoles", priority = 0, description = "Security access for Supervisor")
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
		    .VerifyRoles("Supervisor",Roles)
		    .clickLogoff();
	}
	
	@BeforeClass
	public void beforeClass() {
	dataSheetName="UserRoles";
	requiredData="Supervisor";
	testCaseName="Security access:- Supervisor";
	testDescription="Check whether Supervisor is able to Security access";
	}
}
