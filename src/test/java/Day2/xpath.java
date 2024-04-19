package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.lenskart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		WebElement sunGlass= driver.findElement(By.xpath("//div[@id=\"categories justcenter\"]/div[2]"));
		Actions a= new Actions(driver);
		a.moveToElement(sunGlass).perform();
        driver.findElement(By.xpath("//div[normalize-space()='Premium Sunglasses']")).click();
        driver.findElement(By.xpath("//div[text()=\"Track Order\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Mobile / Email\"]")).sendKeys("rakesh");
        driver.close();
	}

}
