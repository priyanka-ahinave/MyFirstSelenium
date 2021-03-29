package m8AssignmentsSeleniumFrameworkSynchronization;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2_FileUpload_ImplicitWait {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// Test Scenario I: File Upload
		// Step-1 Launch Chrome Browser
		// Step-2 Open Test URL https://smallpdf.com/word-to-pdf
		// Step-3 Click on ChooseFile Button
		// Step-4 Automate Window Alert by Uploading File
		// Step-5 Specify implicit Wait to Complete file Conversion and Download
		// button get's displayed
		// Step-6 Click on Download Button
		// Step-5 Close Browser

		System.setProperty("webdriver.gecko.driver",
				"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); // always write wait code after
												// this
		// driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS); //
		// for
		// page
		// load

		driver.get("https://www.monsterindia.com/seeker/registration"); // Testing
		// webpage
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // for
		// Implicit
		// wait

		// JavascriptExecutor js = (JavascriptExecutor) driver; // Scrolling
		// using
		// // JavascriptExecutor
		// js.executeScript("window.scrollBy(0,380)");// Scroll Down to file
		// upload
		// button (+ve)
		// driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		// FILE UPLOADING USING SENDKEYS ....

		WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		// click on ‘Choose file’ to upload the desired file
		browse.sendKeys("//Users//priya//Documents//workspace//MyFirstSelenium//src//selfPractice//Specification.txt"); // Uploading
																										// the
																														// file
																														// using
																														// sendKeys
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		System.out.println("File is Uploaded Successfully");
	}

}
