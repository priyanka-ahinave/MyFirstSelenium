package m9AssignmentsTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A1_way2SMSLogin {
	WebDriver driver;

	@Test(priority = 1) //
	public void main() throws InterruptedException {
		// TS1 : Launch Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		driver = new ChromeDriver();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void gotoURL() throws InterruptedException {
		driver.get("https://www.way2sms.com/");
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void enterUserName() throws InterruptedException {
		// send username and password values to the elements
		driver.findElement(By.id("mobileNo")).sendKeys("9348358934");
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("secret_pass");
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void clickLogin() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Login ')]")).click();
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Test(priority = 6)
	public void validationPoint() {
		String expectedURL = "https://www.way2sms.com/";
		String actualURL = driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Assert.assertEquals(actualURL, expectedURL);
	}

	@Test(priority = 7)
	public void teardown() {
		// Close the driver
		driver.close();
	}
}
