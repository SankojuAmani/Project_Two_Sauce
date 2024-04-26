package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_15_TermsOfService {
WebDriver driver;
	
	public TC_15_TermsOfService (WebDriver driver){
		this.driver =driver;
	}
	By TermsOfService =  By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[2]/div[2]/div[1]/a/span");
	By Privacy_Policy = By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[2]/div[2]/div[2]/a/span");
	By EEA = By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[2]/div[2]/div[3]/a/span");
	By CCPA = By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[2]/div[2]/div[4]/a/span");
	
	public void Footerlinks() throws Exception {
		driver.findElement(TermsOfService).click();
		driver.findElement(Privacy_Policy).click();
		driver.findElement(EEA).click();
		driver.findElement(CCPA).click();
		
	
	}

}
