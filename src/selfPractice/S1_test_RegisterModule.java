package selfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1_test_RegisterModule {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dccinfotech.in/index.php?route=account/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(3000);
		//*[@id="input-firstname"]
		driver.findElement(By.id("input-firstname")).sendKeys("Priya");
		Thread.sleep(3000);
		
		driver.findElement(By.name("lastname")).sendKeys("Ahin");
		Thread.sleep(3000);
		
		//driver.findElement(By.id("email")).sendKeys("djfh@dg.com");
		driver.findElement(By.id("input-email")).sendKeys("sfd@sdf.com");
		Thread.sleep(3000);
		
		driver.findElements(By.name("newsletter")).get(0).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[1]")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
