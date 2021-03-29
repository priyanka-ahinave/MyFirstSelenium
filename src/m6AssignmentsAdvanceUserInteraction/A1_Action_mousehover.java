package m6AssignmentsAdvanceUserInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A1_Action_mousehover {

	public static void main(String[] args) throws InterruptedException {

		// Test Scenario I: Actions

		// Step-1 Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

		// Step-2 Open Test URL https://www.flipkart.com/
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);

		// Step-3 If found any screen hiding actual page Close the Screen
		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::*[15]")).click();
		Thread.sleep(3000);

		// Step-4 Move mouse Pointer towards Women
		WebElement element = driver.findElement(By.xpath("//span[text()='Women']"));
		Thread.sleep(3000);

		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
		Thread.sleep(1000);

		// Step-5 Click on Shoes
		driver.findElement(By.xpath("//a[text()='Shoes']")).click();
		Thread.sleep(5000);

		// Step-6 Close Browser
		driver.close();
	}

}
