import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AbstractTest {
    static WebDriver driver;
    private static boolean WebDriver;

    @BeforeAll
            static void setDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://evrasia.spb.ru/");
    }

    @BeforeEach
    void initMainPage(){
        Assertions.assertDoesNotThrow( ()-> driver.get().navigate().to("https://evrasia.spb.ru/"),
                "Страница не доступна");
        Assertions.assertTrue(true);

    }
}