package topic_Itest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestFetchDataFromXML_SauceLogin {

	// Cross browser testing and reading from xml file

	WebDriver driver;

	@Parameters({ "browser" })
	@BeforeTest(alwaysRun = true)
	public void setup(String browser) {
		System.out.println("My setup method");

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
			driver = new ChromeDriver();
			System.out.println("Launched Chrome");
		}

		else if (browser.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver",
					"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
			driver = new FirefoxDriver();
			System.out.println("LAunched firefox");

		}

		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"//Users//priya//Documents//workspace//testingRequsites//msedgedriver");
			driver = new EdgeDriver();
			System.out.println("LAunched Edge");

		}
	}

	@Parameters({ "ValidUserName", "ValidPassword" })
	@Test(priority = 1)
	public void verifySauceDemoLogin(String ValidUserName, String ValidPassword) throws InterruptedException {
		System.out.println("inside mehod");
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);

		// send username and password values to the elements
		driver.findElement(By.id("user-name")).sendKeys(ValidUserName);
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys(ValidPassword);
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);

		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		Thread.sleep(5000);

		Assert.assertEquals(actualURL, expectedURL);
	}

	@AfterMethod
	public void getTestResult(ITestResult testResult) {

		System.out.println("Test Case Name :-" + testResult.getName());
		System.out.println("Test Result :-" + testResult.getStatus());
		driver.close();
	}
}
