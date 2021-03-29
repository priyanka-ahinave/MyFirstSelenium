package m2AssignmentsAutomationBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A3TestCaseToTestScriptFF {

	public static void main(String[] args) throws InterruptedException {
		// Assignment:3
		//Covert following Test Cases into Test Scripts 

		//TC-1 Launch Firefox Browser 
		System.setProperty("webdriver.gecko.driver", "//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		//TC-2 Goto Test URL https://www.google.com
		driver.get("https://www.google.com");
		
		//TC-3 Specify Wait Time for 5 Sec
		Thread.sleep(5000);
		
		//TC-4 Get the Title of Page into Console
		String title=driver.getTitle();
		System.out.println(title);
				
		//TC-5 Close the Browser
		driver.close();
	}

}
