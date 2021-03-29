package m8AssignmentsSeleniumFrameworkSynchronization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1_FileUpload_JavaWait {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		// Test Scenario I: File Upload
		// Step-1 Launch Chrome Browser
		// Step-2 Open Test URL https://smallpdf.com/word-to-pdf
		// Step-3 Click on ChooseFile Button
		// Step-4 Automate Window Alert by Uploading File
		// Step-5 Specify Java Wait to Complete file Conversion and Download
		// button get's displayed
		// Step-6 Click on Download Button
		// Step-5 Close Browser

		System.setProperty("webdriver.gecko.driver",
				"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize(); // always write wait code after this
		Thread.sleep(1000);// for page
							// load

		d.get("https://www.monsterindia.com/seeker/registration"); // Testing
																	// webpage
		Thread.sleep(1000);// for
							// Implicit
							// wait

		JavascriptExecutor js = (JavascriptExecutor) d; // Scrolling using
														// JavascriptExecutor
		js.executeScript("window.scrollBy(0,380)");// Scroll Down to file upload
													// button (+ve)
		Thread.sleep(3000);

		// FILE UPLOADING USING SENDKEYS ....

		WebElement browse = d.findElement(By.xpath("//input[@id='file-upload']"));

		Thread.sleep(1000);

		// click on ‘Choose file’ to upload the desired file
		browse.sendKeys("//Users//priya//Documents//workspace//MyFirstSelenium//src//selfPractice//Specification.txt"); // Uploading
																														// the
																														// file
																														// using
																														// sendKeys
		Thread.sleep(3000);

		System.out.println("File is Uploaded Successfully");
	}

}
