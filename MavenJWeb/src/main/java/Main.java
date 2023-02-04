import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Main extends AbstractPage {
    @FindBy(xpath = ".//*[@id=\"header\"]/div[2]/div/div[1]")
    private WebElement logo;

    @FindBy(xpath = ".//*[@id=\"header\"]/div[2]/div/nav/a[1]")
    private WebElement menu;

    @FindBy(xpath = "./html/body/section[3]/div/div[1]/a")
    private WebElement zavtrak;

    @FindBy(xpath = "./html/body/section[3]/div/div[2]/a")
    private WebElement sushi;

    @FindBy(xpath = "./html/body/section[3]/div/div[14]")
    private WebElement napitki;

    @FindBy(xpath = ".//*[@id=\"header\"]/div[2]/div/div[2]/a[2]")
    private WebElement account;
    @FindBy(id = "username")
    private WebElement user;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "./html/body/div[4]/div/form/button")
    private WebElement submit;

    @FindBy(xpath = ".//*[@id=\"header\"]/div[2]/div/nav/a[3]")
    private WebElement restorans;

    public Main(WebDriver driver){
        super(driver);
    }

    public Main clickaccount(){
        account.click();
        return  this;
    }
    public Main clickuser(String s){
        user.click();
        return this;
    }
    public Main clicpassword(String s){
        password.click();
        return this;
    }
    public Main clicksubmit(){
        submit.click();
        return this;
    }
    public Main clickmenu() {
        menu.click();
        return this;
    }
    public Main cliclogo(){
        logo.click();
        return this;
    }

    public Main clickzavtrak(){
        zavtrak.click();
        return this;
    }

    public Main clicksushi(){
        sushi.click();
        return this;
    }

    public Main clicknapitki(){
        napitki.click();
        return this;
    }
}
