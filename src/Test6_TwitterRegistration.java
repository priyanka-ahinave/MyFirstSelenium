
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6_TwitterRegistration {
	public static String TWITTER_URL = "https://twitter.com/?lang=en";
	public static String BROWSER_PATH = "//Users//priya//Documents//workspace//testingRequsites//chromedriver";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", BROWSER_PATH);

		WebDriver driver = new ChromeDriver();
		driver.get(TWITTER_URL);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Sign up']")).click();

		Thread.sleep(3000);

		driver.findElement(By.name("name")).sendKeys("Priya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("// span[contains(text(),'Use email')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("asdfdsf@sdf.com");
		Thread.sleep(2000);
		Select sMonth = new Select(driver.findElement(By.id("Month")));
		sMonth.selectByValue("4");
		Thread.sleep(2000);
		Select sDay = new Select(driver.findElement(By.id("Day")));
		sDay.selectByIndex(3);
		Thread.sleep(2000);
		Select sYear = new Select(driver.findElement(By.id("Year")));
		sYear.selectByIndex(3);
		Thread.sleep(2000);
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		boolean flag = next.isEnabled();

		Thread.sleep(2000);
		if (flag) {
			next.click();
			Thread.sleep(3000);// input[@type='checkbox']
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Sign up']")).click();
			Thread.sleep(3000);

		} else {
			driver.navigate().back();
			Thread.sleep(3000);
		}

		driver.close();
	}

}
