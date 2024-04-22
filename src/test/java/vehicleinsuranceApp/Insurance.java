package vehicleinsuranceApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Insurance {
    WebDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
         driver = new ChromeDriver();
        //launching the Application
        driver.get("https://sampleapp.tricentis.com/101/app.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }
    @Test
    public void test()
    {
        EnterVehicleDataPage vd= new EnterVehicleDataPage(driver);
        vd.getMakeVechileSel("Ford");
        vd.getModelVechileSel("Three-Wheeler");
        vd.setCylinderCap("545");
        vd.setEnginePer("767");
        vd.setDateOfManf("04/02/2024");
        vd.getNumberOfSeats("1");
        vd.setRigthDrive();
        vd.getNumberOfSeatsMotor("1");
        vd.getFuel("Gas");
        vd.SetPayLoad("5");
        vd.SetTotalWeigth("543");
        vd.ListPrice("1000");
        vd.AnnualMile("200");
        vd.nextPage();

        // Entering into VehicleDataPage
        EnterInsurantDataPage Id= new EnterInsurantDataPage(driver);
        Id.SetFirstName("Rakesh");
        Id.SetLastName("ld");
        Id.Setdob("02/05/2001");
        Id.SetCountry("India");
        Id.SetZipCode("663767");
        Id.SetOccupation("Farmer");
        Id.SelecHobbiesSky();
        Id.nextPage();

        //Navigate to product page
        EnterProductDataPage pd= new EnterProductDataPage(driver);
        pd.SetStartDate("06/05/2024");
        pd.SetInsuranceSum("3.000.000,00");
        pd.SetmeritData("Bonus 2");
        pd.SetDamageIns("Partial Coverage");
        pd.SetOptionProd();
        pd.SetCountryCar("Yes");
        pd.nextPage();

        //Navigate to select plan
        EnterSelectPriceOptionPage sp= new EnterSelectPriceOptionPage(driver);
        sp.SetPlan();
        sp.nextPage();

        //Navigate to send quote page
        EnterSendQuotePage sq= new EnterSendQuotePage(driver);
        sq.SetEmail("raksh@gmail.com");
        sq.SetName("rakesh");
        sq.SetPassword("Gandi@123");
        sq.SetConfPassword("Gandi@123");
        sq.send();
        Assert.assertEquals(sq.Getmsg(),"Sending e-mail success!");
        System.out.println(sq.Getmsg());
        sq.ClickOK();

    }
    @AfterMethod
    public void tearDown() throws Exception
    {
       driver.quit();
    }

//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        //launching the Application
//        driver.get("https://sampleapp.tricentis.com/101/app.php");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.manage().window().maximize();
        //Navigate to Home page->VehicleDataPage
//        EnterVehicleDataPage vd= new EnterVehicleDataPage(driver);
//        vd.getMakeVechileSel("Ford");
//        vd.getModelVechileSel("Three-Wheeler");
//        vd.setCylinderCap("545");
//        vd.setEnginePer("767");
//        vd.setDateOfManf("04/02/2024");
//        vd.getNumberOfSeats("1");
//        vd.setRigthDrive();
//        vd.getNumberOfSeatsMotor("1");
//        vd.getFuel("Gas");
//        vd.SetPayLoad("5");
//        vd.SetTotalWeigth("543");
//        vd.ListPrice("1000");
//        vd.AnnualMile("200");
//        vd.nextPage();
//
//        // Entering into VehicleDataPage
//        EnterInsurantDataPage Id= new EnterInsurantDataPage(driver);
//        Id.SetFirstName("Rakesh");
//        Id.SetLastName("ld");
//        Id.Setdob("02/05/2001");
//        Id.SetCountry("India");
//        Id.SetZipCode("663767");
//        Id.SetOccupation("Farmer");
//        Id.SelecHobbiesSky();
//        Id.nextPage();
//
//        //Navigate to product page
//        EnterProductDataPage pd= new EnterProductDataPage(driver);
//        pd.SetStartDate("06/05/2024");
//        pd.SetInsuranceSum("3.000.000,00");
//        pd.SetmeritData("Bonus 2");
//        pd.SetDamageIns("Partial Coverage");
//        pd.SetOptionProd();
//        pd.SetCountryCar("Yes");
//        pd.nextPage();
//
//        //Navigate to select plan
//        EnterSelectPriceOptionPage sp= new EnterSelectPriceOptionPage(driver);
//        sp.SetPlan();
//        sp.nextPage();
//
//        //Navigate to send quote page
//        EnterSendQuotePage sq= new EnterSendQuotePage(driver);
//        sq.SetEmail("raksh@gmail.com");
//        sq.SetName("rakesh");
//        sq.SetPassword("Gandi@123");
//        sq.SetConfPassword("Gandi@123");
//        sq.send();
//        Assert.assertEquals(sq.Getmsg(),"Sending e-mail success!");
//        System.out.println(sq.Getmsg());
//        sq.ClickOK();

//        driver.quit(); //close the current window

}
