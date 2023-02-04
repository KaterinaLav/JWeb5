import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected WebElement login;
    WebDriver driver;

    public AbstractPage (WebDriver driver) {
        driver = driver;
        PageFactory.initElements(driver, this);
    }
    protected WebDriver getDriver () {
        return this.driver;
    }
}
