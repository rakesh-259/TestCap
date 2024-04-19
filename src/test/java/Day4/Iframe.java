package Day4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
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
	public void window() throws Exception {
		// Navigation
		js.executeScript("window.location='https://www.letskodeit.com/practice';");
		//Thread.sleep(3000);
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("name");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("opentab")).click();

		

	}
	
	@After
	public void tearDown() throws Exception {
//		Thread.sleep(3000);
//		driver.quit();
	}


}
