package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Login {

	WebDriver driver;

	// Specify Object Locators
	By UserName = By.id("user-name");
	By Password = By.id("password");
	By Login = By.id("login-button");
	By ErrorMsg = By.xpath("//input[@id='login-button']/following::*[1]");

	public Page_Login(WebDriver driver) {
		this.driver = driver;
	}

	public void type_User(String uname) throws InterruptedException {
		// send username and password values to the elements
		driver.findElement(UserName).sendKeys(uname);
		Thread.sleep(2000);
	}

	public void type_Password(String passwd) throws InterruptedException {
		// send username and password values to the elements
		driver.findElement(Password).sendKeys(passwd);
		Thread.sleep(2000);
	}

	public void click_Login() throws InterruptedException {
		// send username and password values to the elements
		driver.findElement(Login).click();
		Thread.sleep(2000);
	}

	public String lockedOutUSerError() {
		return (driver.findElement(ErrorMsg).getText());
	}

}
