package Day5;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;


public class TestnG {
	public org.apache.logging.log4j.Logger logger =LogManager.getLogger(this.getClass());
	//logger= LogManager.getLogger(this.getClass());
	@Test
	public void testMethod1() {
		logger= LogManager.getLogger(this.getClass());
		System.out.println("Running Test -> testMethod1");
//		SoftAssert ass= new SoftAssert();
//		ass.assertEquals(0, 0);
//		Assert.assertEquals(true);
		logger.info("This is at testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
		logger.info("This is at testMethod2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Running Test -> testMethod3");
	}


}
