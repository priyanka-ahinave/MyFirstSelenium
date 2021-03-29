package testNGFrameworkVerificationPoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2_VerificationPoint2 {

	@Test //
	public void testGoogleURL() throws InterruptedException {
		// TS1 : Launch Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);

		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();

		// verification point
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

		// Close the driver
		driver.close();
	}
}
