package utils;

import exceptions.UnsupportedEnvironmentException;
import exceptions.UnsupportedBrowserException;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;
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

    public static WebDriver localDriver() {
        String browser = PropertiesReader.getProperties().getProperty("browser").toUpperCase();
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
//                ChromeOptions chromeOptions = new ChromeOptions();
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
                throw new UnsupportedBrowserException("Following driver is not supported " + browser);
        }
    }

    @SneakyThrows
    public static RemoteWebDriver remoteDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
//        capabilities.setVersion("");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        return new RemoteWebDriver(
                URI.create("http://159.65.126.109:4444/wd/hub").toURL(),
                capabilities
        );

    }

    public static WebDriver configureDriver() {
        String environment = PropertiesReader.readProperties().getProperty("environment");

        switch (environment) {
            case "local":
                return localDriver();
            case "remote":
                return remoteDriver();
            default:
                throw new UnsupportedEnvironmentException(String.format("'%s' environment is not supported", environment));
        }
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
