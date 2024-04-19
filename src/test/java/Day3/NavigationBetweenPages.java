package Day3;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBetweenPages {
	WebDriver driver;
	String url;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		System.out.println("you are in setup mode");
		url="https://www.letskodeit.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
         driver.get(url);
         String title= driver.getTitle();
         System.out.println("Title of the page "+title);
         String currentUrl= driver.getCurrentUrl();
         System.out.println("Current page title "+title);
         String forwordUrl="https://www.letskodeit.com/login";
         driver.navigate().to(forwordUrl);
         driver.navigate().back();
         driver.navigate().forward();
         System.out.println(driver.getCurrentUrl());
         driver.navigate().refresh();
         System.out.println(driver.getPageSource());

	}

}
