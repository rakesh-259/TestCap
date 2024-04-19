package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3DeleteOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();		
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/login.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//Login to the Application
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='View all orders']")).click();		
		
		List<WebElement> rows= driver.findElements(By.xpath("//tbody/tr"));
//		System.out.println(rows.size());
		for(int i=2;i<=rows.size();i++)
		{
			String PrdName=driver.findElement(By.xpath("//tbody/tr[2]//td[2]")).getText();
			if(PrdName.contains("-Updated"))
			{
				driver.findElement(By.xpath("//tbody/tr[2]//td[1]")).click();
				driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']")).click();
				
			}
			else
			{
				System.out.println("Product got deleted");
			}
		}
		List<WebElement> r= driver.findElements(By.xpath("//tbody/tr"));
//		System.out.println(rows.size());
		for(int i=2;i<=r.size();i++)
		{
			String PrdName=driver.findElement(By.xpath("//tbody/tr[2]//td[2]")).getText();
			if(!PrdName.contains("-Updated"))
			{
				System.out.println("Product got deleted");	
				break;
			}			
		}

	}

}