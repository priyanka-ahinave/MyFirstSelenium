package m7AssignmentsJavaRobot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1JavaRobot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Assignment-1
		//
		// Test Scenario I: File Upload
		// Step-1 Launch Chrome Browser
		// Step-2 Open Test URL https://smallpdf.com/word-to-pdf
		// Step-3 Click on ChooseFile Button
		// Step-4 Automate Window Alert by Uploading File
		// Step-5 Close Browser

		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.close();
	}

}
