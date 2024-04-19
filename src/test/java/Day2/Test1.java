package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/");
		//driver.findElement(By)
		driver.findElement(By.id("input-username")).clear();
		driver.findElement(By.id("input-username")).sendKeys("demo");
		//driver.findElement(By.id("input-password")).clear(); id
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("demo");
		//driver.findElement(By.xpath("//button[text()=\" Login\"]")).click(); xpath
		
		
	}

}
