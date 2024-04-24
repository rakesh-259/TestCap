package Swag_labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class TC_PlaceOrder {
    public static WebDriver driver;
   // public Logger logger;
    @BeforeMethod
    public void setup()
    {
        driver = new ChromeDriver();
        //logger= new LogManager.getLogger(this.logger);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @Test(dataProvider = "LoginData")
    public void testLogin(String Username,String pwd,String exp) throws IOException
    {
        LoginPage lg= new LoginPage(driver);
        //lg.login_auto();
        lg.SetUserName(Username);
        lg.Userpassword(pwd);
        lg.LoginClick(exp);
        System.out.println("User had Login page");
        HomePage hp = new HomePage(driver);
        System.out.println("User navigated to  Home page");
        hp.FindProductAndClick("Sauce Labs Onesie");
        System.out.println("User has selected the product");
        hp.ClickCart();
        hp.ClickOut();
        System.out.println("User has click out");
        hp.enterDetails();
        hp.ClickFinish();
        System.out.println("User clicked on finish");
        hp.ClickMenu();
        hp.ClickLogOut();
        System.out.println("User has loged out");

   }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
    @DataProvider(name = "LoginData")
    public Object[][] getData() {
          Object [][] data= {
                  {"standard_user","secret_sauce","Valid"},
                  {"locked_out_user","secret_sauce","Locked"}
          };
        return data;
    }

}
