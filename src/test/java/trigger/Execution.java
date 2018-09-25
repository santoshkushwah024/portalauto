package trigger;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import globaldata.BrowserFunctions;
import pages.AdminOperations;
import pages.LoginPage;
import pages.TabsVerification;

public class Execution {
	public static ExtentTest test;
	public static ExtentReports report;
			
	@BeforeClass
	public static void launch() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\smsc2PortalReport.html",true);
		test = report.startTest("ExtentDemo");
		BrowserFunctions.launch();
		test.log(LogStatus.PASS, "Browser Lauched Succesfully");
	}

	@Test(priority = 1)
	public static void login() throws InterruptedException {
		LoginPage.LoginHome();
		test.log(LogStatus.PASS,"Login Is SuccessFull");

	}
	
	  @Test(priority = 2)
	  public void tabs() throws InterruptedException {
	  TabsVerification.verification();
	  test.log(LogStatus.PASS,"Login Is Tabs Verification is Succesfull");
	  
	  }
	 
	@Test(priority = 3)
	public static void links() throws Exception {
		AdminOperations.operations();
		test.log(LogStatus.PASS,"Admin Operations is SuccessFull");
		AdminOperations.getLinks();
		test.log(LogStatus.PASS,"Get Links ");
		
	}
	
	@AfterClass
	public static void logout() {
		report.endTest(test);
		report.flush();
		LoginPage.logout();
	}

}
