import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static utils.PropertiesReader.getProperties;

public class DriverTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(getProperties().getProperty("home.page"));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void checkIfTitleIsCorrect() {
        assertThat(driver.getTitle(), equalTo("Online shop – acodemy – Just another WordPress site"));
        assertThat(driver.getTitle(), is(equalTo("Online shop – acodemy – Just another WordPress site")));
        assertThat(driver.getTitle(), containsString("acodemy"));
    }
}
