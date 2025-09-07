package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class AppointmentConfigurationCalendar extends PcorpWrappers{
	public AppointmentConfigurationCalendar() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public AppointmentConfigurationCalendar Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public AppointmentConfigurationCalendar clickNextButton() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.nextbutton.Xpath"));
		return this;
	
	}
	
	public AppointmentConfigurationCalendar clickTimeSlot1() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.timeslot1.Xpath"));
		return this;
		}
	
	public AppointmentConfigurationCalendar clickAppointment() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.appointment.Xpath"));
		return this;
		}
	
	public AppointmentConfigurationCalendar clickTimeSlot2() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.timeslot2.Xpath"));
		return this;
		}
	
	public AppointmentConfigurationCalendar EnterElectricThresold(String data) {
		enterById(prop.getProperty("Acc.electric.id"), data);
		return this;
	}
	
	
	public AppointmentConfigurationCalendar clickSave() throws InterruptedException {
		clickById(prop.getProperty("Acc.save.id"));
		return this;
	
	}
	
	public AppointmentConfigurationCalendar verifyThresold(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyAttributeContainsById(prop.getProperty("Acc.electric.id"), data);
		return this;
	}
	
	public AppointmentConfigurationCalendar clickDelete() throws InterruptedException {
		clickById(prop.getProperty("Acc.delete.id"));
		return this;
	}
	
	public AppointmentConfigurationCalendar clickClose() throws InterruptedException {
		clickById(prop.getProperty("Acc.close.id"));
		return this;
	}

	public LoginPage clickLogoff() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Logoff.Xpath"));
		return new LoginPage();
		}

	
	
	public AppointmentConfigurationCalendar clickConfirmButton() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.confirm.Xpath"));
		return this;
		}
	
	
	public AppointmentConfigurationCalendar clickMenu41() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu41.Xpath"));
		return new AppointmentConfigurationCalendar();
	
	}

		public AppointmentConfigurationCalendar clickSignInButton1() throws InterruptedException  {
			clickByXpath(prop.getProperty("Login.SignInButton.Xpath"));
			Thread.sleep(2000);
			return this;
			}

		
		public AppointmentConfigurationCalendar switchback() throws InterruptedException {
			Thread.sleep(2000);
			switchToParentWindow();
			return new AppointmentConfigurationCalendar();			
			}

		public AppointmentConfigurationCalendar clickSearch1() throws InterruptedException {
			  // Gets control of javascript engine to execute scripts
		    JavascriptExecutor js = ((JavascriptExecutor) driver);
		  
		    //Scrolls to top of page
		    js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			
		    Thread.sleep(5000);
			
			clickByXpath(prop.getProperty("Home.ArizonaSearch.Xpath"));
			return this;
		}

		public AppointmentConfigurationCalendar clickSignOut() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Signout.Xpath"));
			return new AppointmentConfigurationCalendar();
		}

		public AppointmentConfigurationCalendar clickFindSearchDisabled() {
			clickByXpath(prop.getProperty("Home.FindsearchDisabled.Xpath"));
			return this;
		}

}
