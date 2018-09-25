package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import globaldata.Constants;
import trigger.Execution;

public class BarNidRange {
	static int n;
public static void barRange(){
	System.out.println("Other BAR NID Range Validation Started ");
	boolean sel = Constants.driver.findElement(By.xpath("//input[@value='add']")).isSelected();
	if (true == sel) {
		System.out.println("ADD Button is default selected");
	} else {
		System.out.println("ADD Button is not seleted");
		Constants.driver.findElement(By.xpath("//input[@value='add']")).click();
		Execution.test.log(LogStatus.PASS, "ADD is selected");
	}
	Constants.driver.findElement(By.name("txtBarrRangePrefix")).sendKeys("919");
	Select dropdown=new Select(Constants.driver.findElement(By.name("cboBarrRangeType")));
	System.out.println("Select the Range Type \n 1. for Originator Range \n 2. for Destination Range \n");
	if(n==1){
		dropdown.selectByValue("0");
		System.out.println("Orginator Selected");
	}else if(n==1){
		dropdown.selectByValue("1");
		System.out.println("Destination Select");
	}else {
		Execution.test.log(LogStatus.FAIL, "Invalid INPUT is selected");
	}
	
}
// public static void modify(){
	
	
//}
}
