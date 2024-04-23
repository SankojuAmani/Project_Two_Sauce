package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_4_ClickOnProducts {
	WebDriver driver;

    public TC_4_ClickOnProducts(WebDriver driver) {
        this.driver = driver;
    }
public void ClickOnalltheProducts() throws InterruptedException{
	driver.findElement(By.xpath(".//a[@id='item_4_title_link']")).click();
	driver.findElement(By.id("back-to-products")).click();
	
	driver.findElement(By.xpath(".//a[@id='item_0_title_link']")).click();
	driver.findElement(By.id("back-to-products")).click();
	
	driver.findElement(By.xpath(".//a[@id='item_1_title_link']")).click();
	driver.findElement(By.id("back-to-products")).click();
	
	driver.findElement(By.xpath(".//a[@id='item_5_title_link']")).click();
	driver.findElement(By.id("back-to-products")).click();
	
	driver.findElement(By.xpath(".//a[@id='item_2_title_link']")).click();
	driver.findElement(By.id("back-to-products")).click();
	
	driver.findElement(By.xpath(".//a[@id='item_3_title_link']")).click();
	driver.findElement(By.id("back-to-products")).click();

}

}
