package m4AssignmentsLocators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5ClearTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.name("email"));
		element.sendKeys("Priyanka");
		Thread.sleep(2000);
		
		element.clear();
		Thread.sleep(2000);
		
		element.sendKeys("Durva");
		Thread.sleep(2000);
		
		driver.close();
	}

}
