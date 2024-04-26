package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_9_FilterBy {
WebDriver driver;
	
	public TC_9_FilterBy(WebDriver driver){
		this.driver =driver;
	}
	By FilterBy = By.xpath(".//select[@class='product_sort_container']");
	By Price_Low_To_High = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]");
	
    public void FilterByOptions() throws InterruptedException{
    	driver.findElement(FilterBy).click();
    	driver.findElement(Price_Low_To_High).click();
    }

}
