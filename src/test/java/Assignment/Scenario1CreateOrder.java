package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario1CreateOrder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver= new ChromeDriver();		
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/login.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//Login to the Application
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		driver.findElement(By.xpath("//ul[@id=\"ctl00_menu\"]//li[3]/a")).click();
		
		WebElement selectPrd= driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
		Select s= new Select(selectPrd);
		s.selectByVisibleText("ScreenSaver");
		WebElement prdQul= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));

		prdQul.sendKeys("2");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("mahatma gandi");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("mahatma gandhi street");
//river.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")).sendKeys("Gandi Nagar");
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")).sendKeys("gandi");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("5775858");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys("645456");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")).sendKeys("05/24");

	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
	    String ExpextedText=driver.findElement(By.xpath("//strong[normalize-space()='New order has been successfully added.']")).getText();
	    System.out.println(ExpextedText);
	
	}

}
