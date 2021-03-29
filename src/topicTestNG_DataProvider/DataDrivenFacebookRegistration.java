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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenFacebookRegistration {
	WebDriver driver;

	@DataProvider(name = "testData")
	public Object[][] readExcel() throws BiffException, IOException {

		File objFile = new File(
				"//Users//priya//Documents//workspace//MyFirstSelenium//src//topicTestNG_DataProvider//testData_Facebook.xls");
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
	public void loginsauceDemo(String uname, String passwrd, String email) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//Users//priya//Documents//workspace//testingRequsites//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);

		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);

		// Fill username with name
		driver.findElement(By.name("firstname")).sendKeys(uname);
		Thread.sleep(3000);

		driver.findElement(By.id("password_step_input")).sendKeys(passwrd);
		Thread.sleep(3000);

		// fill email with email
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("//input[@type='search']"));

		if (ele.isDisplayed()) {
			System.out.println("test passes");
		} else {
			System.out.println("test failed");
		}

	}

}
