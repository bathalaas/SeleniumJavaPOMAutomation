package testcases;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;

import wrappers.PcorpWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

//whether user is able to login successfully and navigate to all pages.

public class TC005_Trainingplus_MenuPages extends PcorpWrappers{
	
	@Test(dataProvider="fetchData")
public void login(String emailid,String password,String breadcrumbs1,String breadcrumbs2,String breadcrumbs3,String breadcrumbs4,String threvalue  ) throws InterruptedException, FileNotFoundException, IOException {

		new LoginPage()
		.enterUsername(emailid)
		.enterPassword(password)
		.clickLoginButton()
		.clickHumburger()
		.clickMenu6()
		.clickMenu61()
		.Verifybreadcrumbs("TrainingPlus > Course Mapper")
		.ClickTabSkillCertificationCourses()
		.ClickTabRoleCertificationCourses()
		.EditQAManager()
		.clickCheckbox()
		.clickCancel()
		.clickHumburger()
		//.clickMenu6()
		//.clickMenu62()
		//.Verifybreadcrumbs("TrainingPlus > User Compliance") //Currently User Compliance page temporary blocked
		//.SelectSkillCompliance("Compliant")
		//.ClickSearch()
		//.clickHumburger()
		.clickMenu6()
		.clickMenu63();
		
	}
@BeforeClass
public void beforeClass() {
dataSheetName="AddThresold";
testCaseName="Menu:Training Plus Pages";
testDescription="Verify all the pages from Menu-Training Plus";
}
}
