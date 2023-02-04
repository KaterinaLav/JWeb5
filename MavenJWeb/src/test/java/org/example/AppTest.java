package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AppTest extends App{
    WebDriver driver;


    @Test
    void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://evrasia-ex.ru/");
    }

    @Test
    void myActiontest() {

            Actions search = new Actions(driver);

            search.click(driver.findElement(By.xpath("./html/body/header/div/div/div[2]/nav/div/ul/li[4]/a")))
                    .click(driver.findElement(By.xpath(".//*[@id=\"catalog-search-btn\"]")))
                    .moveToElement((WebElement) By.xpath(".//*[@id=\"catalog-search-btn\"]"))
                    .click(driver.findElement(By.xpath(".//*[@id=\"ingredients-search-form\"]/ul/li[1]/label")))
                    .perform();
        }

}