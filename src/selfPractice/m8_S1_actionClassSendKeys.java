package selfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m8_S1_actionClassSendKeys {

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
		email.sendKeys("dfgdgf@df.com");
		Thread.sleep(2000);

		// Enter the Current Address
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));

		currentAddress.sendKeys("43 School Lane London EC71 9GO");
		Thread.sleep(2000);

		// Select the Current Address using CTRL + A
		actions.keyDown(Keys.COMMAND);
		actions.sendKeys("a");
		actions.keyUp(Keys.COMMAND);
		actions.build().perform();
		Thread.sleep(2000);

		// Copy the Current Address using CTRL + C
		actions.keyDown(Keys.COMMAND);
		actions.sendKeys("c");
		actions.keyUp(Keys.COMMAND);
		actions.build().perform();
		Thread.sleep(2000);

		actions.sendKeys(Keys.COMMAND, "T");
		// Press the TAB Key to Switch Focus to Permanent Address
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		Thread.sleep(2000);

		// Paste the Address in the Permanent Address field using CTRL + V
		actions.keyDown(Keys.COMMAND);
		actions.sendKeys("v");
		actions.keyUp(Keys.COMMAND);
		actions.build().perform();
		Thread.sleep(2000);

		// Compare Text of current Address and Permanent Address
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		System.out.println(currentAddress.getAttribute("value"));
		System.out.println(permanentAddress.getAttribute("value"));

		driver.close();
	}

}
