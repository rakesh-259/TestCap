package vehicleinsuranceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Insurance {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //launching the Application
        driver.get("https://sampleapp.tricentis.com/101/app.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        EnterVehicleDataPage vd= new EnterVehicleDataPage(driver);

        vd.getMakeVechileSel("Ford");



    }
}
