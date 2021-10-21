package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;


import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class CartPage {

    private final WebDriver driver = DriverManager.getInstance();

    private final By couponInputField = By.name("coupon_code");
    private final By applyCouponButton = By.name("apply_coupon");
    private final By message = By.className("woocommerce-message");
    private final By removeButton = By.className("woocommerce-remove-coupon");

    public CartPage enterCouponCode(String couponCode) {
        driver.findElement(couponInputField).sendKeys(couponCode);
        return this;
    }

    public CartPage applyCouponCode() {
        driver.findElement(applyCouponButton).click();
        assertThat(driver.findElement(message).isDisplayed(), is(Boolean.TRUE));
        assertThat(driver.findElement(removeButton).isDisplayed(), is(Boolean.TRUE));
        assertThat(driver.findElement(message).getText(),
                containsString("Coupon code applied successfully")
        );
        return this;
    }
}
