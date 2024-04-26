package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_16_CookieSettings {
WebDriver driver;
	
	public TC_16_CookieSettings (WebDriver driver){
		this.driver =driver;
	}
	By Cookie_Settings = By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[2]/div[2]/div[5]/a");
	By StrictlyNecessaryCookies = By.id("ot-header-id-C0001");
	By Performance_Cookies = By.id("ot-header-id-C0002");
	By Functional_Cookies = By.id("ot-header-id-C0003");
	By Targeting_Cookies = By.id("ot-header-id-C0004");
	By Social_Media_Cookies = By.id("ot-header-id-C0005");
	By Confirm_My_Choices = By.xpath("//*[@id=\"onetrust-pc-sdk\"]/div/div[3]/div[1]/button");

	
	
	public void CookieSettingLink() throws Exception {
		driver.findElement(Cookie_Settings).click();
		driver.findElement(StrictlyNecessaryCookies).click();
		driver.findElement(Performance_Cookies).click();
		driver.findElement(Functional_Cookies).click();
		driver.findElement(Targeting_Cookies).click();
		driver.findElement(Social_Media_Cookies).click();
		driver.findElement(Confirm_My_Choices).click();

		
	}
}
