package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class DriverManager {
    private static WebDriver driver;

    // Private constructor to prevent instantiation
    private DriverManager() {}

    public static WebDriver getDriver() {
        if (driver == null) {
        //    String browser = ConfigReader.getProperty("browser");  // Read from config
        	String browser = "chrome";
        	if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}