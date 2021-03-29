import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test0_EdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"//Users//priya//Documents//workspace//testingRequsites//edgedriver_mac64//msedgedriver");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000);
		driver.close();
	}

}
