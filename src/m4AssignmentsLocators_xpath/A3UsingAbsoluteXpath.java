package m4AssignmentsLocators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A3UsingAbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
	
		//Automate Facebook Registration Page  using Absolute X-path in Chrome Browser
	    // https://www.facebook.com/
		System.setProperty("webdriver.chrome.driver", "//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Durva");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Ahin");;
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("sdjf@df.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("sdj@df123");
		Thread.sleep(2000);
		
		Select month = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[1]")));
		month.selectByValue("2");
		Thread.sleep(2000);
					
		Select day = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]")));
		day.selectByValue("10");
		Thread.sleep(2000);
		
		Select year = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]")));
		year.selectByValue("1984");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[10]/button[1]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
