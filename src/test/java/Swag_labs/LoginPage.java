package Swag_labs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    //web element of login page locators
    By txt_username = By.name("user-name");

    By txt_password = By.name("password");

    By check_login = By.xpath("//input[@type='submit']");

    By logo = By.className("login_logo");

    //action menthods of login page

    public void SetUserName(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void Userpassword(String pwd) {
        driver.findElement(txt_password).sendKeys(pwd);
    }

    By errorMsg = By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out')]");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public void LoginClick(String exp) {
        driver.findElement(check_login).click();
        if(exp.equals("Valid"))
        {
            WebElement product=driver.findElement(By.xpath("//span[@class='title']"));
            Assert.assertTrue("User is not login",product.isDisplayed());
        } else if (exp.equals("Locked")) {
          try {
              String errorMsg = driver.findElement(By.xpath("//h3[@data-test='error]")).getText();
              System.out.println(errorMsg);
              Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", errorMsg);
              Assert.fail();
          }catch (Exception e)
          {
              System.out.println(e.getMessage());
          }
          finally {
              System.out.println("User credential are correct");
          }
        }
        else {
            System.out.println("user is invalid");
        }

    }


    public void login_auto()
    {
        driver.findElement(txt_username).sendKeys("standard_user");
        driver.findElement(txt_password).sendKeys("secret_sauce");
        driver.findElement(check_login).click();
    }
}
