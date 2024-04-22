package vehicleinsuranceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantDataPage {
    WebDriver driver;

    EnterInsurantDataPage(WebDriver driver)
    {
        this.driver=driver;
    }
    By firstName= By.xpath("//input[@id='firstname']");
    By LastName= By.xpath("//input[@id='lastname']");
    By db = By.xpath("//input[@id='birthdate']");
    By Country = By.xpath("//select[@id='country']");
    By ZipCode = By.xpath("//input[@id='zipcode']");
    By Occupation = By.xpath("//select[@id='occupation']");
    By selectSkyDrive= By.xpath("//label[normalize-space()='Skydiving']");
    By nextPage= By.xpath("//button[@id='nextenterproductdata']");

    public  void SetFirstName(String Firname)
    {
        driver.findElement(firstName).sendKeys(Firname);
    }
    public  void SetLastName(String Lastname)
    {
        driver.findElement(LastName).sendKeys(Lastname);
    }
    public  void Setdob(String dob)
    {
        driver.findElement(db).sendKeys(dob);
    }
    public void SetCountry(String name)
    {
        Select s= new Select(driver.findElement(Country));
        s.selectByVisibleText(name);
    }
    public void SetOccupation(String occup)
    {
        Select s= new Select(driver.findElement(Occupation));
        s.selectByVisibleText(occup);
    }
    public void SetZipCode(String zip)
    {
        driver.findElement(ZipCode).sendKeys(zip);
    }
    public void SelecHobbiesSky()
    {
        driver.findElement(selectSkyDrive).click();
    }

    public void nextPage()
    {
        driver.findElement(nextPage).click();
    }


}
