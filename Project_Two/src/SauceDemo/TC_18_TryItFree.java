package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_18_TryItFree {
WebDriver driver;
	
	public TC_18_TryItFree (WebDriver driver){
		this.driver =driver;
	}
	By Try_It_Free = By.xpath("//*[@id=\"__next\"]/header/div/div/div[2]/div/div[3]/a/button");
	By SignUpWithEmail = By.xpath("//*[@id=\"signUpWithEmail\"]/span[2]");
	By Sign_Up = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/form/button");
	public void TryItFreeOption() throws Exception {
		driver.findElement(Try_It_Free).click();
		driver.findElement(SignUpWithEmail).click();
		driver.findElement(Sign_Up).click();
		driver.navigate().back();
		driver.navigate().back();
	}
}
