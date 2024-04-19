package Day5;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestMethods {
	public org.apache.logging.log4j.Logger logger =LogManager.getLogger(this.getClass());
	//logger= LogManager.getLogger(this.getClass());
	
	@Test(priority=1)
	public void testMethod1() {
//		logger= LogManager.getLogger(this.getClass());
		System.out.println("Running Test ->1 prority testMethod1");
//		SoftAssert ass= new SoftAssert();
//		ass.assertEquals("hello", "hello");
//		
//		logger.info("This is at testMethod1");
//		ass.assertAll();
		
	}
	@Test(priority=-1)
	public void testMethod2() {
		logger= LogManager.getLogger(this.getClass());
		System.out.println("Running Test -> -1 prority methods");
		
		
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("\nBaseTestSuite -> before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\nBaseTestSuite -> after class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("\nBaseTestSuite -> before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("\nBaseTestSuite -> after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("\nBaseTestSuite -> before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("\nBaseTestSuite -> after suite");
	}


}
