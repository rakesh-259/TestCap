package Day3;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioBtnAndCheckBox {
	WebDriver driver;
	String url;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		//System.out.println("you are in setup mode");
		url="https://www.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		driver.get(url);
		List<WebElement>  io = driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement a : io)
		{
			a.click();
		}
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@name,'cars')]"));
		for(WebElement a : checkBox)
		{
			a.click();
		}
		//DropDown
		WebElement a= driver.findElement(By.id("carselect"));
		Select s= new Select(a);
		s.selectByVisibleText("BMW");
		s.selectByValue("benz");
		s.selectByIndex(2);
	}

}
