package m3AssignmentsHandleTabWindowFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5NavigatingBetweenPagesChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TC-1	Launch Chrome  Browser
		System.setProperty("webdriver.chrome.driver", "//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//TC-2	Go to Test URL  https://www.google.com
		driver.get("https://www.google.com");
		
		//TC-3	Maximize the Browser Window
		driver.manage().window().maximize();
		
		//TC-4	Get the URL of Page
		System.out.println(driver.getTitle());
		
		//TC-5	Navigate to Test URL  https://www.selenium.dev/
		driver.navigate().to(" https://www.selenium.dev/");
	
		//TC-6	Get the URL of Page
		System.out.println(driver.getCurrentUrl());
		
		//TC-7	Navigate back to Test URL  https://www.google.com
		driver.navigate().back();
		
		//TC-8    Get the URL of Page 
		System.out.println(driver.getCurrentUrl());
		
		//TC-8	Navigate one step forward to Test URL  https://www.selenium.dev/ 
		driver.navigate().forward();
		
		//TC-9    Get the URL of Page 
		System.out.println(driver.getCurrentUrl());
		
		//TC-10	Refresh the Current Page 
		driver.navigate().refresh();
		
		//TC-11	Get the URL of Page 
		System.out.println(driver.getCurrentUrl());
		
		//TC-12   Close the Browser
		driver.close();
	}

}
