import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_BrowserAutomation {
public static void main(String[] args)
{
	//TC-1 Launch Chrome Browser 
	System.setProperty("webdriver.chrome.driver", "//Users//priya//Documents//workspace//testingRequsites//chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	
	//TC-2 Send Test URL https://www.facebook.com/
	driver.get("https://www.facebook.com/");
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//TC-3 Get the Title of Page into Console
	System.out.println(driver.getTitle());
	
	//TC-4 Goto TestURL https://netbanking.hdfcbank.com/netbanking/
	driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
	
	//TC-5 Get the URL of the Page into Console 
	System.out.println(driver.getCurrentUrl());
	
	//TC-6 Navigate one Step Back
	driver.navigate().back();
	
	//TC-7 Get Title of Page into Console 
	System.out.println(driver.getTitle());
	
	//TC-8 Navigate one Step Forward 
	driver.navigate().forward();
	
	//TC-9 Get Title of Page into Console 
	System.out.println(driver.getTitle());
	
	//TC-10 Refresh the Current Page 
	driver.navigate().refresh();
	
	//TC-11 Get Title of Page into Console 
	System.out.println(driver.getTitle());
	
	//TC-12 Close the Browser 
	driver.close();
}
}

