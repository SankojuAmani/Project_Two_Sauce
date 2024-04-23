package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_7_Twittericon {
	WebDriver driver;
	
	public TC_7_Twittericon(WebDriver driver){
		this.driver =driver;
	}
    public void HamburgerMenuOptions() throws InterruptedException{
driver.findElement(By.xpath(".//li[@class=\"social_twitter\"]")).click();

    }

}
