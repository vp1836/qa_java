package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocalDriverManager;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class CartPage {

    private final WebDriver driver = LocalDriverManager.getInstance();
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    private final By couponInputField = By.name("coupon_code");
    private final By applyCouponButton = By.name("apply_coupon");

    private final By messageSuccess = By.className("woocommerce-message");
    private final By messageError = By.className("woocommerce-error");
    private final By removeButton = By.className("woocommerce-remove-coupon");

    public CartPage enterAndApplyCouponCode(String couponCode) {
        driver.findElement(couponInputField).sendKeys(couponCode);
        driver.findElement(applyCouponButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '" + couponCode + "')]")));
        return this;
    }

    public CartPage checkCartMessageSuccess(String cartMessage) {
//        assertThat(driver.findElement(messageSuccess).isDisplayed(), is(Boolean.TRUE));
        wait.until(ExpectedConditions.visibilityOfElementLocated(messageSuccess));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(messageSuccess, cartMessage));
        assertThat(driver.findElement(messageSuccess).getText(),
                containsString(cartMessage)
        );
        return this;
    }

    public CartPage checkCartMessageFail(String cartMessage) {
//        assertThat(driver.findElement(messageError).isDisplayed(), is(Boolean.TRUE));
        wait.until(ExpectedConditions.visibilityOfElementLocated(messageError));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(messageError, cartMessage));
        assertThat(driver.findElement(messageError).getText(),
                containsString(cartMessage)
        );
        return this;
    }

    public CartPage removeCoupon(String couponCode) {
        driver.findElement(By.xpath("//a[contains(@href, '" + couponCode + "')]")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[contains(@href, '" + couponCode + "')]")));
        return this;
    }
}
