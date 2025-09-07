package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Reports_ProductionReports extends PcorpWrappers{
	public Reports_ProductionReports() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Reports_ProductionReports Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public Reports_ProductionReports ExpandReports() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.Handle1.Xpath"));
		return this;
		}
	
	public Reports_ProductionReports Navigatetopreviouspage() throws InterruptedException {
		movetoPreviouspage();
		return this;
		}
	
	
	public Reports_RouteSaturationReport ClickRoutesaturationReportElectric() throws InterruptedException {
		mouseOverByXpath(prop.getProperty("Report.RSR.Xpath"));
		clickByXpath(prop.getProperty("Report.Electric1.Xpath"));
		switchToLastWindow();
		return new Reports_RouteSaturationReport() ;
		}
	
	public Reports_InstallerProductivityReport ClickInstallerProductivityReportElectric() throws InterruptedException {
		mouseOverByXpath(prop.getProperty("Report.IPR.Xpath"));
		clickByXpath(prop.getProperty("Report.Electric2.Xpath"));
		switchToLastWindow();
		return new Reports_InstallerProductivityReport() ;
		}
	
	public Reports_ProductQAReport ClickProductQAReportElectric() throws InterruptedException {
		mouseOverByXpath(prop.getProperty("Report.PQR.Xpath"));
		clickByXpath(prop.getProperty("Report.Electric3.Xpath"));
		switchToLastWindow();
		return new Reports_ProductQAReport() ;
		}
	
	public Reports_ProductionReport ClickProductionReportElectric() throws InterruptedException {
		mouseOverByXpath(prop.getProperty("Report.PR.Xpath"));
		clickByXpath(prop.getProperty("Report.Electric4.Xpath"));
		switchToLastWindow();
		return new Reports_ProductionReport() ;
		}
	
	public Reports_ProductionDetailReport ClickProductionDetailReportElectric() throws InterruptedException {
		mouseOverByXpath(prop.getProperty("Report.PDR.Xpath"));
		clickByXpath(prop.getProperty("Report.Electric5.Xpath"));
		switchToLastWindow();
		return new Reports_ProductionDetailReport() ;
		}
	
	public Reports_ProductionDetailReport ClickInventoryReportElectric() throws InterruptedException {
		mouseOverByXpath(prop.getProperty("Report.IR.Xpath"));
		clickByXpath(prop.getProperty("Report.Electric6.Xpath"));
		switchToLastWindow();
		return new Reports_ProductionDetailReport() ;
		}
	
	public Reports_BillingTimeCC ClickBillingReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.BR.Xpath"));
		switchToLastWindow();
				return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickTimeTrackingReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.TTR.Xpath"));
		switchToLastWindow();
				return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickCallCenterReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.CCR.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	
	public Reports_BillingTimeCC ClickRTUescalationReportElectric() throws InterruptedException {
		mouseOverByXpath(prop.getProperty("Report.RTU.Xpath"));
		clickByXpath(prop.getProperty("Report.Electric7.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	
	public Reports_BillingTimeCC ClickPERandCommReportElectric() throws InterruptedException {
		mouseOverByXpath(prop.getProperty("Report.PER.Xpath"));
		clickByXpath(prop.getProperty("Report.Electric8.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickFieldEscalationReportElectric() throws InterruptedException {
		mouseOverByXpath(prop.getProperty("Report.FER.Xpath"));
		clickByXpath(prop.getProperty("Report.Electric10.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}

	public Reports_BillingTimeCC ClickInstallerTimetrackingReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.ITTR.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickInstallerTimetrackingdetail() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.ITTD.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickMissedApptReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.MAR.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}

	public Reports_BillingTimeCC ClickInventoryReconcileReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.IRR.Xpath"));
		switchToLastWindow();
		verifyTextByXpath("//div[text()='New Meter Number']", "New Meter Number");
		//Thread.sleep(9000);
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickAdapterInstalledReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.AIR.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}

	
	public Reports_ProductionReports ExpandDatafeedReports() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.Handle2.Xpath"));
		return this;
		}
	
	public Reports_BillingTimeCC ClickRTUstatusReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.RTUS.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickSafetyReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.SR.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickGPSlocation() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.GPS.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickCallCenterEfficiencyReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.CER.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickJawTensionClipReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.JTC.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickCustomerCommunicationDetail() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.CCD.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickTimesheetdata() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.TSD.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickInstallationdata() throws InterruptedException {
		clickByXpath(prop.getProperty("Report.ID.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}

	public Reports_BillingTimeCC ClickProductQAReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu861.Xpath"));
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickProductQAdetailReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu862.Xpath"));
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickFieldQCReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu871.Xpath"));
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickFieldAuditReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu872.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickInstallForecastDataEntry() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu881.Xpath"));
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickInstallForecastReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu882.Xpath"));
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickProcessQAReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu891.Xpath"));
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickSafetyReport2() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8A1.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickSafetyReportDataEntry() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8A2.Xpath"));
		switchToLastWindow();
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickSafetyMeeting() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8B.Xpath"));
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickTrainingData() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8C.Xpath"));
		return new Reports_BillingTimeCC() ;
		}
	
	public Reports_BillingTimeCC ClickFieldEscalationReport() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8D.Xpath"));
		return new Reports_BillingTimeCC() ;
		}
	
	public MainMenu clickMenu8() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8.Xpath"));
		return new MainMenu();
		}
	
	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

	public Reports_ProductionReports clickHumburger() throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return this;
	}

	}
