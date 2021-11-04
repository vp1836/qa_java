package step_definitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utils.LocalDriverManager;

public class CommonStepDefs {

    WebDriver driver = LocalDriverManager.getInstance();

    @Given("User opes web page {string}")
    public void userOpenWebPage(String url) {
        driver.get(url);
    }
}
