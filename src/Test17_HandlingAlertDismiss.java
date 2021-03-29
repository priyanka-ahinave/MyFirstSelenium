import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17_HandlingAlertDismiss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click here')]")).click();
		Thread.sleep(3000);
		
		String alertText = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		System.out.println(alertText);
		
		
		if (alertText.contains("Are you sure you want to close this account permanently?"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());	
		driver.switchTo().alert().accept();
		driver.close();
	}

}
