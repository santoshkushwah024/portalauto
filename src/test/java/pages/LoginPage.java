package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import globaldata.Constants;
import trigger.Execution;

public class LoginPage {
	public static void LoginHome() throws InterruptedException {
		Thread.sleep(2000);
		Constants.driver.navigate().refresh();
		Thread.sleep(2000);
		String ttl = new String(Constants.driver.getTitle());
		Assert.assertEquals(ttl, "TeleDNA-SMSC");
		System.out.println(ttl + " " + "Title verified Successfully");
		Thread.sleep(2000);
		Constants.driver.switchTo().frame("indexFrame");
		Thread.sleep(1000);
		Constants.driver.findElement(By.xpath("//input[@name='loginId']")).sendKeys("admin");
		Constants.driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Admin@1");
		Constants.driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(1000);
		String login = Constants.driver
				.findElement(By.xpath("//form//table//tbody//tr//td//tbody//tr[3]//td//tbody//td[2]//font")).getText();
		Assert.assertEquals(login, " Welcome admin");
		if(login.equalsIgnoreCase(" Welcome admin")){
		//System.out.println(login + " : " + "Admin Logged in successfully");
		Execution.test.log(LogStatus.PASS, "Admin Logged in successfully");
	}else {
		Execution.test.log(LogStatus.FAIL, "INVALID USER NAME OR PASSWORD");
	}
}

	public static void logout() {
        Constants.driver.findElement(By.xpath("//a[contains(@href,'signout')]")).click();
        System.out.println("Admin Logged out SuccessFully");
        Execution.test.log(LogStatus.PASS, "Admin Logged out successfully");
        Constants.driver.quit();
	}

}
