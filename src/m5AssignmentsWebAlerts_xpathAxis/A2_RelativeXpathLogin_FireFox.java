package m5AssignmentsWebAlerts_xpathAxis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2_RelativeXpathLogin_FireFox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Assignment-2
		// Automate Facebook Login Page using Relative X-path in 2 different
		// Browsers
		// https://www.facebook.com/

		System.setProperty("webdriver.gecko.driver",
				"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		// Get the handler
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// xpath syntax 1
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mdsfh@srfd.com");
		Thread.sleep(2000);

		// xpath syntax 2
		driver.findElement(By.xpath("//input[@name='pass'][@name='pass']")).sendKeys("dfjh2@334");
		Thread.sleep(2000);

		// xpath syntax 9
		driver.findElement(By.xpath("//form[@class='_featuredLogin__formContainer']/div[2]/button")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
