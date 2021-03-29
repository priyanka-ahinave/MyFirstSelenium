package selfPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class s2_FileUpload_JavaRobot {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		WebDriver drv = new FirefoxDriver(); // starting Firefox browser
		drv.manage().window().maximize(); // maximizing window
		Thread.sleep(2000);
		drv.get("https://www.grammarly.com/plagiarism-checker");// open testing
																// website
		Thread.sleep(2000);

		// JavascriptExecutor js = (JavascriptExecutor) drv; // Scroll operation
		// // using Js Executor
		// js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto
		// // browse option
		// Thread.sleep(2000); // suspending execution for specified time period

		WebElement browse = drv.findElement(By.xpath("//div[text()='Upload a file']")); //// input[@name='source_file']
		// using linkText, to click on browse element
		browse.click(); // Click on browse option on the webpage
		Thread.sleep(2000); // suspending execution for specified time period

		// copying File path to Clipboard
		StringSelection str = new StringSelection(
				"//Users//priya//Documents//workspace//MyFirstSelenium//src//selfPractice//Specification.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// creating object of Robot class
		Robot rb = new Robot();

		// Cmd + Tab is needed since it launches a Java app and the browser
		// looses focus
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_META);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		rb.keyRelease(KeyEvent.VK_META);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);

		rb.keyPress(KeyEvent.VK_META);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_G);
		Thread.sleep(5000);
		rb.keyRelease(KeyEvent.VK_META);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyRelease(KeyEvent.VK_G);
		Thread.sleep(5000);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_META);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_META);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		// sendKeys
		Thread.sleep(3000);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		// sendKeys
		Thread.sleep(3000);
		System.out.println("File is Uploaded Successfully");
		drv.close();
	}

}
