package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {

        private final SelenideElement inputPassword = $(By.xpath("//input[@type='password']"));

        public void enterPassword() {
                inputPassword.setValue("12334455");
        }

}
