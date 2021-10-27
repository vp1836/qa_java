package utils;

import exceptions.UnsupportedDriverException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class LocalDriverManager {

    private static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = configureDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        return driver;
    }

    public static WebDriver configureDriver() {
        String browser = PropertiesReader.getProperties().getProperty("browser").toUpperCase();
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.addArguments("--headless");
//                chromeOptions.addArguments("--incognito");
//                chromeOptions.addArguments("start-maximized");
//                return new ChromeDriver(chromeOptions);
                return new ChromeDriver();
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless");
                return new FirefoxDriver();
            default:
                throw new UnsupportedDriverException("Following driver is not supported " + browser);
        }
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
