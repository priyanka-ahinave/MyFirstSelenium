import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10_Tagname_ListOfElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.macys.com/?cm_sp=navigation-_-top_nav-_-macys_icon&lid=glbtopnav_macys_icon-us");
		
		List<WebElement> lstElement= driver.findElements(By.tagName("a"));
		
		System.out.println(lstElement.size());
		
		for (int i=0;i<lstElement.size();i=i+1)
		{
			System.out.println(lstElement.get(i).getText());
		}
		Thread.sleep(3000);
		
		driver.close();
	}

}
