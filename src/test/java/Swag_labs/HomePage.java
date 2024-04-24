package Swag_labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    WebDriver driver;
     HomePage(WebDriver driver){
        this.driver=driver;
    }

    //location of methods
    By Products=By.xpath("//div[@class='inventory_list']//a//div");
 //   List<WebElement> ProductCount= driver.findElements(

    By addtocart= By.xpath("//button[normalize-space()='Add to cart'][1]");
//    WebElement AddToCart= driver.findElement(By.xpath("//button[normalize-space()='Add to cart'][1]"));

    public void FindProductAndClick(String prodName)
    {
        List<WebElement> ProductCount= driver.findElements(Products);
        for( int i = 0;i<ProductCount.size();i++)
        {
            if (ProductCount.get(i).getText().equals(prodName))
            {
                ProductCount.get(i).click();
                AddToCart();
                break;
            }
//            System.out.println(ProductCount.get(i).getText());
        }
    }
    public  void AddToCart()
    {
        driver.findElement(addtocart).click();
//        AddToCart.click();
        driver.navigate().back();
    }
    By ClickonCart= By.xpath("//a[@class='shopping_cart_link']");
    public void ClickCart(){driver.findElement(ClickonCart).click();}
    By checkonOut= By.xpath("//button[@id='checkout']");
    public void ClickOut(){driver.findElement(checkonOut).click();}

    By firstName= By.xpath("//input[@id='first-name']");
    By lastName=By.xpath("//input[@id='last-name']");
    By code=By.xpath("//input[@id='postal-code']");
    By contin = By.xpath("//input[@id='continue']");
    public void enterDetails(){driver.findElement(firstName).sendKeys("gandhi");
    driver.findElement(lastName).sendKeys("mahatma");
    driver.findElement(code).sendKeys("534565");
    driver.findElement(contin).click();}

    By finish = By.xpath("//button[@id='finish']");
    public void ClickFinish(){driver.findElement(finish).click();}

    By clickMenu= By.xpath("//button[@id='react-burger-menu-btn']");
    public void ClickMenu(){driver.findElement(clickMenu).click();}

    By LogOut= By.xpath("//a[@id='logout_sidebar_link']");
    public void ClickLogOut(){driver.findElement(LogOut).click();}


}
