package m4AssignmentsLocators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A2DirectLocatorsOracleFireFox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Automate  Oracle  Registration Page in Chrome Browser   
	   // https://profile.oracle.com/myprofile/account/create-account.jspx


		//Automate  dropdowns part of Oracle  Regist		ration Page in Firefox Browser  
	    //https://profile.oracle.com/myprofile/account/create-account.jspx
		
		System.setProperty("webdriver.gecko.driver", "//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		Thread.sleep(4000);
		
		driver.findElement(By.name("password")).sendKeys("Pass@1234");
		Thread.sleep(2000);
		
		driver.findElement(By.name("retypePassword")).sendKeys("Pass@1234");
		Thread.sleep(2000);
		
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByValue("IN");
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("priya");
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("lastName")).sendKeys("ahin");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("jobTitle")).sendKeys("CEO");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("workPhone")).sendKeys("1234567889");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("companyName")).sendKeys("HomeSweethome");
		Thread.sleep(2000);
		
		driver.findElement(By.name("address1")).sendKeys("jsdgh djfghv ");
		Thread.sleep(2000);
		
		driver.findElement(By.name("address1")).sendKeys("sjdh2 sdjbc222");
		Thread.sleep(2000);
		
		driver.findElement(By.name("city")).sendKeys("Pune");
		Thread.sleep(2000);
		
		
		Select state = new Select(driver.findElement(By.name("state")));
		state.selectByValue("20");
		Thread.sleep(2000);
		
		driver.findElement(By.name("postalCode")).sendKeys("411087");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
