/**
 * @author ACL - QATeam
 * Generic Wrapper class file
 */
package wrappers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Admin_AppointmentManagement;
import utils.Reporter;

public class GenericWrappers {

	public static RemoteWebDriver driver;
	public static WebDriverWait WebDriverWait;
	protected static Properties prop;
	public String sUrl, primaryWindowHandle, sHubUrl, sHubPort, sUrl1;
	public static String getTxt = "";
	protected String browser;

	public GenericWrappers() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./config.properties")));
			sHubUrl = prop.getProperty("HUB");
			sHubPort = prop.getProperty("PORT");
			sUrl = prop.getProperty("URL");
			sUrl1 = prop.getProperty("URL1");
			// gets the browser value from config.properties file
			browser = prop.getProperty("BROWSER");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
		} catch (Exception e) {
		}
	}
	public void closeCurrentBrowser() {
		try {
			driver.close();
		} catch (Exception e) {

		}
	}

	/**
	 * @author ACL - QATeam This method will launch Firefox and Maximise the
	 *         browser, set the wait for 30 seconds and load the url
	 * @param url - The url with http or https
	 */
	public boolean invokeApp(String browser) {
		boolean bReturn = false;
		try {

			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName(browser);
			dc.setPlatform(Platform.WINDOWS);
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(sUrl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			primaryWindowHandle = driver.getWindowHandle();
			Reporter.reportStep("The browser:" + browser + " launched successfully", "PASS");
			bReturn = true;

		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The browser:" + browser + " could not be launched", "FAIL");
		}
		return bReturn;
	}

	/**
	 * @author ACL - QATeam This method will enter the value to the text field using
	 *         id attribute to locate
	 * @param idValue - id of the Web element
	 * @param data    - The data to be sent to web element
	 * @throws IOException
	 * @throws COSVisitorException
	 */
	public boolean enterById(String idValue, String data) {
		boolean bReturn = false;
		try {
			 new WebDriverWait(driver,
			 90).until(ExpectedConditions.presenceOfElementLocated(By.id(idValue)));
			new WebDriverWait(driver, 90).until(ExpectedConditions.visibilityOfElementLocated(By.id(idValue)));
			driver.findElement(By.id(idValue)).clear();
			driver.findElement(By.id(idValue)).sendKeys(data);
			Reporter.reportStep("The data: " + data + " entered successfully in field :" + idValue, "PASS");
			bReturn = true;

		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The data: " + data + " could not be entered in the field :" + idValue, "FAIL");
		}
		return bReturn;
	}

	public boolean enterByName(String nameValue, String data) {
		boolean bReturn = false;
		try {
			 new WebDriverWait(driver,
			 90).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
			driver.findElement(By.name(nameValue)).clear();
			driver.findElement(By.name(nameValue)).sendKeys(data);
			Reporter.reportStep("The data: " + data + " entered successfully in field :" + nameValue, "PASS");
			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The data: " + data + " could not be entered in the field :" + nameValue, "FAIL");
		}
		return bReturn;
	}

	public boolean enterByXpath(String nameVal, String data) {
		boolean bReturn = false;
		String txt = "";
		try {

			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nameVal)));
			
			txt = driver.findElement(By.xpath(nameVal)).getAttribute("name");
			driver.findElement(By.xpath(nameVal)).clear();
			driver.findElement(By.xpath(nameVal)).sendKeys(data);
			Reporter.reportStep("The data: " + data + " entered successfully in field :" + txt, "PASS");
			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The data: " + data + " could not be entered in the field :" + txt + e, "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method will verify the title of the browser
	 * 
	 * @param title - The expected title of the browser
	 * @author ACL - QATeam
	 */
	public boolean verifyTitle(String title) {
		boolean bReturn = false;
		try {

		//	//new WebDriverWait(driver,90).until(ExpectedConditions.visibilityOfElementLocated(By.tagName(title)));
			if (driver.getTitle().equalsIgnoreCase(title)) {
				Reporter.reportStep("The title of the page matches with the value :" + title, "PASS");
				bReturn = true;

			} else
				Reporter.reportStep(
						"The title of the page:" + driver.getTitle() + " did not match with the value :" + title,
						"SUCCESS");

		} catch (Exception e) {
			Reporter.reportStep("The title did not match", "FAIL");
		}

		return bReturn;
	}

	/**
	 * @author ACL - QATeam This method will verify the given text using xpath
	 * @param xpath - The locator of the object in xpath
	 */
	public boolean verifyTextByXpath(String xpath, String text) {
		boolean bReturn = false;

		try {
			new WebDriverWait(driver, 90).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath));
			String sText = driver.findElementByXPath(xpath).getText();
             
			if (driver.findElementByXPath(xpath).getText().trim().equalsIgnoreCase(text)) {
				Reporter.reportStep("The text: " + sText + " matches with the value :" + text, "PASS");
				bReturn = true;
			} else
				Reporter.reportStep("The text: " + sText + " did not match with the value :" + text, "FAIL");
		} catch (Exception e) {
			Reporter.reportStep("The text not found :" + text, "FAIL");
		}
		return bReturn;
	}

	/**
	 * @author ACL - QATeam This method will verify the given text is available
	 *         using xpath
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 */
	public boolean verifyTextContainsByXpath(String xpath, String text) {
		boolean bReturn = false;

		try {
			new WebDriverWait(driver, 90).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			driver.findElementByXPath(xpath);
			String sText = driver.findElementByXPath(xpath).getText();

			if (driver.findElementByXPath(xpath).getText().trim().contains(text)) {
				Reporter.reportStep("The text: " + sText + " contains the value :" + text, "PASS");
				bReturn = true;
			} else {
				Reporter.reportStep("The text: " + sText + " did not contain the value :" + text, "FAIL");
			}
			bReturn = true;
		} catch (NoSuchElementException e) {

			Reporter.reportStep("The text not found :" + text, "FAIL");
		} catch (WebDriverException e) {

		}
		return bReturn;
	}

	/**
	 * This method will close all the browsers
	 * 
	 * @author ACL - QATeam
	 */
	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			Reporter.reportStep("The browser:" + driver.getCapabilities().getBrowserName() + " could not be closed.",
					"FAIL");
		}

	}

	/**
	 * @author ACL - QATeam This method will click the element using id as locator
	 * @param id The id (locator) of the element to be clicked
	 */
	public boolean clickById(String id) {
		boolean bReturn = false;
		String txt = "";
		try {
			 //new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.id(id)));
			txt = driver.findElement(By.id(id)).getText();
			if (txt.isEmpty()) {
				txt = driver.findElement(By.id(id)).getAttribute("value");
			}
			driver.findElement(By.id(id)).click();
			Reporter.reportStep("The element with id: " + txt + " is clicked.", "PASS");
			bReturn = true;

		} catch (Exception e) {
			//Reporter.reportStep("The element with id: " + id + " could not be clicked.", "FAIL");
		}
		return bReturn;
	}

	/**
	 * @author ACL - QATeam This method will click the element using id as locator
	 * @param id The id (locator) of the element to be clicked
	 */
	public boolean clickByClassName(String classVal) {
		boolean bReturn = false;
		try {
			driver.findElement(By.className(classVal)).click();
			Reporter.reportStep("The element with class Name: " + classVal + " is clicked.", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The element with class Name: " + classVal + " could not be clicked.", "FAIL");
		}
		return bReturn;
	}

	/**
	 * @author ACL - QATeam This method will click the element using name as locator
	 * @param name The name (locator) of the element to be clicked
	 */
	public boolean clickByName(String name) {
		boolean bReturn = false;
		try {
			driver.findElement(By.name(name)).click();
			Reporter.reportStep("The element with name: " + name + " is clicked.", "PASS");

			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The element with name: " + name + " could not be clicked.", "FAIL");
		}
		return bReturn;
	}

	/**
	 * @author ACL - QATeam This method will click the element using link name as
	 *         locator
	 * @param name The link name (locator) of the element to be clicked
	 */
	public boolean clickByLink(String name) {
		boolean bReturn = false;
		try {
			new WebDriverWait(driver, 90).until(ExpectedConditions.visibilityOfElementLocated(By.linkText(name)));
			// new WebDriverWait(driver,
			// 90).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.linkText(name)));
			driver.findElement(By.linkText(name)).click();
			Reporter.reportStep("The element with link name: " + name + " is clicked.", "PASS");
			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The element with link name: " + name + " could not be clicked.", "FAIL");
		}
		return bReturn;
	}

	/**
	 * @author ACL - QATeam This method will click the element using xpath as
	 *         locator
	 * @param xpathVal The xpath (locator) of the element to be clicked
	 */
	public boolean clickByXpath(String xpathVal) {
		boolean bReturn = false;
		String txt = "";
		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathVal)));
			txt = driver.findElement(By.xpath(xpathVal)).getText();
			if (txt.isEmpty()) {
				txt = driver.findElement(By.xpath(xpathVal)).getAttribute("value");
			}
