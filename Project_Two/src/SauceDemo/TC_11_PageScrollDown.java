package SauceDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TC_11_PageScrollDown {
WebDriver driver;
	
	public TC_11_PageScrollDown(WebDriver driver){
		this.driver =driver;
	}
	public void ScrollthePageDown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        js.executeScript("window.scrollBy(0,-3000)");

	}

}
