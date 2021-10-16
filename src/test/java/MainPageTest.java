import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
}
