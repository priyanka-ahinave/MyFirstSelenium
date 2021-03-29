package topicTestNG_DataProvider;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenSauceDemo {
	WebDriver driver;

	@DataProvider(name = "testData")
	public Object[][] readExcel() throws BiffException, IOException {

		File objFile = new File(
				"//Users//priya//Documents//workspace//MyFirstSelenium//src//topicTestNG_DataProvider//testData_SauceDemo.xls");
		Workbook objworkbook = Workbook.getWorkbook(objFile); // get the
																// workbook from
																// specified
																// path
		Sheet objSheet = objworkbook.getSheet(0); // get the 0th sheet from
													// specified workbook
		int rows = objSheet.getRows();
		int coloumns = objSheet.getColumns();
		String strInputData[][] = new String[rows - 1][coloumns];// row-1
																	// because
																	// first row
																	// is header
																	// and we
																	// are
																	// eliminating
																	// that
		int count = 0;
		for (int i = 1; i < rows; i++) // row count
		{
			for (int j = 0; j < coloumns; j++) // Column count
			{
				Cell objCell = objSheet.getCell(j, i);
				strInputData[count][j] = objCell.getContents();
			}
			count++;
		}

		return strInputData;
	}

	public Timestamp GetTimeStamp() {

		Date date = new Date();

		long time = date.getTime();
		System.out.println("Time in Milliseconds: " + time);

		Timestamp ts = new Timestamp(time);
		return ts;
	}

	@AfterMethod
	public void getTestResult(ITestResult testResult) throws IOException {
		System.out.println("Test Case Name :-" + testResult.getName());
		System.out.println("Test Result :-" + testResult.getStatus());
		System.out.println("Parameters :-" + testResult.getParameters());

		int status = testResult.getStatus();

		if (status == 1) {
			driver.close();

		} else {
			File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String strFilePath = "//Users//priya//Documents//workspace//MyFirstSelenium//src//topicTestNG_DataProvider//";
			// FileUtils.copyFile(screenShot, new File(strFilePath +
			// testResult.getParameters()[1] + "Defect.jpeg"));
			FileUtils.copyFile(screenShot,
					new File(strFilePath + testResult.getParameters()[1] + GetTimeStamp() + "Defect.jpeg"));
			driver.close();
		}

	}

	@Test(dataProvider = "testData")
	public void loginsauceDemo(String uname, String passwrd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);

		// send username and password values to the elements
		driver.findElement(By.id("user-name")).sendKeys(uname);
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys(passwrd);
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);

		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		Thread.sleep(5000);

		Assert.assertEquals(actualURL, expectedURL);
	}

}
