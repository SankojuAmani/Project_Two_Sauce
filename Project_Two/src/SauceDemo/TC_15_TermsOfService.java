package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_15_TermsOfService {
WebDriver driver;
	
	public TC_15_TermsOfService (WebDriver driver){
		this.driver =driver;
	}
	
	public void Footerlinks() throws Exception {
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[2]/div[2]/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[2]/div[2]/div[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[2]/div[2]/div[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[2]/div[2]/div[4]/a/span")).click();
		

	}

}
