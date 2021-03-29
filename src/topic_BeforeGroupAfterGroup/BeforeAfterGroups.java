package topic_BeforeGroupAfterGroup;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAfterGroups {

	// ############ UI ############

	// Configuration methods
	@BeforeGroups("ui")
	public void setupUI() {
		System.out.println("setupUI()");
	}

	@AfterGroups("ui")
	public void teardownUI() {
		System.out.println("setupUI()");
	}

	// UI real test case
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

	// ############ UI

	// $$$$$$$$ Database $$$$$$$$$$
	// Configuration methods
	@BeforeGroups("database")
	public void setupDatabase() {
		System.out.println("setupDatabase()");
	}

	@AfterGroups("database")
	public void teardownDatabase() {
		System.out.println("teardownDatabase()");
	}

	// Database Real test cases
	@Test(groups = "database")
	public void testInsert() {
		System.out.println("testInsert()");
	}

	@Test(groups = "database")
	public void testDelete() {
		System.out.println("testDelete()");
	}

	@Test(groups = "database")
	public void testUpdate() {
		System.out.println("testUpdate()");
	}

	// $$$$$$$$ Database

	// ******* Security *********
	// Configuration methods
	@BeforeGroups("security")
	public void setupSecurity() {
		System.out.println("setupSecurity()");
	}

	@AfterGroups("security")
	public void teardownSecurity() {
		System.out.println("teardownSecurity()");
	}

	// -----security Real test cases
	@Test(groups = "security")
	public void accessHomePage() {
		System.out.println("accessHomePage()");
	}

	@Test(groups = "security")
	public void accessAdminPage() {
		System.out.println("accessAdminPage()");
	}
	// ******* Security
}
