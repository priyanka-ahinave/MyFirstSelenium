package m8AssignmentsSeleniumFrameworkSynchronization;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class A3_FileUpload_FluentWait {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize(); // always write wait code after
												// this

		driver.get("https://www.monsterindia.com/seeker/registration"); // Testing
																		// webpage
		Thread.sleep(1000);

		// FILE UPLOADING USING SENDKEYS ....

		WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));

		Thread.sleep(1000);
		// click on ‘Choose file’ to upload the desired file
		browse.sendKeys("//Users//priya//Documents//workspace//MyFirstSelenium//src//selfPractice//Specification.txt"); // Uploading
		// the
		// file
		// using
		// sendKeys

		// Fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(300, TimeUnit.SECONDS).pollingEvery(5,
				TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(text(),'uploaded')]")));
		System.out.println("File is Uploaded Successfully");
	}

}
