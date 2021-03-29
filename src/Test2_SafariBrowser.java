import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test2_SafariBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new SafariDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.close();
	}
}

