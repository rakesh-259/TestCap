package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //launching the Application
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
        Alert alertpopUp= driver.switchTo().alert();
        System.out.println(alertpopUp.getText());
        alertpopUp.accept();


        driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
        Alert alertpopUp1= driver.switchTo().alert();
        System.out.println(alertpopUp1.getText());
        alertpopUp1.accept();
        String expText= driver.findElement(By.xpath("//p[@id='demo']")).getText();
        if(expText.equalsIgnoreCase("You pressed Ok"))
        {
            System.out.println(expText);
        }


        driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box ']")).click();
        Alert alertpopUp2= driver.switchTo().alert();
        String name="Automation";
        alertpopUp2.sendKeys(name);
        alertpopUp1.accept();
        String textOut= driver.findElement(By.xpath("//p[@id='demo1']")).getText();
        if(textOut.equals("Hello "+name+" How are you today"))
        {
            System.out.println(textOut);
        }




    }
}
