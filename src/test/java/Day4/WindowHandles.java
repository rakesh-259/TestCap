package Day4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
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
		Thread.sleep(3000);
		 driver.findElement(By.id("openwindow")).click();
		 Set<String> handles= driver.getWindowHandles();
		 for(String h:handles)
		 {
			String title= driver.switchTo().window(h).getTitle();
			 System.out.println(title);
		 }

	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
