/**
* @author ACL - QATeam
* PCORP specific Wrapper class 
*/
package wrappers;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;
import utils.Reporter;

public class PcorpWrappers extends GenericWrappers {

	protected String dataSheetName;
	protected String PageSheetName;
	protected static String testCaseName;
	protected static String testDescription;
	protected static String requiredData;

	@BeforeSuite
	public void beforeSuite() throws FileNotFoundException, IOException {
		Reporter.startResult();
		loadObjects();
	}

	@BeforeTest
	public void beforeTest() {

	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.startTestCase();
		invokeApp(browser);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.endResult();
	}

	@AfterTest
	public void afterTest() {
	}

	@AfterMethod
	public void afterMethod() {
    closeAllBrowsers();
	}

	@DataProvider(name = "fetchData")
	public Object[][] getData() {
		return DataInputProvider.getSheet(dataSheetName);
	}
	@DataProvider(name = "fetchData_UserRoles")
	public Object[][] getData1() throws IOException {
		return DataInputProvider.getSheet1(dataSheetName,requiredData);
	}

}
