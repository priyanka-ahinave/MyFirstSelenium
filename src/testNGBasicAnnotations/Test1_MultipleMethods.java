package testNGBasicAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1_MultipleMethods {
	WebDriver driver;

	// Methods names alphabetically order to set up the priorities
	@Test(priority = 4) //
	public void amain() throws InterruptedException {
		// TS1 : Launch Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		driver = new ChromeDriver();
	}

	@Test(priority = 5)
	public void bgotoURL() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
	}

	@Test(priority = 6)
	public void centerUserName() throws InterruptedException {
		// send username and password values to the elements
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void denterPassword() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void eclickLogin() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Test(priority = 9)
	public void fvalidationPoint() {
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Assert.assertEquals(actualURL, expectedURL);
	}

	@Test(priority = 10)
	public void gteardown() {
		// Close the driver
		driver.close();
	}
}
