package Day4;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor {
	private WebDriver driver;
	String url;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		url="https://www.letskodeit.com/practice";
		js= (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() throws InterruptedException {
		//driver.get(url);
			js.executeScript("window.location='https://www.letskodeit.com/practice';");
//				WebElement ele= driver.findElement(By.id("name"));
//				js.executeScript("arguments[0].value='name';",ele);
				//WebElement textBox=(WebElement)js.executeScript("return document.getElementById('name');");
				//textBox.sendKeys("name");
			
			
			// Size of window
			long height = (Long) js.executeScript("return window.innerHeight;");
			long width = (Long) js.executeScript("return window.innerWidth;");
			
			System.out.println("Height is: " + height);
			System.out.println("Width is: " + width);

	}

}
