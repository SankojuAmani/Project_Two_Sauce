package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_2_InvalidCredientials {
    WebDriver driver;

    // Define locators
    By usernameInput = By.id("user-name");
    By passwordInput = By.name("password");
    By loginButton = By.id("login-button");
    By errorMessage = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3/button");

    public TC_2_InvalidCredientials(WebDriver driver) {
        this.driver = driver;
    }

    public void signInToSauceDemoInvalidCred() throws InterruptedException {
        WebElement username = driver.findElement(usernameInput);
        username.sendKeys("Standard");

        WebElement password = driver.findElement(passwordInput);
        password.sendKeys("");

        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();

        driver.findElement(errorMessage).click();

        username.clear();
        password.clear();
        Thread.sleep(2000); 
    }
}