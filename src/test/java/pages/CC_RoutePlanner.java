package pages;

import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class CC_RoutePlanner extends PcorpWrappers{
	public CC_RoutePlanner() throws InterruptedException {
		if(!verifyTitle("PCORP-T Home"));
			//Reporter.reportStep("This is not the Routeplanner Page", "FAIL");
		//Thread.sleep(5000);
	}
	
	public CC_RoutePlanner Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
	      verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}
	
	public MainMenu clickMenu2() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu2.Xpath"));
		return new MainMenu();
	
	}
	
	public CC_RoutePlanner clickMenu3() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu3.Xpath"));
		return this;
	
	}

	public MainMenu clickMenu4() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu4.Xpath"));
		return new MainMenu();
	
	}
	
	public CC_RoutePlanner clickMenu41() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Menu41.Xpath"));
		return new CC_RoutePlanner();
	
	}

		public CC_RoutePlanner clickSignInButton1() throws InterruptedException  {
			clickByXpath(prop.getProperty("Login.SignInButton.Xpath"));
			Thread.sleep(2000);
			return this;
			}

		
		public CC_RoutePlanner switchback() throws InterruptedException {
			Thread.sleep(2000);
			switchToParentWindow();
			return new CC_RoutePlanner();			
			}

		public CC_RoutePlanner clickSearch1() throws InterruptedException {
			  // Gets control of javascript engine to execute scripts
		    JavascriptExecutor js = ((JavascriptExecutor) driver);
		  
		    //Scrolls to top of page
		    js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			
		    Thread.sleep(5000);
			
			clickByXpath(prop.getProperty("Home.ArizonaSearch.Xpath"));
			return this;
		}

		public CC_RoutePlanner clickSignOut() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Signout.Xpath"));
			return new CC_RoutePlanner();
		}

		public CC_RoutePlanner clickFindSearchDisabled() {
			clickByXpath(prop.getProperty("Home.FindsearchDisabled.Xpath"));
			return this;
		}

		public MainMenu clickHumburger() throws InterruptedException {
			clickById(prop.getProperty("Home.Humburger.id"));
			return new MainMenu();
	}
		
		public CC_RoutePlanner clickNextButton() throws InterruptedException {
			clickByXpath(prop.getProperty("Acc.nextbutton.Xpath"));
			return this;
		
		}		
		public CC_RoutePlanner clickTimeSlot1() throws InterruptedException {
			clickByXpath(prop.getProperty("Acc.timeslot1.Xpath"));
			return this;
			}
 	
	public CC_RoutePlanner EnterElectricThresold(String data) {
		enterById(prop.getProperty("Acc.electric.id"), data);
		return this;
	}
	
	public CC_RoutePlanner clickSave() throws InterruptedException {
		clickById(prop.getProperty("Acc.save.id"));
		return this;
	
	}
	
	public CC_RoutePlanner clickAppointment() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.appointment.Xpath"));
		return this;
		}
	
	public CC_RoutePlanner verifyThresold(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyAttributeContainsById(prop.getProperty("Acc.electric.id"), data);
		return this;
	}
	
	public CC_RoutePlanner clickDelete() throws InterruptedException {
		clickById(prop.getProperty("Acc.delete.id"));
		return this;
	}
	
	public CC_RoutePlanner clickConfirmButton() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.confirm.Xpath"));
		return this;
		}

	public LoginPage clickLogoff() throws InterruptedException {
		clickByClassName(prop.getProperty("Home.Logoff.class"));
		return new LoginPage();
		}

	
	public CC_RoutePlanner clickMonth() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.Month.Xpath"));
		return this;
		}
	
	public CC_RoutePlanner clickDeleteMonthlyThresold() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.Delmonth.Xpath"));
		return this;
		}
	
	public CC_RoutePlanner clickCustom() throws InterruptedException {
		clickByXpath(prop.getProperty("Acc.customrangeradiobutton.Xpath"));
		return this;
		}
	
	public CC_RoutePlanner EnterStartDate() {
		
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
	
	public CC_RoutePlanner EnterGasThresold(String data) {
		enterById(prop.getProperty("Acc.Gas.id"), data);
		return this;
	}
	
	public CC_RoutePlanner EnterNetworkThresold(String data) {
		enterById(prop.getProperty("Acc.Network.id"), data);
		return this;
	}
	public CC_RoutePlanner EnterWaterThresold(String data) {
		enterById(prop.getProperty("Acc.Water.id"), data);
		return this;
	}

	
	public CC_RoutePlanner clickClose() throws InterruptedException {
		clickById(prop.getProperty("Acc.close.id"));
		return this;
	}

	public CC_RoutePlanner clickMonthnext() throws InterruptedException {
			
			new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='fc-icon fc-icon-right-single-arrow']")));
			new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='fc-icon fc-icon-right-single-arrow']")));
			clickByXpath(prop.getProperty("Acc.Monthnext.Xpath"));
			return this;
			}
}
