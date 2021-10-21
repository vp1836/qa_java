import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object.MainPage;
import utils.DriverManager;
import utils.LocalDriverManager;

import static utils.PropertiesReader.getProperties;

@Slf4j
public class CouponCodeTest {

    private final WebDriver driver = LocalDriverManager.getInstance();

    private final MainPage mainPage = new MainPage();

    @BeforeEach
    public void setUp() {
        driver.get(getProperties().getProperty("home.page"));
    }

    @Test
    public void applyCouponTest() {
        mainPage.selectProductFromListByName("Polo")
                .addProductToCart()
                .goToCart()
                .enterCouponCode("easy_discount")
                .applyCouponCode();
    }

    @Test
    public void applyCouponTest2() {
        System.out.println("Test 2");
    }

    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}
