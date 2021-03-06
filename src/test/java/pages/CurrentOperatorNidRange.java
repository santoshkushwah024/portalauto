package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import globaldata.Constants;
import trigger.Execution;

public class CurrentOperatorNidRange {
	static int n;
	static int n1;
	static int n2;
	static int n3;
	static String gsm;
	static String gsm1;
	static String gsm2;

	public static void currentOperator() throws InterruptedException {
		// Checking the RadioButtons is Selected or Not

		boolean sel = Constants.driver.findElement(By.xpath("//input[@value='add']")).isSelected();
		if (true == sel) {
			System.out.println("Add Button is default selected");
			Execution.test.log(LogStatus.PASS, "Add Button is default selected");
		} else {
			System.out.println("Radio Button is not seleted");
			Constants.driver.findElement(By.xpath("//input[@value='add']")).click();
			Execution.test.log(LogStatus.PASS, "Add  Button is now selected");
		}
		boolean sel1 = Constants.driver.findElement(By.xpath("//input[@value='SingleNID']")).isSelected();
		if (false == sel1) {
			System.out.println("SingleTon Button is default selected");
			Execution.test.log(LogStatus.PASS, "SingleTon Button is default selected");
		} else {
			Constants.driver.findElement(By.xpath("//input[@value='SingleNID']")).click();
			Execution.test.log(LogStatus.PASS, "Single Ton Button is Now Selected selected");
		}
		Thread.sleep(2000);

		// Sending the Values to the Text Field
		Constants.driver.findElement(By.xpath("//input[@name='txtMCRangeName']")).clear();
		Constants.driver.findElement(By.xpath("//input[@name='txtMCRangeName']")).sendKeys(Constants.name);
		Constants.driver.findElement(By.xpath("//input[@name='txtMCPrefix']")).clear();
		Constants.driver.findElement(By.xpath("//input[@name='txtMCPrefix']")).sendKeys("91");
		Thread.sleep(2000);

		// Operation for Selecting Air Interface BAsed on user Choice
		System.out.print("Enter the Air interface  YOu Want to Select :\n 1. for GSM \n 2. for CDMA \n 3. for TDMA \n");
		n = Constants.scan.nextInt();
		Select dropdown = new Select(Constants.driver.findElement(By.xpath("//*[@name='cboAirInterface']")));
		if (n == 1) {
			gsm = Constants.driver.findElement(By.xpath("//option[@value='GSM']")).getText();
			System.out.println(gsm + " " + "Air interface is selected \n");
			dropdown.selectByValue("GSM");
			Execution.test.log(LogStatus.PASS, "GSM Air Interface is selected");
		} else if (n == 2) {
			gsm1 = Constants.driver.findElement(By.xpath("//option[@value='CDMA']")).getText();
			System.out.println(gsm1 + " " + "Air interface is selected \n");
			dropdown.selectByValue("CDMA");
			Execution.test.log(LogStatus.PASS, "CDMA Air Interface is selected");
		} else if (n == 3) {
			gsm2 = Constants.driver.findElement(By.xpath("//option[@value='TDMA']")).getText();
			System.out.println(gsm2 + " " + "Air interface is selected \n");
			dropdown.selectByValue("TDMA");
			Execution.test.log(LogStatus.PASS, "TDMA Air Interface is selected");
		} else {
			Execution.test.log(LogStatus.FAIL, "Invalid INput is selected");
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
			Execution.test.log(LogStatus.PASS, "Primary STP is Selected");
			Thread.sleep(1000);
			Select option1 = new Select(Constants.driver.findElement(By.xpath("//select[@name='sltStpSecond']")));
			option1.selectByVisibleText("kar");
			System.out.println(option1 + " " + "Selected Successfully");
			Execution.test.log(LogStatus.PASS, "Secondary STP is Selected");
		} else if (n1 == 1) {
			dropdown1.selectByValue("1");
			System.out.println("Route Mode LoadShared is selected \n");
			Execution.test.log(LogStatus.PASS, "LoadShared is selected");
		} else{
			Execution.test.log(LogStatus.FAIL, "Invalid Input is selected");
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
			Execution.test.log(LogStatus.PASS, "SRI & MT is selected");
		} else if (n2 == 2) {
			dropdown2.selectByValue("1");
			System.out.println("Traffic Type SRI is selected \n");
			Execution.test.log(LogStatus.PASS, "SRI  is selected");
		} else if (n2 == 3) {
			dropdown2.selectByValue("2");
			System.out.println("Traffic Type MT is selected \n");
			Execution.test.log(LogStatus.PASS, "MT is selected");
		} else {
			Execution.test.log(LogStatus.FAIL, "Invalid INPUT is selected");
		}
		Thread.sleep(2000);

		// Selecting the Protocol Version for USer
		Select dropdown3 = new Select(Constants.driver.findElement(By.xpath("//*[@name='cboMapVersion']")));
		System.out.print("Enter cboMapVersion  YOu Want to Select :\n 1. for V1 \n 2. for V2 \n 3. for V3 \n");
		n3 = Constants.scan.nextInt();
		if (n3 == 1) {
			dropdown3.selectByValue("V1");
			System.out.println("Protocol Version V1 is Selected \n");
		} else if (n3 == 2) {
			dropdown3.selectByValue("V2");
			System.out.println("Protocol Version V2 is Selected \n");
		} else if (n3 == 3) {
			dropdown3.selectByValue("V3");
			System.out.println("Protocol Version V3 is Selected \n");
		} else {
			Execution.test.log(LogStatus.FAIL, "INVALID INput is selected");
		}
		Thread.sleep(2000);

		// Selecting the MIS PLMN/Circle
		// Select dropdown4 = new
		// Select(Constants.driver.findElement(By.xpath("//*[@name=cboZoneNameForMIS']")));
	}

