package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PcorpWrappers;

public class TC019_SecurityLevel_PrintCompanyUser extends PcorpWrappers {
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
	requiredData="PrintCompanyUser";
	testCaseName="Security access:Print Company User";
	testDescription="Check whether Print Company User is able to Security access";
	}
}
