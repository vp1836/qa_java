package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.LocalDriverManager;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class CartPage {

    private final WebDriver driver = LocalDriverManager.getInstance();

    private final By couponInputField = By.name("coupon_code");
    private final By applyCouponButton = By.name("apply_coupon");

    private final By messageSuccess = By.className("woocommerce-message");
    private final By messageError = By.className("woocommerce-error");
    private final By removeButton = By.className("woocommerce-remove-coupon");

    public CartPage enterCouponCode(String couponCode) {
        driver.findElement(couponInputField).sendKeys(couponCode);
        return this;
    }

    public CartPage applyCouponCode() {
        driver.findElement(applyCouponButton).click();
        return this;
    }

    public CartPage checkCartMessageSuccess(String cartMessage) {
        assertThat(driver.findElement(messageSuccess).isDisplayed(), is(Boolean.TRUE));
        assertThat(driver.findElement(messageSuccess).getText(),
                containsString(cartMessage)
        );
        return this;
    }

    public CartPage checkCartMessageFail(String cartMessage) {
        assertThat(driver.findElement(messageError).isDisplayed(), is(Boolean.TRUE));
        assertThat(driver.findElement(messageError).getText(),
                containsString(cartMessage)
        );
        return this;
    }

    public CartPage removeCoupon() {
        driver.findElement(removeButton).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
}
