package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;
import utils.Reporter;
import wrappers.PcorpWrappers;

public class MainMenu extends PcorpWrappers {
	public MainMenu() throws InterruptedException {
		if (!verifyTitle("PCORP-T Home"))
			;
		// Reporter.reportStep("This is not the Main Page", "FAIL");
		// Thread.sleep(5000);
	}

	public MainMenu clickMenu1() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu1.Xpath"));
		return this;
	}

	public MainMenu clickMenu2() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu2.Xpath"));
		return this;
	}

	public MainMenu clickMenu3() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3.Xpath"));
		return this;
	}

	/*
	 * public MainMenu clickMenu30() throws InterruptedException {
	 * clickByXpath(prop.getProperty("Home.Menu30.Xpath")); return this; }
	 */
	public Ops_WorkAssignment clickMenu31() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu31.Xpath"));
		return new Ops_WorkAssignment();
	}

	public Ops_ProblemEscalation clickMenu32() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu32.Xpath"));
		return new Ops_ProblemEscalation();
	}

	public Ops_CallcenterEscallationWithoutQueue clickMenu33() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu33.Xpath"));
		return new Ops_CallcenterEscallationWithoutQueue();
	}

	public Ops_CallcenterEscallations clickMenu34() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu34.Xpath"));
		return new Ops_CallcenterEscallations();
	}

	public Ops_CallcenterSearch clickMenu35() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu35.Xpath"));
		return new Ops_CallcenterSearch();
	}

	public Ops_RouteTracker clickMenu36() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu36.Xpath"));
		return new Ops_RouteTracker();
	}

	public Ops_TechTracker clickMenu37() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu37.Xpath"));
		return new Ops_TechTracker();
	}

	public Ops_TechTracker clickMenu38() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu38.Xpath"));
		return new Ops_TechTracker();
	}

	public Ops_TechTracker clickMenu39() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu39.Xpath"));
		return new Ops_TechTracker();
	}

	public Ops_TechTracker clickMenu3A() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3A.Xpath"));
		return new Ops_TechTracker();
	}

	public Ops_TechTracker clickMenu3B() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3B.Xpath"));
		return new Ops_TechTracker();
	}

	public Ops_DayRouting clickMenu3C() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3C.Xpath"));
		return new Ops_DayRouting();
	}

	public Ops_TechTracker clickMenu3D() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3D.Xpath"));
		switchToLastWindow();
		closeCurrentBrowser();
		switchToParentWindow();
		return new Ops_TechTracker();
	}

	public Ops_TechTracker clickMenu3E() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3E.Xpath"));
		return new Ops_TechTracker();
	}

	public Ops_TechTracker clickMenu3F() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3F.Xpath"));
		return new Ops_TechTracker();
	}

	public Ops_TechTracker clickMenu3G() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3G.Xpath"));
		return new Ops_TechTracker();
	}

	public Ops_TechTracker clickMenu3H() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3H.Xpath"));
		return new Ops_TechTracker();
	}

	public MainMenu clickMenu43() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu43.Xpath"));
		return this;
	}

	public MainMenu clickMenu4() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu4.Xpath"));
		return this;
	}

	public CC_RoutePlanner clickMenu41() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu41.Xpath"));
		return new CC_RoutePlanner();
	}

	public CC_MailerTemplateManagement clickMenu42() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu42.Xpath"));
		return new CC_MailerTemplateManagement();

	}

	public RoutePlanner clickMenu431() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu431.Xpath"));
		return new RoutePlanner();

	}

	public CC_MBM_ManageMailerBatch clickMenu432() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu432.Xpath"));
		return new CC_MBM_ManageMailerBatch();
	}

	public MainMenu clickQualityModule() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu5.Xpath"));
		return this;
	}

	public Quality_QABatchManagement clickMenu51() throws InterruptedException {
		clickById(prop.getProperty("Home.Menu51.id"));
		return new Quality_QABatchManagement();
	}
	public Quality_QABatchManagement clickDataQuality() throws InterruptedException {
		Thread.sleep(3000);
		clickByXpath(prop.getProperty("Quality.DataQuality.xpath"));
		return new Quality_QABatchManagement();
	}
	public Quality_QABatchManagement ClickWorkmanshipQuality() throws InterruptedException {
		Thread.sleep(3000);
		clickByXpath(prop.getProperty("Quality.WorkmanshipQuality.xpath"));
		return new Quality_QABatchManagement();
	}
	public Quality_QABatchManagement ClickSuperviserReview() throws InterruptedException {
		Thread.sleep(1000);
		clickByXpath(prop.getProperty("Quality.SupervisorReview.xpath"));
		clickByXpath(prop.getProperty("SupervisorReviewPage.ClearButton.xpath"));
		clickByXpath(prop.getProperty("Supervisor.SupervisorReviewPage.xpath"));
		Thread.sleep(1000);
        RandomClick(prop.getProperty("Supervisor.Dropdown.xpath"));
		clickByXpath(prop.getProperty("SupervisorReviewPage.SearchButton.xpath"));
		//clickByXpath(prop.getProperty("Installer.SupervisorReviewPage.xpath"));
		//RandomClick(prop.getProperty("Installer.Dropdown.xpath"));
		clickByXpath(prop.getProperty("SupervisorReviewPage.SearchButton.xpath"));
		return new Quality_QABatchManagement();
	}

	public Inventory_InventoryManagement clickMenu21() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu21.Xpath"));
		return new Inventory_InventoryManagement();
	}

	public Inventory_LotManagement clickMenu22() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu22.Xpath"));
		return new Inventory_LotManagement();
	}

	public Inventory_Consumables clickMenu23() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu23.Xpath"));
		return new Inventory_Consumables();
	}

	public Inventory_StoreManagement clickMenu24() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu24.Xpath"));
		return new Inventory_StoreManagement();
	}

	public MainMenu clickMenu6() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu6.Xpath"));
		return this;
	}

	public TrainingPlus_CourseMapper clickMenu61() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu61.Xpath"));
		return new TrainingPlus_CourseMapper();
	}

	public TrainingPlus_UserTrainingCompliance clickMenu62() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu62.Xpath"));
		return new TrainingPlus_UserTrainingCompliance();
	}

	public TrainingPlus_LitmosTrainingSystem clickMenu63() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu63.Xpath"));
		return new TrainingPlus_LitmosTrainingSystem();
	}

	public MainMenu clickMenu7() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu7.Xpath"));
		return this;
	}

	public MainMenu clickMenu8() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8.Xpath"));
		return this;
	}

	public Admin_UserManagement clickMenu71() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu71.Xpath"));
		return new Admin_UserManagement();

	}

	public Admin_GroupManagement clickMenu72() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu72.Xpath"));
		return new Admin_GroupManagement();
	}

	public Admin_DeviceManagement clickMenu73() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu73.Xpath"));
		return new Admin_DeviceManagement();
	}

	public Admin_DeviceManagement clickMenu74() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu74.Xpath"));
		return new Admin_DeviceManagement();
	}

	public Admin_DeviceManagement clickMenu75() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu75.Xpath"));
		return new Admin_DeviceManagement();
	}

	public Admin_DeviceManagement clickMenu76() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu76.Xpath"));
		return new Admin_DeviceManagement();
	}

	public Admin_DeviceManagement clickMenu77() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu77.Xpath"));
		return new Admin_DeviceManagement();
	}

	public Admin_DeviceManagement clickMenu78() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu78.Xpath"));
		return new Admin_DeviceManagement();
	}

	public Admin_AppointmentManagement clickMenu79() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu79.Xpath"));
		return new Admin_AppointmentManagement();
	}

	public Reports_TodaysInstallationSummary clickMenu81() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu81.Xpath"));
		return new Reports_TodaysInstallationSummary();
	}

	public Reports_PerfomanceSummary clickMenu82() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu82.Xpath"));
		return new Reports_PerfomanceSummary();
	}

	public Reports_ProductionReports clickMenu83() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu83.Xpath"));
		return new Reports_ProductionReports();
	}

	public Reports_BillingTimeCC clickMenu84() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu84.Xpath"));
		return new Reports_BillingTimeCC();
	}

	public Reports_BillingTimeCC clickMenu85() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu85.Xpath"));
		return new Reports_BillingTimeCC();
	}

	public Reports_ProductionReports clickMenu86() throws InterruptedException {
		mouseOverByXpath(prop.getProperty("Home.Menu86.Xpath"));
		return new Reports_ProductionReports();
	}

	public Reports_ProductionReports clickMenu87() throws InterruptedException {
		mouseOverByXpath(prop.getProperty("Home.Menu87.Xpath"));
		return new Reports_ProductionReports();
	}

	public Reports_ProductionReports clickMenu88() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu88.Xpath"));
		return new Reports_ProductionReports();
	}

	public Reports_ProductionReports clickMenu89() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu89.Xpath"));
		return new Reports_ProductionReports();
	}

	public Reports_ProductionReports clickMenu8A() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8A.Xpath"));
		return new Reports_ProductionReports();
	}

	public Reports_BillingTimeCC clickMenu8B() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8B.Xpath"));
		return new Reports_BillingTimeCC();
	}

	public Reports_BillingTimeCC clickMenu8C() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8C.Xpath"));
		return new Reports_BillingTimeCC();
	}

	public Reports_BillingTimeCC clickMenu8D() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu8D.Xpath"));
		return new Reports_BillingTimeCC();
	}

	public MainMenu clickSignInButton1() throws InterruptedException {
		clickByXpath(prop.getProperty("Login.SignInButton.Xpath"));
		Thread.sleep(2000);
		return this;
	}

	public MainMenu switchback() throws InterruptedException {
		Thread.sleep(2000);
		switchToParentWindow();
		return new MainMenu();
	}

	public MainMenu clickSearch1() throws InterruptedException {
		// Gets control of javascript engine to execute scripts
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		// Scrolls to top of page
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		Thread.sleep(5000);

		clickByXpath(prop.getProperty("Home.ArizonaSearch.Xpath"));
		return this;
	}

	public MainMenu clickSignOut() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Signout.Xpath"));
		return new MainMenu();
	}

	public MainMenu clickFindSearchDisabled() {
		clickByXpath(prop.getProperty("Home.FindsearchDisabled.Xpath"));
		return this;
	}

	public MainMenu clickHumburger() throws InterruptedException {
		clickById(prop.getProperty("Home.Humburger.id"));
		return new MainMenu();
	}

	public MainMenu clickMenu30() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu30.Xpath"));
		return new MainMenu();
	}
	public MainMenu clickDashboard()throws InterruptedException{
		clickByXpath(prop.getProperty("Home.Dashboard.xpath"));
		return new MainMenu();
	}
	public MainMenu clickPMDashboard()throws InterruptedException{
		clickByXpath(prop.getProperty("Dashboard.PMDashboard"));
		return new MainMenu();
	}
	public MainMenu clickPEDashboard()throws InterruptedException{
		clickByXpath(prop.getProperty("Dashboard.PEDashboard"));
		return new MainMenu();
	}
	public MainMenu clickUtilityDashboard()throws InterruptedException{
		clickByXpath(prop.getProperty("Dashboard.UtilityDashboard"));
		return new MainMenu();
	}
	public MainMenu clickSupervisorPerformanceDashboard()throws InterruptedException {
		clickByXpath(prop.getProperty("Dashboard.SupervisorPerformanceDashboard"));
		return new MainMenu();
	}

	public MainMenu Verifybreadcrumbs(String data) {
		verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		try {
			return new MainMenu();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public MainMenu clickShowAdvanced() throws InterruptedException {
		clickById(prop.getProperty("WorkAssignments.Advanced.id"));
		return this;
	}

	public MainMenu ClickAddress() throws InterruptedException {
		clickByXpath(prop.getProperty("WorkAssignments.Address.Xpath"));
		switchToLastWindow();
		return this;
	}

	public MainMenu clickMenu44() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu44.Xpath"));
		return this;
	}

	public MainMenu ClickCommunicationTab() throws InterruptedException {
		clickByXpath(prop.getProperty("WorkAssignments.commtab.Xpath"));
		switchToLastWindow();
		return this;
	}

	public MainMenu ClickPhoneicon() throws InterruptedException {
		Thread.sleep(7000);
		clickByXpath(prop.getProperty("WorkAssignments.commtab.Xpath"));
		return this;
	}

	public MainMenu ClickClose() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
		clickByXpath(prop.getProperty("CCL.Close.Xpath"));
	    switchToParentWindow();
		return this;
	}
	public MainMenu ClickClosed() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
		//clickByXpath(prop.getProperty("CCL.Close.Xpath"));
	    switchToParentWindow();
		return this;
	}

	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
	}
		
	public MainMenu ClickCallicon() throws InterruptedException {
		clickById(prop.getProperty("WorkAssignments.Logcall.id"));
		return this;
		}
	
	
	public MainMenu ClickProblemGroupDropdown() throws InterruptedException {
		clickById(prop.getProperty("CCEWQ.Group.id"));
		return this;
		}
	
	public MainMenu ClickProblemGroupDropdownArrow() throws InterruptedException {
		clickById(prop.getProperty("CCEWQ.GroupDD.id"));
		Thread.sleep(8000);
		return this;
		}
	
	public MainMenu SelectGroupValue() throws InterruptedException {
		clickByXpath(prop.getProperty("CCEWQ.Groupval.Xpath"));
		return this;
		}

	public MainMenu ClickProblemTypeDropdown() throws InterruptedException {
		Thread.sleep(2000);
		clickById(prop.getProperty("CCEWQ.Type.id"));
		Thread.sleep(7000);
		return this;
		}
	
	public MainMenu ClickProblemTypeDropdownArrow() throws InterruptedException {
		clickById(prop.getProperty("CCEWQ.TypeDD.id"));
		return this;
		}
	
	public MainMenu SelectTypeValue() throws InterruptedException {
		clickById(prop.getProperty("CCEWQ.Type.id"));
		System.out.println("clicked once again");
		clickByXpath(prop.getProperty("CCEWQ.Typeval.Xpath"));
		System.out.println("super");
		return this;
		}
	
	public MainMenu ClickSearch() throws InterruptedException {
		clickById(prop.getProperty("CCEWQ.Search.id"));
		return this;
		}

	public MainMenu clickMenu46() {
		clickByXpath(prop.getProperty("Home.Menu46.Xpath"));
		return this;
	}

	public MainMenu clickMenu11() {
		clickByXpath(prop.getProperty("Home.Menu11.Xpath"));
		return this;
	}
	
	public MainMenu VerifyReportHeaderWIF(String data) throws InterruptedException {
	      verifyTextByXpath(prop.getProperty("WIF.reportHeader.Xpath"), data);
		return this;
	}

	public MainMenu clickMenuPM() {
		clickByXpath(prop.getProperty("Home.MenuPM.Xpath"));
		return this;
	}

	public MainMenu clickMenuPM2() {
		clickByXpath(prop.getProperty("Home.MenuPM2.Xpath"));
		return this;
	}
	
	
	public MainMenu VerifyReportHeaderTDA(String data) throws InterruptedException {
		verifyTextContainsByXpath(prop.getProperty("TDA.reportHeader.Xpath"), data);
		return this;
	}
	public MainMenu clickAdminiStration() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu.Administration.Xpath"));
		return this;
	}
	public MainMenu userManagement() throws InterruptedException {
		clickByXpath(prop.getProperty("admin.userManagement"));
		return this;
	}
	public MainMenu userName() throws InterruptedException {
		getTextSplitByXpath(prop.getProperty("Home.Humburger.name"),prop.getProperty("admin.Nametextbox"));
		return this;
	}
	public MainMenu ClickSearchAdmin() throws InterruptedException {
		clickByXpath(prop.getProperty("admin.SearchBtn"));
		return this;
	}
	public MainMenu VerifyRoles(String Roles, String roleMatch) throws InterruptedException{
		VerifyUserRoles(prop.getProperty("admin.UserRoles"),prop.getProperty("Home.Humburger.MenuList"),Roles,prop.getProperty("Home.Humburger.subMenulist"), roleMatch);
		return this;
	}
	public MainMenu ClickEdit() throws InterruptedException{
		clickByXpath(prop.getProperty("admin.Edit"));
		return this;
	}
	public MainMenu SecurityAccess(String roleMatch) throws InterruptedException{
		installerVerification(prop.getProperty("Home.Humburger.MenuList"),prop.getProperty("Home.Humburger.subMenulist"),roleMatch);
		return this;
}
	public MainMenu verifyLastUpdated()throws InterruptedException{
		DategetText(prop.getProperty("Dashboard.lastUpdated"));
		return new MainMenu();
		
	}
	}
