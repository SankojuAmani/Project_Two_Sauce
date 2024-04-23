package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_6_RemoveFromCart {
	WebDriver driver;

	public TC_6_RemoveFromCart(WebDriver driver) {
	    this.driver = driver;
	}
	    public void RemoveFromtheCart() throws InterruptedException{
	    driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	driver.findElement(By.id("shopping_cart_container")).click();
	driver.findElement(By.xpath(".//button[@id='continue-shopping']")).click();
	}
	}

