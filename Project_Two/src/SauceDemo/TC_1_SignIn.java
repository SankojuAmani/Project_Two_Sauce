package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_1_SignIn {
     WebDriver driver;
     
     public TC_1_SignIn (WebDriver driver) {
	        this.driver = driver;
	    }

	    By usernameInput = By.xpath(".//input[@class='input_error form_input']");
	    By passwordInput = By.id("password");
	    By loginButton = By.id("login-button");
	    public void SIgnIntoSauceDemo() throws InterruptedException {
	    	WebElement usernameElement = driver.findElement(usernameInput);
	        usernameElement.sendKeys("standard_user");

	        WebElement passwordElement = driver.findElement(passwordInput);
	        passwordElement.sendKeys("secret_sauce");

	        WebElement loginButtonElement = driver.findElement(loginButton);
	        loginButtonElement.click();

	}
	    
}


