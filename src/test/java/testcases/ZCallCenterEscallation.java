package testcases;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;

import wrappers.PcorpWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

//whether user is able to login successfully and navigate to all pages.

public class ZCallCenterEscallation extends PcorpWrappers{
	
	@Test(dataProvider="fetchData")
public void login(String emailid,String password,String breadcrumbs1,String breadcrumbs2,String breadcrumbs3,String breadcrumbs4,String threvalue  ) throws InterruptedException, FileNotFoundException, IOException {

		new LoginPage()
		.enterUsername(emailid)
		.enterPassword(password)
		.clickLoginButton()
		.clickHumburger()
		.clickMenu4()
		.clickMenu44()
		//.clickMenu33()
		.Verifybreadcrumbs("Ops Center > Call Center Escalations")
		//.ClickProblemGroupDropdown()
		//.SelectGroupValue()
		//.ClickProblemGroupDropdownArrow()
		//.ClickProblemTypeDropdown()
		//.SelectTypeValue()
	//	.ClickProblemTypeDropdownArrow()
		//.ClickSearch()
		//.clickMenu3()
		//.clickMenu34()
		//.verifybreadcrumbs("Ops Center > Call Center Escalations")
		.clickHumburger()
		.clickMenu3()
		.clickMenu35()
		.verifybreadcrumbs("Ops Center > Customer Search")
		.clickHumburger()
		.clickMenu3()
		.clickMenu36()
		.verifybreadcrumbs("Ops Center> Route Tracker")
		.clickHumburger()
		.clickMenu3()
		.clickMenu37()
		.verifybreadcrumbs("Ops Center > Tech Tracker")
		.clickHumburger()
		.clickMenu3()
		.clickMenu3C()
		.verifybreadcrumbs("Ops Center > Day Route")
		.clickAddLot()
		.clickclose()
		.clickLogoff()
			;
		
	}
@BeforeClass
public void beforeClass() {
dataSheetName="AddThresold";
testCaseName="CC Escalations without queue Page";
testDescription="Check whether user is able to open all links and tabs";
}
}
