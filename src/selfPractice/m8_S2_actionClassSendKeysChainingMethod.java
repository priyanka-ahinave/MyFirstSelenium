package selfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m8_S2_actionClassSendKeysChainingMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Initialize ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

		// Navigate to the demo site
		driver.get("https://demoqa.com/text-box");

		// Create object of the Actions class
		Actions actions = new Actions(driver);

		// Enter the Full Name
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Priyanka");
		Thread.sleep(2000);

		// Enter the Email
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("jsfcjjd@kjdfv.com");
		Thread.sleep(2000);

		// Enter the Current Address
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));

		currentAddress.sendKeys("43 School Lane London EC71 9GO");
		Thread.sleep(2000);

		// Select the Current Address
		actions.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
		Thread.sleep(2000);

		// Copy the Current Address
		actions.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
		Thread.sleep(2000);

		// Press the TAB Key to Switch Focus to Permanent Address
		actions.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);

		// Paste the Address in the Permanent Address field
		actions.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		Thread.sleep(2000);

		// Compare Text of current Address and Permanent Address
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		System.out.println(currentAddress.getAttribute("value"));
		System.out.println(permanentAddress.getAttribute("value"));

		// assertEquals(currentAddress.getAttribute("value"),
		// permanentAddress.getAttribute("value"));
		// import static org.junit.Assert.assertEquals;

		driver.close();
	}

}
