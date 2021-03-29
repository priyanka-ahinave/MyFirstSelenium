import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18_HandlingAlertDynamicText3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Priyanka");
		Thread.sleep(2000);
	
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Assignment to fetch dynamic text value from test displayed in p tag
	    String s=driver.findElement(By.xpath("//p[contains(text(),'Hello')]")).getText();
		System.out.println(s);
		
		if (s.contains("How are you"))
		{
			System.out.println("test passed");
		}
		Thread.sleep(2000);
		
		driver.close();
	}

}
