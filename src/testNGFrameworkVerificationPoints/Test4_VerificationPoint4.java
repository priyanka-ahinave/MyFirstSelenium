package testNGFrameworkVerificationPoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4_VerificationPoint4 {

	@Test //
	public void testsaucedemoLogin() throws InterruptedException {
		// TS1 : Launch Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);

		// send username and password values to the elements
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

		String expectedErrorMsg = "Sorry, this user has been locked out.";
		String actualErrorMsg = driver.findElement(By.xpath("//input[@id='login-button']/following::*[1]")).getText(); // xpath
																														// //h3[contains(.,'Epic
																														// sadface:
																														// Sorry,
																														// this
																														// user
																														// has
																														// been
																														// locked
																														// out.')]
		Thread.sleep(2000);
		System.out.println(expectedErrorMsg);
		System.out.println(actualErrorMsg);

		// Assert.assertEquals(actualErrorMsg, expectedErrorMsg);

		if (actualErrorMsg.contains(expectedErrorMsg)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
		// Close the driver
		driver.close();
	}
}
