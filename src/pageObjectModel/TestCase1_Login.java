package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1_Login {

	static Page_Login login;
	static WebDriver driver;

	@Test(priority = 0)
	public static void myTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		login = new Page_Login(driver);
		Thread.sleep(2000);

		login.type_User("standard_user");
		login.type_Password("secret_sauce");
		login.click_Login();

		Thread.sleep(2000);

		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		Thread.sleep(2000);

		Assert.assertEquals(actualURL, expectedURL);

		// Close the driver
		driver.close();
	}
}
