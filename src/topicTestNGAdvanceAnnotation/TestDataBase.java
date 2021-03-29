package topicTestNGAdvanceAnnotation;

import org.testng.annotations.Test;

public class TestDataBase {
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
}
