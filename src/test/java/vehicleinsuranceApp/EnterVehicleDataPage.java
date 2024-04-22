package vehicleinsuranceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleDataPage {
    static WebDriver driver;

    public EnterVehicleDataPage(WebDriver driver)
    {
        this.driver=driver;
//        PageFactory.initElements(driver,this);
    }
    public static WebElement makeVechileSel = driver.findElement(By.xpath("//select[@id='make']"));

    public void getMakeVechileSel(String name)
    {
        Select s= new Select(makeVechileSel);
        s.selectByVisibleText(name);
//        return makeVechileSel;
    }

}
