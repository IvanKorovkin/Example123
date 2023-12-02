package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class ExampleUITest extends BaseTest{

    @Test
    @DisplayName("Проверка открытия главной страницы")
    void testOpenMainPage() {

        new MainPage()
                .clickLoginButton()
                .enterPassword();
    }

}
