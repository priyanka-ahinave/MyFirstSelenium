package m5AssignmentsWebAlerts_xpathAxis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A1_RelativeXpathFB_RegiFireFox {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			//Automate Facebook Registration Page  using Relative X-path  in 2 different  Browsers
		    // https://www.facebook.com/
			
			System.setProperty("webdriver.gecko.driver", "//Users//priya//Documents//workspace//testingRequsites//geckodriver");
			
			//Get the handler
			WebDriver driver=new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//driver.findElement(By.linkText("Create New Account")).click();;
			//Thread.sleep(5000);

			//Click on Create new Account button
			driver.findElement(By.xpath("//form[@class='_featuredLogin__formContainer']/div[5]/a")).click();
			Thread.sleep(3000);
			
			//fill name with name
			driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("durva");
			Thread.sleep(3000);
			
			//fill name with name
			driver.findElement(By.xpath("//input[@name='lastname' or id='lastname']")).sendKeys("ahin");
			Thread.sleep(3000);
			
			//fill email with email
			driver.findElement(By.xpath("//input[@data-type='text'][@name='reg_email__']")).sendKeys("jhdf@gmail.com");
			Thread.sleep(3000);
			
			//fill confirmation email with email
			driver.findElement(By.xpath("//input[@data-type='text'][@name='reg_email_confirmation__']")).sendKeys("jhdf@gmail.com");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("jhdf@2334");
			Thread.sleep(3000);
					
			Select s = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
			s.selectByValue("6");
			Thread.sleep(2000);
			
			Select s1 = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
			s1.selectByVisibleText("19");
			
			Thread.sleep(2000);
			Select s2 = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
			s2.selectByValue("1988");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
			Thread.sleep(2000);
			
			driver.close();

	}

	
	
	
	
}
