package testcases;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;

import wrappers.PcorpWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

//whether user is able to login successfully and navigate to all pages.

public class TC006_Administration_MenuPages extends PcorpWrappers{
	
	@Test(dataProvider="fetchData")
public void login(String emailid,String password,String breadcrumbs1,String breadcrumbs2,String breadcrumbs3,String breadcrumbs4,String threvalue  ) throws InterruptedException, FileNotFoundException, IOException {

		new LoginPage()
		.enterUsername(emailid)
		.enterPassword(password)
		.clickLoginButton()
		.clickHumburger()
		.clickMenu7()
		.clickMenu71()
		.Verifybreadcrumbs("Administration > User Management")
		//.clickAdduser()
		//.AddFirstName("Aclara")
		//.AddLastName("QA Team")
		//.clickCancel()
		.clickHumburger()
		.clickMenu7()
		.clickMenu73()
		.Verifybreadcrumbs("Administration > Device Management")
		.clickAdddevice()
		.clickCancel()
		.clickHumburger()
		.clickMenu7()
		.clickMenu74()
		.Verifybreadcrumbs("Administration > Company Management")
		.clickView()
		.clickClose()
		.clickHumburger()
		.clickMenu7()
		.clickMenu75()
	    .Verifybreadcrumbs("Administration > Skillset Management")
		.clickAddSkillset()
		.clickCancel()
		.clickHumburger()
		.clickMenu7()
		.clickMenu76()
		.Verifybreadcrumbs("Administration > Application Management")
		.clickAddNew()
		.clickCancel()
		.clickHumburger()
		.clickMenu7()
		.clickMenu77()
		.Verifybreadcrumbs("Administration > Asset Type Management")
		.clickAddNew()
		.clickCancel()
		.clickHumburger()
		.clickMenu7()
		.clickMenu78()
		.Verifybreadcrumbs("Administration > Change Installer Location")
//		.clickHumburger()
//		.clickMenu7()
//		.clickMenu72()
//		.clickAddGroup()
//		.clickClose()
		.clickLogoff();
		
	}
@BeforeClass
public void beforeClass() {
dataSheetName="AddThresold";
testCaseName="Menu:Administration Pages";
testDescription="Check whether user is able to open all reports and can export";
}
}
