package SauceDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_2_InvalidCredientials {

    WebDriver driver;

    public TC_2_InvalidCredientials(WebDriver driver) {
        this.driver = driver;
    }

    public void SignInToSauceDemoInvalidCred() throws InterruptedException {
        WebElement Username = driver.findElement(By.id("user-name"));
        Username.sendKeys("Standard");

        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("");

        WebElement LoginBtn = driver.findElement(By.id("login-button"));
        LoginBtn.click();

        driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/button")).click();

        // Clear the username and password fields
        Username.clear();
        Password.clear();
        Thread.sleep(2000);
    }
}
