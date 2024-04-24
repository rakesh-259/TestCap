package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

//import static OrangeHRM.DefaultLogin;
import static OrangeHRM.DefaultLogin.driver;

public class CreateAddEmp
{

    @Test
    public void test() throws InterruptedException {
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
//        el.SetNationality("Indian");
//        el.SetMartial("Single");
//        el.clickGender();
//        el.clickSave();

        el.clickContactDetails();
        el.setStreet1("Gandhi street");
        el.setCity("Hyderabad");
        el.ClickSaveContact();

        el.ClickJob();
        //el.SetJobTitle("HR Manager");
        el.ClickDate("2021-05-13");
 //       el.ClickSaveContact();

        //navigate to admin
        driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
        List<WebElement> userRole= driver.findElements(By.xpath("//div[@role='listbox']/div"));
        for(int i=0; i<userRole.size(); i++) {
            if(userRole.get(i).getText().contains("ESS")) {
                userRole.get(i).click();
                //System.out.println("clicked");
                break;
            }
        }
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Raju");
        //div[@class='oxd-autocomplete-dropdown --positon-bottom']//span
        List<WebElement> addEmpl= driver.findElements(By.xpath("//div[@class='oxd-autocomplete-dropdown --positon-bottom']//span"));
        for(int i=0; i<addEmpl.size(); i++) {
            if(addEmpl.get(i).getText().contains("Raju")) {
                addEmpl.get(i).click();
                //System.out.println("clicked");
                break;
            }
        }
        driver.findElement(By.xpath("//div[contains(text(),'-- Select --')]")).click();

        List<WebElement> addStatus= driver.findElements(By.xpath("//div[@role='listbox']//span"));
        for(int i=0; i<addStatus.size(); i++) {
            if(addStatus.get(i).getText().contains("Enabled")) {
                addStatus.get(i).click();
                //System.out.println("clicked");
                break;
            }
        }
        String name="Tharton",pwd="Tharton@123";
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'][@autocomplete='off'])[1]")).sendKeys(name);
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'][@type='password'])[1]")).sendKeys(pwd);
        driver.findElement(By.xpath("(//div[@class='oxd-input-group__label-wrapper']/following-sibling::*)[6]/input")).sendKeys(pwd);
        Thread.sleep(1000);
        //driver.findElement(By.xpath("((//input[@type='password'][@autocomplete='off'])[2]")).sendKeys("Tharton@123");
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        //WebElement element = driver.findElement(Nationality);
//        js.executeScript("arguments[0].value='Tharton@123';",driver.findElement(By.xpath("((//input[@type='password'][@autocomplete='off'])[2]")));
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        System.out.println("User login to new user");
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();






    }

}
