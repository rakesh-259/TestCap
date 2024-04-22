package vehicleinsuranceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleDataPage {
     WebDriver driver;

     EnterVehicleDataPage(WebDriver driver)
    {
        this.driver=driver;
//        PageFactory.initElements(driver,this);
    }
    By makeVech=By.xpath("//select[@id='make']");
    By modelVech=By.xpath("//select[@id='model']");
    By CylinderCap= By.xpath("//input[@id='cylindercapacity']");
    By EnginePerf= By.xpath("//input[@id='engineperformance']");
    By DateofManf= By.xpath("//input[@id='dateofmanufacture']");
    By selectRigth= By.xpath("//label[normalize-space()='Yes']");
    By NoOfSets= By.xpath("//select[@id='numberofseats']");
    By NoOfSetsmotor= By.xpath("//select[@id='numberofseatsmotorcycle']");
    By FuelTyoe= By.xpath("//select[@id='fuel']");
    By payLoad= By.cssSelector("#payload");
    By TotalWeigth= By.xpath("//input[@id='totalweight']");
    By ListPrice= By.xpath("//input[@id='listprice']");
    By AnnualMile= By.xpath("//input[@id='annualmileage']");
    By nextPage= By.xpath("//button[@id='nextenterinsurantdata']");
//     WebElement makeVechileSel = driver.findElement(By.xpath("//select[@id='make']"));
   public void SetPayLoad(String pay)
  {
    driver.findElement(payLoad).sendKeys(pay);
   }
    public void nextPage()
    {
        driver.findElement(nextPage).click();
    }
    public void AnnualMile(String mile)
    {
        driver.findElement(AnnualMile).sendKeys(mile);
    }
    public void ListPrice(String Price)
    {
        driver.findElement(ListPrice).sendKeys(Price);
    }
   public  void SetTotalWeigth(String weigth)
   {
       driver.findElement(TotalWeigth).sendKeys(weigth);
   }
   public void getNumberOfSeats(String seats)
   {
    Select s= new Select(driver.findElement(NoOfSets));
    s.selectByValue(seats);
   }
    public void getNumberOfSeatsMotor(String seats)
    {
        Select s= new Select(driver.findElement(NoOfSetsmotor));
        s.selectByValue(seats);
    }
    public void getFuel(String fuel)
    {
        Select s= new Select(driver.findElement(FuelTyoe));
        s.selectByValue(fuel);
    }
    public void getMakeVechileSel(String name)
    {
        Select s= new Select(driver.findElement(makeVech));
        s.selectByVisibleText(name);
    }
    public void getModelVechileSel(String Model)
    {
        Select s= new Select(driver.findElement(modelVech));
        s.selectByVisibleText(Model);
    }
    public void setCylinderCap(String cap)
    {
        driver.findElement(CylinderCap).sendKeys(cap);
    }
    public void setEnginePer(String per )
    {
        driver.findElement(EnginePerf).sendKeys(per);
    }
    public void setDateOfManf(String date )
    {
        driver.findElement(DateofManf).sendKeys(date);
    }
    public void setRigthDrive( )
    {
        driver.findElement(DateofManf).click();
    }

}
