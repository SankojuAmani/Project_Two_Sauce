package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_5_Add_To_Cart {
WebDriver driver;

public TC_5_Add_To_Cart(WebDriver driver) {
    this.driver = driver;
}
    public void AddToCart() throws InterruptedException{
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
driver.findElement(By.id("shopping_cart_container")).click();
}
}