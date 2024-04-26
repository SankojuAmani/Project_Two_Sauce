package SauceDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_17_SignInOption {
WebDriver driver;
	
	public TC_17_SignInOption (WebDriver driver){
		this.driver =driver;
	}
	
	By SignIn_Btn = By.xpath("//*[@id=\"__next\"]/header/div/div/div[2]/div/div[1]/a/button");
	public void SignInHeader() throws Exception {
        driver.findElement(SignIn_Btn).click();

	}
}

