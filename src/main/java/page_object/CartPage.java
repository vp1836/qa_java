package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocalDriverManager;
import utils.Messages;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static page_object.StaticWebElements.*;
import static utils.Messages.*;

public class CartPage {

    private final WebDriver driver = LocalDriverManager.getInstance();
    private final WebDriverWait wait;

    private final By couponInputField = By.id("coupon_code");
    private final By applyCouponButton = By.name("apply_coupon");

    public CartPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public CartPage enterAndApplyCouponCode(String couponCode) {
        driver.findElement(couponInputField).sendKeys(couponCode);
        driver.findElement(applyCouponButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MESSAGE_SUCCESS_ELEMENT));
        assertThat("Message is not correct", driver.findElement(MESSAGE_SUCCESS_ELEMENT).getText(), equalTo(COUPON_APPLIED_MESSAGE));
        return this;
    }

    public CartPage checkRemoveLink(String couponCode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(@href, '" + couponCode + "')]"))
        );
        return this;
    }

    public CartPage checkCartMessageSuccess(String cartMessage) {
//        assertThat(driver.findElement(messageSuccess).isDisplayed(), is(Boolean.TRUE));
        wait.until(ExpectedConditions.visibilityOfElementLocated(MESSAGE_SUCCESS_ELEMENT));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(MESSAGE_SUCCESS_ELEMENT, cartMessage));
        assertThat("Message is not correct", driver.findElement(MESSAGE_SUCCESS_ELEMENT).getText(), containsString(cartMessage));
        return this;
    }

    public CartPage checkCartMessageFail(String cartMessage) {
//        assertThat(driver.findElement(messageError).isDisplayed(), is(Boolean.TRUE));
        wait.until(ExpectedConditions.visibilityOfElementLocated(MESSAGE_ERROR_ELEMENT));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(MESSAGE_ERROR_ELEMENT, cartMessage));
        assertThat("Message is not correct",
                driver.findElement(MESSAGE_ERROR_ELEMENT).getText(),
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
