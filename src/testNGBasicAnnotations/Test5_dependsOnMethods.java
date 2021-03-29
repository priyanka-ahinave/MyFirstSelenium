package testNGBasicAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5_dependsOnMethods {

	WebDriver driver;

	@Test(priority = 0) //
	public void main() throws InterruptedException {
		// TS1 : Launch Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		driver = new ChromeDriver();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods = "main", alwaysRun = true)
	public void gotoURL() throws InterruptedException {
		driver.get("https://www.fsaucedemo.com/");
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods = "gotoURL")
	public void enterUserName() throws InterruptedException {
		// send username and password values to the elements
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods = "enterUserName")
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods = "enterPassword")
	public void clickLogin() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Test(dependsOnMethods = "clickLogin")
	public void validationPoint() {
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Assert.assertEquals(actualURL, expectedURL);
	}

	@Test(dependsOnMethods = "validationPoint")
	public void teardown() {
		// Close the driver
		driver.close();
	}

}
