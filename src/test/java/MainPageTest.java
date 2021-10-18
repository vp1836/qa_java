import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.MainPage;
import utils.Singleton;


public class MainPageTest {
    Singleton singleton = Singleton.getInstance();
    WebDriver driver;
    MainPage mainPage;

    @BeforeEach
    public void setUp() {
        driver = singleton.openBrowser();
        mainPage = new MainPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findAllElementsTest() {
        System.out.println(
                mainPage.getAllProducts().size()
        );
    }

    @Test
    public void goToPageTwo() {
        driver.findElement(By.linkText("2")).click();
        driver.findElement(By.linkText("1")).click();
//        "//h1[contains(@class, "product_title")]"
//        driver.findElement(By.linkText("2")).getAttribute("href");
    }
}
