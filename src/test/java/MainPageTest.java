import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page_object.MainPage;

import static utils.PropertiesReader.getProperties;

public class MainPageTest {
    WebDriver driver;
    MainPage mainPage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(getProperties().getProperty("home.page"));
//        mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage = new MainPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findAllElementsTest() {
        System.out.println(mainPage.getAllProducts().size());
    }
}
