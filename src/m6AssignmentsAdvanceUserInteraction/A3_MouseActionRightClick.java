package m6AssignmentsAdvanceUserInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A3_MouseActionRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Test Scenario I: Actions

		// Step-1 Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

		// Step-2 Open Test URL
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		Thread.sleep(3000);

		// Step-3 Right Click on Double-Click Me To See Alert Button
		WebElement element = driver.findElement(By.xpath("//button[starts-with(text(),'Double-Click')]"));

		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
		Thread.sleep(3000);

		// Step-4 Close Browser
		driver.close();
	}

}