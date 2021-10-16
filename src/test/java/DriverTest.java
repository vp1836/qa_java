import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utils.Singleton;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class DriverTest {

    Singleton singleton = Singleton.getInstance();
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = singleton.openBrowser();
        driver.get("https://shop.acodemy.lv/");
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
