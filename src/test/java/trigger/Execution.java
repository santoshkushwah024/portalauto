package trigger;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import globaldata.BrowserFunctions;
import pages.AdminOperations;
import pages.LoginPage;

public class Execution {
	@BeforeClass
	public static void launch() {
		BrowserFunctions.launch();
	}

	@Test(priority = 1)
	public static void login() throws InterruptedException {
		LoginPage.LoginHome();

	}

	@Test(priority = 2)
	public static void links() throws Exception {
		AdminOperations.operations();
		AdminOperations.getLinks();
	
		
		
	}
/*
	@AfterClass
	public static void logout() {
		LoginPage.logout();
	}
	*/
}
