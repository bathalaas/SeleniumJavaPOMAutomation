package testcases;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;

import wrappers.PcorpWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

//whether user is able to login successfully and navigate to all pages.

public class TC001_InventoryManagement extends PcorpWrappers{
	
	@Test(dataProvider="fetchData")
public void login(String emailid,String password,String breadcrumbs1,String breadcrumbs2,String breadcrumbs3,String breadcrumbs4,String threvalue  ) throws InterruptedException, FileNotFoundException, IOException {

		new LoginPage()
		.enterUsername(emailid)
		.enterPassword(password)
		.clickLoginButton().clickHumburger()
		.clickMenu2()
		.clickMenu21()
		.Verifybreadcrumbs("Inventory > Inventory Management")
		.ClickInstallersHeader()
		.ClickAnInstaller()
		.Verifyinstaller("SubbuBathala Hubbell")
//		.VerifyCount("28")
		.clickHumburger()
		.clickMenu2()
		.clickMenu22()
		.Verifybreadcrumbs("Inventory > Lot Management")
		.clickAddLot()
		.clickCancel()
		.clickHumburger()
		.clickMenu2()
		.clickMenu24()
//		.Verifybreadcrumbs("Inventory > Add Consumables")
//		.clickEdit()
//		.clickCancel()
//		.clickHumburger()
//		.clickMenu2()
//		.clickMenu24()
//		.clickAddnewFacility()
//		.clickClose()
		.clickLogoff();
	
	}
@BeforeClass
public void beforeClass() {
dataSheetName="AddThresold";
testCaseName="Menu:Inventory Pages";
testDescription="Check whether user is able to open all links and tabs";
}
}
