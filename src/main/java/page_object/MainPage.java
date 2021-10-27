package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.LocalDriverManager;
import utils.SharedContext;
import utils.StaticKeys;

import java.util.List;

public class MainPage {

    private final WebDriver driver = LocalDriverManager.getInstance();

    private final By productsElements = By.xpath("//ul[contains(@class,'products')]/li");

    public List<WebElement> getAllProducts() {
        return driver.findElements(productsElements);
    }

    public ProductPage selectProductFromListByName(String productName) {

        getAllProducts().stream()
                .filter(product -> product.getText().contains(productName))
                .findFirst()
                .ifPresent(WebElement::click);

        SharedContext.setValue(StaticKeys.CURRENT_ITEM, productName);

//        for (WebElement product : getAllProducts()) {
//            if(product.getText().contains(productName)){
//                product.click();
//                break;
//            }
//        }
        return new ProductPage();
    }
}
