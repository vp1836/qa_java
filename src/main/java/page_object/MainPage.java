package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    WebDriver driver;

    private final By productsElements = By.xpath("//ul[contains(@class,'products')]/li");

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getAllProducts() {
        return driver.findElements(productsElements);
    }
}
