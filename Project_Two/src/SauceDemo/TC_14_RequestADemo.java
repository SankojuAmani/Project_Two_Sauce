package SauceDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_14_RequestADemo {
WebDriver driver;
	
	public TC_14_RequestADemo (WebDriver driver){
		this.driver =driver;
	}
	
	public void AboutPageDemoRequest() throws Exception {
		Duration waitTimeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,waitTimeout);
        WebElement burgerButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@class=\"bm-burger-button\"]")));
        burgerButton.click();
        WebElement aboutLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("about_sidebar_link")));
        aboutLink.click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[1]/div/div[4]/div[2]/a/button[2]")).click();
		WebElement BusinessEmail = wait.until(ExpectedConditions.elementToBeClickable(By.id("Email")));
		BusinessEmail.sendKeys("amani.sankoju@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("SauceDemo");
		WebElement PhoneNumber = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Phone\"]")));
		PhoneNumber.sendKeys("9999999999");
		/*WebElement Country = driver.findElement(By.id("Country"));
		Select drop = new Select(Country);
		drop.selectByVisibleText("India");*/
		WebElement Interest = driver.findElement(By.xpath("//*[@id=\"Solution_Interest__c\"]"));
		Select dropdown = new Select(Interest);
		dropdown.selectByVisibleText("Mobile Application Testing");
		driver.findElement(By.id("Sales_Contact_Comments__c")).sendKeys("I have filled the contact details");
		driver.findElement(By.id("LblmktoCheckbox_41050_0")).click();
		driver.findElement(By.xpath(".//button[@class='mktoButton']")).click();
		
	
	}
}
