package SauceDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_3_ListOfItems {
	WebDriver driver;
    
    public TC_3_ListOfItems(WebDriver driver) {
        this.driver = driver;
    }
	public void ListOfProducts() throws InterruptedException {
        WebElement FirstElement = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]"));
        List<WebElement> listItems = FirstElement.findElements(By.tagName("div"));
        for (WebElement listItem : listItems) {
            String text = listItem.getText().trim();
            if (!text.isEmpty()) {
                System.out.println("List item text: " + text);
                System.out.println("List item text: " + text);
            }
        }

	}
}

