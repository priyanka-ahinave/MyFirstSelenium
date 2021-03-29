package selfPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class s2_FileUpload_JavaRobotEx2 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		WebDriver drv = new FirefoxDriver(); // starting Firefox browser
		// WebDriver driver = new FirefoxDriver();

		// maximize browser
		drv.manage().window().maximize();

		// Specify the file location with extension
		StringSelection sel = new StringSelection("C:\\Users\\Desktop\\1.doc");

		// Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		System.out.println("selection" + sel);

		// Open Monster.com
		drv.get("http://my.monsterindia.com/create_account.html");
		Thread.sleep(2000);

		// This will scroll down the page
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("scroll(0,350)");

		// Wait for 5 seconds
		// Thread.sleep(5000);

		// This will click on Browse button
		// driver.findElement(By.id("wordresume")).click();

		System.out.println("Browse button clicked");
		WebElement browse = drv.findElement(By.xpath("//span[text()='Choose file']")); //// input[@name='source_file']
		// using linkText, to click on browse element
		browse.click(); // Click on browse option on the webpage
		Thread.sleep(2000); // suspending execution for specified time period

		File file = new File(
				"//Users//priya//Documents//workspace//MyFirstSelenium//src//selfPractice//Specification.txt");
		StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
		// copying File path to Clipboard
		// StringSelection stringSelection = new StringSelection(
		// "//Users//priya//Documents//workspace//MyFirstSelenium//src//selfPractice//Specification.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		Robot robot = new Robot();

		// Cmd + Tab is needed since it launches a Java app and the browser
		// looses focus

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(2000);

		// Open Goto window

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_G);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyRelease(KeyEvent.VK_G);
		Thread.sleep(2000);
		// Paste the clipboard value

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		// Press Enter key to close the Goto window and Upload window

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		System.out.println("File is Uploaded Successfully");
	}

}
