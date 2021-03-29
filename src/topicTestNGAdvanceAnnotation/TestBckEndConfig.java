package topicTestNGAdvanceAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBckEndConfig {
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite"); // configuration related code
	}

	@AfterSuite // tear down related code
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

}
