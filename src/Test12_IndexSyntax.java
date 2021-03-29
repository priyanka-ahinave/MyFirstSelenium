import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12_IndexSyntax {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// xpath syntax for indexing the elements
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.partialLinkText("Create New")).click();
		Thread.sleep(2000);

		// click on sex as a male option
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
