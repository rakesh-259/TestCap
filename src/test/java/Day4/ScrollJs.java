package Day4;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollJs {
	private WebDriver driver;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testJavaScriptExecution() throws Exception {
		// Navigation
		js.executeScript("window.location='https://www.letskodeit.com/practice';");
		Thread.sleep(3000);
		
//		// Scroll Down
//		js.executeScript("window.scrollBy(0, 1900);");
//		Thread.sleep(2000);
//		
//		// Scroll Up
//		js.executeScript("window.scrollBy(0, -1900);");
//		Thread.sleep(2000);
		
		// Scroll Element Into View
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0, -190);");
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}


}
