package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_1_SignIn {
     WebDriver driver;
	    
	    public TC_1_SignIn (WebDriver driver) {
	        this.driver = driver;
	    }
	    public void SIgnIntoSauceDemo() throws InterruptedException {
	    	driver.findElement(By.xpath(".//input[@class='input_error form_input']")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();

	}
	    
}


