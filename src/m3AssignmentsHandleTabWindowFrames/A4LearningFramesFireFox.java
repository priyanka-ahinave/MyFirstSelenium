package m3AssignmentsHandleTabWindowFrames;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A4LearningFramesFireFox {

	public static void main(String[] args) throws InterruptedException {

		// TC-1 Launch Firefox Browser
		System.setProperty("webdriver.gecko.driver",
				"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		WebDriver driver = new FirefoxDriver();

		// TC-2 Go to Test URL https://netbanking.hdfcbank.com/netbanking/
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(2000);
		
		// TC-3 Maximize the Browser Window
		driver.manage().window().maximize();
		
		// TC-4 Get the Title of Page
		System.out.println(driver.getTitle());

		// TC-5 Click on knowmore Link Text
		
		driver.switchTo().frame("login_page");	// know more link is inside the frame so first we should switch inside the frame.

		// now once you are inside the frame,find the element
		// here know more link is not containing any direct locator so we used
		// xpath- syntax no 5 and 8 ([index])
		driver.findElement(By.xpath("(//a[text()='Know More'])[1]")).click(); // click on the link for "transfer money"
		
		//driver.findElement(By.xpath("(//a[text()='Know More'])[2]")).click(); // click on the link for "pay bill"
		
		//driver.findElement(By.xpath("(//a[text()='Know More'])[3]")).click(); // click on the link for "shop online"
			
		/*
		// List<WebElement> elements = driver.findElements(By.xpath("//a[text()='Know More']"));
		// elements.get(0).click();
		
		driver.findElements(By.xpath("//a[text()='Know More']")).get(0).click(); // click on the link for "transfer money"
		driver.findElements(By.xpath("//a[text()='Know More']")).get(1).click(); // click on the link for "pay bill"
		driver.findElements(By.xpath("//a[text()='Know More']")).get(2).click(); // click on the link for "shop online"
		*/
		
		Thread.sleep(3000);
		
		// TC-6 Switch from 0th Window to 1st Window
		ArrayList<String> lstWindow = new ArrayList<String>(driver.getWindowHandles()); // important syntax to remember
		driver.switchTo().window(lstWindow.get(1));
		

		// TC-7 After Switching Get the Title of Page
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		// TC-8 Close 1st Window
		driver.close();

		// TC-9 Switch from 1st Window to 0th Window
		driver.switchTo().window(lstWindow.get(0));
		Thread.sleep(5000);

		// TC-10 After Switching Get the Title of Page
		System.out.println(driver.getTitle());

		// TC-11 Close 0th Window
		driver.close();
	}

}
