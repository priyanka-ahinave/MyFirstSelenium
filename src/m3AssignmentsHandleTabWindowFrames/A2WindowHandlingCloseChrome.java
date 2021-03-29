package m3AssignmentsHandleTabWindowFrames;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2WindowHandlingCloseChrome {

	public static void main(String[] args) {
		// TC-1 Launch Chrome Browser 
				System.setProperty("webdriver.gecko.driver", "//Users//priya//Documents//workspace//testingRequsites//geckodriver");
			    WebDriver driver = new FirefoxDriver();
			
			   // TC-2 Send Test URL  https://seleniummaster.com/llc/
			    driver.get("https://seleniummaster.com/llc/");
			    
			   //TC-2.1 Manage window to maxmize
			    driver.manage().window().maximize();
			    
			   // TC-3 Click on KnowMore Link Text
			    driver.findElement(By.xpath("//span[@id='siteseal']")).click();
			    
			    ArrayList<String> lstWindows = new ArrayList<String>(driver.getWindowHandles());
			    
			   // TC-4 Switch from 0th Window to 1st Window
			  
			    driver.switchTo().window(lstWindows.get(1));
			    
			   // TC-5 Get the Current URL of the Page 
			    System.out.println(driver.getCurrentUrl());   
			    
			   // TC-6 Switch from 1st Window to 0th Window
			    driver.switchTo().window(lstWindows.get(0));
			    
			   // TC-7 Get the Current URL of the Page
			   String strUrl= driver.getCurrentUrl();
			   System.out.println(strUrl);
			    
			   // TC-8 Close 0th Window 
			   driver.close();
			    
			   // TC-9 Switch from 0th Window to 1st Window
			   driver.switchTo().window(lstWindows.get(1));
			   
			   
			   // TC-10 Close 1st Window 

			    driver.close();
			    
			    driver.quit();
	}

}
