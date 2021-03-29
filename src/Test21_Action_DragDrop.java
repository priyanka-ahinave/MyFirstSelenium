import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test21_Action_DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		Thread.sleep(3000);

		// Perform slider operation on slider
		WebElement element = driver.findElement(By.xpath("//div[@id='slider']"));
		Thread.sleep(1000);

		Actions a = new Actions(driver);
		a.dragAndDropBy(element, 50, 0).build().perform();
		Thread.sleep(1000);

		driver.close();
	}

}
