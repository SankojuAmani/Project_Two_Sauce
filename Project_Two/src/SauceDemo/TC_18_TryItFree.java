package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_18_TryItFree {
WebDriver driver;
	
	public TC_18_TryItFree (WebDriver driver){
		this.driver =driver;
	}
	public void TryItFreeOption() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div/div[2]/div/div[3]/a/button")).click();
		driver.findElement(By.xpath("//*[@id=\"signUpWithEmail\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/form/button")).click();
		driver.navigate().back();
		driver.navigate().back();
		
	}
}
