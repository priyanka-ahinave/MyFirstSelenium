package m5AssignmentsWebAlerts_xpathAxis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_HandlingAlerts_GetText {

	public static void main(String[] args) throws InterruptedException {
		// Step-1 Launch Firefox Browser
		// Step-2 Open Test URL
		// https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt in
		// Chrome Browser
		// Step-3 Switch into Frame
		// Step-3 Click on Try it Button
		// Step-4 Send the text into Alert
		// Step-5 Accept the Web Alert
		// Step-6 Get the text displayed on page into Console
		// Step-7 Close Browser

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.close();

	}

}
