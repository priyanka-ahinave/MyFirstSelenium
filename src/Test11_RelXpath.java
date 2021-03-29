import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11_RelXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sdkf@sf.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='pass'][@id='pass']")).sendKeys("efsf@344");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);

		/*
		 * driver.findElement(By.xpath("//input[@name='firstname']")).click();
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(
		 * "Priya"); Thread.sleep(2000);
		 */

		driver.close();
	}

}
