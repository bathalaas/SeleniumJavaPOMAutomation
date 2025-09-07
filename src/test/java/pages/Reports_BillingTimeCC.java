package pages;

//div[text()='District/Route Saturation Report']
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Reporter;
import wrappers.PcorpWrappers;

public class Reports_BillingTimeCC extends PcorpWrappers{
//	public Reports_BillingTimeCC() throws InterruptedException {
//		if(!verifyTitle("PCORP-T Home"));
//	}

	public Reports_BillingTimeCC Verifybreadcrumbs(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextContainsById(prop.getProperty("All.breadcrumbs.id"), data);
		return this;
	}

	public Reports_BillingTimeCC clickStartdate() throws InterruptedException {
		clickById(prop.getProperty("RSR.calStartDate.id"));
		return this;
	}

	public Reports_BillingTimeCC clickPreviousmonth() throws InterruptedException {
		clickById(prop.getProperty("RSR.previousMonth.id"));
		return this;
	}

	public Reports_BillingTimeCC pickDate() throws InterruptedException {
		clickByXpath(prop.getProperty("RSR.pickDate.Xpath"));
		return this;
	}

	public Reports_BillingTimeCC clickFilter() throws InterruptedException {
		clickById(prop.getProperty("RSR.filterButton.id"));
		return this;
	}

