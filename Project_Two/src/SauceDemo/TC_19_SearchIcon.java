package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_19_SearchIcon {
WebDriver driver;
	
	public TC_19_SearchIcon (WebDriver driver){
		this.driver =driver;
	}
	public void SearchIcon() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div/div[2]/div/button/div/span/img")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("SauceLabs");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}
}
