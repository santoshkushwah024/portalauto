package pages;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import globaldata.Constants;
import trigger.Execution;

public class AdminOperations {
	public static void operations() throws InterruptedException {
		// LoginPage.LoginHome();
		// Click on the First Option
		Constants.driver.findElement(By.xpath("//a[contains(@href,'rangeconfiguration')]")).click();
		Thread.sleep(1000);
		
		//Click for Section Option Testing 
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'rangeconfiguration')]/font)[2]")).click();
		Thread.sleep(2000);
		CurrentOperatorNidRange.currentOperator();
		Thread.sleep(2000);
		CurrentOperatorNidRange.clear();
		// CurrentOperatorNidRange.add();
		Thread.sleep(1000);
		// CurrentOperatorNidRange.modfiy();
		Thread.sleep(2000);
		Execution.test.log(LogStatus.PASS, "Option 1 Successfully Verfied");
		
		//Click for Section Option Testing 
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'rangeconfiguration')]/font)[3]")).click();
		OtherOperatorNid.otherOperatorNid();
		CurrentOperatorNidRange.clear();
		Execution.test.log(LogStatus.PASS, "Option 2 Successfully Verfied");
		
		//Click for 4th Option
		Thread.sleep(2000);
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'rangeconfiguration')]/font)[4]")).click();
		OtherOperatorSmpp.otherSmpp();
		OtherOperatorSmpp.bulkNid();
		Execution.test.log(LogStatus.PASS, "Option 3 Successfully Verfied");
		Thread.sleep(1000);
		
		//Click for 5th Option
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'rangeconfiguration')]/font)[5]")).click();
		BarNidRange.barRange();
		Execution.test.log(LogStatus.PASS, "Option 4 Successfully Verfied");

	}

	public static void getLinks() throws Exception {

		List<WebElement> links = Constants.driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		try {
			while (it.hasNext()) {
				Constants.URL2 = it.next().getAttribute("href");
				System.out.println(Constants.URL2);
				Execution.test.log(LogStatus.PASS, "SuccessFully verified all Links present in Home Page");
			}
		} catch (Exception e) {
			System.out.println("error " + e);
			Execution.test.log(LogStatus.FAIL, "Links are Not Able to Fetch");
		}

	}
}
