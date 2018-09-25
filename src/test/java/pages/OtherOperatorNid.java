package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import globaldata.Constants;
import trigger.Execution;

public class OtherOperatorNid {
	static int n;
	static int n1;
	static int n2;
	static int n3;
	static int n4;
	static String gsm;
	static String gsm1;
	static String gsm2;

	public static void otherOperatorNid() throws InterruptedException {
		System.out.println("Other Operator NID Range Validation Started ");
		boolean sel = Constants.driver.findElement(By.xpath("//input[@value='add']")).isSelected();
		if (true == sel) {
			System.out.println("ADD  Button is default selected");
			Execution.test.log(LogStatus.PASS, "ADD is selected");
		} else {
			System.out.println("ADD  Button is not seleted");
			Constants.driver.findElement(By.xpath("//input[@value='add']")).click();
			Execution.test.log(LogStatus.PASS, "ADD is selected");
		}
		boolean sel1 = Constants.driver.findElement(By.xpath("//input[@value='SingleNID']")).isSelected();
		if (true == sel1) {
			System.out.println("Single Ton Button is default selected");
			Execution.test.log(LogStatus.PASS, "Single TON is selected");
		} else {
			Constants.driver.findElement(By.xpath("//input[@value='SingleNID']")).click();
			Execution.test.log(LogStatus.PASS, "Single Ton INPUT is selected");
		}
		Thread.sleep(2000);

		// Sending the Values to the Text Field
		Constants.driver.findElement(By.xpath("//input[@name='txtOtherOpRangeName']")).clear();
		Constants.driver.findElement(By.xpath("//input[@name='txtOtherOpRangeName']")).sendKeys(Constants.name);
		Constants.driver.findElement(By.xpath("//input[@name='txtOtherOpPrefix']")).clear();
		Constants.driver.findElement(By.xpath("//input[@name='txtOtherOpPrefix']")).sendKeys("919");
		Thread.sleep(2000);

		// Operation for Selecting Air Interface BAsed on user Choice
		System.out.print("Enter the Air interface  YOu Want to Select :\n 1. for GSM \n 2. for CDMA \n 3. for TDMA \n");
		n = Constants.scan.nextInt();
		Select dropdown = new Select(Constants.driver.findElement(By.xpath("//*[@name='cboAirInterface']")));
		if (n == 1) {
			gsm = Constants.driver.findElement(By.xpath("//option[@value='GSM']")).getText();
			System.out.println(gsm + " " + "Air interface is selected \n");
			dropdown.selectByValue("GSM");
		} else if (n == 2) {
			gsm1 = Constants.driver.findElement(By.xpath("//option[@value='CDMA']")).getText();
			System.out.println(gsm1 + " " + "Air interface is selected \n");
			dropdown.selectByValue("CDMA");
		} else if (n == 3) {
			gsm2 = Constants.driver.findElement(By.xpath("//option[@value='TDMA']")).getText();
			System.out.println(gsm2 + " " + "Air interface is selected \n");
			dropdown.selectByValue("TDMA");
		} else {
			Execution.test.log(LogStatus.FAIL, "Invalid INPUT is selected");
		}
		Thread.sleep(2000);

		// Operation for Selecting the Route Mode in GUI Configurations
		System.out.print("Enter the Route Mode  YOu Want to Select :\n 0. for Active/StandBy \n 1. for LoadShared \n");
		n1 = Constants.scan.nextInt();
		Select dropdown1 = new Select(Constants.driver.findElement(By.xpath("//*[@name='sltRouteMode']")));
		dropdown1.selectByVisibleText("Select Route Mode");
		if (n1 == 0) {
			dropdown1.selectByValue("0");
			System.out.println("Route Mode Active/StandBy is selected \n");
			boolean hide = Constants.driver.findElement(By.xpath("//select[@name='sltStpPrim']")).isDisplayed();
			System.out.println(hide);
			Select option = new Select(Constants.driver.findElement(By.xpath("//select[@name='sltStpPrim']")));
			option.selectByVisibleText("kar");
			Thread.sleep(1000);
			Select option1 = new Select(Constants.driver.findElement(By.xpath("//select[@name='sltStpSecond']")));
			option1.selectByVisibleText("kar");
			System.out.println(option1 + " " + "Selected Successfully");
			Execution.test.log(LogStatus.PASS, " in successfully");
		} else if (n1 == 1) {
			dropdown1.selectByValue("1");
			System.out.println("Route Mode LoadShared is selected \n");
		} else {
			Execution.test.log(LogStatus.FAIL, "Invalid INPUT is selected");
		}

		Thread.sleep(2000);

		// Selecting the Traffic Type For the USer
		Select dropdown2 = new Select(Constants.driver.findElement(By.xpath("//*[@name='sltTrafficType']")));
		System.out.print("Enter Traffic Type  YOu Want to Select :\n 1. for SRI & MT \n 2. for SRI \n 3. for MT \n");
		dropdown2.selectByVisibleText("Select Traffic Type");
		n2 = Constants.scan.nextInt();
		if (n2 == 1) {
			dropdown2.selectByValue("0");
			System.out.println("Traffic Type SRI & MT is selected \n");
		} else if (n2 == 2) {
			dropdown2.selectByValue("1");
			System.out.println("Traffic Type SRI is selected \n");
		} else if (n2 == 3) {
			dropdown2.selectByValue("2");
			System.out.println("Traffic Type MT is selected \n");
		} else {
			Execution.test.log(LogStatus.FAIL, "Invalid INPUT is selected");
		}
		Thread.sleep(2000);

		// Selecting the Protocol Version for USer
		Select dropdown3 = new Select(Constants.driver.findElement(By.xpath("//*[@name='cboMapVersion']")));
		System.out.print("Enter cboMapVersion  YOu Want to Select :\n 1. for V2 \n 2. for V3 \n 3. for IS41_C \n 4. for IS41_D \n");
		n3 = Constants.scan.nextInt();
		if (n3 == 1) {
			dropdown3.selectByValue("V2");
			System.out.println("Protocol Version V2 is Selected \n");
		} else if (n3 == 2) {
			dropdown3.selectByValue("V3");
			System.out.println("Protocol Version V3 is Selected \n");
		} else if (n3 == 3) {
			dropdown3.selectByValue("IS41_C");
			System.out.println("Protocol Version IS41_C is Selected \n");
		}else if (n3==4){
			dropdown3.selectByValue("IS41_D");
			System.out.println("Protocol Version IS41_D is Selected \n");
		} else {
			Execution.test.log(LogStatus.FAIL, "Invalid INPUT is selected");
		}
		Thread.sleep(2000);

		Select dropdown4 = new Select(Constants.driver.findElement(By.name("cboIntIndicator")));
		System.out.println("Enter your Choice For International Indicator \n 0 for National \n 1. for Internaltional \n");
		n4 = Constants.scan.nextInt();
		if (n4 == 0) {
			dropdown4.selectByValue("0");
			System.out.println(" National Selected SuceessFully");
		} else if (n4 == 1) {
			dropdown4.selectByValue("1");
			System.out.println(" InterNational Selected SuceessFully");
		
		} else {
			Execution.test.log(LogStatus.FAIL, "Invalid INPUT is selected");
		}
		Thread.sleep(2000);
		CurrentOperatorNidRange.clear();
		

	}
}
