package vehicleinsuranceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterSelectPriceOptionPage {
    WebDriver driver;
    EnterSelectPriceOptionPage(WebDriver driver)
    {
        this.driver=driver;
    }
    By selectPlan = By.xpath("//section[@id='pricePlans']//label[1]");
    By nextPage = By.xpath("//button[@id='nextsendquote']");
    public void SetPlan()
    {
        driver.findElement(selectPlan).click();
    }
    public void nextPage()
    {
        driver.findElement(nextPage).click();
    }
}