	public static void clear() throws InterruptedException {
		// Clear the Fields for Clear button Verification
		Thread.sleep(2000);
		boolean bl = Constants.driver.findElement(By.xpath("(//a[contains(@href,'enable')])[2]")).isEnabled();
		System.out.println(bl + " " + "Clear Button Is enbled \n ");
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'enable')])[2]")).click();
		Execution.test.log(LogStatus.PASS, "Fields Cleared successfully");
	}

	public static void add() throws InterruptedException {
		// Add the Fields for button Verification
		Thread.sleep(2000);
		boolean bl = Constants.driver.findElement(By.xpath("(//a[contains(@href,'enable')])[1]")).isEnabled();
		System.out.println(bl + "Add Button Is enbled \n");
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'enable')])[1]")).click();
		Execution.test.log(LogStatus.PASS, "Fields Added Successfully");
	}

	public static void modfiy() throws InterruptedException {
		boolean sel1 = Constants.driver.findElement(By.xpath("//input[@value='modify']")).isSelected();
		if (false == sel1) {
			Constants.driver.findElement(By.xpath("//input[@value='modify']")).click();
		} else {
			System.out.println("The Option is already selected");
			Execution.test.log(LogStatus.PASS, "Option is Already is selected");
		}
		System.out.println("Enter the NID Range you want to search for Modification / Deletion \n");
		String str = Constants.scan.nextLine();
		Thread.sleep(2000);
		Constants.driver.findElement(By.xpath("//input[@id='NidTextSearch']")).sendKeys(str);
		Thread.sleep(1000);
		Constants.driver.findElement(By.xpath("//input[@type='submit']")).click();
		Constants.driver.switchTo().alert().accept();
		// Search the Element based on the user Search and Perform the Operation
		Constants.driver
				.findElement(By.xpath("//td[contains(text(),'" + str + "')]//../..//td//..//font[text()='[Edit]']"))
				.click();
		Execution.test.log(LogStatus.PASS, "Search is Working");
	}
}
