package pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Admin_AppointmentManagement extends PcorpWrappers{
	public Admin_AppointmentManagement() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public Admin_AppointmentManagement Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public Admin_AppointmentManagement clickNextButton() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.nextbutton.Xpath"));
		return this;
	
	}
	
	public Admin_AppointmentManagement clickTimeSlot1() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.timeslot1.Xpath"));
		return this;
		}
	
	public Admin_AppointmentManagement clickCustom() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.customrangeradiobutton.Xpath"));
		return this;
		}
	
	
	public Admin_AppointmentManagement EnterStartDate() {
		
		String s ="";		
        s = driver.findElement(By.id("CustomRangeStarttime")).getAttribute("value");
        System.out.println(s);
		String format = "mm/dd/yyyy";
	    SimpleDateFormat simpleFormat = new SimpleDateFormat("mm/dd/yyyy");
	    java.text.DateFormat df = new java.text.SimpleDateFormat(format);
	    java.util.Calendar calendar = java.util.Calendar.getInstance();
	    try {
	        calendar.setTime(df.parse(s));
	        calendar.add(java.util.Calendar.DAY_OF_MONTH, +1);
	        String formatted = simpleFormat.format(calendar.getTime());
	        System.out.println(formatted);
	        driver.findElement(By.id("CustomRangeStarttime")).clear();
		    driver.findElement(By.id("CustomRangeStarttime")).sendKeys(formatted);
	    } catch (Exception ex) {
	        System.out.println("Error: " + ex.toString());
	    }
	
	   		return this;
	}
	
	public Admin_AppointmentManagement clickMonth() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.Month.Xpath"));
		return this;
		}
	
	public Admin_AppointmentManagement clickMonthnext() throws InterruptedException {
		
		new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='fc-icon fc-icon-right-single-arrow']")));
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='fc-icon fc-icon-right-single-arrow']")));
		clickByXpath(prop.getProperty("Acc.Monthnext.Xpath"));
		return this;
		}
	
	public Admin_AppointmentManagement clickDeleteMonthlyThresold() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.Delmonth.Xpath"));
		return this;
		}
	
	public Admin_AppointmentManagement clickAppointment() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.appointment.Xpath"));
		return this;
		}
	
	public Admin_AppointmentManagement clickTimeSlot2() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.timeslot2.Xpath"));
		return this;
		}
	
	public Admin_AppointmentManagement EnterElectricThresold(String data) {
		enterById(prop.getProperty("Acc.electric.id"), data);
		return this;
	}
	
	public Admin_AppointmentManagement EnterGasThresold(String data) {
		enterById(prop.getProperty("Acc.Gas.id"), data);
		return this;
	}
	
	public Admin_AppointmentManagement EnterNetworkThresold(String data) {
		enterById(prop.getProperty("Acc.Network.id"), data);
		return this;
	}
	public Admin_AppointmentManagement EnterWaterThresold(String data) {
		enterById(prop.getProperty("Acc.Water.id"), data);
		return this;
	}
	
	
	public Admin_AppointmentManagement clickSave() throws InterruptedException {
		clickById(prop.getProperty("Acc.save.id"));
		return this;
	
	}
	
	public Admin_AppointmentManagement verifyThresold(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyAttributeContainsById(prop.getProperty("Acc.electric.id"), data);
		return this;
	}
	
	public Admin_AppointmentManagement clickDelete() throws InterruptedException {
		clickById(prop.getProperty("Acc.delete.id"));
		return this;
	}
	
	public Admin_AppointmentManagement clickClose() throws InterruptedException {
		clickById(prop.getProperty("Acc.close.id"));
		return this;
	}

	public LoginPage clickLogoff() throws InterruptedException {
		clickByClassName(prop.getProperty("Home.Logoff.class"));
		return new LoginPage();
		}

	
	
	public Admin_AppointmentManagement clickConfirmButton() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.confirm.Xpath"));
		return this;
		}
	
	
	public Admin_AppointmentManagement clickMenu41() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu41.Xpath"));
		return new Admin_AppointmentManagement();
	
	}

		public Admin_AppointmentManagement clickSignInButton1() throws InterruptedException  {
			clickByXpath(prop.getProperty("Login.SignInButton.Xpath"));
			Thread.sleep(2000);
			return this;
			}

		
		public Admin_AppointmentManagement switchback() throws InterruptedException {
			Thread.sleep(2000);
			switchToParentWindow();
			return new Admin_AppointmentManagement();			
			}

		public Admin_AppointmentManagement clickSearch1() throws InterruptedException {
			  // Gets control of javascript engine to execute scripts
		    JavascriptExecutor js = ((JavascriptExecutor) driver);
		  
		    //Scrolls to top of page
		    js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			
		    Thread.sleep(5000);
			
			clickByXpath(prop.getProperty("Home.ArizonaSearch.Xpath"));
			return this;
		}

		public Admin_AppointmentManagement clickSignOut() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Signout.Xpath"));
			return new Admin_AppointmentManagement();
		}

		public Admin_AppointmentManagement clickFindSearchDisabled() {
			clickByXpath(prop.getProperty("Home.FindsearchDisabled.Xpath"));
			return this;
		}

}
