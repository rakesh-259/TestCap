package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {
    WebDriver driver;

    PIMPage(WebDriver driver)
    {
        this.driver=driver;
    }
    By pimClick = By.xpath("//ul[@class='oxd-main-menu']/li[2]");
    By AddEmp = By.xpath("//a[normalize-space()='Add Employee']");
    By eFirstN= By.xpath("//input[@placeholder='First Name']");
    By eLastN= By.xpath("//input[@placeholder='Last Name']");//button[normalize-space()='Save']
    By Save =By.xpath("//button[normalize-space()='Save']");

    public void clickPIM(){
        driver.findElement(pimClick).click();
        System.out.println("click on pim");
    }
    public  void clickAddEmp() {
        driver.findElement(AddEmp).click();
    }
    public void EnterFisrtName(String name) {
        driver.findElement(eFirstN).sendKeys(name);
    }
    public void EnterLastName(String Lname) {
        driver.findElement(eLastN).sendKeys(Lname);
    }
    public void clickSave() {
        driver.findElement(Save).click();
    }

}
