package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_4_ClickOnProducts {
	WebDriver driver;

    public TC_4_ClickOnProducts(WebDriver driver) {
        this.driver = driver;
    }
    By Product1 = By.xpath(".//a[@id='item_4_title_link']");
    By Product2 = By.xpath(".//a[@id='item_0_title_link']");
    By Product3 = By.xpath(".//a[@id='item_1_title_link']");
    By Product4 = By.xpath(".//a[@id='item_5_title_link']");
    By Product5 = By.xpath(".//a[@id='item_2_title_link']");
    By Product6 = By.xpath(".//a[@id='item_3_title_link']");
    By Back_Btn = By.id("back-to-products");
    
public void ClickOnalltheProducts() throws InterruptedException{
	driver.findElement(Product1).click();
	driver.findElement(Back_Btn).click();

	driver.findElement(Product2).click();
	driver.findElement(Back_Btn).click();
	
	driver.findElement(Product3).click();
	driver.findElement(Back_Btn).click();
	
	driver.findElement(Product4).click();
	driver.findElement(Back_Btn).click();
	
	driver.findElement(Product5).click();
	driver.findElement(Back_Btn).click();
	
	driver.findElement(Product6).click();
	driver.findElement(Back_Btn).click();

}

}
