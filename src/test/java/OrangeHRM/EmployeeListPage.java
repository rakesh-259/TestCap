package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EmployeeListPage {
    WebDriver driver;

    EmployeeListPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //Personal Details
    By Nationality = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]");
    By LocIndia=By.xpath("//div[@class='oxd-select-option']/span");
    By Gender= By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]");
    By SaveDetails =By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]");
    public void SetNationality(String couName)
    {
        driver.findElement(Nationality).click();
        List<WebElement> county=driver.findElements(LocIndia);
        for(int i=0; i<county.size(); i++) {
            if(county.get(i).getText().contains(couName)) {
                county.get(i).click();
                System.out.println("clicked");
                break;
            }
        }
    }
    public void clickGender(){
        driver.findElement(Gender).click();
    }
    public void  clickSave(){
        driver.findElement(SaveDetails).click();
    }
}