//			je.executeScript("arguments[0].scrollIntoView(true);", element);
			driver.findElement(By.xpath(xpathVal)).click();
			Reporter.reportStep("The element : " + txt + " is clicked.", "PASS");

			bReturn = true;

		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The element with xpath: " + xpathVal + "  " + txt + " could not be clicked." + e,
					"FAIL");
		}
		return bReturn;
	}

	/**
	 * @author ACL - QATeam This method will mouse over on the element using xpath
	 *         as locator
	 * @param xpathVal The xpath (locator) of the element to be mouse over
	 */
	public boolean mouseOverByXpath(String xpathVal) {
		boolean bReturn = false;
		try {
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath(xpathVal));
			action.moveToElement(we).build().perform();
//			new Actions(driver).moveToElement(driver.findElement(By.xpath(xpathVal))).build().perform();
			Reporter.reportStep("The mouse over by xpath : " + xpathVal + " is performed.", "PASS");

			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The mouse over by xpath : " + xpathVal + " could not be performed.", "FAIL");
		}
		return bReturn;
	}

	/**
	 * @author ACL - QATeam This method will mouse over on the element using link
	 *         name as locator
	 * @param xpathVal The link name (locator) of the element to be moused over
	 */
	public boolean mouseOverByLinkText(String linkName) {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.linkText(linkName))).build().perform();
			Reporter.reportStep("The mouse over by link : " + linkName + " is performed.", "PASS");

			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The mouse over by link : " + linkName + " could not be performed.", "FAIL");
		}
		return bReturn;
	}

	public String getTextByXpath(String xpathVal) {
		String bReturn = "";
		try {
			getTxt = driver.findElement(By.xpath(xpathVal)).getText();
			System.out.println(getTxt);
		} catch (Exception e) {
			Reporter.reportStep("The element with xpath: " + xpathVal + " could not be found.", "FAIL");
		}
		return bReturn;
	}
	public String getTextSplitByXpath(String xpathVal,String textbox) {
		String bReturn = "";
		try {
			clickById(prop.getProperty("Home.Humburger.id"));
			getTxt = driver.findElement(By.xpath(xpathVal)).getText();
			String[] split=getTxt.split(" ");
			for(int i=0;i<split.length;i++) {
			}
		    String value=split[1];
			System.out.println(split[1]);
			driver.findElement(By.xpath(textbox)).sendKeys(value);
		} catch (Exception e) {
			Reporter.reportStep("The element with xpath: " + xpathVal + " could not be found.", "FAIL");
		}
		return bReturn;
	}
	/**
	 * @author ACL - QATeam This method will store the LeadID for the first record *
	 */
	public String GettextFirstRecord(String xpathVal) {
		String ldId = driver.findElementByXPath(xpathVal).getText();
		return ldId;
	}

	/**
	 * @author ACL - QATeam This method will select the drop down value using id as
	 *         locator
	 * @param id    The id (locator) of the drop down element
	 * @param value The value to be selected (visible text) from the dropdown
	 */
	public boolean selectById(String id, String value) {
		boolean bReturn = false;
		try {
			WebElement selectElement = driver.findElement(By.id(id));
	        Select select = new Select(selectElement);
//			new Select(driver.findElement(By.id(id))).selectByVisibleText(value);
	        select.selectByVisibleText(value);
			Reporter.reportStep("The element with id: " + id + " is selected with value :" + value, "PASS");
			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The value: " + value + " could not be selected.", "FAIL");
		}
		return bReturn;
	}

	public boolean selectByName(String name, String value) {
		boolean bReturn = false;
		try {
	        WebElement selectElement = driver.findElement(By.name(name));
	        Select select = new Select(selectElement);
	        select.selectByValue(value);

//			new Select(driver.findElement(By.name(name))).selectByVisibleText(value);
			Reporter.reportStep("The element with name: " + name + " is selected with value :" + value, "PASS");

			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The value: " + value + " could not be selected.", "FAIL");
		}
		return bReturn;
	}

	public void loadObjects() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(new File("./object.properties")));

	}

	public boolean switchToParentWindow() {
		boolean bReturn = false;
		try {
			// driver.switchTo().window(primaryWindowHandle);
			// TODO Auto-generated method stub
			Set<String> allWin = driver.getWindowHandles();
			System.out.println(allWin.size());
			for (String eachWin : allWin) {
				driver.switchTo().window(eachWin);
				break;
			}
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("Unable to switch to parent window", "FAIL");
		}
		return bReturn;
	}

	public boolean switchToLastWindow() {
		boolean bReturn = false;
		try {
			// TODO Auto-generated method stub
			Set<String> allWin = driver.getWindowHandles();
			System.out.println(allWin.size());
			for (String eachWin : allWin) {
				driver.switchTo().window(eachWin);
			}
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("Unable to switch to Child window", "FAIL");
		}
		return bReturn;
	}

	public void acceptAlert() throws InterruptedException {
		driver.switchTo().alert().accept();
	}

	public boolean Rowcount(String xpathVal) {
		boolean bReturn = false;
		try {
			List<WebElement> c = driver.findElementsByXPath(xpathVal);
			int count = c.size();

			if (count != 0) {
				Reporter.reportStep("There are " + count + " records displayed for the search criteria", "Pass");
				bReturn = true;
			} else {
				Reporter.reportStep(count + " records displayed for the search criteria", "Fail");
				bReturn = false;
			}
		} catch (Exception e) {
			Reporter.reportStep("Unable to proceed testing", "FAIL");
		}

		return bReturn;

	}

	public boolean selectByXpath(String name, String value) {
		boolean bReturn = false;
		String txt = "";
		try {
			new WebDriverWait(driver, 90).until(
					ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
			new Select(driver.findElement(By.xpath(name))).selectByVisibleText(value);
			txt = driver.findElement(By.xpath(name)).getText();

			Reporter.reportStep("The element with xpath: " + txt + " is selected with value :" + value, "PASS");

			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The value: " + value + " could not be selected.", "FAIL");
		}
		return bReturn;
	}

	public boolean invokeGmail(String browser) {
		boolean bReturn = false;
		try {

			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName(browser);
			dc.setPlatform(Platform.WINDOWS);
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/c.exe");
				driver = new ChromeDriver();
			} else
				driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(sUrl1);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			primaryWindowHandle = driver.getWindowHandle();
			Reporter.reportStep("The browser:" + browser + " launched successfully", "PASS");
			bReturn = true;

		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The browser:" + browser + " could not be launched", "FAIL");
		}
		return bReturn;
	}

	public String getTextByXpath1(String xpathVal) {
		String bReturn = "";
		try {
			getTxt = driver.findElement(By.xpath(xpathVal)).getText().substring(17, 20);
			System.out.println(getTxt);
		} catch (Exception e) {
			Reporter.reportStep("The element with xpath: " + xpathVal + " could not be found.", "FAIL");
		}
		return bReturn;
	}

	public boolean checkDisplay(String xpath, String text) {
		boolean bReturn = false;

		try {
			new WebDriverWait(driver, 90).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			driver.findElementByXPath(xpath);
			boolean sText = driver.findElementByXPath(xpath).isDisplayed();

			if (driver.findElementByXPath(xpath).isDisplayed()) {
				String sText1 = driver.findElement(By.xpath(xpath)).getText();
				Reporter.reportStep("The text: " + sText + " displays the value " + sText1, "PASS");

			} else {
				boolean stext1 = driver.findElement(By.xpath(xpath)).getText().isEmpty();
				Reporter.reportStep("The text displays the value :" + stext1, "FAIL");

			}
			bReturn = true;
		} catch (NoSuchElementException e) {

			Reporter.reportStep("The text is not displayed :" + text, "FAIL");
		} catch (WebDriverException e) {

		}
		return bReturn;
	}

	public boolean enterByXpathwithoutClear(String nameVal, String data) {
		boolean bReturn = false;
		String txt = "";
		try {

			new WebDriverWait(driver, 90).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nameVal)));
			//
			txt = driver.findElement(By.xpath(nameVal)).getAttribute("name");
			// driver.findElement(By.xpath(nameVal)).clear();
			driver.findElement(By.xpath(nameVal)).sendKeys(data);
			Reporter.reportStep("The data: " + data + " entered successfully in field :" + txt, "PASS");
			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The data: " + data + " could not be entered in the field :" + txt + e, "FAIL");
		}
		return bReturn;
	}

	public boolean switchToTabs() {
		boolean bReturn = false;
		try {
			// driver.switchTo().window(primaryWindowHandle);
			// TODO Auto-generated method stub
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(5000);
			driver.close();
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(5000);
		}
		// bReturn = true;
		catch (Exception e) {
			Reporter.reportStep("Unable to switch to tab", "FAIL");
		}
		return bReturn;
	}

	public boolean verifyTextContainsById(String id, String text) {
		boolean bReturn = false;

		try {
			driver.findElementById(id);
			String sText = driver.findElementById(id).getText();

			if (driver.findElementById(id).getText().trim().contains(text)) {
				Reporter.reportStep("The text: " + sText + " contains the value :" + text, "PASS");

			} else {
				Reporter.reportStep("The text: " + sText + " did not contain the value :" + text, "FAIL");

			}
			bReturn = true;
		} catch (NoSuchElementException e) {

			Reporter.reportStep("The text not found :" + text, "FAIL");
		} catch (WebDriverException e) {

		}
		return bReturn;
	}

	public boolean verifyAttributeContainsById(String id, String text) {
		boolean bReturn = false;

		try {
			driver.findElementById(id);
			String sText = driver.findElementById(id).getAttribute("value");

			if (driver.findElementById(id).getAttribute("value").trim().contains(text)) {
				Reporter.reportStep("The text: " + sText + " contains the value :" + text, "PASS");
			}
			bReturn = true;

		} catch (NoSuchElementException e) {

			Reporter.reportStep("The text not found :" + text, "FAIL");
		} catch (WebDriverException e) {

		}
		return bReturn;
	}

	public boolean switchToFrame() {
		boolean bReturn = false;

		try {
			// TODO Auto-generated method stub
			driver.switchTo().frame("RadWindow1");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("Unable to switch to Frame", "FAIL");
		}
		return bReturn;
	}

	public boolean verifyAttributeContainsByXPath(String xpath, String text) {
		boolean bReturn = false;

		try {
			
			driver.findElementByXPath(xpath);
			String sText = driver.findElementByXPath(xpath).getAttribute("value");

			if (driver.findElementByXPath(xpath).getAttribute("value").trim().contains(text)) {
				Reporter.reportStep("The text: " + sText + " contains the value :" + text, "PASS");

			} else {
				Reporter.reportStep("The text: " + sText + " did not contain the value :" + text, "FAIL");

			}
			bReturn = true;
		} catch (NoSuchElementException e) {

			Reporter.reportStep("The text not found :" + text, "FAIL");
		} catch (WebDriverException e) {

		}
		return bReturn;
	}

	public void movetoPreviouspage() {
		try {
			driver.navigate().back();
			driver.navigate().back();
			Reporter.reportStep("Successfully navigates to the previous page", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("something went wrong", "Fail");

		}
	}
	/**
	 * @author -QATeam
	 * @param - This method getting all user's access pages
	 */
	public String VerifyUserRoles(String xpathVal,String xpaths,String data,String Subxpaths, String roleMatch) {
		String bReturn = "";
		try {
			getTxt = driver.findElement(By.xpath(xpathVal)).getText();
			System.out.println(getTxt);
			String[] split=getTxt.split(", ");
			for(int i=0;i<split.length;i++) {
				if(split[i].equals(data)) {
				System.out.println("Verified--"+data);
					}
				}
				clickById(prop.getProperty("Home.Humburger.id"));
				List<WebElement> linksText = driver.findElementsByXPath(xpaths);
				for(WebElement links:linksText) {
				System.out.println(links.getText());
	Reporter.reportStep("User accessing Module: " + links.getText() + " is selected with value :" +links.getText(), "PASS");
					}
		System.out.println();

		List<WebElement> SublinksText = driver.findElementsByXPath(Subxpaths);
		for(WebElement links:SublinksText) {
		//System.out.println(links.getAttribute("innerHTML"));
		if(roleMatch.contains(links.getAttribute("innerHTML"))){
			System.out.println(links.getAttribute("innerHTML").toString()+" - Match found");
		}else{
			System.err.println(links.getAttribute("innerHTML").toString()+" - Match not found ,Remove access for Roles");
		}
		Reporter.reportStep("User accessing Web Pages: " + links.getAttribute("innerHTML") + " is selected with value :" +links.getAttribute("innerHTML"), "PASS");
		}
						
		} catch (Exception e) {
			Reporter.reportStep("The element with xpath: " + xpathVal + " could not be found.", "FAIL");
		}
		return bReturn;
	}
	/**
	 * @author -QATeam
	 * @param - This method getting installer's access pages
	 */
	
	public String installerVerification(String xpaths, String Subxpaths,String roleMatch) {
		String bReturn = "";
		try {
			List<WebElement> linksText = driver.findElementsByXPath(xpaths);
			for(WebElement links:linksText) {
				System.out.println(links.getText());
	Reporter.reportStep("User accessing Module: " + links.getText() + " is selected with value :" +links.getText(), "PASS");
				}
			System.out.println();
			List<WebElement> SublinksText = driver.findElementsByXPath(Subxpaths);
			for(WebElement links:SublinksText) {
				//System.out.println(links.getAttribute("innerHTML"));
				if(roleMatch.contains(links.getAttribute("innerHTML"))){
					System.out.println(links.getAttribute("innerHTML").toString()+" - Match found");
				}else{
					System.err.println(links.getAttribute("innerHTML").toString()+" - Match not found");
				}
				Reporter.reportStep("User accessing Web Pages: " + links.getAttribute("innerHTML") + " is selected with value :" +links.getAttribute("innerHTML"), "PASS");
			}
			
		} catch (Exception e) {
			Reporter.reportStep("The element with xpath: " + xpaths + " could not be found.", "FAIL");
			Reporter.reportStep("The element with xpath: " + Subxpaths + " could not be found.", "FAIL");
		}
		return bReturn;
	}
	/*public Date yesterday() {
	    final Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -1);
	    return cal.getTime();
	}*/
	public String getYesterdayDateString() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
        
        return dateFormat.format(yesterday());
}
	private Date yesterday() {
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -1);
	    Date yesterday=cal.getTime();
		return null;
	}

	public String DategetText(String xpath) throws InterruptedException {
		String bReturn = "";
         //try {
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		String text = driver.findElementByXPath(xpath).getText();
		String title=driver.getTitle();
		System.out.println(title +'='+ text);
		/*if (text.trim().contains(getYesterdayDateString())) {
			Reporter.reportStep("The text: " + text + " contains the value :" +title +'='+ text, "PASS");
			
		} else {
			Reporter.reportStep("The text: " + text + " did not contain the value :title +'='+" + text, "FAIL");
		}*/
		driver.switchTo().defaultContent();
		return bReturn;
         }
	/**
	 * @author -QATeam
	 * @param - This method for randomly click on element
	 */
public String RandomClick(String xpath){
	String bReturn = "";
	List<WebElement> ele=driver.findElementsByXPath(xpath);
	for(int i=0;i<ele.size();i++){
		Random r=new Random();
		ele.get(r.nextInt(ele.size())).click();
	}
	return bReturn;
}

}
