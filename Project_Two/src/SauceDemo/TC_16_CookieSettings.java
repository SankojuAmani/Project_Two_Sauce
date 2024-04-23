package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_16_CookieSettings {
WebDriver driver;
	
	public TC_16_CookieSettings (WebDriver driver){
		this.driver =driver;
	}
	
	public void CookieSettingLink() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[2]/div[2]/div[5]/a")).click();
		driver.findElement(By.id("ot-header-id-C0001")).click();
		driver.findElement(By.id("ot-header-id-C0002")).click();
		driver.findElement(By.id("ot-header-id-C0003")).click();
		driver.findElement(By.id("ot-header-id-C0004")).click();
		driver.findElement(By.id("ot-header-id-C0005")).click();
driver.findElement(By.xpath("//*[@id=\"onetrust-pc-sdk\"]/div/div[3]/div[1]/button")).click();

		
	}
}
