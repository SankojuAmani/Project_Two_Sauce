package SauceDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_20_Logout {
WebDriver driver;
	
	public TC_20_Logout (WebDriver driver){
		this.driver =driver;
	}
	public void LogoutOption() throws Exception {
		Duration waitTimeout = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver,waitTimeout);
        WebElement burgerButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@class=\"bm-burger-button\"]")));
        burgerButton.click();
        WebElement Logout_Btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"logout_sidebar_link\"]")));
        Logout_Btn.click();
	}
}
