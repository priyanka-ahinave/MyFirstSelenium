import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test21Action_Captcha {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));

		Actions actions = new Actions(driver);

		// Open new tab code not working
		// actions.keyDown(Keys.COMMAND).sendKeys("T").keyUp(Keys.COMMAND).build().perform();

		// Send text into searchbox
		actions.click(element).sendKeys("Sai").build().perform();
		Thread.sleep(3000); // key down
		actions.click(element).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000); // key down
		actions.click(element).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000); // key down
		actions.click(element).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);

		actions.click(element).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);

		driver.close();
	}

}
