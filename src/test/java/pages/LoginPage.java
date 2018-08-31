package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import globaldata.Constants;

public class LoginPage {
	public static void LoginHome() throws InterruptedException {
		Thread.sleep(2000);
		String ttl = new String(Constants.driver.getTitle());
		Assert.assertEquals(ttl, "TeleDNA-SMSC");
		System.out.println(ttl + " " + "Title verified Successfully");
		Constants.driver.switchTo().frame("indexFrame");
		Thread.sleep(1000);
		Constants.driver.findElement(By.xpath("//input[@name='loginId']")).sendKeys("admin");
		Constants.driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Admin@1");
		Constants.driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(1000);
		String login = Constants.driver
				.findElement(By.xpath("//form//table//tbody//tr//td//tbody//tr[3]//td//tbody//td[2]//font")).getText();
		Assert.assertEquals(login, " Welcome admin");
		System.out.println(login + " : " + "Admin Logged in successfully");

	}

	public static void logout() {
        Constants.driver.findElement(By.xpath("//a[contains(@href,'signout')]")).click();
        System.out.println("Admin Logged out SuccessFully");
        Constants.driver.quit();
	}

}
