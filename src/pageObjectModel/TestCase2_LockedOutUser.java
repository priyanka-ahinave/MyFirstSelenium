package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestCase2_LockedOutUser {

	static WebDriver driver;
	// static Login_Page login;

	@Test
	public void verifyErrorMsgForLockedOutUser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		Page_Login login = new Page_Login(driver);

		login.type_User("locked_out_user");
		Thread.sleep(2000);

		login.type_Password("secret_sauce");
		Thread.sleep(2000);

		login.click_Login();
		Thread.sleep(2000);

		String expectedErrorMsg = "Sorry, this user has been locked out.";

		if (login.lockedOutUSerError().contains(expectedErrorMsg)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

	}

	@AfterMethod
	public void teardown() {
		// Close the driver
		driver.close();
	}
}
