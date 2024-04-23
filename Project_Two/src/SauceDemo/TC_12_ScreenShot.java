package SauceDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TC_12_ScreenShot {
WebDriver driver;
	
	public TC_12_ScreenShot (WebDriver driver){
		this.driver =driver;
	}
	
	public void ScreenshotOfSauce() throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("C:\\Users\\amani\\Desktop\\SauceDemo.Png");
        File directory = new File("C:\\Users\\amani\\Desktop");
        FileUtils.copyFile(SrcFile, DestFile);
}
}
