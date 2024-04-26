package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_6_RemoveFromCart {
	WebDriver driver;

	public TC_6_RemoveFromCart(WebDriver driver) {
	    this.driver = driver;
	}
	By RemoveProduct = By.id("remove-sauce-labs-backpack");
	By Cart = By.id("shopping_cart_container");
	By Continue_Shopping_Btn = By.xpath(".//button[@id='continue-shopping']");
	
	public void RemoveFromtheCart() throws InterruptedException{
	driver.findElement(RemoveProduct).click();
	driver.findElement(Cart).click();
	driver.findElement(Continue_Shopping_Btn).click();
	}
	}

