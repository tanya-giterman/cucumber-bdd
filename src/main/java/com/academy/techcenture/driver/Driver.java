package com.academy.techcenture.driver;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            switch (browser) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new RuntimeException("Invalid Browser type: " + browser);
            }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20L));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20L));
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

