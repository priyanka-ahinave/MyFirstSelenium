package testNGBasicAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3_BeforeMethod_afterMethod {
	WebDriver driver;

	@BeforeMethod
	public void main() throws InterruptedException {
		// TS1 : Launch Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		driver = new ChromeDriver();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void gotoGoogle() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 2)
	public void gotoSauceDemo() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 3)
	public void gotoFaceBook() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterMethod
	public void teardown() {
		// Close the driver
		driver.close();
	}
}
