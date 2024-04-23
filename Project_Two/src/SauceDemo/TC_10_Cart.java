package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_10_Cart {
	WebDriver driver;
	
	public TC_10_Cart(WebDriver driver) {
		this.driver = driver;
	}
    public void CartOptions() throws InterruptedException{
    driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();	
	driver.findElement(By.id("shopping_cart_container")).click();
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.id("first-name")).sendKeys("Amani");
	driver.findElement(By.id("last-name")).sendKeys("Sankoju");
	driver.findElement(By.id("postal-code")).sendKeys("500089");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();
	driver.findElement(By.id("back-to-products")).click();
	}

}
