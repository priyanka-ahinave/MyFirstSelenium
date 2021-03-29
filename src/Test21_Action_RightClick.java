import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test21_Action_RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://only-testing-blog.blogspot.com/");
		Thread.sleep(3000);

		// Perform mouseover operation Women
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Me To See')]"));
		Thread.sleep(3000);

		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
		Thread.sleep(3000);

		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		driver.close();
	}

}
