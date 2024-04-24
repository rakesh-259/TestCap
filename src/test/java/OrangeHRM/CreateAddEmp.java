package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

//import static OrangeHRM.DefaultLogin;
import static OrangeHRM.DefaultLogin.driver;

public class CreateAddEmp
{

    @Test
    public void test()
    {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        PIMPage pim= new PIMPage(driver);
        pim.clickPIM();
        pim.clickAddEmp();
        pim.EnterFisrtName("Raju");
        pim.EnterLastName("K");
        pim.clickSave();


        EmployeeListPage el = new EmployeeListPage(driver);
        el.SetNationality("Indian");
        el.clickGender();
        el.clickSave();




    }

}
