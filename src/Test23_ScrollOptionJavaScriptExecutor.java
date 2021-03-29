import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test23_ScrollOptionJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"//Users//priya//Documents//workspace//testingRequsites//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(3000);

		driver.close();
	}

}
