package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_10_Cart {
	WebDriver driver;
	
	public TC_10_Cart(WebDriver driver) {
		this.driver = driver;
	}
	By Sauce_Labs_Onesie = By.id("add-to-cart-sauce-labs-onesie");
	By Filter_Icon = By.id("shopping_cart_container");
	By Checkout_Btn = By.id("checkout");
	By FirstName = By.id("first-name");
	By LastName = By.id("last-name");
	By Postal_Code = By.id("postal-code");
	By Continue_Btn = By.id("continue");
	By Finish_Btn = By.id("finish");
	By Back_To_Products_Btn = By.id("back-to-products");
	
    public void CartOptions() throws InterruptedException{
    driver.findElement(Sauce_Labs_Onesie).click();	
	driver.findElement(Filter_Icon).click();
	driver.findElement(Checkout_Btn).click();
	driver.findElement(FirstName).sendKeys("Amani");
	driver.findElement(LastName).sendKeys("Sankoju");
	driver.findElement(Postal_Code).sendKeys("500089");
	driver.findElement(Continue_Btn).click();
	driver.findElement(Finish_Btn).click();
	driver.findElement(Back_To_Products_Btn).click();
	}

}
