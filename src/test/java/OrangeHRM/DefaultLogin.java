package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class DefaultLogin extends CreateAddEmp
{
    public static WebDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        //launching the Application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws Exception
    {
//        driver.quit();
    }


}
