package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_7_Twittericon {
	WebDriver driver;
	
	public TC_7_Twittericon(WebDriver driver){
		this.driver =driver;
	}
	By Twitter_Icon = By.xpath(".//li[@class=\"social_twitter\"]");
    public void TwitterOption() throws InterruptedException{
driver.findElement(Twitter_Icon).click();

    }

}