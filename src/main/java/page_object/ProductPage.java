package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.LocalDriverManager;
import utils.SharedContext;
import utils.StaticKeys;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;
import static page_object.StaticWebElements.*;
import static utils.Messages.*;

public class ProductPage {

    private final WebDriver driver = LocalDriverManager.getInstance();

    private final By addToCartElement = By.name("add-to-cart");
    private final By viewCartLink = By.xpath("//div[@class=\"woocommerce\"]//a");

    public ProductPage addProductToCart() {
        driver.findElement(addToCartElement).click();
        assertThat(driver.findElement(MESSAGE_SUCCESS_ELEMENT).isDisplayed(), is(Boolean.TRUE));
        assertThat(driver.findElement(MESSAGE_SUCCESS_ELEMENT).getText(),
                containsString( String.format(PRODUCT_ADDED_TO_CART, SharedContext.getValue(StaticKeys.CURRENT_ITEM)))
        );
        return this;
    }

    public CartPage goToCart() {
        driver.findElement(viewCartLink).click();
        assertThat("Title is incorrect", driver.getTitle(), containsString("Cart"));
        return new CartPage();
    }
}
