package selfPractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class s2_FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize(); // always write wait code after this
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // for page
																		// load

		d.get("https://www.monsterindia.com/seeker/registration"); // Testing
																	// webpage
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // for
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
