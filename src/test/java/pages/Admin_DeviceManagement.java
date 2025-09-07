package pages;

import java.sql.Timestamp;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Admin_DeviceManagement extends PcorpWrappers{
	public Admin_DeviceManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Admin_DeviceManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
		
	public Admin_DeviceManagement clickAdddevice() throws InterruptedException {
		clickById(prop.getProperty("All.Add.id"));
		return this;
		}
	
		public Admin_DeviceManagement clickCancel() throws InterruptedException {
		Date date = new Date();
       	switchToFrame();
        System.out.println("After swtch to frame"+ new Timestamp(date.getTime()));
		clickById(prop.getProperty("All.Cancel.id"));
		driver.switchTo().defaultContent();
		System.out.println("back to default"+new Timestamp(date.getTime()));
		return this;
		}
		
		
		public Admin_DeviceManagement clickView() throws InterruptedException {
			clickByXpath(prop.getProperty("CM.view.Xpath"));
			return this;
			}
		
		public Admin_DeviceManagement clickClose() throws InterruptedException {
			switchToFrame();
	        clickById(prop.getProperty("All.Cancel.id"));
			driver.switchTo().defaultContent();
			return this;
			}
		
		public Admin_DeviceManagement clickAddSkillset() throws InterruptedException {
			clickById(prop.getProperty("All.Add.id"));
			return this;
			}
		
		public Admin_DeviceManagement clickAddNew() throws InterruptedException {
			clickById(prop.getProperty("All.Add.id"));
			return this;
			}
	public MainMenu clickMenu7() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu7.Xpath"));
		return new MainMenu();
		}
	
	public LoginPage clickLogoff() throws InterruptedException {
		clickById(prop.getProperty("Home.Logoff.id"));
		return new LoginPage();
		}

	public MainMenu clickHumburger() throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return new MainMenu();
			}

	}
