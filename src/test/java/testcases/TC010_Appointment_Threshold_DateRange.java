package testcases;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;

import wrappers.PcorpWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

//whether user is able to login successfully and navigate to all pages.

public class TC010_Appointment_Threshold_DateRange extends PcorpWrappers{
	
	@Test(dataProvider="fetchData")
public void login(String emailid,String password,String breadcrumbs1,String breadcrumbs2,String breadcrumbs3,String breadcrumbs4,String threvalue  ) throws InterruptedException, FileNotFoundException, IOException {

		new LoginPage()
		.enterUsername(emailid)
		.enterPassword(password)
		.clickLoginButton()
		.clickHumburger()
		.clickMenu4()
		.clickMenu41()
		.clickMonth()
		.clickDeleteMonthlyThresold()
		.clickConfirmButton()
	    .clickNextButton()
		.clickTimeSlot1()
		.clickCustom()
		.EnterStartDate()
		.EnterElectricThresold(threvalue)
		.EnterGasThresold("5")
		.EnterNetworkThresold("9")
		.EnterWaterThresold("4")
		.clickSave()
		.clickAppointment()
		.verifyThresold(threvalue)
		.clickClose()
		.clickMonth()
		.clickDeleteMonthlyThresold()
		.clickConfirmButton()
		.clickMonth()
		.clickMonthnext()
		.clickDeleteMonthlyThresold()
		.clickConfirmButton()
		.clickLogoff()
			;
		
	}
@BeforeClass
public void beforeClass() {
dataSheetName="AddThresold";
testCaseName="Appointment:Create,Verify,Delete Threshold for Date range";
testDescription="Check whether user is able to add thresold";
}
}
