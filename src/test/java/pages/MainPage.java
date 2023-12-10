package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    private final SelenideElement loginButton = $(By.xpath("//a[@class='login-button']"));

//    public MainPage checkVisibleLoginButton() {
//        loginButton.shouldBe(visible);
//
//        return this;
//    }

    public AuthPage clickLoginButton() {
        loginButton.click();

        return page(AuthPage.class);
    }

    public MainPage test() {
        loginButton.click();

        return this;
    }

}
