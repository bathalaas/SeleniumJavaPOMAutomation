package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class LoginPage extends PcorpWrappers{
	public LoginPage() throws InterruptedException {
		if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}

	public LoginPage enterUsername(String data) throws FileNotFoundException, IOException {
		enterById(prop.getProperty("Home.Username.id"), data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		enterById(prop.getProperty("Home.Password.id"), data);
		return this;
		} 
	
	public MainMenu clickLoginButton() throws InterruptedException {
		clickById(prop.getProperty("Home.Login.id"));
		return new MainMenu();
		}
	
	public LoginPage clickSitefinityWm() {
		clickByXpath(prop.getProperty("Sitefinity.WarningMsg.Xpath"));
		return this;
	}
	public LoginPage clickSitefinityLogin() {
		clickById(prop.getProperty("Sitefinity.LoginButton.Id"));
		return this;
	}
	 public LoginPage clickTryAgain() throws InterruptedException {
		 clickById(prop.getProperty("Sitefinity.TryAgain.Id"));
		 return new LoginPage();
		 }


	public LoginPage clickPopup() {
		clickByXpath(prop.getProperty("Homepage.Popup.xpath"));
		return this;
	}
	
		}


