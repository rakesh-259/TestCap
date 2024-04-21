package Day6;

import java.time.Duration;
import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

 public class ExtemRep {
	WebDriver driver;
	String url;
//	ExtentReports report;
//	ExtentTest test;
public Logger logger = LogManager.getLogger(this.getClass());
	@BeforeMethod
	public void setUp() throws Exception {
//		report = new ExtentReports("C:\\Users\\MANRAKES\\Desktop\\eclipse\\Test\\long.html");
//		test = report.startTest("Verify Welcome Text");
		driver = new ChromeDriver();
//		test.log(LogStatus.INFO, "Browser Started...");
		//System.out.println("you are in setup mode");
		url="https://www.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("user login to website");

	}

	@AfterMethod
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
		logger.info("user selected required dropdown ");
	}

	public String captureScreen(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
