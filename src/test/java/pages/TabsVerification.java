package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;

import globaldata.Constants;

public class TabsVerification {
	public static void verification() throws InterruptedException {
		//Click/Verification for the Administration Link
		String adm=Constants.driver.findElement(By.xpath("(//a[contains(@href,'admin')])[1]")).getText();
		Assert.assertEquals(adm, "Administration");
		System.out.println(adm);
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'admin')])[1]")).click();
		Thread.sleep(1000);
		
		//Click/Verification for Provisioning Link
		String pro=Constants.driver.findElement(By.xpath("(//a[contains(@href,'pro')])[1]")).getText();
		Assert.assertEquals(pro, "Provisioning");
		System.out.println(pro);
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'pro')])[1]")).click();
		Thread.sleep(1000);
		
		//Click/Verification for Mis Reports Link
		String mis=Constants.driver.findElement(By.xpath("//a[contains(@href,'mis')]")).getText();
		Assert.assertEquals(mis, "MIS Reports");
		System.out.println(mis);
		Constants.driver.findElement(By.xpath("//a[contains(@href,'mis')]")).click();
		Thread.sleep(1000);
		
		//Click/VErification of of Security Management
		String sec=Constants.driver.findElement(By.xpath("//a[contains(@href,'security')]")).getText();
		Assert.assertEquals(sec, "Security Management");
		System.out.println(sec);
		Constants.driver.findElement(By.xpath("//a[contains(@href,'security')]")).click();
		Thread.sleep(1000);
		
		//Click/verification of RAMT link
		String ram=Constants.driver.findElement(By.xpath("(//a[contains(@href,'ramt')])[1]")).getText();
		Assert.assertEquals(ram, "RAMT");
		System.out.println(ram);
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'ramt')])[1]")).click();
		Thread.sleep(1000);
		
		//Click/verification of of Ccm Management
		String ccm=Constants.driver.findElement(By.xpath("(//a[contains(@href,'ccm')])[1]")).getText();
		Assert.assertEquals(ccm, "CCM Management");
		System.out.println(ccm);
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'ccm')])[1]")).click();
		Thread.sleep(1000);
		
		//Click/verification of of Process Management
		String prs=Constants.driver.findElement(By.xpath("(//a[contains(@href,'process')])[1]")).getText();
		Assert.assertEquals(prs, "Process Management");
		System.out.println(prs);
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'process')])[1]")).click();
		Thread.sleep(1000);
		
		//Click/verification of Signalling
		String sig=Constants.driver.findElement(By.xpath("(//a[contains(@href,'signal')])[1]")).getText();
		Assert.assertEquals(sig, "Signaling Link Management");
		System.out.println(sig);
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'signal')])[1]")).click();
		Thread.sleep(1000);
		
		//Click/verification of of Health Check
		String sys=Constants.driver.findElement(By.xpath("(//a[contains(@href,'system')])[1]")).getText();
		Assert.assertEquals(sys, "System Health Check");
		System.out.println(sys);
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'system')])[1]")).click();
		Thread.sleep(1000);
		
		//Click/verification of of Home Page 
		String hom=Constants.driver.findElement(By.xpath("//font[contains(text(),'Home')]")).getText();
		Assert.assertEquals(hom, "Home");
		System.out.println(hom);
		Constants.driver.findElement(By.xpath("//font[contains(text(),'Home')]")).click();
		Thread.sleep(1000);
		
	}
}
