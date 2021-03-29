package m2AssignmentsAutomationBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2TestCasetoTestScriptChrome {

	public static void main(String[] args) throws InterruptedException {
		//TC-1 Launch Chrome Browser 
		System.setProperty("webdriver.chrome.driver", "//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

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
