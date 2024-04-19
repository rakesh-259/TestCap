package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCreateUpdateDelete {

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
			
			//Create a product Scenario1
			WebElement selectPrd= driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
			Select s= new Select(selectPrd);
			s.selectByVisibleText("ScreenSaver");
			WebElement prdQul= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
	//prdQul.clear();
			prdQul.sendKeys("2");
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("mahatma gandi");
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("mahatma gandhi street");
	
	       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")).sendKeys("gandi");
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("5775858");
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();
			
			driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys("645456");
			driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")).sendKeys("05/24");

		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
		    String ExpextedText=driver.findElement(By.xpath("//strong[normalize-space()='New order has been successfully added.']")).getText();
		    System.out.println(ExpextedText);
		//Update the Product Scenario2
			driver.findElement(By.xpath("//a[normalize-space()='View all orders']")).click();
			driver.findElement(By.xpath("//tbody/tr[2]/td[13]/input[1]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys("-Updated");
			driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_UpdateButton']")).click();
			String updateText= driver.findElement(By.xpath("//tbody/tr[2]//td[2]")).getText();
			System.out.println(updateText);
			if(updateText.contains("-Updated"))
			{
				System.out.println("Product got updated");
			}
		//Updated product edit Scenario3
			List<WebElement> rows= driver.findElements(By.xpath("//tbody/tr"));
			for(int i=2;i<=rows.size();i++)
			{
				String PrdName=driver.findElement(By.xpath("//tbody/tr[2]//td[2]")).getText();
				if(PrdName.contains("-Updated"))
				{
					driver.findElement(By.xpath("//tbody/tr[2]//td[1]")).click();
					driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']")).click();
					
				}
				
			}
			
			//Checing the deleted prod
			List<WebElement> r= driver.findElements(By.xpath("//tbody/tr"));
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
