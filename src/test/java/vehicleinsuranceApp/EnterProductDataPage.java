package vehicleinsuranceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterProductDataPage {
    WebDriver driver;
    EnterProductDataPage(WebDriver driver)
    {
        this.driver=driver;
    }
    By startDate = By.xpath("//input[@id='startdate']");
    By InsuranceSum = By.xpath("//select[@id='insurancesum']");
    By  damageIns = By.xpath("//select[@id='damageinsurance']");
    By  meritRating= By.xpath("//select[@id='meritrating']");
    By optionProduct =By.xpath("//label[normalize-space()='Euro Protection']");
    By  CountryCar= By.xpath("//select[@id='courtesycar']");
    By nextPage = By.xpath("//button[@id='nextselectpriceoption']");

    public void SetOptionProd()
    {
        driver.findElement(optionProduct).click();
    }
    public void nextPage()
    {
        driver.findElement(nextPage).click();
    }


    public void SetStartDate(String date)
    {
        driver.findElement(startDate).sendKeys(date);
    }
    public void SetInsuranceSum(String InsuData)
    {
        Select s= new Select(driver.findElement(InsuranceSum));
        s.selectByVisibleText(InsuData);
    }
    public void SetDamageIns(String damageData)
    {
        Select s= new Select(driver.findElement(damageIns));
        s.selectByVisibleText(damageData);
    }
    public void SetmeritData(String meritData)
    {
        Select s= new Select(driver.findElement(meritRating));
        s.selectByVisibleText(meritData);
    }
    public void SetCountryCar(String countyCar)
    {
        Select s= new Select(driver.findElement(CountryCar));
        s.selectByVisibleText(countyCar);
    }


}
