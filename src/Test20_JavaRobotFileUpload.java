import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20_JavaRobotFileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://smallpdf.com/jpg-to-pdf");
		Thread.sleep(3000);

		// Clicke on the choose file button
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		Thread.sleep(2000);

		// Handling a fileupload

		// Put data into clipboard
		// StringSelection filePath = new
		// StringSelection("//Users//priya//Desktop//sisters.jpg");
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,
		// null);

		File file = new File("//Users//priya//Desktop//sisters.jpg");
		StringSelection filePath = new StringSelection(file.getAbsolutePath());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		// USing java Robot
		Robot objRobo = new Robot();

		// Cmd + Tab is needed since it launches a Java app and the browser
		// looses focus
		objRobo.keyPress(KeyEvent.VK_META);
		objRobo.keyPress(KeyEvent.VK_TAB);
		objRobo.keyRelease(KeyEvent.VK_META);
		objRobo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);

		objRobo.keyPress(KeyEvent.VK_META);
		objRobo.keyPress(KeyEvent.VK_TAB);
		objRobo.keyRelease(KeyEvent.VK_META);
		objRobo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);

		objRobo.keyPress(KeyEvent.VK_META);
		objRobo.keyPress(KeyEvent.VK_SHIFT);
		objRobo.keyPress(KeyEvent.VK_G);
		Thread.sleep(5000);
		objRobo.keyRelease(KeyEvent.VK_META);
		objRobo.keyRelease(KeyEvent.VK_SHIFT);
		objRobo.keyRelease(KeyEvent.VK_G);
		Thread.sleep(5000);

		objRobo.keyPress(KeyEvent.VK_CONTROL);
		objRobo.keyPress(KeyEvent.VK_V);
		objRobo.keyRelease(KeyEvent.VK_V);
		objRobo.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);

		objRobo.keyPress(KeyEvent.VK_ENTER);
		objRobo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Convert']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Download']")).click();
		Thread.sleep(3000);

		driver.close();
	}

}
