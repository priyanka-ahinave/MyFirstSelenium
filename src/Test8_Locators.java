import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test8_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Create New Account")).click();

		Thread.sleep(5000);

		// Fill username with name
		driver.findElement(By.name("firstname")).sendKeys("Amey");

		Thread.sleep(3000);

		// fill surname with surname
		driver.findElement(By.name("lastname")).sendKeys("durva");
		Thread.sleep(3000);

		// fill email with email
		driver.findElement(By.name("reg_email__")).sendKeys("jhdf@gmail.com");
		Thread.sleep(3000);

		// fill email with email
		driver.findElement(By.id("password_step_input")).sendKeys("jhdf@2334");
		Thread.sleep(3000);

		Select s = new Select(driver.findElement(By.id("month")));
		s.selectByValue("6");
		Thread.sleep(2000);

		Select s1 = new Select(driver.findElement(By.id("day")));
		s1.selectByVisibleText("19");

		Thread.sleep(2000);
		Select s2 = new Select(driver.findElement(By.id("year")));
		s2.selectByValue("1988");
		Thread.sleep(2000);

		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);

		driver.close();
	}

}
