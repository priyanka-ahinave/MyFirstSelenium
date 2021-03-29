import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22_SendKeysMultipleParameter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");

		Thread.sleep(3000);

		// driver.switchTo().defaultContent();
		driver.switchTo().frame(0);

		// driver.switchTo().frame(
		// driver.findElement(By.xpath("//noframes[contains(text(),'Sorry
		// does')]/following-sibling::*[1]")));
		// Thread.sleep(3000);

		WebElement e = driver.findElement(By.xpath("//p[contains(text(),'final year computing project')]"));
		Thread.sleep(2000);
		System.out.println(e.getText());
		e.click();
		Thread.sleep(1000);

		driver.switchTo().defaultContent();
		Thread.sleep(1000);

		driver.switchTo().frame(1);
		// driver.switchTo().frame(
		// driver.findElement(By.xpath("//noframes[contains(text(),'Sorry
		// does')]/following-sibling::*[2]")));
		WebElement eleFrm2 = driver.findElement(By.name("name")); //// input[@name='text']
																	//// xpath
																	//// expression
		Thread.sleep(1000);

		eleFrm2.sendKeys("Priya");
		Thread.sleep(1000);

		eleFrm2.clear();

		eleFrm2.sendKeys("Ahin");
		Thread.sleep(1000);

		String textVal = eleFrm2.getAttribute("value");
		System.out.println(textVal);

		System.out.println(eleFrm2.getCssValue("color"));
		System.out.println(eleFrm2.getCssValue("font-size"));

		WebElement ele2Frm2 = driver.findElement(By.name("suggestions"));
		Thread.sleep(1000);

		ele2Frm2.sendKeys("skdjf b sfh sdfgfius fshfi f", Keys.ENTER, "How are you", Keys.SPACE,
				Keys.chord(Keys.ENTER, "Priyanka "), "Thank you");
		Thread.sleep(1000);

		ele2Frm2.sendKeys(Keys.chord(Keys.COMMAND, Keys.HOME));

		String textVal2 = ele2Frm2.getAttribute("value");
		System.out.println(textVal2);

		Thread.sleep(1000);

		driver.switchTo().defaultContent();
		Thread.sleep(1000);

		driver.switchTo().frame(2);
		// driver.switchTo().frame(
		// driver.findElement(By.xpath("//noframes[contains(text(),'Sorry
		// does')]/following-sibling::*[3]"))); //xpath axis
		Thread.sleep(1000);

		WebElement eleFrm3 = driver
				.findElement(By.xpath("//font[contains(text(),'denotes certain elements such as')]"));
		String textVal3 = eleFrm3.getText();
		System.out.println(textVal3);

		// Thread.sleep(1000);

		driver.close();
	}

}
