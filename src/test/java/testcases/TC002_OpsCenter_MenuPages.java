package testcases;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;

import wrappers.PcorpWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

//whether user is able to login successfully and navigate to all pages.

public class TC002_OpsCenter_MenuPages extends PcorpWrappers{
	
	@Test(dataProvider="fetchData")
public void login(String emailid,String password,String breadcrumbs1,String breadcrumbs2,String breadcrumbs3,String breadcrumbs4,String threvalue  ) throws InterruptedException, FileNotFoundException, IOException {

		new LoginPage()
		.enterUsername(emailid)
		.enterPassword(password)
		.clickLoginButton()
		.clickHumburger()
		.clickMenu4()
		.clickMenu44()
		//.Verifybreadcrumbs("Ops Center > Call Center Escalations")
		.ClickProblemGroupDropdown()
		.SelectGroupValue()
		.ClickProblemGroupDropdownArrow()
		.ClickProblemTypeDropdown()
		.SelectTypeValue()
		.ClickProblemTypeDropdownArrow()
		.ClickSearch()
		.clickHumburger()
		.clickMenu4()
		.clickMenu44()
		//.Verifybreadcrumbs("Ops Center > Call Center Escalations")
		.clickHumburger()
		.clickMenu4()
		.clickMenu46()
		//.Verifybreadcrumbs("Ops Center > Customer Search")
//		.clickHumburger()
//		.clickMenu3()
//		.clickMenu36()
//		.verifybreadcrumbs("Ops Center> Route Tracker")
		.clickHumburger()
		.clickMenu3()
		.clickMenu37()
		//.verifybreadcrumbs("Ops Center > Tech Tracker")
		.clickHumburger()
		.clickMenuPM()
		.clickMenuPM2()
		//.VerifyReportHeaderTDA("Technician Daily Activity")
		.clickHumburger()
		.clickMenu1()
		.clickMenu11()
		//.VerifyReportHeaderWIF("Weekly Forecast Data Entry")
//		.clickHumburger()
//		.clickMenu30()
//		.clickMenu3A()
//		//.VerifyReportHeaderSWS("")
		.clickHumburger()
		.clickMenu3()
		.clickMenu3B()
		//.verifybreadcrumbs("Ops > Route Sequence Management")
		.clickHumburger()
		.clickMenu3()
		.clickMenu3C()
		//.verifybreadcrumbs("Ops Center > Day Route")
		//.clickAddLot()
		//.clickclose()
		.clickHumburger()
		.clickMenu3()
		//.clickMenu3D()
	//	.verifybreadcrumbs("Meeting Organizer")
		.clickHumburger()
		//.clickMenu3()
		//.clickMenu3E()
//		.verifybreadcrumbs("Meter Schedule map")
		//.clickHumburger()
		//.clickMenu3()
		//.clickMenu3F()
		//.VerifyReportHeaderSA("Scheduled Appointment")
		.clickHumburger()
		//.clickMenu30()
		//.clickMenu3G()
		//.VerifyReportHeaderPE2("New Escalations")
		//.clickHumburger()
		//.clickMenu30()
		//.clickMenu3H()
		//.clickCreateNewRouteBatch()
		//clickCancel()
		.clickLogoff();
		
	}
@BeforeClass
public void beforeClass() {
dataSheetName="AddThresold";
testCaseName="Menu:Ops Center Pages";
testDescription="Ops Center Menu Verification for all the pages";
}
}
