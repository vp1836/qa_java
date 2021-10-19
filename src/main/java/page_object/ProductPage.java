package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class ProductPage {

    private final WebDriver driver = DriverManager.getInstance();

    private final By addToCartElement = By.name("add-to-cart");
    private final By message = By.className("woocommerce-message");

    public ProductPage addProductToCart() {
        driver.findElement(addToCartElement).click();
        assertThat(driver.findElement(message).isDisplayed(), is(Boolean.TRUE));
        assertThat(driver.findElement(message).getText(),
                containsString("has been added to your cart")
        );
        return this;
    }
}
