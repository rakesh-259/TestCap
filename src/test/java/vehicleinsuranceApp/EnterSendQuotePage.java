package vehicleinsuranceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterSendQuotePage {
    WebDriver driver;
    EnterSendQuotePage(WebDriver driver)
    {
        this.driver=driver;
    }
    By  email= By.xpath("//input[@id='email']");
    By Username = By.xpath("//input[@id='username']");
    By pwd = By.xpath("//input[@id='password']");
    By ConfPwd = By.xpath("//input[@id='confirmpassword']");
    By send = By.xpath("//button[@id='sendemail']");
    By ok= By.xpath("//button[normalize-space()='OK']");

    By getOupt= By.xpath("//div[@class='sweet-alert showSweetAlert visible']//h2");
    public void SetEmail(String em)
    {
        driver.findElement(email).sendKeys(em);
    }
    public String Getmsg()
    {
       String output= driver.findElement(getOupt).getText();
       return output;
    }
    public void SetName(String name)
    {
        driver.findElement(Username).sendKeys(name);
    }
    public void SetPassword(String password)
    {
        driver.findElement(pwd).sendKeys(password);
    }
    public void SetConfPassword(String cpwd)
    {
        driver.findElement(ConfPwd).sendKeys(cpwd);
    }
    public void send()
    {
        driver.findElement(send).click();
    }
    public void ClickOK()
    {
        driver.findElement(ok).click();
    }
}
