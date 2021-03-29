package testNGFrameworkVerificationPoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1_VerificationPoint1 {

	@Test //
	public void testGoogleURL() throws InterruptedException {
		// TS1 : Launch Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);

		Boolean linkDisplayed = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();

		// verification point
		if (linkDisplayed) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

		// Close the driver
		driver.close();
	}
}
