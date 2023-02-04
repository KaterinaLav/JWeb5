import org.checkerframework.checker.units.qual.Current;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest extends AbstractTest{

    @Test
    void mainMenuNavigateTest(){
        Main main = new Main(driver);
        main
                .clickmenu()
                .clickzavtrak()
                .clicksushi()
                .clicknapitki();
        Assertions.assertEquals("https://evrasia.spb.ru/menu/napitki/", driver);
    }

    @Test
    void mainLogoTest(){
        Main main = new Main(driver);
        main
                .clickmenu()
                .clicknapitki()
                .cliclogo();
        Assertions.assertEquals("https://evrasia.spb.ru/", driver);
    }

    @Test
    void mainLoginTest(){
        Main main =new Main(driver);
        main
                .clickaccount()
                .clickuser("+7 (931) 364-28-67")
                .clicpassword("935125")
                .clicksubmit();
        Assertions.assertEquals("https://evrasia.spb.ru/account/", driver);
    }
}