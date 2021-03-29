package m5AssignmentsWebAlerts_xpathAxis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step-1 Launch Firefox Browser
		// Step-2 Open Test URL
		// https://www.jquery-az.com/javascript/demo.php?ex=151.1_1 in Chrome Browser
		// Step-3 Click on Click here to show confirm alert Button
		// Step-4 Get the text displayed on Alert into Console
		// Step-5 Accept the Web Alert to Delete Account
		// Step-6 Get the text displayed on Alert into Console
		// Step-6 Accept the Alert
		// Step-6 Close Browser

		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.close();

	}

}
