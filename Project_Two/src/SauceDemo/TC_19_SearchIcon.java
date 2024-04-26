package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_19_SearchIcon {
WebDriver driver;
	
	public TC_19_SearchIcon (WebDriver driver){
		this.driver =driver;
	}
	By Search_Icon = By.xpath("//*[@id=\"__next\"]/header/div/div/div[2]/div/button/div/span/img");
	By search_Word = By.xpath("//*[@id=\"search\"]");
	
	public void SearchIcon() throws Exception {
		driver.findElement(Search_Icon).click();
		driver.findElement(search_Word).sendKeys("SauceLabs");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}
}
