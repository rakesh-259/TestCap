package Assignment;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class Guru99Applic {
    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        //launching the Application
        driver.get("http://demo.guru99.com/V4/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[name='uid']")).sendKeys("mngr567833");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("habypus");
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        String HomePage= driver.findElement(By.xpath("//marquee[@class='heading3']")).getText();
        Assert.assertEquals(HomePage,"Welcome To Manager's Page of Guru99 Bank");
        System.out.println("Welcome To Manager's Page of Guru99 Bank");

        //Click on withdraw
        driver.findElement(By.xpath("//ul[@class='menusubnav']/li[9]/a")).click();
        driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("87654");
        driver.findElement(By.cssSelector("input[name='ammount']")).sendKeys("6765");
        driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("amount");
        driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
        Alert alertpopUp= driver.switchTo().alert();
        System.out.println(alertpopUp.getText());
        alertpopUp.accept();
        System.out.println("Again Navigated to Amount Withdrawal Form");

        //click on new customer
        driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rakesh");
        driver.findElement(By.id("dob")).sendKeys("02-12-2008");//textarea[@name='addr']
        driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("House");
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Delhi");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Hyderabad");
        driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("543565");
        driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("987657654");
        String email=RandomStringUtils.randomAlphabetic(4)+"@email.com";
        System.out.println(email);
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@name='sub']")).click();
        String NewCustId= driver.findElement(By.xpath("//table[@id='customer']//tr[4]/td[2]")).getText();
        System.out.println(driver.findElement(By.xpath("//table[@id='customer']//tr[1]//p")).getText());
        System.out.println("Customer Id "+NewCustId);

        //Click on new Account
        driver.findElement(By.xpath("//a[normalize-space()='New Account']")).click();
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys(NewCustId);
        WebElement accType=driver.findElement(By.xpath("//select[@name='selaccount']"));
        Select s= new Select(accType);
        s.selectByValue("Current");
        driver.findElement(By.xpath("//input[@name='inideposit']")).sendKeys("5464");
        driver.findElement(By.xpath("//input[@name='button2']")).click();
        String NewAccId= driver.findElement(By.xpath("//table[@id='account']//tr[4]/td[2]")).getText();
        System.out.println(driver.findElement(By.xpath("//table[@id='account']//tr[1]//p")).getText());
        System.out.println("Account Id "+NewAccId);

        //click on Account
        driver.findElement(By.xpath("//ul[@class='menusubnav']/li[9]/a")).click();
        driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys(NewAccId);
        driver.findElement(By.cssSelector("input[name='ammount']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("amount to withdraw");
        driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
        System.out.println(driver.findElement(By.xpath("//table[@id='withdraw']//tr[1]//p")).getText());

        //log off
        driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
        Alert alertLogOff= driver.switchTo().alert();
        System.out.println(alertLogOff.getText());
        alertLogOff.accept();

        driver.quit();

    }
}
