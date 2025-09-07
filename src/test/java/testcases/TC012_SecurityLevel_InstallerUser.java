package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.PcorpWrappers;

public class TC012_SecurityLevel_InstallerUser extends PcorpWrappers {
	@Test(dataProvider="fetchData_UserRoles",priority = 1,description = "Security access:Installer")
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
	//pagea="UserAccessPages";
	requiredData="Installer";
	testCaseName="Security access:Installer";
	testDescription="Check whether Installer is able to Security access";
	}
}