	public Reports_ProductionReports VerifyReportHeader(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextContainsByXpath(prop.getProperty("RSR.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}

	public Reports_ProductionReports VerifyReportHeaderBR(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextContainsByXpath(prop.getProperty("BR.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}

	public Reports_ProductionReports VerifyReportHeaderTTR(String data) throws InterruptedException {
		//Thread.sleep(3000);
		//verifyTextContainsByXpath(prop.getProperty("TTR.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}

	public Reports_ProductionReports VerifyReportHeaderCCR(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextContainsByXpath(prop.getProperty("CCR.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}

	public Reports_BillingTimeCC clickEscalateStartdate() throws InterruptedException {
		clickById(prop.getProperty("RTU.calStartDate.id"));
		return this;
	}

	public Reports_BillingTimeCC clickEscalatePreviousmonth() throws InterruptedException {
		
		clickById(prop.getProperty("RTU.previousMonth.id"));
		return this;
	}

	public Reports_ProductionReports VerifyReportHeaderRTU(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextContainsByXpath(prop.getProperty("RTU.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}

	public Reports_ProductionReports VerifyReportHeaderPER(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextContainsByXpath(prop.getProperty("PER.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}


	public Reports_ProductionReports VerifyReportHeaderFER(String data) throws InterruptedException {
		//Thread.sleep(3000);
		verifyTextContainsByXpath(prop.getProperty("FER.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}

	public Reports_ProductionReports VerifyReportHeaderITTR(String data) throws InterruptedException {
		//Thread.sleep(2000);
		verifyTextContainsByXpath(prop.getProperty("ITTR.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}

	public Reports_ProductionReports VerifyReportHeaderITTD(String data) throws InterruptedException {
		//Thread.sleep(2000);
		verifyTextContainsByXpath(prop.getProperty("ITTD.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}

	public Reports_ProductionReports VerifyReportHeaderMAR(String data) throws InterruptedException {
		//Thread.sleep(2000);
		verifyTextContainsByXpath(prop.getProperty("MAR.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}

	public Reports_BillingTimeCC clickSave() throws InterruptedException {
		clickByXpath(prop.getProperty("IRR.Save.Xpath"));
		return this;
	}

	public Reports_BillingTimeCC ClickExcel() throws InterruptedException {
		clickByXpath(prop.getProperty("IRR.SaveExcel.Xpath"));
			return this;
	}
	
	public Reports_ProductionReports VerifyReportHeaderIIR(String data) throws InterruptedException {
		//Thread.sleep(2000);
		//verifyTextContainsByXpath(prop.getProperty("IRR.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}
	

	public Reports_BillingTimeCC clickAIRStartdate() throws InterruptedException {
		clickById(prop.getProperty("AIR.calStartDate.id"));
		return this;
	}

	public Reports_BillingTimeCC clickAIRPreviousmonth() throws InterruptedException {
		clickById(prop.getProperty("AIR.previousMonth.id"));
		return this;
	}
	
	public Reports_ProductionReports VerifyReportHeaderAIR(String data) throws InterruptedException {
		//Thread.sleep(2000);
		verifyTextContainsByXpath(prop.getProperty("AIR.reportHeader.Xpath"), data);
		closeCurrentBrowser();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}
	
	public Reports_BillingTimeCC clickFilterBtn() throws InterruptedException {
		clickById(prop.getProperty("PQR.filterButton.id"));
		Thread.sleep(3000);
		return this;
		}
	
	public Reports_ProductionReports VerifyReportHeaderRTUS(String data) throws InterruptedException {
		//Thread.sleep(2000);
		verifyTextContainsByXpath(prop.getProperty("RTUS.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}
	
	public Reports_BillingTimeCC clickStartdatePopup() throws InterruptedException {
				clickById(prop.getProperty("PQR.calStartDate.id"));
		return this;
		}
	
	public Reports_BillingTimeCC clickPreviousmonthPopup() throws InterruptedException {
		clickById(prop.getProperty("PQR.previousMonth.id"));
		return this;
		}
	
	public Reports_ProductionReports VerifyReportHeaderSR(String data) throws InterruptedException {
		//verifyTextContainsByXpath(prop.getProperty("SR.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}

	public Reports_BillingTimeCC clickGPSStartdatePopup() throws InterruptedException {
		clickById(prop.getProperty("GPS.calStartDate.id"));
return this;
}

public Reports_BillingTimeCC clickGPSPreviousmonthPopup() throws InterruptedException {
clickById(prop.getProperty("GPS.previousMonth.id"));
return this;
}

	
    public Reports_ProductionReports VerifyReportHeaderGPS(String data) throws InterruptedException {
		verifyTextContainsByXpath(prop.getProperty("GPS.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}
	
    public Reports_ProductionReports VerifyReportHeaderCER(String data) throws InterruptedException {
		verifyTextContainsByXpath(prop.getProperty("CER.reportHeader.Xpath"), data);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
	}
	
    public Reports_ProductionReports VerifyReportHeaderJTC(String data) throws InterruptedException {
  		//verifyTextContainsByXpath(prop.getProperty("JTC.reportHeader.Xpath"), data);
  		driver.close();
  		switchToParentWindow();
  		return new Reports_ProductionReports();
  	}
    
    
    public Reports_BillingTimeCC SelectWarehouse(String data) {
    	selectById(prop.getProperty("IPR.Warehouse.id"), data);
		return this;
		}
    
	public Reports_BillingTimeCC enterVisitcount(String data) {
		enterById(prop.getProperty("CCD.visitcount.id"), data);
		return this;
		} 
	
	public Reports_ProductionReports clickSearchButton() throws InterruptedException {
		clickById(prop.getProperty("CCD.search.id"));
		Thread.sleep(5000);
		driver.close();
		switchToParentWindow();
		return new Reports_ProductionReports();
		}
    
	 public Reports_ProductionReports VerifyReportHeaderTSD(String data) throws InterruptedException {
	  		//verifyTextContainsByXpath(prop.getProperty("TSD.reportHeader.Xpath"), data);
	  		driver.close();
	  		switchToParentWindow();
	  		return new Reports_ProductionReports();
	  	}
	 
	 public Reports_ProductionReports VerifyReportHeaderID(String data) throws InterruptedException {
		 Thread.sleep(5000);
		 //verifyTextContainsByXpath(prop.getProperty("ID.reportHeader.Xpath"), data);
	  		driver.close();
	  		switchToParentWindow();
	  		return new Reports_ProductionReports();
	  	}
	 
	 public Reports_ProductionReports VerifyReportHeaderIIPR(String data) throws InterruptedException {
		 verifyTextContainsByXpath(prop.getProperty("IIPR.reportHeader.Xpath"), data);
			 return new Reports_ProductionReports();
	  	}
	 
	 public Reports_ProductionReports VerifyReportHeaderIMC(String data) throws InterruptedException {
		 Thread.sleep(3000);
		 verifyTextContainsByXpath(prop.getProperty("IMC.reportHeader.Xpath"), data);
			 return new Reports_ProductionReports();
	  	}
	 
	 public Reports_ProductionReports VerifyReportHeaderPQR(String data) throws InterruptedException {
			//Thread.sleep(3000);
		      verifyTextContainsByXpath(prop.getProperty("PQR.reportHeader.Xpath"), data);
		      return new Reports_ProductionReports();
		}
	 
	 public Reports_ProductionReports VerifyReportHeaderPQD(String data) throws InterruptedException {
			//Thread.sleep(3000);
		      verifyTextContainsByXpath(prop.getProperty("PQD.reportHeader.Xpath"), data);
		      return new Reports_ProductionReports();
		}
	 public Reports_BillingTimeCC SelectComparator(String data) {
	    	selectById(prop.getProperty("CCD.compare.id"), data);
			return this;
			}
	 
	 public Reports_BillingTimeCC clickStartingFromDate() throws InterruptedException {
			
			clickById(prop.getProperty("IPR.calStartDate.id"));
			return this;
			}
		
		public Reports_BillingTimeCC clickPreviousmonthFromDate() throws InterruptedException {
			clickById(prop.getProperty("IPR.previousMonth.id"));
			return this;
			}
		
		public Reports_ProductionReports VerifyReportHeaderFQC(String data) throws InterruptedException {
			//Thread.sleep(3000);
		      verifyTextContainsByXpath(prop.getProperty("FQC.reportHeader.Xpath"), data);
		      return new Reports_ProductionReports();
		}
		
		public Reports_ProductionReports VerifyReportHeaderFAR(String data) throws InterruptedException {
			//Thread.sleep(3000);
		      verifyTextContainsByXpath(prop.getProperty("FAR.reportHeader.Xpath"), data);
//		        closeCurrentBrowser();
//				switchToParentWindow();
		      return new Reports_ProductionReports();
		}
		 public Reports_BillingTimeCC SelectCompany(String data) {
		    	selectById(prop.getProperty("FAR.Company.id"), data);
				return this;
				}
		 
		 public Reports_BillingTimeCC clickSearch() throws InterruptedException {
				clickById(prop.getProperty("FAR.Search.id"));
				return this;
				}
		
		 public Reports_BillingTimeCC clickGenerateReport() throws InterruptedException {
				clickById(prop.getProperty("IF.GenerateReport.id"));
				switchToLastWindow();
				return this;
				}
		 
		 public Reports_ProductionReports VerifyReportHeaderIF(String data) throws InterruptedException {
				//Thread.sleep(3000);
			      verifyTextContainsByXpath(prop.getProperty("IF.reportHeader.Xpath"), data);
			        closeCurrentBrowser();
					switchToParentWindow();
			      return new Reports_ProductionReports();
		 }
		 public Reports_ProductionReports VerifyReportHeaderIFR(String data) throws InterruptedException {
				//Thread.sleep(3000);
			      verifyTextContainsByXpath(prop.getProperty("IFR.reportHeader.Xpath"), data);
			      return new Reports_ProductionReports();
		 }	 
	
		 public Reports_ProductionReports VerifyReportHeaderPQA(String data) throws InterruptedException {
				//Thread.sleep(3000);
			      verifyTextContainsByXpath(prop.getProperty("PQA.reportHeader.Xpath"), data);
			      return new Reports_ProductionReports();
		 }	 
		 
		 public Reports_BillingTimeCC SelectCompanyforSafetyReport(String data) {
		    	selectById(prop.getProperty("SRD.Company.id"), data);
				return this;
				}
		 
		 public Reports_BillingTimeCC clickSearchforSafetyReport() throws InterruptedException {
				clickById(prop.getProperty("SRD.Search.id"));
				return this;
				}
		 public Reports_ProductionReports VerifyReportHeaderSRD(String data) throws InterruptedException {
				//Thread.sleep(3000);
			      verifyTextContainsByXpath(prop.getProperty("SRD.reportHeader.Xpath"), data);
//			        closeCurrentBrowser();
//					switchToParentWindow();
			      return new Reports_ProductionReports();
		 }
		 
		 public Reports_BillingTimeCC clickAddnewRecord() throws InterruptedException {
				clickById(prop.getProperty("SMD.Add.id"));
				return this;
			}

			public Reports_BillingTimeCC clickCancel() throws InterruptedException {
				clickById(prop.getProperty("SMD.Cancel.id"));
				return this;
			}
		 
			public Reports_BillingTimeCC ClickProblemStatus() throws InterruptedException {
				clickByXpath(prop.getProperty("PER.ProblemStatus.Xpath"));
					return this;
			}

		public Reports_BillingTimeCC ClickClosedcheckbox() throws InterruptedException {
				clickByXpath(prop.getProperty("PER.ProblemStatusval.Xpath"));
					return this;
			}
		
		public Reports_BillingTimeCC clickSearchbtn() throws InterruptedException {
			clickById(prop.getProperty("PER.Search.id"));
			return this;
		}
	
			public MainMenu clickMenu8() throws InterruptedException {
				clickByXpath(prop.getProperty("Home.Menu8.Xpath"));
				return new MainMenu();
				}

			public Reports_BillingTimeCC VerifyReportHeaderPESR(String data) throws InterruptedException {
				//Thread.sleep(3000);
			      verifyTextContainsByXpath(prop.getProperty("PESR.reportHeader.Xpath"), data);
			        return this;
		 }
			
	 public LoginPage clickLogoff() throws InterruptedException {
		clickByClassName(prop.getProperty("Home.Logoff.class"));
		return new LoginPage();
		}

	public MainMenu clickHumburger() throws InterruptedException {
		clickById(prop.getProperty("Home.Humburger.id"));
		return new MainMenu();
		}

}
