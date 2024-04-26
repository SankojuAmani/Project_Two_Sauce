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
	By Menu = By.xpath(".//div[@class=\"bm-burger-button\"]");
	By About = By.id("about_sidebar_link");
	By Request_a_Demo = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[1]/div/div[4]/div[2]/a/button[2]");
	By EmailAddress = By.id("Email");
	By PhoneNum = By.xpath("//*[@id=\"Phone\"]");
	By Interest_Field = By.xpath("//*[@id=\"Solution_Interest__c\"]");
	By Comment_Field = By.id("Sales_Contact_Comments__c");
	By Checkbox = By.id("LblmktoCheckbox_41050_0");
	By Get_a_Demo = By.xpath(".//button[@class='mktoButton']");
	
	
	
	
	
	public void AboutPageDemoRequest() throws Exception {
		Duration waitTimeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,waitTimeout);
        WebElement burgerButton = wait.until(ExpectedConditions.elementToBeClickable(Menu));
        burgerButton.click();
        WebElement aboutLink = wait.until(ExpectedConditions.elementToBeClickable(About));
        aboutLink.click();
		driver.findElement(Request_a_Demo).click();
		
		WebElement BusinessEmail = wait.until(ExpectedConditions.elementToBeClickable(EmailAddress));
		BusinessEmail.sendKeys("amani.sankoju@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("SauceDemo");
		WebElement PhoneNumber = wait.until(ExpectedConditions.elementToBeClickable(PhoneNum));
		PhoneNumber.sendKeys("9999999999");
		/*WebElement Country = driver.findElement(By.id("Country"));
		Select drop = new Select(Country);
		drop.selectByVisibleText("India");*/
		WebElement Interest = driver.findElement(Interest_Field);
		Select dropdown = new Select(Interest);
		dropdown.selectByVisibleText("Mobile Application Testing");
		driver.findElement(Comment_Field).sendKeys("I have filled the contact details");
		driver.findElement(Checkbox).click();
		driver.findElement(Get_a_Demo).click();
		
	
	}
}
