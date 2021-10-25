import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.CartPage;
import page_object.MainPage;
import utils.LocalDriverManager;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static utils.PropertiesReader.getProperties;

@Slf4j
public class CouponCodeTest {

    private final WebDriver driver = LocalDriverManager.getInstance();

    private final MainPage mainPage = new MainPage();
    private final CartPage cartPage = new CartPage();

    @BeforeEach
    public void setUp() {
        driver.get(getProperties().getProperty("home.page"));
        mainPage.selectProductFromListByName("Polo")
                .addProductToCart()
                .goToCart();
    }

    @Test
    public void applyCouponSuccessTest() {
        cartPage.enterCouponCode("easy_discount")
                .applyCouponCode()
                .checkCartMessageSuccess("Coupon code applied successfully");
    }

    @Test
    public void applyCouponFailTest() {
        cartPage.enterCouponCode("bad_discount")
                .applyCouponCode()
                .checkCartMessageFail("does not exist!");
    }

    @Test
    public void applyCouponExpiredTest() {
        cartPage.enterCouponCode("expired")
                .applyCouponCode()
                .checkCartMessageFail("This coupon has expired");
    }

    @Test
    public void removeCouponSuccessTest() {
        cartPage.enterCouponCode("easy_discount")
                .applyCouponCode()
                .checkCartMessageSuccess("Coupon code applied successfully")
                .removeCoupon()
                .checkCartMessageSuccess("Coupon has been removed");
    }

    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}
