package testcases;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import wrappers.PcorpWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

//whether user is able to login successfully and navigate to all pages.

public class TC003_Verify_CustomerCommunicationLinks extends PcorpWrappers{
		
	@Test(dataProvider="fetchData")
public void login(String emailid,String password,String breadcrumbs1,String breadcrumbs2,String breadcrumbs3,String breadcrumbs4 ) throws InterruptedException, FileNotFoundException, IOException {

		new LoginPage()
		.enterUsername(emailid)
		.enterPassword(password)
		.clickLoginButton()
		.clickHumburger()
		.clickMenu4()
		.clickMenu41()
		//.Verifybreadcrumbs(breadcrumbs1)
     	.clickHumburger()
		.clickMenu4()
		.clickMenu42()
		.Verifybreadcrumbs(breadcrumbs2)
		.clickHumburger()
		.clickMenu4()
		.clickMenu43()
		.clickMenu431()
		.Verifybreadcrumbs(breadcrumbs3)
		.clickHumburger()
		.clickMenu4()
		.clickMenu43()
		.clickMenu432()
		.Verifybreadcrumbs(breadcrumbs4)
		.clickLogoff();
	}

@BeforeClass
public void beforeClass() {
dataSheetName="verifyLinks";
testCaseName="Menu: CustomerCommunication Pages";
testDescription="Check whether user is able to login successfully and navigate to all pages";
}
}
