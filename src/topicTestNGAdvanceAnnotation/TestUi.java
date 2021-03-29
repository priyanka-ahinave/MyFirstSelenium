package topicTestNGAdvanceAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestUi {

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}

	@Test(groups = "ui")
	public void openFileDialouge() {
		System.out.println("openFileDialouge()");
	}

	@Test(groups = "ui")
	public void openConfirmationDialouge() {
		System.out.println("openConfirmationDialouge()");
	}

	@Test(groups = "ui")
	public void closeFiledialouge() {
		System.out.println("closeFiledialouge()");
	}

	@Test(groups = "ui")
	public void closeConfirmationDialouge() {
		System.out.println("closeConfirmationDialouge()");
	}

}
