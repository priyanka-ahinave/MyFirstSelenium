package topic_Itest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestResultContext {

	// Cross browser testing and reading from xml file
	// Method level inclusion and exclusion

	WebDriver driver;

	@BeforeTest(alwaysRun = true)
	public void setup(ITestContext textcontext) {
		System.out.println("My seup method");

		String strBrowser = textcontext.getCurrentXmlTest().getParameter("browser");
		if (strBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
			driver = new ChromeDriver();
			System.out.println("LAunched Chrome");
			driver.close();
		}

		else if (strBrowser.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver",
					"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
			driver = new FirefoxDriver();
			System.out.println("LAunched firefox");
			driver.close();
		}

		else if (strBrowser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"//Users//priya//Documents//workspace//testingRequsites//msedgedriver");
			driver = new EdgeDriver();
			System.out.println("LAunched Edge");
			driver.close();
		}
	}

	@Test(groups = "sanity")
	public void testLogin() {
	}

	@Test(groups = "sanity")
	public void testCreateAdmin() {
	}

	@Test(groups = "sanity")
	public void testCreateUser() {
	}

	@Test(groups = "regression")
	public void testEditAdmin() {
	}

	@Test
	public void testDeleteUser() {

		Assert.assertEquals(true, false);
	}

	@AfterMethod
	public void getTestResult(ITestResult testResult) {

		System.out.println("Test Case Name :-" + testResult.getName());
		System.out.println("Test Result :-" + testResult.getStatus());
	}
}
