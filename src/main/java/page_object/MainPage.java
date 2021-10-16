package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage {

    WebDriver driver;

    private final By productsElements = By.xpath("//ul[contains(@class,'products')]/li");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getAllProducts() {
        return driver.findElements(productsElements);
    }
}
