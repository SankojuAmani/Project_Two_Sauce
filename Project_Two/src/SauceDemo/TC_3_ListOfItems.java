package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_3_ListOfItems {
    WebDriver driver;

    By firstProductContainer = By.xpath("//*[@id='inventory_container']/div/div[1]/div[2]");

    public TC_3_ListOfItems(WebDriver driver) {
        this.driver = driver;
    }

    public void listOfProducts() throws InterruptedException {
        WebElement firstProductElement = driver.findElement(firstProductContainer);

        List<WebElement> productElements = firstProductElement.findElements(By.tagName("div"));

        for (WebElement productElement : productElements) {
            String productText = productElement.getText().trim();
            if (!productText.isEmpty()) {
                System.out.println("Product text: " + productText);
            }
        }
    }
}
