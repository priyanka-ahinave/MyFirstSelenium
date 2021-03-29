package m8AssignmentsSeleniumFrameworkSynchronization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A3_FileUpload_ExplicitWait {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Test Scenario I: File Upload
		// Step-1 Launch Chrome Browser
		// Step-2 Open Test URL https://smallpdf.com/word-to-pdf
		// Step-3 Click on ChooseFile Button
		// Step-4 Automate Window Alert by Uploading File
		// Step-5 Specify webDriver Wait to Complete file Conversion and
		// Download button get's displayed
		// Step-6 Click on Download Button
		// Step-5 Close Browser

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

		// Explicit wait / Dynamic wait / Webdriver wait

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'uploaded')]")));
		System.out.println("File is Uploaded Successfully");
	}

}
