package topic_ObjectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadPropFile {
	static WebDriver driver;

	@Test
	public void sauceDemoLoginPage() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"//Users//priya//Documents//workspace//MyFirstSelenium//src//topic_ObjectRepository//config.properties");
		prop.load(ip);

		String Name = prop.getProperty("name");
		System.out.println(Name);

		String Age = prop.getProperty("age");
		System.out.println(Age);

		String Url = prop.getProperty("url");
		System.out.println(Url);

		String Browser = prop.getProperty("browser");
		System.out.println(Browser);

		if (Browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
			driver = new ChromeDriver();
			Thread.sleep(2000);

		} else if (Browser.contains("ff")) {
			System.setProperty("webdriver.gecko.driver",
					"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
			driver = new FirefoxDriver();

		}
		driver.get(Url);
		Thread.sleep(2000);
		driver.findElement(By.id(prop.getProperty("UserNameField"))).sendKeys(prop.getProperty("username"));
		Thread.sleep(4000);
		driver.findElement(By.id(prop.getProperty("PasswordField"))).sendKeys(prop.getProperty("password"));
		Thread.sleep(4000);
		driver.findElement(By.id(prop.getProperty("Login"))).click();
		Thread.sleep(4000);
		driver.close();
	}

}
