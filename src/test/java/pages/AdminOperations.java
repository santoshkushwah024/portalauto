package pages;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import globaldata.Constants;

public class AdminOperations {
	public static void operations() throws InterruptedException {
		// LoginPage.LoginHome();
		// Click on the First Option
		Constants.driver.findElement(By.xpath("//a[contains(@href,'rangeconfiguration')]")).click();
		Thread.sleep(1000);
		Constants.driver.findElement(By.xpath("(//a[contains(@href,'rangeconfiguration')]/font)[2]")).click();
		Thread.sleep(2000);
		CurrentOperatorNidRange.currentOperator();
		Thread.sleep(2000);
		CurrentOperatorNidRange.clear();
		//CurrentOperatorNidRange.add();
		Thread.sleep(1000);
		
		// Constants.driver.findElement(By.xpath("(//a[contains(@href,'rangeconfiguration')]/font)[3]")).click();
		// Thread.sleep(1000);
		// Constants.driver.findElement(By.xpath("(//a[contains(@href,'rangeconfiguration')]/font)[4]")).click();
		// Thread.sleep(1000);
		// Constants.driver.findElement(By.xpath("(//a[contains(@href,'rangeconfiguration')]/font)[5]")).click();

	}

	public static void getLinks() throws Exception {

		List<WebElement> links = Constants.driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		try {
			while (it.hasNext()) {
				Constants.URL2 = it.next().getAttribute("href");
				System.out.println(Constants.URL2);
			}
		} catch (Exception e) {
			System.out.println("error " + e);
		}

	}
}
