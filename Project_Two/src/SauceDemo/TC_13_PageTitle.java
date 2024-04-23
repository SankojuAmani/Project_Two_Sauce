package SauceDemo;

import org.openqa.selenium.WebDriver;

public class TC_13_PageTitle {
WebDriver driver;
	
	public TC_13_PageTitle(WebDriver driver){
		this.driver =driver;
	}
	
	public void PageTitle() throws Exception {

        String actualTitle = driver.getTitle();
        String expectedTitle = "SauceDemo";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Page title is correct: " + actualTitle);
        } else {
            System.out.println("Page title is incorrect. Actual title is: " + actualTitle);
        }
    }

}
