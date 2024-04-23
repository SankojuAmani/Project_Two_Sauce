package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_9_FilterBy {
WebDriver driver;
	
	public TC_9_FilterBy(WebDriver driver){
		this.driver =driver;
	}
    public void FilterByOptions() throws InterruptedException{
    	driver.findElement(By.xpath(".//select[@class=\"product_sort_container\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
    }

}
