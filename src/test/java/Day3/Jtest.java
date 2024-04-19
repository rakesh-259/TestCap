package Day3;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jtest {
	WebDriver driver;
	String url;
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		System.out.println("you are in setup mode");
		url="https://www.letskodeit.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void test() {
		driver.get(url);
		driver.findElement(By.xpath("//div[@id=\"navbar-inverse-collapse\"]/div/div/a[text()=\"Sign In\"]")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).click();
	}
	@After
	public void tearDown()
	{
		driver.close();
	}

}
