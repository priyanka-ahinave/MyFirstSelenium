import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14_Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// driver.findElement(By.xpath("//iframe[@name='packageListFrame']")).click();
		// Thread.sleep(3000);

		driver.switchTo().frame("packageListFrame");
		Thread.sleep(3000);

		WebElement e = driver.findElement(By.xpath("//a[contains(text(),'chromium')]"));
		System.out.println(e.getText());
		e.click();
		Thread.sleep(3000);

		driver.switchTo().parentFrame();
		Thread.sleep(3000);

		driver.switchTo().frame("packageFrame");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[contains(text(),'Driver')])[1]")).click();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		driver.switchTo().frame("classFrame");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Instance Methods')]")).click();
		;
		Thread.sleep(3000);

		driver.close();
	}

}
