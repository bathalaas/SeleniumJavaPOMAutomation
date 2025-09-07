package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;

import wrappers.PcorpWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

//whether user is able to login successfully and navigate to all pages.

public class TC007_Reporting_MenuPages extends PcorpWrappers {

	@Test(dataProvider = "fetchData")
	public void login(String emailid, String password, String breadcrumbs1, String breadcrumbs2, String breadcrumbs3,
			String breadcrumbs4, String threvalue) throws InterruptedException, FileNotFoundException, IOException {

		new LoginPage().enterUsername(emailid).enterPassword(password).clickLoginButton().clickHumburger().clickMenu8()
				.clickMenu81().Verifybreadcrumbs("Today's Installation Summary").ClickProductstatusTab()
				.ClickInstallationsummaryTab().clickHumburger().clickMenu8().clickMenu82()
				// .Verifybreadcrumbs("Today's Installation Performance Summary")
				.ClickInstallationPerformanceSummaryReportTab().ClickInstallationPerformanceSummaryTab()
				.clickHumburger().clickMenu8().clickMenu84().SelectWarehouse("ALL").clickFilter()
				.VerifyReportHeaderIIPR("Installer Inventory Pickup Report").Navigatetopreviouspage().clickHumburger()
				.clickMenu8().clickMenu85().VerifyReportHeaderIMC("Indoor Meter Count Report").Navigatetopreviouspage()
				.clickHumburger().clickMenu8().clickMenu86().ClickProductQAReport().clickStartdatePopup()
				.clickPreviousmonthPopup().pickDate().clickFilterBtn().VerifyReportHeaderPQR("Quality Assurance Report")
				.Navigatetopreviouspage().clickHumburger().clickMenu8().clickMenu86().ClickProductQAdetailReport()
				.clickStartdate().clickPreviousmonth().pickDate().clickFilter()
				.VerifyReportHeaderPQD("Product QA Detail Report").Navigatetopreviouspage().clickHumburger()
				.clickMenu8().clickMenu87().ClickFieldQCReport().clickStartingFromDate().clickPreviousmonthFromDate()
				.pickDate().clickFilter().VerifyReportHeaderFQC("FieldQC Report").Navigatetopreviouspage()
				.clickHumburger().clickMenu8().clickMenu87().ClickFieldAuditReport().SelectCompany("SGS")
				.clickSearch().VerifyReportHeaderFAR("Profield Field Audit Report").Navigatetopreviouspage().clickHumburger().clickMenu8()
				.clickMenu88().ClickInstallForecastDataEntry().clickGenerateReport()
				.VerifyReportHeaderIF("4-Week Installation Forecast")
				.clickHumburger().clickMenu8().clickMenu88().ClickInstallForecastReport().VerifyReportHeaderIFR("4-Week Installation Forecast")
				.Navigatetopreviouspage()
				.clickHumburger().clickMenu8().clickMenu89().ClickProcessQAReport()
				.clickFilter().VerifyReportHeaderPQA("ProcessQA Report").Navigatetopreviouspage()
//				.clickHumburger()
//				.clickMenu8().clickMenu8A().ClickSafetyReport2().clickStartdatePopup().clickPreviousmonthPopup()
//				.pickDate().clickFilterBtn().VerifyReportHeaderSR("")
				.clickHumburger().clickMenu8().clickMenu8A()
				.ClickSafetyReportDataEntry().SelectCompanyforSafetyReport("SGS").clickSearchforSafetyReport()
				.VerifyReportHeaderSRD("Safety Report Data Entry").clickHumburger().clickMenu8()
				.clickMenu8B().Verifybreadcrumbs("Safety Meeting Data").clickAddnewRecord().clickCancel()
				.Verifybreadcrumbs("Safety Meeting Data").clickHumburger().clickMenu8().clickMenu8C()
				.Verifybreadcrumbs("Training Data").clickAddnewRecord().clickCancel().Verifybreadcrumbs("Training Data").clickHumburger()
				.clickMenu8().clickMenu8D().ClickProblemStatus().ClickClosedcheckbox().clickSearchbtn()
				.VerifyReportHeaderPESR("Problem Escalations Report").clickLogoff();
	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName = "AddThresold";
		testCaseName = "Menu:Reporting-Report pages validation";
		testDescription = "Check that user is able to open all the links from Reporting Menu";
	}
}
