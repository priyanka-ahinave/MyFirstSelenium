import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test20_JavaRobotFileDownload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://smallpdf.com/jpg-to-pdf");
		Thread.sleep(3000);

		// Clicke on the choose file button
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		Thread.sleep(2000);
		/// driver.switchTo().fr

		// Handling a fileupload

		// Put data into clipboard
		// StringSelection filePath = new
		// StringSelection("//Users//priya//Desktop//sisters.jpg");

		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,"Priya");

		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,
		// null);

		// Copy to clipboard
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,
		// null);

		// Robot robot = new Robot();

		// Cmd + Tab is needed since it launches a Java app and the browser
		// looses focus

		// // priya new start
		// robot.keyPress(KeyEvent.VK_DOWN);
		// robot.keyRelease(KeyEvent.VK_DOWN);
		// Thread.sleep(2000);
		//
		// robot.keyPress(KeyEvent.VK_DOWN);
		// robot.keyRelease(KeyEvent.VK_DOWN);
		// Thread.sleep(2000);
		//
		// robot.keyPress(KeyEvent.VK_DOWN);
		// robot.keyRelease(KeyEvent.VK_DOWN);
		// Thread.sleep(2000);
		//
		// robot.keyPress(KeyEvent.VK_DOWN);
		// robot.keyRelease(KeyEvent.VK_DOWN);
		// Thread.sleep(2000);
		//
		// robot.keyPress(KeyEvent.VK_DOWN);
		// robot.keyRelease(KeyEvent.VK_DOWN);
		// Thread.sleep(2000);
		//
		// robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);
		// Thread.sleep(2000);
		// // priya new end

		// Click on the Import Button

		// File Need to be imported

		File file = new File("/Users/priya/Desktop/sisters.jpg");
		System.out.println("file.getAbsolutePath()" + file.getAbsolutePath().toString());
		StringSelection stringSelection = new StringSelection(file.getAbsolutePath());

		// Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		Robot robot = new Robot();
		System.out.println("step 1");

		// Cmd + Tab is needed since it launches a Java app and the browser
		// looses focus

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_TAB);

		robot.delay(500);
		System.out.println("step 2");

		// Open Goto window

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_G);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyRelease(KeyEvent.VK_G);
		System.out.println("step 3");

		// Paste the clipboard value

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_V);

		System.out.println("step 4");
		// Press Enter key to close the Goto window and Upload window

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.delay(500);
		System.out.println("step 5");

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("step 6");

		//
		// StringSelection StringSelection = new
		// StringSelection("/Users/priya/Desktop/sisters.jpg");
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(StringSelection,
		// null);
		//
		// System.out.println("driver.getWindowHandle() is " +
		// driver.getWindowHandle().toString());
		// driver.switchTo().window(driver.getWindowHandle());
		//
		// Robot robot = new Robot();
		//
		// // Open Goto window
		// robot.keyPress(KeyEvent.VK_META);
		// robot.keyPress(KeyEvent.VK_SHIFT);
		// robot.keyPress(KeyEvent.VK_G);
		// robot.keyRelease(KeyEvent.VK_META);
		// robot.keyRelease(KeyEvent.VK_SHIFT);
		// robot.keyRelease(KeyEvent.VK_G);
		// robot.delay(1000);
		//
		// // Paste the clipboard value
		// robot.keyPress(KeyEvent.VK_META);
		// robot.keyPress(KeyEvent.VK_V);
		// robot.keyRelease(KeyEvent.VK_META);
		// robot.keyRelease(KeyEvent.VK_V);
		// robot.delay(1000);
		//
		// // Press Enter key to close the Goto window and Upload window
		// robot.delay(1000);
		// robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);
		// robot.delay(1000);
		// robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);

		// Open Goto window

		/*
		 * robot.keyPress(KeyEvent.VK_META);
		 * 
		 * robot.keyPress(KeyEvent.VK_SHIFT);
		 * 
		 * robot.keyPress(KeyEvent.VK_G);
		 * 
		 * robot.keyRelease(KeyEvent.VK_META);
		 * 
		 * robot.keyRelease(KeyEvent.VK_SHIFT);
		 * 
		 * robot.keyRelease(KeyEvent.VK_G);
		 * 
		 * // Paste the clipboard value
		 * 
		 * robot.keyPress(KeyEvent.VK_META);
		 * 
		 * robot.keyPress(KeyEvent.VK_V);
		 * 
		 * robot.keyRelease(KeyEvent.VK_META);
		 * 
		 * robot.keyRelease(KeyEvent.VK_V);
		 * 
		 * // Press Enter key to close the Goto window and Upload window
		 * 
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * 
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * robot.delay(500);
		 * 
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * 
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 */

		// USing java Robot
		// Robot robo = new Robot();
		//
		// robo.keyPress(KeyEvent.VK_CONTROL);
		// robo.keyPress(KeyEvent.VK_V);
		// robo.keyRelease(KeyEvent.VK_V);
		// robo.keyRelease(KeyEvent.VK_CONTROL);
		//
		// robo.keyPress(KeyEvent.VK_ENTER);
		// robo.keyRelease(KeyEvent.VK_ENTER);
		// Thread.sleep(1000);
		//
		// driver.findElement(By.xpath("//button[text()='Convert']")).click();
		// Thread.sleep(1000);
		//
		// driver.findElement(By.xpath("//button[text()='Download']")).click();
		// Thread.sleep(1000);
		//
		// // Code for downloading the file
		// driver.findElement(By.xpath("//span[text()='Download
		// File']")).click();
		// robo.keyPress(KeyEvent.VK_DOWN);
		// robo.keyRelease(KeyEvent.VK_DOWN);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// robo.keyPress(KeyEvent.VK_DOWN);
		// robo.keyRelease(KeyEvent.VK_DOWN);
		//
		// robo.keyPress(KeyEvent.VK_ENTER);
		// robo.keyRelease(KeyEvent.VK_ENTER);
		//
		// driver.close();
	}

}
