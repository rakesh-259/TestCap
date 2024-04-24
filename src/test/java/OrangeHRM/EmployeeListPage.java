package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    By Nationality = By.xpath("(//div[@clear='false' and @class='oxd-select-text-input'])[1]");
    By Marital= By.xpath("(//div[@clear='false' and @class='oxd-select-text-input'])[2]");

    By LocSingleMarital = By.xpath("//div[@role='listbox']/div");
    By LocIndia=By.xpath("//div[@class='oxd-select-option']/span");
    By Gender= By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]");
    By SaveDetails =By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]");
    By ContactDetails= By.xpath("//a[normalize-space()='Contact Details']");
    //div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[@xpath="1"]
    By AddStreet1= By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[1]//div[1]//div[2]//input[1]");
    //div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[1]//div[1]//div[2]//input[1]
    //div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[@xpath='1']
    By AddCity= By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[3]//div[1]//div[2]//input[1]");
    By ContactDetailsSave =By.xpath("//button[normalize-space()='Save']");
    public void SetNationality(String couName)
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //WebElement element = driver.findElement(Nationality);
        js.executeScript("arguments[0].click();",driver.findElement(Nationality));
        List<WebElement> county=driver.findElements(LocIndia);
        for(int i=0; i<county.size(); i++) {
            if(county.get(i).getText().contains(couName)) {
                county.get(i).click();
               // System.out.println("clicked");
                break;
            }
        }
    }
    public void SetMartial(String martial)
    {
        driver.findElement(Marital).click();
        List<WebElement> county=driver.findElements(LocSingleMarital);
        for(int i=0; i<county.size(); i++) {
            if(county.get(i).getText().contains(martial)) {
                county.get(i).click();
                //System.out.println("clicked");
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
    public void clickContactDetails(){
        driver.findElement(ContactDetails).click();
    }
    public void setStreet1(String streetName)
    {
        driver.findElement(AddStreet1).sendKeys(streetName);
    }
    public void setCity(String addcity) {driver.findElement(AddCity).sendKeys(addcity);}
    public void ClickSaveContact() {driver.findElement(ContactDetailsSave).click();}
    //Job
    By Job = By.xpath("//a[normalize-space()='Job']");
    By JobTitle= By.xpath("//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div/div[2]");
    By listTitle=By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']//span");
    By JoinDate =By.xpath("//input[@placeholder='yyyy-dd-mm']");

    public void ClickDate(String date){driver.findElement(JoinDate).sendKeys(date);}
    public void ClickJob() {driver.findElement(Job).click();}
    public void SetJobTitle(String titleJob)
    {
        driver.findElement(JobTitle).click();
        List<WebElement> county=driver.findElements(listTitle);
        for(int i=0; i<county.size(); i++) {
            if(county.get(i).getText().contains(titleJob)) {
                county.get(i).click();
                //System.out.println("clicked");
                break;
            }
        }
    }


}
