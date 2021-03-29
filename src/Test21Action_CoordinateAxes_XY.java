import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test21Action_CoordinateAxes_XY {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::*[15]")).click();

		// Perform mouseover operation Women
		WebElement element = driver.findElement(By.xpath("//span[text()='Women']"));
		Thread.sleep(3000);

		int x = element.getLocation().getX();
		int y = element.getLocation().getY();

		Actions a = new Actions(driver);
		a.moveByOffset(x, y) .build().perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Sarees'])[1]")).click();

		Thread.sleep(5000);
		driver.close();
	}

}
