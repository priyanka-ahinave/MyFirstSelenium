package selfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class m8_S3_actionClassSendKeys_Chord {

	public static void main(String[] args) throws InterruptedException {

		// Initialize ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

		// Navigate to the demo site
		driver.get("https://demoqa.com/text-box");

		// Enter the Full Name
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Priyanka");
		Thread.sleep(2000);

		// Enter the Email
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("wrong_email@kjdfv.com");
		Thread.sleep(2000);

		email.sendKeys(Keys.chord(Keys.COMMAND, "a"), Keys.DELETE);
		Thread.sleep(2000);

		email.sendKeys("correct_email@kjdfv.com");
		Thread.sleep(2000);

		// Enter the Current Address
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43", Keys.ENTER, "School Lane", Keys.ENTER, "London EC71 9GO");
		Thread.sleep(2000);

		// Select the Current Address
		currentAddress.sendKeys(Keys.chord(Keys.COMMAND, "a"));
		Thread.sleep(2000);

		// Copy the Current Address
		currentAddress.sendKeys(Keys.chord(Keys.COMMAND, "c"));
		Thread.sleep(2000);

		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

		// Paste the Address in the Permanent Address field
		permanentAddress.sendKeys(Keys.chord(Keys.COMMAND, "v"));
		Thread.sleep(2000);

		// Compare Text of current Address and Permanent Address

		System.out.println(currentAddress.getAttribute("value"));
		System.out.println(permanentAddress.getAttribute("value"));

		driver.close();
	}

}
