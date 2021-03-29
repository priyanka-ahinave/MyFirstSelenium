package m5AssignmentsWebAlerts_xpathAxis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A6_XpathAxes_FBRegistration_Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Automate Facebook Registration Page using xpath axes in Chrome
		// Browser
		// https://www.facebook.com

		// Automate dropdowns part of Facebook Registration Page using xpath
		// axces in firefox Browser
		// https://www.facebook.com/
		// System.setProperty("webdriver.gecko.driver",
		// "//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		// WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		// TC1: Find Create new account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);

		// TC2 :
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		Thread.sleep(1000);

		driver.findElement(By.name("lastname")).sendKeys("Ahinave");
		Thread.sleep(1000);

		driver.findElement(By.name("reg_email__")).sendKeys("pkakad@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pkakad@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.name("reg_passwd__")).sendKeys("pass@12345");
		Thread.sleep(1000);

		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByIndex(3);
		Thread.sleep(1000);

		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("23");
		Thread.sleep(1000);

		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1995");
		Thread.sleep(3000);

		driver.findElements(By.name("sex")).get(0).click();
		Thread.sleep(3000);

		/*
		 * driver.findElements(By.name("sex")).get(1).click();
		 * Thread.sleep(3000);
		 * 
		 * driver.findElements(By.name("sex")).get(2).click();
		 * Thread.sleep(3000);
		 */

		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
