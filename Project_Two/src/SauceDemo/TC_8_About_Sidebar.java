package SauceDemo;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_8_About_Sidebar {
WebDriver driver;
	
	public TC_8_About_Sidebar(WebDriver driver){
		this.driver =driver;
	}
	By Menuoption = By.xpath(".//div[@class=\"bm-burger-button\"]");
	By About = By.id("about_sidebar_link");
	By Hover_Products = By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/span");
	public void AboutInMenuSidebar() throws InterruptedException {
	       Duration waitTimeout = Duration.ofSeconds(10);
	        WebDriverWait wait = new WebDriverWait(driver,waitTimeout);
	        WebElement burgerButton = wait.until(ExpectedConditions.elementToBeClickable(Menuoption));
	        burgerButton.click();
	        WebElement aboutLink = wait.until(ExpectedConditions.elementToBeClickable(About));
	        aboutLink.click();
	        Actions action1 = new Actions(driver);
	        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(Hover_Products));
	        action1.moveToElement(product).build().perform();
	        driver.navigate().back();

    }
}
