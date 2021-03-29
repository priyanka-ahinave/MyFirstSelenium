package m4AssignmentsLocators_xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4CountTotalNoOfElementsOnPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Write a Test Script to get no of links available on Facebook Page 
	  //   https://www.facebook.com/	
		
		System.setProperty("webdriver.chrome.driver", "//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		// List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		System.out.println(driver.findElements(By.tagName("a")).size());
		
	  //  List<WebElement> links = driver.findElements(By.tagName("a"));
	   //   System.out.println(“The number of links is“ + links.size());
	      
		driver.quit();
	}

}
