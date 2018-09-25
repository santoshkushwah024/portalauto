package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import globaldata.Constants;
import trigger.Execution;

public class OtherOperatorSmpp {
	static int n;
	public static void otherSmpp() throws InterruptedException{
		System.out.println("Other Operator SmPP Validation Started ");
		boolean sel = Constants.driver.findElement(By.xpath("//input[@value='add']")).isSelected();
		if (true == sel) {
			System.out.println("ADD Button is default selected");
			Execution.test.log(LogStatus.PASS, "ADD  is selected");
		} else {
			System.out.println("ADD Button is not seleted");
			Constants.driver.findElement(By.xpath("//input[@value='add']")).click();
			Execution.test.log(LogStatus.PASS, "ADD  is selected");
		}
		config();
	}
		//For Bulk Nid Configuration
	public static void bulkNid() throws InterruptedException{
		boolean sel1 = Constants.driver.findElement(By.xpath("//input[@value='BulkNID']")).isSelected();
		if (true == sel1) {
			System.out.println("Bulk Button is default selected");
			Execution.test.log(LogStatus.PASS, "Bulk is selected");
		} else {
			Constants.driver.findElement(By.xpath("//input[@value='BulkNID']")).click();
			System.out.println("Bulk Nid Configuration  is selected");
			Execution.test.log(LogStatus.PASS, "Bulk is selected");
		}
		config();
	}
	
		public static void config() throws InterruptedException{
			Constants.driver.findElement(By.xpath("//input[@name='txtSMPPGWRangeName']")).sendKeys("Testing");
			//Select dropdown = new Select(Constants.driver.findElement(By.name("cboShortCode")));
			Constants.driver.findElement(By.xpath("//input[@name='txtSMPPGWPrefix']")).sendKeys("919");
			Select dropdown1 = new Select(Constants.driver.findElement(By.name("cboSMPPGWType")));
			System.out.println("Enter the SMPP-GW Type \n 1. for International GW \n 2. for LandLine GW");
			Constants.scan.nextInt();
			if(n==1){
			dropdown1.selectByVisibleText("International GW");
			}else if(n==2){
				dropdown1.selectByVisibleText("LandLine GW");
			} else{
				Execution.test.log(LogStatus.FAIL, "Invalid INPUT is selected");
			}
			//CurrentOperatorNidRange.add();
			CurrentOperatorNidRange.clear();
		}
	
}
